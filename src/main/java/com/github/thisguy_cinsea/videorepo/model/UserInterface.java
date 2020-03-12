package com.github.thisguy_cinsea.videorepo.model;

public interface UserInterface extends EntityInterface {
    String getUserName();
    String getPassword();

    void setUserName(String userName);
    void setPassword(String password);
}
