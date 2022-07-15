package com.example.emos.wx.controller;

import com.example.emos.wx.common.util.R;
import com.example.emos.wx.controller.form.TestSayHelloForm;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Author: EdisonHo
 * Date: 2022-07-14
 */
@RestController
@RequestMapping("/test")
@Api("测试web接口")
public class TestController {

    @PostMapping("/sayhello")
    @ApiOperation("the ever more easy method of testing")
    public R sayHello(@Valid @RequestBody TestSayHelloForm form){
        return R.ok().put("message","Hello," + form.getName());
    }
}
