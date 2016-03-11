package com.iteso.observer.Observer.impl;

import com.iteso.observer.Subject.impl.SWDP2016;

import java.util.Random;

/**
 * Created by rvillalobos on 3/10/16.
 */
public class Antonio {
    private SWDP2016 swdp2016;
    private String lastMessage;
    private String lastQuestion;

    public String getLastMessage() {
        return lastMessage;
    }

    public void maybeIllListen(String words) {

        Random random = new Random();
        if (random.nextBoolean()) {
            this.lastMessage = words;
        }
    }

    public String getLastQuestion() {
        return lastQuestion;
    }

    public void setLastQuestion(String lastQuestion) {
        this.lastQuestion = lastQuestion;
    }

    public SWDP2016 getSwdp2016() {
        return swdp2016;
    }

    public void setSwdp2016(SWDP2016 swdp2016) {
        this.swdp2016 = swdp2016;
    }


}
