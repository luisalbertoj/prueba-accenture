package com.springboot.luis.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.luis.models.User;

 
 
@RestController
public class UserServiceRest {
     
    private static List<User> listaUsuarios = new ArrayList<User>() {
        {
            add(new User( 12345, "carrera 11# 14-08","Rosa", "Marfil"));
        }
    };
     
    @RequestMapping(value="/users", method=RequestMethod.GET)
    public List<User>  getUsers(){
        return listaUsuarios;
    }
}