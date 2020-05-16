package com.example.demo;

import com.example.demo.configure.MyConfigure1;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ShardingJdbcApplicationTests {

    @Test
    void contextLoads() {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfigure1.class);
        context.start();
        context.close();
    }

}
