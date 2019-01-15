/**
 * fshows.com
 * Copyright (C) 2013-2019 All Rights Reserved.
 */
package com.zytiger.apollo.demo.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoyi
 * @version TestController.java, v 0.1 2019-01-15 14:35
 */
@RestController
public class TestController {

    @RequestMapping("/apollo/demo/test")
    public String testApollo() {
        return "OK";
    }
}
