package com.tcc.fizzbuzz.fizzbuzz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/fizzbuzz/")
public class FizzBuzzController {

    private final FizzBuzzService service;

    @Autowired
    public FizzBuzzController(FizzBuzzService service) {
        this.service = service;

    }

    	
    @GetMapping("/{input}")
    public ResponseEntity<List<String>> getFizzBuzzList(@PathVariable int input) {
        List<String> response = service.getFizzBuzzList(input);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
