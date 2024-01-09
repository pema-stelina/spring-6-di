package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PropertyinjectedController {

    @Qualifier("greetingServicePropertyInjection")
    @Autowired
    GreetingService greetingService;

    public String sayHello(){
       return greetingService.sayGreetings();
    }
}
