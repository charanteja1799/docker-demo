package com.example.springdockerdemo.Controller;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DockerController {

    @GetMapping("/docker")
    public String helloDocker (){
        return "HELLO DOCKER ";
    }

    @GetMapping
    public String helloDockerName (){
        return "HELLO DOCKER 8080";
    }

    @RequestMapping(value = "/restURL")
    public String serveRest(@RequestHeader HttpHeaders headers){
        return headers.get("user").get(0).toString();
    }

    @PostMapping
    public String helloDockerNam (){
        return "HELLO DOCKER ";
    }

}
