package com.zhang.sampleprovider.providers;


import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;
import com.zhang.IHelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

@Service
public class HelloServiceImpl implements IHelloService {
    @Value("${dubbo.application.name}")
    private String serviceName;
    @Override
    public String sayHello(String name) {
        return String.format("[%s]: hello, %s", serviceName, name);
    }
}
