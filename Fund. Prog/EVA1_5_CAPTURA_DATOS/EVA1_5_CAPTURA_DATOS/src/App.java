import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       int edad=0;
       String nombre;
        System.out.println("Introduce tu nombre");
        //CREAR NUESTRO SCANNER
        Scanner captura = new Scanner(System.in);
        //CAPTURAR
        nombre = captura.nextLine();
        System.out.println("introduce tu edad");
        edad = captura.nextInt();
        System.out.println("Tu nombre es: "+ nombre);
        System.out.println("Tu edad es: "+edad );
    



    }
}
