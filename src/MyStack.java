import MyExceptions.FullStackException;

import java.util.ArrayList;

/**
 * @author Richard Ludwig
 * @version 1.0
 */
public class MyStack<T> {
    private ArrayList<T> stack;
    private int count=10;
    public MyStack(int maxTam){
        count=maxTam;
        stack=new ArrayList<>();
    }
    public MyStack(){
        stack=new ArrayList<>();
    }
    public boolean isEmpty(){
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public int size(){
        return stack.size();
    }
    public T top(){
        if (isEmpty()){
            System.out.println("Pilha vazia!");
            return null;
        }
        else {
            return stack.get(size()-1);
        }
    }
    public T pop(){
        if (isEmpty()){
            System.out.println("Pilha vazia");
            return null;
        }
        else {
            T a = stack.get(0);
            stack.remove(0);
            return a;
        }
    }
    public void clear(){
        if(!isEmpty()){
            stack.clear();
        }
    }
    public void push(T element){
        if(size()+1>count){
            throw new FullStackException("Pilha cheia!");
        }
        else {
            stack.add(0, element);
        }
    }
}
