public class MyLinkedListOfInteger {

    private class Node{
        public Integer element;
        public Node next;
        public Node(Integer e){
            this.element=e;
            next=null;
        }
        public Node(Integer e, Node n){
            this.element=e;
            this.next=n;
        }
    }
    private Node head;
    private Node tail;
    private int count;

    public MyLinkedListOfInteger(){
        head=null;
        tail=null;
        count=0;
    }
    public void add(Integer e){
        Node n = new Node(e);
        if (count == 0) {
            head=n;
            tail=n;
            n.next=null;
            count++;
        }
        else {
            tail.next=n;
            tail=n;
            n.next=null;
        }
    }
    public void add(Integer e, int index){
        Node n = new Node(e);
        if(index<0 || index>=count){
            System.out.println("Index out of bounds!");
        }
        else if (index==count-1) {
            tail.next=n;
            tail=n;
            n.next=null;
        }
        else if (index==0) {
            n.next=head;
            head=n;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }
    public int size(){
        return count;
    }
    public void clear(){
        head=null;
        tail=null;
        count=0;
    }
    public Integer get(int index){
        if((index<0)||(index>=count)){
            throw new IndexOutOfBoundsException();
        }
        if(index==count-1){
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
    public void middleInsert(int index, Integer element){
        Node bef;
        bef=head;
        for(int i=0; i<index; i++){
            bef = bef.next;
        }
    }
}
