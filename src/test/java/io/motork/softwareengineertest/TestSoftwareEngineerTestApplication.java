package io.motork.softwareengineertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestSoftwareEngineerTestApplication {

    public static void main(String[] args) {
        SpringApplication.from(SoftwareEngineerTestApplication::main).with(TestSoftwareEngineerTestApplication.class).run(args);
    }

}
