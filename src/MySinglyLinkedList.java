/**
 * @author Richard Ludwig
 * @version 0.1
 */
public class MySinglyLinkedList<T> {
    private Node head;
    private Node tail;
    private int count;
    private class Node{
        public T element;
        public Node next;
        public Node(T e){
            this.element=e;
            this.next=null;
        }
        public Node(T e, Node n){
            this.element=e;
            this.next=n;
        }
    }
    public MySinglyLinkedList(){
        this.head=null;
        this.tail=null;
        this.count=0;
    }
    public void add(T e){
        Node n = new Node(e);
        if (isEmpty()) {
            head=n;
        }
        else {
            tail.next=n;
        }
        tail=n;
        count++;
    }
    public void add(T e, int index){
        if(index<0 || index>size()){
            throw new IndexOutOfBoundsException();
        }
        Node n = new Node(e);
        if (index==size()) {
            tail.next=n;
            tail=n;
        }
        else if (index==0) {
            if (isEmpty()) {
                tail = n;
            }
            else {
                n.next = head;
            }
            head=n;
        }
        else {
            Node before =head;
            for (int i =0; i<index-1;i++){
                before=before.next;
            }
            n.next=before.next;
            before.next=n;
        }
    }

    public boolean isEmpty(){
        return (head == null);
    }
    public int size(){
        return count;
    }
    public void clear(){
        this.head=null;
        this.tail=null;
        this.count=0;
    }
    public T set(int index, T e){
        if((index<0)||(index>=size())){
            throw new IndexOutOfBoundsException();
        }
        if(index == size()-1){
            T t = tail.element;
            tail.element=e;
            return t;
        }
        Node aux=head;
        for (int i =0; i<index; i++){
            aux=aux.next;
        }
        T t = aux.element;
        aux.element=e;
        return t;
    }
    public T get(int index){
        if((index<0)||(index>=size())){
            throw new IndexOutOfBoundsException();
        }
        if(index==size()-1){
            return tail.element;
        }
        Node aux = head;
        int c = 0;
        while (c<index){
            aux = aux.next;
            c++;
        }
        return aux.element;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        Node aux = head;
        if(isEmpty()){
            s.append("Lista Vazia");
            return s.toString();
        }
        while(aux!=null){
            s.append(aux.element.toString());
            s.append("\n");
            aux = aux.next;
        }
        return s.toString();
    }
    public Integer indexOf(T e){
        Node aux =head;
        for(int i=0; i<count; i++){
            if (aux.element.equals(e)){
                return i;
            }
            aux=aux.next;
        }
        return null;
    }
    public T removeByIndex(int index){
        Node before=head;
        for(int i =0; i<index-1;i++){
            before=before.next;
        }
        Node aux = before.next;
        before.next=aux.next;
        return aux.element;
    }
    public boolean remove(T element){
        if(isEmpty()){
            return false;
        }
        if (head.element.equals(element)){
            if (size()==1){
                clear();
            }
            else {
                head=head.next;
                count--;
            }
            return true;
        }
        Node aux = head.next;
        Node ant = head;
        while (aux != null) {
            if (aux.element.equals(element)) {
                if (aux == tail) {
                    tail = ant;
                    tail.next = null;
                }
                else {
                    ant.next = aux.next;
                }
                count--;
                return true;
            }
            aux = aux.next;
            ant = ant.next;
        }
        return false;
    }
}