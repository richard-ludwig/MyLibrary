package MyClasses;

import MyExceptions.EmptyStackException;
import MyExceptions.FullStackException;

import java.util.ArrayList;

/**
 * @author Richard Ludwig
 * @version 1.0
 */
public class MyStack<T> {
    private ArrayList<T> stack;
    private int size=10;
    /**
     * Constructor Method
     * Starts the class with the parametric maximum size
     */
    public MyStack(int maxTam){
        this.size=maxTam;
        this.stack=new ArrayList<>();
    }

    /**
     * Constructor Method
     * Starts the class with the pattern maximum size
     */
    public MyStack(){
        stack=new ArrayList<>();
    }

    /**
     * Verifies if the stack is empty.
     * @return A boolean value relative with the emptiness of the stack
     */
    public boolean isEmpty(){
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Gets the stack size/number of elements in the stack.
     * @return An int value with the stack size.
     */
    public int size(){
        return stack.size();
    }

    /**
     * Gets the top element of the stack/last element of the list.
     * @return The element.
     * @since 1.0.
     */
    public T top(){
        if (isEmpty()){
            System.out.println("Pilha vazia!");
            return null;
        }
        else {
            return stack.get(size()-1);
        }
    }

    /**
     * Gets and Removes the top element of the stack/last element of the list.
     * @throws EmptyStackException in case of stack emptiness.
     * @return The removed element.
     * @since 1.0.
     */
    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException("The stack is empty!");
        }
        else {
            T a = stack.get(0);
            stack.remove(0);
            return a;
        }
    }

    /**
     * Clears the stack.
     * @since 1.0.
     */
    public void clear(){
        if(!isEmpty()){
            stack.clear();
        }
    }

    /**
     * Inserts an element in the stack
     * @param element The element to be inserted in the stack.
     * @throws FullStackException in case of stack fullness.
     * @since 1.0.
     */
    public void push(T element){
        if(size()+1>this.size){
            throw new FullStackException("The stack is full!");
        }
        else {
            stack.add(size(), element);
        }
    }
}
