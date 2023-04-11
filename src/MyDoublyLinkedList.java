public class MyDoublyLinkedList<T>{
    private Node header;
    private Node trailer;
    private int count;
    public MyDoublyLinkedList(){
        this.header=new Node(null);
        this.trailer=new Node(null);
        this.count=0;
    }
    private class Node {
        public T element;
        public Node next;
        public Node prev;

        public Node(T e) {
            this.element = e;
            this.next = null;
            this.prev=null;
        }
    }
    public void add(T e){

    }
    public void add(T e, int index){

    }
    public T get(int index){

    }
    public T set(T e, int index){

    }
    public boolean remove(T e){

    }
    public T removeByIndex(int index){

    }
    public boolean isEmpty(){

    }
    public int size(){

    }
    public boolean contains(T e){

    }
    public int indexOf(T e){

    }
    public void clear(){

    }
}
