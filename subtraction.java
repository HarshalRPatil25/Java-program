import java.util.Scanner;
public class Sub{
    public static void main(String [] args){
        System.out.println("This program for substraction of two number");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b= sc.nextFloat();
        float sub = a-b;
        System.out.println("Diffrence between two number are "+sub);
    }
}
