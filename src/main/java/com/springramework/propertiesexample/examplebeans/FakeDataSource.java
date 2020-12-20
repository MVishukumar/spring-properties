package com.springramework.propertiesexample.examplebeans;

public class FakeDataSource {
    private String username;
    private String password;
    private String dburl;

    public FakeDataSource() {
    }

    public FakeDataSource(String username, String password, String dburl) {
        this.username = username;
        this.password = password;
        this.dburl = dburl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDburl() {
        return dburl;
    }

    public void setDburl(String dburl) {
        this.dburl = dburl;
    }
}
