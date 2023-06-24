package MyClasses;
import MyExceptions.EmptyLinkedListException;
import MyExceptions.FullLinkedListException;

import java.util.ArrayList;

/**
 * @author Richard Ludwig
 * @version 0.6 | (31-05-2023)
 * <h2>Classe para criação de listas duplamente encadeadas</h2>
 * @param <T> Define a tipagem utilizada na lista.
 */
public class MyDoublyLinkedList<T>{

        // Referencia para o sentinela de inicio da lista encadeada.
        private Node header;
        private boolean allowDuplicity;
        // Referencia para o sentinela de fim da lista encadeada.
        private Node trailer;
        // Referencia que aponta para uma posicao corrente da lista
        private Node current;
        // Contador do numero de elementos da lista.
        private int count;
        private int maxSize;

        /**
         * Intern private class to the nodes of the linked list
         * @since 0.1
         */
        private class Node {
            public T element;
            public Node next;
            public Node prev;
            public Node(T e) {
                this.element = e;
                next = null;
                prev = null;
            }
        }

        /**
         * Constructor of Doubly Linked List
         * @since 0.1
         */
        public MyDoublyLinkedList() {
            header = new Node(null);
            trailer = new Node(null);
            header.next = trailer;
            trailer.prev = header;
            count = 0;
        }
        public MyDoublyLinkedList(boolean allowDuplicity){
            new MyDoublyLinkedList(allowDuplicity, 0);
        }
        public MyDoublyLinkedList(int maxSize){
            new MyDoublyLinkedList(true, maxSize);
        }
        public MyDoublyLinkedList(boolean allowDuplicity, int maxSize){
            new MyDoublyLinkedList();
            this.allowDuplicity=allowDuplicity;
            this.maxSize=maxSize;
        }

        /**
         * Retorna o numero de elementos da lista
         * @return int value corresponding with the size of the list
         * @since 0.1
         */
        public int size() {
            return count;
        }
        /**
         * Faz a referencia para a posicao corrente apontar
         * para o primeiro elemento da lista.
         * @since 0.2
         */
        public void reset() {
            current = header.next;
        }

        /**
         * @return The next element of the current node.
         * @since 0.2
         */
        public T next () {
            if (current == trailer) // se chegou no final da lista
                return null;
            else {
                T a = current.element;
                current = current.next;
                return a;
            }
        }
    public T previous () {
        if (current == header) // se chegou no final da lista
            return null;
        else {
            T a = current.element;
            current = current.prev;
            return a;
        }
    }

