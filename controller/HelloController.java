package com.example.myfirstspringproject.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.myfirstspringproject.model.UserModel;

@RestController
@RequestMapping("/hello")
public class HelloController  {

//    @Autowired
   private UserModel userModel;
    //uc1
    @RequestMapping(value = {" "," /","/home"},method = RequestMethod.GET )
    public String sayHello() {
        return "Hello From BridgeLabz !!!";
    }

    @RequestMapping(value = {"/query "} , method = RequestMethod.GET)
    public  String sayHello(@RequestParam(value = "name") String name) {
        return "Hello "+ name + " ! ";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@RequestParam String name) {
         return "hello" + " " + name + "from bridglabz";
    }


    @PostMapping("/post")
    public String postSave
            (@RequestBody UserModel userModel) {
        return "welcome to bridgelabz"+" "+userModel.getFirstName() +" "+userModel.getLastName() +" from bridgelabz";
    }
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName,
                           @RequestParam (value = "lastName") String lastName) {
        return "Hello "+ firstName + " " + lastName + " ! ";
    }
}