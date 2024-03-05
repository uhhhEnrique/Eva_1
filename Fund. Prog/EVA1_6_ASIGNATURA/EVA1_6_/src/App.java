import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //clave, nombre, creditos, hrTeo, hrPr, carrera
        //tipoMat
        String clave,nombre,carrera;
        int creditos,hrTeo,hrPrac;
        boolean tipoMat;
        //CAPTURAR
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce la clave de la asignatura");
        clave = captu.nextLine();
        System.out.println("Introduce el nombre de la asignatura");
        nombre = captu.nextLine();
        System.out.println("Introduce la carrera de la asignatura");
        carrera = captu.nextLine();
        System.out.println("Introduce los creditos de la asignatura");
        creditos = captu.nextInt();
        System.out.println("Introduce las horas teoricas de la asignatura");
        hrTeo = captu.nextInt();
        System.out.println("Introduce las horas de practica de la asignatura");
        hrPrac = captu.nextInt();
        System.out.println("Introduce el tipo de la asignatura [true-->generica false-->especialidad]");
        tipoMat = captu.nextBoolean();

        System.out.println("Nombre: "+nombre+ "\n Carrera: "+carrera+ "\n Clave: "+clave+ "\n Creditos: "+creditos+ "\n Horas de Teoria: "+hrTeo+ "\n Horas de Practica: "+hrPrac);
        System.out.println("Tipo de Materia: "+tipoMat);

    }
}
