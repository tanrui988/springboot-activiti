package com.bpm.demo;

import org.activiti.engine.RuntimeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private RuntimeService runtimeService;

    @Test
    public void startProcess(){
        runtimeService.startProcessInstanceByKey("myProcess1");
    }
}
