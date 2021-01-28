package com.tcc.fizzbuzz.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.List;


@SpringBootTest
@ExtendWith(SpringExtension.class)
public class FizzBuzzServiceTest {

	@Autowired
    private FizzBuzzService service;
		 
	 //input = 16
	 @Test
	 void getFizzBuzzListTest() {
	  List<String> fizzBuzzList = Arrays.asList("2","3","Fizz","5","Buzz","Fizz","8","9","Fizz","Buzz","12","Fizz","14","15","FizzBuzz","17");
      assertIterableEquals(service.getFizzBuzzList(16), fizzBuzzList);
	 }

}
