package ru.lesson.lessons.lesson12;

import java.util.LinkedList;

public class BlockQueue <T>{
    public final LinkedList<T> queue = new LinkedList<T>();

    public void push(final T t){
        synchronized (this.queue){
            this.queue.add(t);
            this.queue.notifyAll();
        }
    }

    public T poll(){
        synchronized (this.queue){
            while (this.queue.isEmpty()){
                try {
                    this.queue.wait();

                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
            }
            return this.queue.remove();
        }
    }
}
