package guru.springframework.spring6di.services.i18n;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("en")
@Service("i18nService")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello world - en";
    }
}
