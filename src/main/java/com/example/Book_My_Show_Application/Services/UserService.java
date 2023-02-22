package com.example.Book_My_Show_Application.Services;

import com.example.Book_My_Show_Application.Entities.UserEntity;
import com.example.Book_My_Show_Application.EntryDtos.UserEntryDtos;
import com.example.Book_My_Show_Application.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    public void adduser(UserEntryDtos userEntryDtos){

        UserEntity userEntity = UserEntity.builder().age(userEntryDtos.getAge()).name(userEntryDtos.getName()).address(userEntryDtos.getAddress()).email(userEntryDtos.getEmail()).mobNo(userEntryDtos.getMobNo()).build();

        userRepository.save(userEntity);

    }

}
