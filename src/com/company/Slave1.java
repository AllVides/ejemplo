package com.company;

public class Slave1 {
    int VAR1;

    public Slave1(){
        this.VAR1 = 3;
        int VAR1 = 4;
    } //CONTRUSCTOR

    public void bubble(){
        int[] vector = {5,8,93,8,4,8,2,5,48,6};
        for(int i = 0;i<vector.length;i++){
            for(int j = i; j <= vector.length-1; j++){
                if (vector[i] <= vector[j]){
                    int aux = vector[i];
                    vector[i]= vector[j];
                    vector[j] = aux;
                }
                for(int k = 0;k<vector.length;k++){
                    System.out.print(vector[k]+" | ");

                }
                System.out.println();

            }
        }

    }
}