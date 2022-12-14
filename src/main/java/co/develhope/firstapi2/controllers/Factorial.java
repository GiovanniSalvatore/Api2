package co.develhope.firstapi2.controllers;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/factorial")
public class Factorial {
    @GetMapping(value = "")
    public String test(){
        return "ok";
    }
    @GetMapping(value = "/{n}")
    public String factorial(@PathVariable(required = true)Integer n){
        Integer p = 0;
        for(Integer i= 0; i <= n ; i++){
            p = p + (n*i);
        }
        return p.toString();
    }
}