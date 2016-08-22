package com.example;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LU355846 on 8/22/2016.
 */

@RestController
public class UserController {

    @RequestMapping("/sum/{a}/{b}")
    public int sum (@PathVariable int a, @PathVariable int b){
        return a+b;
    }
}
