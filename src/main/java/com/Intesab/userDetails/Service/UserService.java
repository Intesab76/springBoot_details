package com.Intesab.userDetails.Service;

import com.Intesab.userDetails.UserInputs.UserData;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@Service
public class UserService {

    public List<UserData> userList = Arrays.asList(new UserData("Intesab" , "Btech" , "Q-22323" , "CSE"));


    public List<UserData> getData(){

        return userList;

    }

    public UserData addData(UserData u){
        userList.add(u);
        return u;
    }

}
