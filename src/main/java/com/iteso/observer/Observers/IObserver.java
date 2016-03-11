package com.iteso.observer.Observers;

/**
 * Created by luis_ on 11/03/2016.
 */
public interface IObserver {
    void sendMessageToStudents(String message);
    void askQuestionToTeacher(String question);

}
