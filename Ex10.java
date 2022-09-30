public class Ex10{
    public static void main(String[] args){
    int matriz[][] = new int[][]{{1,1,1,1}, {2,2,2,2}, {3,3,3,3}, {4,4,4,4}};
        int count = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int l = 0; l < matriz.length; l++) {
                if (l < i) {
                    count += matriz[i][l];
                }
            }
        }
        
        System.out.println(count);
    }
}