        /**
         * Adiciona um elemento ao final da lista
         * @param element elemento a ser adicionado ao final da lista
         */
        public void add(T element) {
            add(size(), element);
        }
        /**
         * Insere um elemento em uma determinada posicao da lista
         * @param index a posicao da lista onde o elemento sera inserido
         * @param element elemento a ser inserido
         * @throws IndexOutOfBoundsException se (index < 0 || index > size())
         */
        public void add(int index, T element) throws IndexOutOfBoundsException {
            // Primeiro verifica se index eh valido
            if (index < 0 || index > size() ) { // indice invalido
                throw new IndexOutOfBoundsException("Índice inválido!");
            }
            if (maxSize==size()){
                throw new FullLinkedListException("Lista cheia!");
            }
            if(allowDuplicity == false){
                if(contains(element)){
                    return;
                }
            }
            // Primeiro cria o nodo
            Node n = new Node(element);
            if (index == size()) { // se insercao no final
                Node aux = trailer;
                // Primeiro "gruda" o novo nodo na lista
                n.next = aux;
                n.prev = aux.prev;
                // Atualiza as referencias para apontarem para o novo nodo
                aux.prev.next = n; // Node ant = aux.prev; ant.next = n;
                aux.prev = n;
            }
            else {
                // Pega a referencia para o nodo da posicao index
                Node aux = getNode(index);
                // Primeiro "gruda" o novo nodo na lista
                n.next = aux;
                n.prev = aux.prev;
                // Atualiza as referencias para apontarem para o novo nodo
                aux.prev.next = n; // Node ant = aux.prev; ant.next = n;
                aux.prev = n;

            }
            // Atualiza o contador
            count++;
            current=n;
        }
        /**
         * Remove a primeira ocorrencia do elemento na lista, se existir
         * @param element elemento a ser removido
         * @return valor booleano correspondente, se a lista contém o elemento especificado
         */
        public boolean removeFirstOccurence(T element) {
            Node aux = header.next;
            while (aux != trailer) {
                if (aux.element.equals(element)) { // if(num%2==0)
                    if(aux.equals(header.next)){
                        current=aux.next;
                    }
                    else{
                        current=aux.prev;
                    }
                    aux.prev.next = aux.next;
                    aux.next.prev = aux.prev;
                    count--;
                    return true;
                }
                aux = aux.next;
            }
            return false;
        }
        public T remove() {
            return remove(size()-1);
        }
        /**
         * Remove o elemento de uma determinada posicao da lista
         * @param index a posicao da lista
         * @return o elemento que foi removido da lista
         * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
         */
        public T remove(int index) {
            // Primeiro verifica se index eh valido
            if(isEmpty()){
                throw new EmptyLinkedListException("Cannot remove from empty linked list!");
            }
            if (index < 0 || index >= size()) {
                throw new IndexOutOfBoundsException();
            }
            Node aux = getNode(index);
            if(aux.equals(header.next)){
                current=aux.next;
            }
            else{
                current=aux.prev;
            }
            aux.prev.next = aux.next;
            aux.next.prev = aux.prev;
            count--;
            return aux.element;
        }
        /**
         * Retorna true se a lista contem o elemento especificado
         * @param element o elemento a ser testado
         * @return true se a lista contém o elemento especificado
         */
        public boolean contains(T element) {
            Node aux = header.next;
            while (aux != trailer) {
                if (aux.element.equals(element)) {
                    return true;
                }
                aux = aux.next;
            }
            return false;
        }
        /**
         * Retorna o elemento de uma determinada posicao da lista
         * @param index a posicao da lista
         * @return o elemento da posicao especificada
         * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
         */
        public T get(int index) {
            if ((index < 0) || (index >= count)) {
                throw new IndexOutOfBoundsException();
            }
            Node aux = getNode(index);
            current=aux;
            return aux.element;
        }
        // Retorna referencia para o nodo da posicao index
        private Node getNode(int index) {
            Node aux = header.next;
            if(index <= count/2) { // se esta na primeira metade da lista
                for(int i=0; i<index; i++) {
                    aux = aux.next;
                }
            }
            else { // se esta na segunda metade da lista
                aux = trailer.prev;
                for(int i=count-1; i>index; i--) {
                    aux = aux.prev;
                }
            }
            return aux;
        }
        /**
         * Retorna o indice da primeira ocorrencia do elemento na lista, ou -1 se a lista não contém o elemento
         * @param element o elemento a ser buscado
         * @return o indice da primeira ocorrencia do elemento na lista, ou -1 se a lista não contém o elemento
         */
        public int indexOf(T element) {
            Node aux = header.next;
            for(int i=0; i<count; i++) {
                if (aux.element.equals(element)) {
                    current=aux;
                    return i;
                }
                aux = aux.next;
            }
            return -1;
        }
        /**
         * Substitui o elemento armanzenado em uma determinada posicao da lista pelo elemento indicado
         * @param index a posicao da lista
         * @param element o elemento a ser armazenado na lista
         * @return o elemento armazenado anteriormente na posicao da lista
         * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
         */
        public T set(int index, T element) {
            // Primeiro verifica se index eh valido
            if ((index < 0) || (index >= count)) {
                throw new IndexOutOfBoundsException();
            }
            // Recebe a referencia para o nodo da posicao index
            Node aux = getNode(index);

            // Guarda o elemento da posicao index
            T a = aux.element;
            // Coloca o novo elemento na posicao index
            aux.element = element;
            // Retorna o elemento guardado
            return a;
        }
        /**
         * Esvazia a lista
         */
        public void clear() {
            header.next = trailer;
            trailer.prev = header;
            count = 0;
        }
        /**
         * Retorna true se a lista não contem elementos
         * @return true se a lista não contem elementos
         */
        public boolean isEmpty() {
            return (count == 0);
        }
        @Override
        public String toString() {
            StringBuilder s = new StringBuilder();
            Node aux = header.next;
            for (int i = 0; i < count; i++) {
                s.append(aux.element.toString());
                s.append("\n");
                aux = aux.next;
            }
            return s.toString();
        }
        /**
         * Retorna um arranjo com uma copia de um subconjunto dos elementos da
         * lista.
         *
         * @param fromIndex a posição inicial ("inclusive") dos elementos a serem
         * incluídos
         * @param toIndex a posição final ("exclusive") dos elementos a serem
         * incluídos
         * @return um arranjo com um subconjunto da lista
         * @throws IndexOutOfBoundsException se (fromIndex < 0 || toIndex > size())
         * @throws IllegalArgumentException se (fromIndex > toIndex)
         */
        public ArrayList<T> subList(int fromIndex, int toIndex) {
            // Primeiro verifica se os indices sao validos
            if (fromIndex < 0 || toIndex > size()) {
                throw new IndexOutOfBoundsException();
            }
            if (fromIndex > toIndex) {
                throw new IllegalArgumentException();
            }
            // Cria um array com (toIndex-fromIndex) posicoes
            ArrayList<T> a= new ArrayList<T>();

            // "Caminha" na lista ate a posicao fromIndex
            Node aux = this.getNode(fromIndex);

            // Copiar os elementos entre fromIndex e toIndex para o array
            for (int i=0; i<size(); i++) {
                a.add(aux.element);
                aux = aux.next;
            }
            return a; // Returns the ArrayList
        }
        public int countOccurrences(T element) {
            Node aux = header.next;
            int contador = 0;
            for(int i=0; i<count; i++) {
                if (aux.element.equals(element)) {
                    contador++;
                }
                aux = aux.next;
            }
            return contador;
        }
    }