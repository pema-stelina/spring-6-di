package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("greetingServicePropertyInjection")
public class GreetingServicePropertyInjected implements GreetingService {

    @Override
    public String sayGreetings() {
        return "Hello from the property injected service";
    }
}
