package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {//If we had defined the "name" query parameter then it will be assigned to the name variable of hello() method otherwise the default value will be set as "world"
        return String.format("Hello %s!", name);
    }
}
