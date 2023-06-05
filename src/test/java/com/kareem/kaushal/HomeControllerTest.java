package com.kareem.kaushal;

import com.kareem.kaushal.controller.HomeController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class HomeControllerTest {

    HomeController a = new HomeController();
    @Test
    void TestController(){


        if(a.testMethod("kaushal").equals("My name is kaushal")){
            System.out.println("test method woking properly");
        }else{
            System.out.println("it is not working");
        }
    }
}
