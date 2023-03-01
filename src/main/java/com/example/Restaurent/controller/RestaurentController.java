package com.example.Restaurent.controller;

import com.example.Restaurent.model.Restaurent;
import com.example.Restaurent.service.RestaurentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/restaurent-app")
public class RestaurentController {
    @Autowired
    RestaurentService service;// dependency injection

//    if you want to write code without using Autowired we can use below code
//    RestaurentService service; // dependency injection
//
//    public RestaurentController(RestaurentService service) {
//        this.service=service;
//    }

    @GetMapping("/get-restaurent")
    public List<Restaurent> get(){
        return service.findAll();
    }

    @GetMapping("/get-restaurent/name/{name}")
    public Restaurent getByName(@PathVariable String name)
    {
        return service.findByName(name);
    }
    @PostMapping("/add-restaurent")
    public void add(@RequestBody Restaurent restaurent){
         service.addList(restaurent);
    }
    @PutMapping("/update-restaurent/name/{name}")
    public void update(@PathVariable String name,@RequestBody Restaurent resturent)
    {
        service.updateRestaurent(name,resturent);
    }
    @DeleteMapping("/delete-restaurent/name/{name}")
    public void delete(@PathVariable String name){
        service.deleteRestaurent(name);
    }
}
