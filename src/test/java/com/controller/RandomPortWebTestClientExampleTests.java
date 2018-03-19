package com.controller;

/**
 * @author 73598.
 * @Date 2018/3/15 0015.
 * @Time 11:11.
 */
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class RandomPortWebTestClientExampleTests {

    @Autowired
    private WebTestClient webClient;

    @Test
    public void exampleTest() {
//        this.webClient.get().uri("loca").exchange().expectStatus().isOk()
//                .expectBody(String.class).isEqualTo("Hello World");
    }

}
