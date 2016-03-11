package com.iteso.observer.Impl;

import com.iteso.observer.Observer;
import com.iteso.subject.Impl.SWDP2016;
import com.iteso.subject.Subject;
/**
 * Created by rvillalobos on 3/10/16.
 */
public class Alejandra implements Observer{
    private String name;
    private SWDP2016 swdp2016;
    private String lastMessage;
    private String lastQuestion;

    public String getLastMessage() {

        return lastMessage;
    }
    public Alejandra(Subject chatSWDP2016, String MyName){
        Subject slack = chatSWDP2016;
        this.name = MyName;
        slack.registerObserver(this);
    }
    //public void tellMeSomething(String something) {
      //  this.lastMessage = something;
        //String complain = "will you give more checkpoints for that?";
       // getSwdp2016().askQuestionToTeacher(complain);
  //  }

  //  public String getLastQuestion()
    // return lastQuestion;
   // }

//    public void setLastQuestion(String lastQuestion) {
 //       this.lastQuestion = lastQuestion;
 //   }

    public SWDP2016 getSwdp2016() {

        return swdp2016;
    }

    public void setSwdp2016(SWDP2016 swdp2016) {
        this.swdp2016 = swdp2016;
    }

  //  public void askSomething(String myQuestion){
    //    setLastQuestion(myQuestion);
    //    getSwdp2016().askQuestionToTeacher(getLastQuestion());
   // }
    public void sendMessage(String message) {
        this.lastMessage = message;
    }
}
