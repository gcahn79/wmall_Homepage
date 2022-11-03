package kr.co.wmall.wmall_homepage.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Slf4j
public class appRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext ctx;

    @Override
    public void run(ApplicationArguments args) {
        Environment env = ctx.getEnvironment();

        log.info("=====================================================");
        log.info("spring.profiles.active : " + args.getOptionValues("spring.profiles.active"));
        log.info("Enviroment's Active profiles : " + Arrays.toString(env.getActiveProfiles()));
        log.info("=====================================================");
    }
}
