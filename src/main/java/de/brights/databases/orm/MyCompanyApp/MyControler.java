package de.brights.databases.orm.MyCompanyApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MyControler {


    // http://localhost:8080/
    @GetMapping("/")
    public @ResponseBody String getSomething() {
        return "something";
    }
}
