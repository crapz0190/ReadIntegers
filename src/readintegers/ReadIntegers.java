package readintegers;
import java.util.Scanner;

public class ReadIntegers {
    
    public static void counterNumbers(){
        Scanner input = new Scanner(System.in);
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
    
    public static void majorMinor(){
        Scanner input = new Scanner(System.in);
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
    
    public static void findSmallestNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de valores a analizar: ");
        int quantity = input.nextInt();
        int number;
        int minor;
        int counterNumber = 2;
        
        while (quantity <= 0) {
            System.err.println("La cantidad de números analizar debe ser positiva");
            System.out.print("Ingrese la cantidad de valores a analizar: ");
            quantity = input.nextInt();
        }
        
        System.out.print("Ingrese el número 1: ");
        number = input.nextInt();
        minor = number;
        
        while (quantity > 1) {
            System.out.printf("Ingrese el número %d: ", counterNumber++);
            number = input.nextInt();
            
            if (number < minor)
                minor = number;
            
            --quantity;
        }
        
        System.out.println("\n--------------- Exercise number 10 ---------------");
        System.out.printf("El número más pequeño es: %d\n", minor);
        
    }

    public static void main(String[] args) {
        //ReadIntegers.counterNumbers();
        //System.out.println();
        //ReadIntegers.majorMinor();
        System.out.println();
        ReadIntegers.findSmallestNumber();
        
        
        System.out.println();
    }
    
}
