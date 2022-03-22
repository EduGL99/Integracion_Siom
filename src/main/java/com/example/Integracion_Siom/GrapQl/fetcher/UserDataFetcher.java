package com.example.Integracion_Siom.GrapQl.fetcher;

import com.example.Integracion_Siom.Models.User;
import com.example.Integracion_Siom.Repository.UserRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDataFetcher implements DataFetcher<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User get(DataFetchingEnvironment dataFetchingEnvironment){
        String id = dataFetchingEnvironment.getArgument("id");
        return userRepository.findById(id).orElse(null);
    }
}
