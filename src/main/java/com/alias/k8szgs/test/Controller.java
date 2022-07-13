package com.alias.k8szgs.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.Inet4Address;
import java.net.UnknownHostException;

@RestController

public class Controller {

    @RequestMapping("/ping")
    public String ping(){
        return "pong";
    }

    @RequestMapping("/getIp")
    public String getIp() throws UnknownHostException {
        return Inet4Address.getLocalHost().getHostAddress();
    }
}
