package nexus.clearclothes.test;

import nexus.clearclothes.code.controller.HomeController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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


@RunWith(SpringRunner.class)
@SpringBootTest(classes = HomeController.class)
@AutoConfigureMockMvc
public class FrontTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Greetings from Spring Boot!")));
    }

}


