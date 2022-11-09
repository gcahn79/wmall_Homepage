package kr.co.wmall.wmall_homepage.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class HelloController {

    @Autowired
    ApplicationContext ctx;

    @GetMapping("/")
    public String test1() {
        Environment env = ctx.getEnvironment();
        return new StringBuilder(("getMapping root~\n Enviroment's Active profiles : "+Arrays.toString(env.getActiveProfiles()))).toString();
    }

    @GetMapping("hello")
    public String hello(){
        return "Hello~";
    }
}
