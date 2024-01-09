package guru.springframework.spring6di.services;


import org.springframework.stereotype.Service;

@Service("greetingServiceSetter")
public class GreetingServiceSetterInjected implements GreetingService{
    @Override
    public String sayGreetings() {
        return "Hello from the service of setter injected ";
    }
}
