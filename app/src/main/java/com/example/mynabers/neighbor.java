package com.example.mynabers;

public class neighbor {
    private String firstName, lastName, url;
    private boolean faivorit = false;

    public neighbor(String firstName, String lastName, String url,boolean favor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.url = url;
        this.faivorit=favor;
    }

    public boolean isFaivorit() {
        return faivorit;
    }

    public void setFaivorit(boolean faivorit) {
        this.faivorit = faivorit;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
