package org.apache.dubbo.samples.api;

public class User {
    private String username;

    private String location;

    private Integer id;

    public User(String username, String location) {
        this.username = username;
        this.location = location;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
