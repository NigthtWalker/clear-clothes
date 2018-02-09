package nexus.clearclothes.code;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

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
@SpringBootApplication
public class FrontApp {

    public static void main(String[] args) {
        SpringApplication.run(FrontApp.class, args);
    }

    //指定下bean的名称
    @Bean(name = "sean")
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                System.out.println("Let's inspect the beans provided by Spring Boot:");
                String[] beanNames = ctx.getBeanDefinitionNames();
                for (String beanName : beanNames){
                    System.out.println(beanName);
                }
            }
        };
    }



}
