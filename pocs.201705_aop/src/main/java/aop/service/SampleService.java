package aop.service;

import org.springframework.stereotype.Component;

@Component
public class SampleService extends ServiceBase {
    @Override
    public void execute() {
        System.out.println("[[[ AOP execute doing ]]]");
    }
}