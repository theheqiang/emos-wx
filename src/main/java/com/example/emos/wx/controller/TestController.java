package com.example.emos.wx.controller;

import com.example.emos.wx.common.util.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: EdisonHo
 * Date: 2022-07-14
 */
@RestController
@RequestMapping("/test")
@Api("测试web接口")
public class TestController {

    @GetMapping("/sayhello")
    @ApiOperation("the ever more easy method of testing")
    public R sayHello(){
        return R.ok().put("message","Helloworld");
    }
}
