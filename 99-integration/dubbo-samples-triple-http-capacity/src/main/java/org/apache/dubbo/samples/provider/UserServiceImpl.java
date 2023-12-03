package org.apache.dubbo.samples.provider;

import org.apache.dubbo.samples.api.Response;
import org.apache.dubbo.samples.api.User;
import org.apache.dubbo.samples.api.UserService;

import java.nio.charset.StandardCharsets;

public class UserServiceImpl implements UserService {

    @Override
    public User getUser(String username) {
        return new User(username,"beijing");
    }

    @Override
    public Response createUser(User user) {
        return new Response("ServerReceived:",user);
    }

    @Override
    public Response createUser(String username, String location) {
        return new Response("ServerReceived",new User(username, location));
    }

    @Override
    public Response createUserWithAttachments(String msg, User user, byte[] image) {
        return new Response("ServerReceived msg="+msg+" image="+new String(image, StandardCharsets.UTF_8),user);
    }

}
