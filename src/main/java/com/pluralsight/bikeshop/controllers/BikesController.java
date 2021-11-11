package com.pluralsight.bikeshop.controllers;

import com.pluralsight.bikeshop.repositories.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pluralsight.bikeshop.models.Bike;
//annotation for rest controllers
@RestController
//annotation for request path
@RequestMapping("/api/v1/bikes")
public class BikesController {
   @Autowired
   private BikeRepository bikeRepository;

    //annotation for get method
    @GetMapping
    public List<Bike>list(){
        return bikeRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Bike bike){
        bikeRepository.save(bike);

    }
    @GetMapping("/{id}")  //adding on to the get path
    public Bike get(@PathVariable("id") long id){
        return bikeRepository.getOne(id);
    }
}
