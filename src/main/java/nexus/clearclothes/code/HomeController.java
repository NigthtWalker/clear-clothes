package nexus.clearclothes.code;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*****************************************
 * *
 * @dookay.com Internet make it happen *
 * ----------- ----------------------- *
 * dddd ddddd Internet make it happen *
 * o o o Internet make it happen *
 * k k k Internet make it happen *
 * a a a Internet make it happen *
 * yyyy yyyyy Internet make it happen *
 * ----------- ----------------------- *
 * @dookay.com Internet make it happen *
 * *
 ****************************************/


@RestController
public class HomeController {


    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/HelloWorld")
    public String hello() {
        return "Hello World!";
    }

}
