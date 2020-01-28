package com.example.whiteboard.Login;

import android.content.Context;
import android.widget.Toast;

public class LoginClass {

    private static String username, password;


    public LoginClass(String username, String password){
        this.username = username;
        this.password = password;
    }

    public static void LogIn(Context ctx){

        long newPassHash = new PasswordVerivicationClass().makePasswordHash(password);
        long databasePassHash = 642; //TODO: Implement Database hash fetching - Right now "Hash" is done by adding ASCII values of the character
                                    /** Refer to: https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html for the values*/

        if(newPassHash == databasePassHash) {
            Toast.makeText(ctx, "Login Successful: " + newPassHash, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(ctx, "Login Failed", Toast.LENGTH_LONG).show();
        }
    }

}
