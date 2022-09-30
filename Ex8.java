import java.util.Scanner;

public class Ex8{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] vet = new int[10]; 
        int maior = 0, menor = 0;
        for(int i=0; i < 10; i++){
            vet[i] = scan.nextInt();
        } 
        for(int j = 0; j < 10; j++){
            if(j == 0){
            maior = vet[j];
            menor = vet[j];
            }
            if(vet[j] > maior){
                maior = vet[j];
            }
            if(vet[j] < menor){
                menor = vet[j];
            }
        }
        System.out.println("O maior:" +maior);
        System.out.println("O menor:" +menor);
    }
}
