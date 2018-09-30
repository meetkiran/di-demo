package guru.springframework.controllers;

import org.springframework.stereotype.Service;

@Service
public class MyControllerServiceImpl implements MyControllerService {
    @Override
    public String sayHello() {
        return "hello service";
    }

}
