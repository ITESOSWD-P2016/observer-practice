package com.iteso.observerpattern.Observer;

/**
 * Created by lnvitado on 11/03/2016.
 */
public interface iObserver {
    void sendMessageToChat(String message);
    void updateChat(String message);
}
