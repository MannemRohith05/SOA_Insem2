package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class Ms1ApplicationTests {

    @Autowired
    MockMvc mockMvc;

    // PASS TEST CASE
    @Test
    void testAddPass() throws Exception {

        mockMvc.perform(get("/ms1/add")
                .param("a", "-5")
                .param("b", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("MS 1.1 - Additon = 0"));
    }

    // FAIL TEST CASE
    @Test
    void testAddFail() throws Exception {

        mockMvc.perform(get("/ms1/add")
                .param("a", "-5")
                .param("b", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("MS 1.1 - Additon = 10"));
    }
}