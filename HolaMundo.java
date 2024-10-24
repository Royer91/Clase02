import java.util.Scanner;

/**
 * HolaMundo
 */
public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("Hola Mundo ");

        var entrada = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        var entero = entrada.nextInt();

        System.out.println(entero);

        entrada.close();



    }
    
}