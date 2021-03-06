package com.iteso.observer;

import java.util.Random;

/**
 * Created by rvillalobos on 3/10/16.
 */
public class Sebastian {
    private SWDP2016 swdp2016;
    private String lastMessage;
    private String lastQuestion;

    public String getLastMessage() {
        return lastMessage;
    }

    public void setWhateverMessageIWantWhenIWant(String lastMessage) {
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (new Random().nextBoolean()) {
            this.lastMessage = lastMessage;
        }
        else {
            this.lastMessage = "My idea is better";
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

    public void askSomething(String myQuestion){
        setLastQuestion(myQuestion);
        getSwdp2016().askQuestionToTeacher(getLastQuestion());
    }
}
