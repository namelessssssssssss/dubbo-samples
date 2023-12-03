package org.apache.dubbo.samples.api;

import javax.jws.soap.SOAPBinding.Use;

public class Response {

    String msg;

    User user;

    public Response(String msg, User user) {
        this.msg = msg;
        this.user = user;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
