package org.apache.dubbo.samples.api;


public interface UserService {

    //x-www-form & plaintext
    User getUser(String username);

    //json & xml
    Response createUser(User user);

    //multipart & x-www-form
    Response createUser(String username,String location);

    //multipart
    Response createUserWithAttachments(String msg,User user,byte[] image);
}
