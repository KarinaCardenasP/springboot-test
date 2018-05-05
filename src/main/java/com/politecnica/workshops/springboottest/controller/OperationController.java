package com.politecnica.workshops.springboottest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationController {

    @RequestMapping(value="/sum")
    public int DoOperation(@RequestParam  int a, @RequestParam int b){
        return  a;
    }
}
