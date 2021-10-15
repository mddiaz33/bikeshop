package com.pluralsight.bikeshop.controllers;

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
    //annotation for get method

    @GetMapping
    public List<Bike>list(){
        List<Bike> bikes = new ArrayList<>();
        bikes.add(new Bike());
        return bikes;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.OK) //changing hhtp response to 201
    public Map<String,String> create(@RequestBody Bike bike){
        Map response = new HashMap<String,String>();
        response.put("status","success");
        return response;
    }
    @GetMapping("/{id}")  //adding on to the get path
    public void create(@PathVariable("id") long id){

    }
}
