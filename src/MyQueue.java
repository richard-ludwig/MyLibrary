import MyExceptions.EmptyQueueException;
import MyExceptions.FullQueueException;

import java.util.ArrayList;

public class MyQueue<T> {
    private ArrayList<T> queue;
    private int count=0;

    public MyQueue(int maxTam){
        this.count=maxTam;
        this.queue = new ArrayList<>();
    }
    public MyQueue(int maxTam, boolean allow){
        this.count=maxTam;
        this.queue = new ArrayList<>();
    }
    public MyQueue(){
        this.queue=new ArrayList<>();
    }
    public boolean isEmpty(){
        if(queue.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public void enqueue(T element){
        if(count!=0 && size()+1>count){
            throw new FullQueueException("Fila cheia!");
        }
        else {
            queue.add(size()-1, element);
        }
    }
    public T dequeue(){
        if (isEmpty()){
            throw new EmptyQueueException("Fila vazia!");
        }
        else {
            T a = queue.get(0);
            queue.remove(0);
            return a;
        }
    }
    public void clear(){
        if(!isEmpty()){
            queue.clear();
        }
    }
    public int size(){
        return queue.size();
    }
}
