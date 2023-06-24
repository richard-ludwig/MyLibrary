package MyClasses;

import java.util.Scanner;

/**
 * @author Richard Ludwig
 * @version 1.0
 * Classe com métodos de manipulação de vetores bidimensionais(Matrizes)
 */
public class MyMatrix {
    /*
    Métodos implementados:
    print();
    write();
    minMaxAndPos();
    line();
    column();
    sum();
    isSymetrical();
    minMax();
    posMinMax();
    linearSearch();
    countLinearSearch();
    rewriteLinearSearch();
    columnMinMax();
    lineMinMax();
    transfer();
    multiplyBy();
    addBy();
    subtractBy();
    divideBy();
    add();
    subtract();
    divide();
    multiply();
    principalDiagonal();
    secundaryDiagonal();

    ...........................................................................................

    Métodos para implementar:
    addArray();
    removeArray();
    addItem();
    removeItem();
     */

    /**
     * Imprime os elementos de uma matriz de inteiros.
     * @param a Matriz a ser impressa.
     */
    public static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Imprime os elementos de uma matriz de reais.
     * @param a Matriz a ser impressa.
     */
    public static void print(double[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%.4f ", a[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Imprime os elementos de uma matriz de textos.
     * @param a Matriz a ser impressa.
     */
    public static void print(String[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Imprime os elementos de uma matriz de valores booleanos.
     * @param a Matriz a ser impressa.
     */
    public static void print(boolean[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Imprime os elementos de uma matriz de caracteres.
     * @param a Matriz a ser impressa.
     */
    public static void print(char[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Imprime os elementos de uma matriz de inteiros.
     * @param a Matriz a ser impressa.
     */
    public static void print(long[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Escreve valores de elementos inseridos pelo usuário em uma matriz de valores reais.
     * @param s Leitor de elementos inseridos pelo usuário.
     * @param a Matriz a ter valores escritos.
     * @return Matriz com os valores  de elementos reais inseridos pelo usuário.
     */
    public static double[][] write(Scanner s, double[][] a) {
        int t = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (t < a[i].length) {
                    t = a[i].length;
                }
            }
        }
        double[][] m = new double[a.length][t];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                m[i][j] = s.nextDouble();
            }
        }
        return m;
    }
    public static int[][] write(Scanner s, int[][] a) {
        int t = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (t < a[i].length) {
                    t = a[i].length;
                }
            }
        }
        int[][] m = new int[a.length][t];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                m[i][j] = s.nextInt();
            }
        }
        return m;
    }
    public static String[][] write(Scanner s, String[][] a) {
        int t = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (t < a[i].length) {
                    t = a[i].length;
                }
            }
        }
        String[][] m = new String[a.length][t];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                m[i][j] = s.nextLine();
            }
        }
        return m;
    }
    public static long[][] write(Scanner s, long[][] a) {
        int t = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (t < a[i].length) {
                    t = a[i].length;
                }
            }
        }
        long[][] m = new long[a.length][t];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                m[i][j] = s.nextLong();
            }
        }
        return m;
    }
    public static char[][] write(Scanner s, char[][] a) {
        int t = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (t < a[i].length) {
                    t = a[i].length;
                }
            }
        }
        char[][] m = new char[a.length][t];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                m[i][j] = s.next().charAt(0);
            }
        }
        return m;
    }
    public static boolean[][] write(Scanner s, boolean[][] a) {
        int t = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (t < a[i].length) {
                    t = a[i].length;
                }
            }
        }
        boolean[][] m = new boolean[a.length][t];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                m[i][j] = s.nextBoolean();
            }
        }
        return m;
    }
    public static float[][] write(Scanner s, float[][] a) {
        int t = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (t < a[i].length) {
                    t = a[i].length;
                }
            }
        }
        float[][] m = new float[a.length][t];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                m[i][j] = s.nextFloat();
            }
        }
        return m;
    }
    private static double[] minMaxAndPos(double[][] a) {
        double min = a[0][0];
        int column = 0;
        int line = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                    line = i;
                }
            }
        }
        double min_max = a[line][0];
        for (int i = 0; i < a[line].length; i++) {
            if (a[line][i] > min_max) {
                min_max = a[line][i];
                column = i;
            }
        }
        double[] r = new double[3];
        r[0] = min_max;
        r[1] = line;
        r[2] = column;
        return r;
    }
    public static double minMax(double[][] a){
        return minMaxAndPos(a)[0];
    }
    public static int[] posMinMax(double[][] a){
        int[] r = new int[2];
        r[0]=(int)minMaxAndPos(a)[1];
        r[1]=(int)minMaxAndPos(a)[2];
        return r;
    }
    public static int lineMinMax(double[][] a) {
        return posMinMax(a)[0];
    }
    public static int columnMinMax(double[][] a) {
        return posMinMax(a)[1];
    }
    public static boolean linearSearch(int[][] a, int b){
        for (int i=0; i<a.length; i++){
            for (int j =0; j<a[i].length; j++){
                if (a[i][j]==b){
                    return true;
                }
            }
        }
        return false;
    }
    public static int countLinearSearch(int[][] a, int b){
        int count=0;
        for (int i=0; i<a.length; i++){
            for (int j =0; j<a[i].length; j++){
                if (a[i][j]==b){
                    count++;
                }
            }
        }
        return count;
    }
    public static int[][] rewriteLinearSearch(int[][] a, int b, int c){
        for (int i=0; i<a.length; i++){
            for (int j =0; j<a[i].length; j++){
                if (a[i][j]==b){
                    a[i][j]=c;
                }
            }
        }
        return a;
    }
    public static boolean isSymmetrical(int[][] a){
        for(int i = 0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                if(a[i][j]!=a[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
    public static double[] line(double[][] a, int b){
        double[] r = new double[a[b].length];
        for(int i =0; i< a[b].length; i++){
            r[i]=a[b][i];
        }
        return r;
    }
    public static double[] column(double[][] a, int b){
        double[] r = new double[a.length];
        for(int i =0; i< a.length; i++){
            r[i]=a[i][b];
        }
        return r;
    }
    public static int[] line(int[][] a, int b){
        int[] r = new int[a[b].length];
        for(int i =0; i< a[b].length; i++){
            r[i]=a[b][i];
        }
        return r;
    }
    public static int[] column(int[][] a, int b){
        int[] r = new int[a.length];
        for(int i =0; i< a.length; i++){
            r[i]=a[i][b];
        }
        return r;
    }
    public static char[] line(char[][] a, int b){
        char[] r = new char[a[b].length];
        for(int i =0; i< a[b].length; i++){
            r[i]=a[b][i];
        }
        return r;
    }
    public static char[] column(char[][] a, int b){
        char[] r = new char[a.length];
        for(int i =0; i< a.length; i++){
            r[i]=a[i][b];
        }
        return r;
    }
    public static String[] line(String[][] a, int b){
        String[] r = new String[a[b].length];
        for(int i =0; i< a[b].length; i++){
            r[i]=a[b][i];
        }
        return r;
    }
    public static String[] column(String[][] a, int b){
        String[] r = new String[a.length];
        for(int i =0; i< a.length; i++){
            r[i]=a[i][b];
        }
        return r;
    }
    public static long[] line(long[][] a, int b){
        long[] r = new long[a[b].length];
        for(int i =0; i< a[b].length; i++){
            r[i]=a[b][i];
        }
        return r;
    }
    public static long[] column(long[][] a, int b){
        long[] r = new long[a.length];
        for(int i =0; i< a.length; i++){
            r[i]=a[i][b];
        }
        return r;
    }
    public static double sum(double[][] a){
        double sum=0;
        for (int i = 0; i<a.length; i++){
            for (int j = 0; j<a[i].length; j++){
                sum+=a[i][j];
            }
        }
        return sum;
    }
    public static int sum(int[][] a){
        int sum=0;
        for (int i = 0; i<a.length; i++){
            for (int j = 0; j<a[i].length; j++){
                sum+=a[i][j];
            }
        }
        return sum;
    }
    public static long sum(long[][] a){
        long sum=0;
        for (int i = 0; i<a.length; i++){
            for (int j = 0; j<a[i].length; j++){
                sum+=a[i][j];
            }
        }
        return sum;
    }
    public static void transfer(char[][] a, char[][] b){
        for (int i =0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                b[i][j]=a[i][j];
            }
        }
    }
    public static void transfer(double[][] a, double[][] b){
        for (int i =0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                b[i][j]=a[i][j];
            }
        }
    }
    public static void transfer(String[][] a, String[][] b){
        for (int i =0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                b[i][j]=a[i][j];
            }
        }
    }
    public static void transfer(long[][] a, long[][] b){
        for (int i =0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                b[i][j]=a[i][j];
            }
        }
    }
    public static void multiplyBy(int[][] a, int b){
        for (int i =0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                a[i][j]*=b;
            }
        }
    }
    public static void multiplyBy(double[][] a, double b){
        for (int i =0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                a[i][j]*=b;
            }
        }
    }
    public static void multiplyBy(long[][] a, long b){
        for (int i =0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                a[i][j]*=b;
            }
        }
    }
    public static void divideBy(double[][] a, double b){
        for (int i =0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                a[i][j]/=b;
            }
        }
    }
    public static void subtractBy(long[][] a, long b){
        for (int i =0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                a[i][j]-=b;
            }
        }
    }
    public static void subtractBy(int[][] a, int b){
        for (int i =0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                a[i][j]-=b;
            }
        }
    }
    public static void subtractBy(double[][] a, double b){
        for (int i =0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                a[i][j]-=b;
            }
        }
    }
    public static void addBy(long[][] a, long b){
        for (int i =0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                a[i][j]+=b;
            }
        }
    }
    public static void addBy(int[][] a, int b){
        for (int i =0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                a[i][j]+=b;
            }
        }
    }
    public static void addBy(double[][] a, double b){
        for (int i =0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                a[i][j]+=b;
            }
        }
    }
    public static int[][] multiply(int[][] a, int[][] b){
        int[][] r = new int[a.length][a[0].length];
        for (int i =0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                r[i][j]=a[i][j]*b[i][j];
            }
        }
        return r;
    }
    public static double[][] multiply(double[][] a, double[][] b){
        double[][] r = new double[a.length][a[0].length];
        for (int i =0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                r[i][j]=a[i][j]*b[i][j];
            }
        }
        return r;
    }
    public static long[][] multiply(long[][] a, long[][] b){
        long[][] r = new long[a.length][a[0].length];
        for (int i =0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                r[i][j]=a[i][j]*b[i][j];
            }
        }
        return r;
    }
    public static double[][] divide(double[][] a, double[][] b){
        double[][] r = new double[a.length][a[0].length];
        for (int i =0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                r[i][j]= a[i][j] / b[i][j];
            }
        }
        return r;
    }
    public static double[][] add(double[][] a, double[][] b){
        double[][] r = new double[a.length][a[0].length];
        for (int i =0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                r[i][j]= a[i][j] + b[i][j];
            }
        }
        return r;
    }
    public static long[][] add(long[][] a, long[][] b){
        long[][] r = new long[a.length][a[0].length];
        for (int i =0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                r[i][j]= a[i][j] + b[i][j];
            }
        }
        return r;
    }
    public static int[][] add(int[][] a, int[][] b){
        int[][] r = new int[a.length][a[0].length];
        for (int i =0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                r[i][j]= a[i][j] + b[i][j];
            }
        }
        return r;
    }
    public static double[][] subtract(double[][] a, double[][] b){
        double[][] r = new double[a.length][a[0].length];
        for (int i =0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                r[i][j]= a[i][j] - b[i][j];
            }
        }
        return r;
    }
    public static long[][] subtract(long[][] a, long[][] b){
        long[][] r = new long[a.length][a[0].length];
        for (int i =0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                r[i][j]= a[i][j] - b[i][j];
            }
        }
        return r;
    }
    public static int[][] subtract(int[][] a, int[][] b){
        int[][] r = new int[a.length][a[0].length];
        for (int i =0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                r[i][j]= a[i][j] - b[i][j];
            }
        }
        return r;
    }
    public static int[] principalDiagonal(int[][] a){
        int[] r = new int[a.length];
        for (int i =0; i<a.length; i++){
            r[i]=a[i][i];
        }
        return r;
    }
    public static int[] secundaryDiagonal(int[][] a){
        int[] r = new int[a.length];
        for (int i =0; i<a.length; i++){
            r[i]=a[i][a.length-1-i];
        }
        return r;
    }
}
