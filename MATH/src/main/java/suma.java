import java.util.Scanner;

public class suma {
    Scanner reader = new Scanner(System.in);

    int numero1 = 0;
    int numero2 = 0;

    int resultado = numero1+numero2;

    int suma(){


        System.out.println("Introduce el primer número:");
        numero1 = reader.nextInt();

        System.out.println("Introduce el segundo número:");
        numero2 = reader.nextInt();

        System.out.println("La suma es " + numero1 + " + " + numero2 + " = " + resultado);

        return 0;

    }

}
