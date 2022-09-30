public class Main{
    public static void main(String[] args){
        int count = 0;
        for (int j = 100; j < 200; j++){
            boolean primo = true;
        
        for(int x =2; x<j;x++){
            if (j % x == 0){
                primo = false;   
            }
        }

        if(primo){
        System.out.println(j);
        }
    }
    }
}
