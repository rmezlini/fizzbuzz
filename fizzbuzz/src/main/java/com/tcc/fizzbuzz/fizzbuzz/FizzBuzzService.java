package com.tcc.fizzbuzz.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {
	
	public List<String> getFizzBuzzList(int input){
		
    	List<String> fizzBuzzList = new ArrayList<>();
	    for (int i = 1 ; i <= input; i++) {
	    	fizzBuzzList.add(fizzBuzz(i));
	    }
	    return fizzBuzzList;

	}
 
    public String fizzBuzz(int input) {
    	if(input % 15 == 0) {
    		return "FizzBuzz";
        }
    	
    	else if(input % 3 == 0) {
        	return "Fizz";
        }
        
        else if(input % 5 == 0) {
        	return "Buzz";
        }
        
        else {
        	return String.valueOf(input + 1);
        }
	}

}
