package com.fire.fire.postandcommenttutorial.models;

import java.io.Serializable;

/**
 * Created by brad on 2017/02/05.
 */

public class User implements Serializable {
    private String user;
    private String email;
    private String photoUrl;
    private String uid;

    public User() {
    }

    public User(String user, String email, String photoUrl, String uid) {

        this.user = user;
        this.email = email;
        this.photoUrl = photoUrl;
        this.uid = uid;
    }

    public String getUser() {

        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
