import java.util.Scanner;

public class Ex9{
    public static void main(String[] args){
        int[] array = new int[50];
        int soma = 0;
        for(int i = 0; i<50; i++){
            array[i] = 1 + (int) (Math.random() * 100); 
        
        soma = soma + array[i];
        }
        int media = soma/50;
        System.out.println(media);
        System.out.println("Valores abaixo da media:");
        for(int j = 0; j < 50; j++){
            if(array[j] < media){
                System.out.println(array[j]);
            }
        }
    }
}
