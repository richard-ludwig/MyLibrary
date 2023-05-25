import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Richard Ludwig
 * @version 1.0
 * Classe com métodos de manipulação de vetores(Arrays)
 */
public class MyVector<T> {
    public static int[] write(Scanner s, int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = s.nextInt();
        }
        return b;
    }

    public static double[] write(Scanner s, double[] a) {
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = s.nextInt();
        }
        return b;
    }

    public static String[] write(Scanner s, String[] a) {
        String[] b = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = s.next();
        }
        return b;
    }

    public static char[] write(Scanner s, char[] a) {
        char[] b = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = s.next().charAt(0);
        }
        return b;
    }

    public static long[] write(Scanner s, long[] a) {
        long[] b = new long[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = s.nextInt();
        }
        return b;
    }

    public static void fill(double[] v, int t, double n) {
        for (int i = 0; i < t; i++) {
            v[i] = n;
        }
    }

    public static void fill(double[] v, double n) {
        fill(v, v.length, n);
    }

    public static double sum(double[] v, int t) {
        double res = 0;
        for (int i = 0; i < t; i++) {
            res += v[i];
        }
        return res;
    }

    public static double sum(double[] v) {
        return sum(v, v.length);
    }

    public static double media(double[] v, int t) {
        return sum(v, t) / t;
    }

    public static double media(double[] v) {
        return media(v, v.length);
    }

    public static float sum(float[] v, int t) {
        float res = 0;
        for (int i = 0; i < t; i++) {
            res += v[i];
        }
        return res;
    }

    public static float sum(float[] v) {
        return sum(v, v.length);
    }

    public static float media(float[] v, int t) {
        return sum(v, t) / t;
    }

    public static float media(float[] v) {
        return media(v, v.length);
    }

    public static void fill(int[] v, int t, int n) {
        for (int i = 0; i < t; i++) {
            v[i] = n;
        }
    }

    public static void fill(int[] v, int n) {
        fill(v, v.length, n);
    }

    public static void fill(long[] v, int t, long n) {
        for (int i = 0; i < t; i++) {
            v[i] = n;
        }
    }

    public static void fill(long[] v, long n) {
        fill(v, v.length, n);
    }

    public static int sum(int[] v, int t) {
        int res = 0;
        for (int i = 0; i < t; i++) {
            res += v[i];
        }
        return res;
    }

    public static int sum(int[] v) {
        return sum(v, v.length);
    }

    public static long sum(long[] v, int t) {
        long res = 0;
        for (int i = 0; i < t; i++) {
            res += v[i];
        }
        return res;
    }

    public static long sum(long[] v) {
        return sum(v, v.length);
    }

    public static void fill(char[] v, int t, char n) {
        for (int i = 0; i < t; i++) {
            v[i] = n;
        }
    }

    public static void fill(char[] v, char n) {
        fill(v, v.length, n);
    }

    public static void fill(String[] v, int t, String n) {
        for (int i = 0; i < t; i++) {
            v[i] = n;
        }
    }

    public static void fill(String[] v, String n) {
        fill(v, v.length, n);
    }

    public static void print(int[] a) {
        for (int element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void print(char[] a) {
        for (char element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void print(long[] a) {
        for (long element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void print(double[] a) {
        for (double element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void print(String[] a) {
        for (String element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void print(boolean[] a) {
        for (boolean element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void print(float[] a) {
        for (float element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    /**
     * <h1>Algoritmos de ordenação</h1>
     * <br>
     * Bubble Sort
     * @param a Uma lista de inteiros
     */
    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            boolean orderly = true;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                    orderly = false;
                }
            }
            if (orderly) {
                break;
            }
        }
    }
    /**
     * Selection Sort
     * @param a Uma lista de inteiros
     */
    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int aux = a[i];
                a[i] = a[minIndex];
                a[minIndex] = aux;
            }
        }
    }
    /**
     * Quick Sort
     * @param a Uma lista de inteiros
     * @param start Valor inicial do método
     * @param end Valor final do método
     */
    public static void quickSort(int[] a, int start, int end){
        if (start < end) {
            int indexPivot = quickSortPartition(a, start, end);
            quickSort(a, start, indexPivot - 1);
            quickSort(a, indexPivot + 1, end);
        }
    }
    /**
     * Partição do Quick Sort
     * @param a Uma lista de inteiros
     * @param start Valor inicial do método
     * @param end valor final do método
     * @return Valor de pivô
     */
    public static int quickSortPartition(int[] a, int start, int end){
        int pivot = a[start];
        int i = start + 1;
        int e = end;
        while (i <= e) {
            if (a[i] <= pivot) {
                i++;
            }
            else if (pivot < a[e]) {
                e--;
            }
            else {
                int aux = a[i];
                a[i] = a[e];
                a[e] = aux;
                i++;
                e--;
            }
        }
        a[start] = a[e];
        a[e] = pivot;
        return e;
    }
    /**
     * Isertion Sort
     * @param a Lista de inteiros
     */
    public static void insertionSort(int[] a) {
        int key;
        int j;
        for (int i = 1; i < a.length; i++) {
            key = a[i];
            for (j = i - 1; (j >= 0) && (a[j] > key); j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = key;
        }
    }
    /**
     * <h1>Conversão de Estrutura de dados</h1>
     * <br>
     * Conversão para ArrayList
     * @param a Vetor de qualquer tipo
     * @return ArrayList de qualquer tipo
     */
    public ArrayList<T> toArrayList(T[] a){
        ArrayList<T> result = new ArrayList<>();
        for(T element : a){
            result.add(element);
        }
        return result;
    }
    /**
     * Conversão para pilha
     * @param a Vetor de qualquer tipo
     * @return Pilha de qualquer tipo
     */
    public MyStack<T> toStack(T[] a){
        MyStack<T> result = new MyStack<>();
        for(T element : a){
            result.push(element);
        }
        return result;
    }
    /**
     * Conversão para fila
     * @param a Vetor de qualquer tipo
     * @return Fila de qualquer tipo
     */
    public MyQueue<T> toQueue(T[] a){
        MyQueue<T> result = new MyQueue<>();
        for(T element : a){
            result.enqueue(element);
        }
        return result;
    }
}