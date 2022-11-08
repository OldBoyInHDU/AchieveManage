package com.nyzs.achieve;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class AchieveApplicationTests {

    @Test
    void contextLoads() {
        String testStr = " / ";
        System.out.println(Arrays.toString(testStr.split(" / ")));
    }

}
