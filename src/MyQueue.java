import java.util.Queue;

public class MyQueue {
    private Integer[] queue;
    private int count;
    private int queueSize;

    public MyQueue(int t){
        queue = new Integer[t];
        count=0;
        queueSize=t;
    }
    public boolean isEmpty(){
        if(count==0){
            return true;
        }
        else{
            return false;
        }
    }
    public void enqueue(Integer e){
        if(count<queueSize){
            count++;
            queue[count-1]=e;
        }
        else {
            System.out.println("Fila cheia!");
        }
    }
}
