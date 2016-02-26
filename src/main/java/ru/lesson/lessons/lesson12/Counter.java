package ru.lesson.lessons.lesson12;

public class Counter {
    private int amount;

    public synchronized int increse(){
        amount++;
        return amount;
    }
    public static synchronized void echo(){

    }
}
