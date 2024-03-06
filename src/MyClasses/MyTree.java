package MyClasses;
public interface MyTree<T>{
    class Node<T>{
        T element;
        Node father;
        Node leftChild;
        Node rightChild;
    }
    public int height();
    public int width(Node element);
    public T getFather();
    public T getLeftChild();
    public T getRightChild();
    public void organizeTree();
    public T getRoot();
    public void add(T element);
    public  void remove(T element);
    public int size();
}
