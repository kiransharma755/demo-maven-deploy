package com.fxdm.tech.web.controller;

import com.google.common.collect.ImmutableMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequestMapping("/demo/test")
public class DemoTestController {

    @RequestMapping("/get1")
    public Map<String, Object> get1() {
        return ImmutableMap.of("value", 1, "time", LocalDateTime.now());
    }

}
