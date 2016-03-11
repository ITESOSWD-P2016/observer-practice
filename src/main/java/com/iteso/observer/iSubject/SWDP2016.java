package com.iteso.observer;

/**
 * Created by rvillalobos on 3/10/16.
 */
public class SWDP2016 {
    Alejandra alejandra;
    Alexa alexa;
    Antonio antonio;
    Ariana ariana;
    Cristhian cristhian;
    Flavio flavio;
    Jorge jorge;
    Josue josue;
    Luis luis;
    Rene rene;
    Sabino sabino;
    Saul saul;
    Sebastian sebastian;
    Rodrigo rodrigo;

    public SWDP2016(){
        alejandra = new Alejandra();
        alexa = new Alexa();
        antonio = new Antonio();
        ariana = new Ariana();
        cristhian = new Cristhian();
        flavio = new Flavio();
        jorge = new Jorge();
        josue = new Josue();
        luis = new Luis();
        rene = new Rene();
        sabino = new Sabino();
        saul = new Saul();
        sebastian = new Sebastian();
    }

    public void sendMessageToStudents(String message) {
        alejandra.tellMeSomething(message);
        alexa.tryToGetMyAttention(message);
        antonio.maybeIllListen(message);
        ariana.setLastMessage(message);
        cristhian.setLastMessage(message);
        flavio.setLastMessage(message);
        jorge.setLastMessage(message);
        josue.tryToSendMeMessage(message);
        luis.setLastMessage(message);
        rene.setLastMessage(message);
        sabino.setLastMessage(message);
        saul.setLastMessage(message);
        sebastian.setWhateverMessageIWantWhenIWant(message);

    }
    public void askQuestionToTeacher(String question){
        rodrigo.setLastQuestion(question);

    }

    public void 
}
