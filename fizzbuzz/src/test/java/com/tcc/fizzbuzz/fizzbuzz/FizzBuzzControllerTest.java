package com.tcc.fizzbuzz.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.util.Arrays;


@WebMvcTest
@ExtendWith(SpringExtension.class)
public class FizzBuzzControllerTest {

    @Autowired
    private MockMvc mockMvc;
    
    @MockBean
    private FizzBuzzService service;


    @Test
    void getFizzBuzzListTest() throws Exception {
        when(service.getFizzBuzzList(anyInt())).thenReturn(Arrays.asList("string1","string2"));
        mockMvc.perform(get("/api/v1/fizzbuzz/19"))
        		.andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.*").isArray());
    }
    
}
