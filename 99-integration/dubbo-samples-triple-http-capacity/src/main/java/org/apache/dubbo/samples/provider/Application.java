package org.apache.dubbo.samples.provider;

import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;
import org.apache.dubbo.samples.api.UserService;

public class Application {

    public static void main(String[] args) {
        ServiceConfig<UserService> userServiceServiceConfig = new ServiceConfig<>();
        userServiceServiceConfig.setInterface(UserService.class);
        userServiceServiceConfig.setRef(new UserServiceImpl());
        DubboBootstrap bootstrap = DubboBootstrap.getInstance().application("UserProviderApplication")
                .service(userServiceServiceConfig)
                .protocol(new ProtocolConfig("tri"))
                .start().await();
    }
}
