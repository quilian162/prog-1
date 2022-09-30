public class Ex6{
    public static void main(String[] args){
        int count = 0;
        for (int j = 2; j < 100; j++){
            boolean primo = true;
            if(count == 15){
                break;
            }
        
        for(int x =2; x<j;x++){
            if (j % x == 0){
                primo = false;   
            }
        }

        if(primo){
        System.out.println(j);
            count++;
        }
    }
    }
}

