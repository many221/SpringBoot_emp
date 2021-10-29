package com.careerdevs.hw_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class RouteController {

    private final AtomicLong NuclearCounter = new AtomicLong ();
    private final String defualtTxt = "Hello %s";
    private final String ZaWarudo = "Warudo";

    @GetMapping("/")
    public String root(){
      return String.format ( defualtTxt, ZaWarudo);
    }

    @GetMapping("/dummy")
    public Employee dummyEmployee(){
        return new Employee ( NuclearCounter.incrementAndGet (),"Joseph","JoeStar" );
    }

    @GetMapping("/emp")
    public Employee employee(@RequestParam(value = "q",defaultValue = "Joseph")String f_name, @RequestParam(value = "k", defaultValue = "JoeStar")String l_name){
        return new Employee ( NuclearCounter.incrementAndGet (),f_name,l_name );
    }

    @GetMapping("/search/{f_name}/{l_name}")
    public Employee empSearch(@PathVariable String f_name, @PathVariable String l_name){
        return new Employee ( NuclearCounter.incrementAndGet (),f_name,l_name);
    }

}
