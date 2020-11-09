import java.util.*;

public class tarea3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i;
        int[] numeros = new int[10];
        double media = 0;


        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < 10; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = sc.nextInt();
        }
        
        System.out.println("Aqui los 10 numeros");
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        System.out.println(numeros[4]);
        System.out.println(numeros[5]);
        System.out.println(numeros[6]);
        System.out.println(numeros[7]);
        System.out.println(numeros[8]);
        System.out.println(numeros[9]);
        System.out.println(numeros[10]);


    }
}