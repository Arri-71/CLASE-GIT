import java.util.Scanner;
public class multiplicator {
    public int multiplication(){
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int num1 = reader.nextInt();

        System.out.println("Introduce el segundo número:");
        int num2 = reader.nextInt();
        
        reader.close();;

        return num1*num2;
    }
}
