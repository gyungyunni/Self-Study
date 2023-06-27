package com.selfstudy.jpa.bookmanager.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest // mvc 테스트 할 수 있음
class HelloWorldControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void helloWorld() throws Exception {  //테스트 메서드 생성
        mockMvc.perform(MockMvcRequestBuilders.get("/hello-world")) //get 으로 요청하는거 테스트
                .andDo(print())
                .andExpect(status().isOk())    // 200 응답 기대
                .andExpect(content().string("hello-world")); // hello-world 리턴하는지 확인, 밑에 있는거 import
    }
}