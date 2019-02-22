package com.ssl.controller;

import com.ssl.model.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SslController  {

    @GetMapping("/ssl")
    Test ssl(){
        System.out.println("SSL");
        return new Test("SSL success");
    }
}
