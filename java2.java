import java.util.Scanner;

public class java2 {
    public static void main(String[] args){
        int num1;
        int num2;

    Scanner sc = new Scanner(System.in);
    System.out.println("Escribir primer numero");
    num1 = sc.nextInt();
    System.out.println("Escribir segundo numero");
    num2 = sc.nextInt();

        while(num1!=num2){
            System.out.println("Escribir primer numero");
            num1 = sc.nextInt();
            System.out.println("Escribir segundo numero");
            num2 = sc.nextInt();
        }
    }
}
