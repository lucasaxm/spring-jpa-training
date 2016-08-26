package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

/**
 * Created by LU355846 on 8/24/2016.
 */

@Controller
public class DragController {

    @RequestMapping("/dropped")
    public ResponseEntity<String> dropped(@RequestParam Boolean dropped) {
        String answer;
        if (dropped) {
            answer = "parabains";
        } else {
            answer = "chatiado";
        }
        return new ResponseEntity<>(answer, HttpStatus.OK);
    }
}
