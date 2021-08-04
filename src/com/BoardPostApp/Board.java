package com.BoardPostApp;

public class Board {

    void displayMessage(User user, Message message){
        user.postMessage(user,message);
    }
}
