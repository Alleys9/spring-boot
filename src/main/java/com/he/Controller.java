package com.he;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Hmy on 2017/8/15
 */
@RestController
public class Controller {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
