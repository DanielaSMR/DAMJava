import java.util.Scanner;

public class java3 {
    public static void main(String[] args){
        int suma = 0;
        int num;
        int contador = 0;

        Scanner sc = new Scanner(System.in);

        while(contador!=10){
            System.out.println("Introduce un numero");
            num = sc.nextInt();
            suma = num + suma;
            contador = contador+1;
        }
        
        System.out.println("El resultado es:" + suma);

    }
}
