import java.util.Scanner;

public class resta {
    Scanner reader = new Scanner(System.in);

    int numero1 = 0;
    int numero2 = 0;

    int resultado = numero1-numero2;

    int resta(){


        System.out.println("Introduce el primer número:");
        numero1 = reader.nextInt();

        System.out.println("Introduce el segundo número:");
        numero2 = reader.nextInt();

        System.out.println("La resta es " + numero1 + " - " + numero2 + " = " + resultado);

        return 0;

    }

}
