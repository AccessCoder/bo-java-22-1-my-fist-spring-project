package de.neuefische.bojava221myfistspringproject.contoller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/helloworld")
public class GreetingsController {

    private String name = "";

    @GetMapping
    public String sayHello(){
        return "Servus " + name;
    }

    @GetMapping("/en")
    public String sayHello2(){
        return "Helloooo";
    }

    @GetMapping(path = "{name}")
    public String sayHello3(@PathVariable String name, @RequestParam String greeting){
        return greeting + " " + name;
    }

    @PostMapping
    public String postName(@RequestBody String newName){
        name = newName;
        return "Name was set to: " + name;
    }



}
