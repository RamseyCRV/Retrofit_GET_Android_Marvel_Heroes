package com.example.marvelheroes;

import com.google.gson.annotations.SerializedName;

public class Hero {
    @SerializedName("name")
    private String name;

    @SerializedName("realname")
    private String realname;

    @SerializedName("team")
    private String team;

    @SerializedName("firstappearance")
    private String firstappaearance;

    @SerializedName("publisher")
    private String publisher;

    @SerializedName("imageurl")
    private String imageurl;

    @SerializedName("bio")
    private String bio;

    @SerializedName("createdby")
    private String createBy;

    public Hero(String name, String realname, String team, String firstappaearance, String createBy, String publisher, String bio) {
        this.createBy = createBy;
        this.name = name;
        this.realname = realname;
        this.team = team;
        this.firstappaearance = firstappaearance;
        this.publisher = publisher;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public String getRealname() {
        return realname;
    }

    public String getTeam() {
        return team;
    }

    public String getFirstappaearance() {
        return firstappaearance;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getImageurl() {
        return imageurl;
    }

    public String getBio() {
        return bio;
    }

    public String getCreateBy() {
        return createBy;
    }

}
