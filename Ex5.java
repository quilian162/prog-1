public class Ex5{
    public static void main(String[] args){
        String string = " atrapalham ";
        int count;
        System.out.println("1 Java atrapalha muita gente");
        for(count=2; count<=100; count++){
            System.out.println(count + " Java " + string.repeat(count) + "atrapalham muita gente");
        }
    }
}
