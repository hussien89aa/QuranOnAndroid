package com.example.hussienalrubaye.quranonline;

/**
 * Created by hussienalrubaye on 12/26/15.
 */
/**
 * Created by ASUS S550C on 18/01/2015.
 */
public class AuthorClass {
    public String RealName ;
    public String ServerName ;
    public String StateName ;
    public String ImgUrl ;
    public AuthorClass(){}
    public AuthorClass(String ServerName,String RealName)
    { this.ServerName=ServerName;
        this.RealName=RealName;
    }
    public AuthorClass(String ServerName,String RealName,String StateName,String ImgUrl)
    { this.ServerName=ServerName;
        this.RealName=RealName;
        this.StateName=StateName;
        this.ImgUrl=ImgUrl;
    }
}
