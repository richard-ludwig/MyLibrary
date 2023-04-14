/**
 * @author Richard Ludwig
 * @version 0.1
 */
public class MySinglyLinkedList<T> {

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
    private Node head;
    private Node tail;
    private int count;

    public MySinglyLinkedList(){
        this.head=null;
        this.tail=null;
        this.count=0;
    }
    public void add(T e){
        Node n = new Node(e);
        if (count == 0) {
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
        if (index==count) {
            tail.next=n;
            tail=n;
        }
        else if (index==0) {
            if (head == null) {
                tail = n;
                n.next = null;
            } else {
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
        if((index<0)||(index>=count)){
            throw new IndexOutOfBoundsException();
        }
        if(index == count-1){
            T n = tail.element;
            tail.element=e;
            return n;
        }
        Node aux=head;
    }
    public T get(int index){
        if((index<0)||(index>=count)){
            throw new IndexOutOfBoundsException();
        }
        if(index==count-1){
            return tail.element;
        }
        Node aux = head;
        int a = 0;
        while (a<index){
            aux = aux.next;
            a++;
        }
        return aux.element;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        Node aux = head;
        if(count==0){
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
    public void middleInsert(int index, T element){
        Node bef=head;
        for(int i=0; i<index; i++){
            bef = bef.next;
        }
    }
    public Integer indexOf(T e){
        Node aux =head;
        for(int i=0; i<count; i++){
            if (aux.element.equals(e)){
                return i;
            }
            else {
                aux=aux.next;
            }
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
        Node auxB, auxA=head;
        if(isEmpty()){
            return false;
        }
        if (head.element.equals(element)){
            if (count==1){
                clear();
            }
            else {
                head=head.next;
                count--;
            }
            return true;
        }
        for(int i=0; i<count;i++){
            if (head.next == null){
                System.out.println("Elemento não existe!");
                return false;
            }
            if(head.next.element.equals(element)){
                auxA=head.next;
                head.next=auxA.next;
                count--;
                return true;
            }
            auxA=auxA.next;
        }
        auxB=auxA.next;
        auxA.next=auxB.next;
    }
}