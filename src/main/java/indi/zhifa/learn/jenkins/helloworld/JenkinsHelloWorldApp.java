package indi.zhifa.learn.jenkins.helloworld;

import indi.zhifa.learn.jenkins.helloworld.common.util.DtoEntityUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"indi.zhifa.learn.jenkins.helloworld"})
public class JenkinsHelloWorldApp {
    public static void main(String[] args) {
        DtoEntityUtil.init();
        SpringApplication.run(JenkinsHelloWorldApp.class, args);
    }
}
