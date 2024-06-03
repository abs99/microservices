package org.cloudapp.controller;

import org.cloudapp.bean.Limit;
import org.cloudapp.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    @Autowired
    Configuration config;
    @GetMapping("/limits")
    public Limit getLimits(){
        return new Limit(config.getMaximum(),config.getMinimum());
    }
}
