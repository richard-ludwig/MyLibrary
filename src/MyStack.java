/**
 * @author Richard Ludwig
 * @version 1.0
 */
public class MyStack {
    private Integer[] stack;
    private int count;
    private int stackSize;
    public MyStack(int t){
        stackSize=t;
        count = 0;
        stack = new Integer[t];
        for (Integer element:stack) {
            element=null;
        }
    }
    public boolean isEmpty(){
        if(count==0){
            return true;
        }
        else{
            return false;
        }
    }
    public int size(){
        return count;
    }
    public Integer top(){
        if (isEmpty()){
            System.out.println("Pilha vazia!");
            return null;
        }
        else {
            return stack[count-1];
        }
    }
    public Integer pop(){
        if (isEmpty()){
            System.out.println("Pilha vazia");
            return null;
        }
        else {
            Integer a = stack[count-1];
            stack[count-1]=null;
            count--;
            return a;
        }
    }
    public void clear(){
        if(!isEmpty()){
            count=0;
            for (Integer element:stack) {
                element=null;
            }
        }
    }
    public void push(Integer e){
        if(count<stackSize){
            count++;
            stack[count-1]=e;
        }
        else {
            System.out.println("Pilha cheia!");
        }
    }
}
