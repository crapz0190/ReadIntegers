package readintegers;
import java.util.Scanner;

public class ReadIntegers {
    
    public static void counterNumbers(Scanner input){
        int number;
        int numberNeg = 0;
        int numberPos = 0;
        int numberZero = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Ingrese el número %d: ", i);
            number = input.nextInt();
            
            if(number == 0)
                ++numberZero;
            else if (number > 0)
                ++numberPos;
            else
                ++numberNeg;
        }
        
        System.out.println("\n--------------- Exercise number 8 ---------------");
        System.out.printf("Cantidad de números positivos: %d\n", numberPos);
        System.out.printf("Cantidad de números negativos: %d\n", numberNeg);
        System.out.printf("Cantidad de ceros: %d\n",numberZero);
    }
    
    public static void majorMinor(Scanner input){
        System.out.print("Ingrese el número 1: ");
        int number = input.nextInt();
        int major = number;
        int minor = number;
        
        for (int i = 2; i <= 10; i++) {
            System.out.printf("Ingrese el número %d: ", i);
            number = input.nextInt();
          
            if (number > major)
                major = number;
            else if (number < minor)
                minor = number;
        }
        
        System.out.println("\n--------------- Exercise number 9 ---------------");
        System.out.printf("El número más grande es: %d\n", major);
        System.out.printf("El número más pequeño es: %d\n", minor);
        
    }
    
    private static int findSmallestNumber(int number, int minor){        
        if (minor < number)
            return minor;
        
        return number;
    }
    
    public static void showMessage(Scanner input){
        int number;
        int quantity;
        int minor;
        
        System.out.println();
        do {
            System.out.print("Indique la cantidad de valores a analizar (por ejemplo, 5): ");
            quantity = input.nextInt();
            if(quantity <= 0)
                System.err.println("La cantidad de números analizar debe ser positiva");
        } while (quantity <= 0);
        
        System.out.println("\nIngrese los números solicitados, para determinar el menor: ");
        System.out.print("Ingrese el número 1: ");
        number = input.nextInt();
        minor = number;
        
        for (int i = 2; i <= quantity; i++) {
            System.out.printf("Ingrese el número %d: ", i); // inicia desde 2
            number = input.nextInt();
            minor = findSmallestNumber(number, minor);                          
        }
      
        System.out.println("\n--------------- Exercise number 10 ---------------");
        System.out.printf("El número más pequeño ingresado es: %d\n", minor); 
    }

}
