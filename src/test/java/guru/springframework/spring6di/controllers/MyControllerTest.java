package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {

    @Test
    void sayHello() {

        MyController myController = new MyController();
        System.out.println(myController.sayHello());
    }
}