import java.util.ArrayList;

/**
 * @author Richard Ludwig
 * @version 0.1
 * <h2>Classe para criação de listas duplamente encadeadas</h2>
 * @param <T> Define a tipagem utilizada na lista.
 */
public class MyDoublyLinkedList<T>{
    private Node header;
    private Node trailer;
    private Node current;
    private int count;
    public MyDoublyLinkedList(){
        this.header=new Node(null);
        this.trailer=new Node(null);
        header.next=trailer;
        trailer.prev=header;
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
    public T next(){
        if (current == trailer){
            return null;
        }
        else{
            T e = current.element;
            current=current.next;
            return e;
        }
    }
    public void reset(){
        current=header.next;
    }
    public void add(T e){
        //Creates the node
        Node n = new Node(e);
        //Creates the previous and the next linked nodes
        n.prev=trailer.prev;
        n.next=trailer;
        //Inserts the node into the linked list
        trailer.prev.next=n;
        trailer.prev=n;
    }
    public void add(T e, int index){
        if(index<0|| index>count){
            throw new IndexOutOfBoundsException();
        }
        if (index==count){
            this.add(e);
        }
        else {
            Node n = new Node(e);
            Node aux = getNodeByIndex(index);
            n.next = aux;
            n.prev=aux.prev;
        }
    }
    public T get(int index){
        if((index<0) || (index>=count)){
            throw new IndexOutOfBoundsException();
        }
        Node aux = getNodeByIndex(index);
        return aux.element;
    }
    public T set(T e, int index){
        if ((index < 0) || (index >= count)) {
            throw new IndexOutOfBoundsException();
        }
        Node aux = getNodeByIndex(index);
        T t = aux.element;
        aux.element = e;
        return t;
    }
    public boolean remove(T e){
        Node aux = header.next;
        while (aux != trailer) {
            if (aux.element.equals(e)) {
                aux.prev.next = aux.next;
                aux.next.prev = aux.prev;
                count--;
                return true;
            }
            aux = aux.next;
        }
        return false;
    }
    public T removeByIndex(int index){
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }
        Node aux = getNodeByIndex(index);
        aux.prev.next = aux.next;
        aux.next.prev = aux.prev;
        count--;
        return aux.element;
    }
    public boolean isEmpty(){
        return (count == 0);
    }
    public int size(){
        return count;
    }
    public boolean contains(T e){
        Node aux = header.next;
        while (aux != trailer) {
            if (aux.element.equals(e)) {
                return true;
            }
            aux = aux.next;
        }
        return false;
    }
    public Integer indexOf(T e){
        Node aux = header.next;
        for(int i=0; i<count; i++) {
            if (aux.element.equals(e)) {
                return i;
            }
            aux = aux.next;
        }
        return null;
    }
    public void clear(){
        header = new Node(null);
        trailer = new Node(null);
        header.next = trailer;
        trailer.prev = header;
        count = 0;
    }
    public Node getNodeByIndex(int index){
        Node aux;
        if(index<=count/2){
            aux=header.next;
            for (int i=0; i<index; i++){
                aux=aux.next;
            }
        }
        else {
            aux = trailer.prev;
            for(int i=count-1; i>index; i--){
                aux = aux.prev;
            }
        }
        return aux;
    }
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        Node aux = header.next;
        for(int i=0; i<count; i++){
            s.append(aux.element.toString());
            s.append("\n");
            aux=aux.next;
        }
        return s.toString();
    }
    public ArrayList<T> sublist(int fromIndex, int toIndex){
        if (fromIndex < 0 || toIndex > size())
            throw new IndexOutOfBoundsException();
        if (fromIndex > toIndex)
            throw new IllegalArgumentException();
        int size = toIndex-fromIndex;
        ArrayList<T> a = new ArrayList<>(size);
        Node aux = this.getNodeByIndex(fromIndex);
        for(int i=0; i<size; i++) {
            a.set(i, aux.element);
            aux = aux.next;
        }
        return a;
    }
    public void reverse() {
        if (count > 0) {
            Node aux1 = header.next;
            Node aux2 = trailer.prev;
            for(int i=0; i<(count/2); i++) {
                T num = aux1.element;
                aux1.element = aux2.element;
                aux2.element = num;
                aux1 = aux1.next;
                aux2 = aux2.prev;
            }
        }
    }
    public int countOccurrences(T e){
        Node aux = header.next;
        int c=0;
        for(int i=0; i<count; i++){
            if(aux.element.equals(e)){
                c++;
            }
            aux=aux.next;
        }
        return c;
    }
}
