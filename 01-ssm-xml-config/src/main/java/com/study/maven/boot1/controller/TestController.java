package com.study.maven.boot1.controller;

import com.study.maven.boot1.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author HLH
 * @email 17703595860@163.com
 * @date : Created in  2021/3/9 19:59
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test.do")
    @ResponseBody
    public String test() {
        return "success";
    }

    @GetMapping("/test2")
    @ResponseBody
    public String test2() {
        return testService.getString();
    }

    @GetMapping("/test3")
    public String test3() {
        return "test";
    }

}
