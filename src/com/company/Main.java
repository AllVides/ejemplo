package com.company;

import java.util.Arrays;

public class Main {
    public static int numero2 = 2; //global

    public static void main(String[] args) {

        Slave1 esclavo = new Slave1(); //decalracion de objet

        String cadena = "cadena";
        char caracter = 'c';
        char num = 65;
        boolean truthsy = true;
        boolean falsy = false;

        foo(!true);
        int h = suma(18);
        System.out.println(h);

        palno(false);

        matriz();
        for (int i = 30; i > 1; i++){
            System.out.println(i);
            i %= 4;}


    }

    public static void foo( boolean valor){
        //metodo normal
        System.out.println(valor);
        //return;
    }

    public static void palno(boolean x){
        //ejemplo de las estructuras de decision basicas
        // +, -, /,*, %
        // &&, || , == , <, > ,=<, =>, !=
        if (x){
            System.out.println("x");
            System.out.println("y");
        } if (x){}
        else{
            System.out.print("z\n");
        }

        if (!x)
            System.out.println("x");
        System.out.println("y");

        int y = (x)? 1 : 2;
        System.out.println(y);

    }

    public static int suma(int numero){
        return numero % 14;
    }

    public static void matriz(){
        int[] vector = new int[5]; //declaracion de vector
        int[][] matriz; //declaracion de matriz

        matriz = new int[][]{
                {0,1,2,3,4},
                {5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19},
                {20,21,22,23,24}
        };
        //declaracion de matriz con contenido

        //recorrido de matriz
        for(int i = 0; i < matriz.length; i++){//for para filas
            for(int j = 0; j < matriz[i].length; j++){//for para columnas
                System.out.print(matriz[i][j] + " "); //impresion de columnas
            }
            System.out.println();
        }

        for(int i = 50; i > 1; i = i / 5){
            //estructura del for: for (punto de inicio ; condicional ; accion al finalizar una iteracion) { codigo }
            System.out.println(i);

        }

        /*i = i +1
        i-- -> i = i-1
        i += 5 -> i = i + 5

*/
        /*int f = 0;
        while(true){
            System.out.println(f);
            f++;

        }*/



    }

}
