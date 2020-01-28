package com.example.whiteboard.Login;

public class PasswordVerivicationClass {

    private long passwordHash;

    PasswordVerivicationClass(){
    }

    /** Placeholder for the actual hashing algorithm (To be implemented) */
    public static  long makePasswordHash(String password){
        long hash = 0;
        for(int i = 0; i < password.length(); i++){
            hash += password.charAt(i);
        }
        return hash;
    }


}
