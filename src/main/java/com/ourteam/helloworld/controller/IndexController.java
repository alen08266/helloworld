package com.ourteam.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * package：com.ourteam.helloworld.controller
 * Created by RenQi on 2019/9/20 0020.
 * Description：
 */
@RestController
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "success";
    }

}
