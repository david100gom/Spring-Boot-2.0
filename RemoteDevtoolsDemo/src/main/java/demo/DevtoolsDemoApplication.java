package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevtoolsDemoApplication {

    @RequestMapping(method = RequestMethod.GET, path = "/")
    @ResponseBody
    public String showText() {
        return "스프링 부트 2.0";
    }

    public static void main(String[] args) {
        SpringApplication.run(DevtoolsDemoApplication.class, args);
    }
}