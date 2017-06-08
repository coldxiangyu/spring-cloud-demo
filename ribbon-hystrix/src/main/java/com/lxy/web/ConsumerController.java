package com.lxy.web;

import com.lxy.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by coldxiangyu on 2017/6/6.
 */
@RestController
public class ConsumerController {
    @Autowired
    private ComputeService computeService;
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return computeService.addService();
    }
}