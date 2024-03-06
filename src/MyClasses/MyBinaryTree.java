package MyClasses;

import java.util.ArrayList;

public class MyBinaryTree<T> implements MyTree<T> {

    public MyBinaryTree(T rootElement, boolean boolDuplicity, boolean boolArrayList){
        setDuplicity(false);
        useArrayList(boolArrayList);
        size=1;
        root=new Node();
        root.element=rootElement;
    }
    private ArrayList tree;
    private boolean allowDuplicity;
    private int size;
    private Node root;

    public void useArrayList(boolean a) {
        if (a){
            tree=new ArrayList<>();
        }
    }
    public void setDuplicity(boolean value) {
        this.allowDuplicity=value;
    }
    @Override
    public int size() {
        return 0;
    }

    @Override
    public void add(T element) {

    }

    @Override
    public void remove(T elemnt) {

    }

    @Override
    public int height() {
        return 0;
    }

    @Override
    public int width(Node element) {
        return 0;
    }

    @Override
    public T getFather() {
        return null;
    }

    @Override
    public T getLeftChild() {
        return null;
    }

    @Override
    public T getRightChild() {
        return null;
    }

    @Override
    public void organizeTree() {

    }

    @Override
    public T getRoot() {
        return null;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}