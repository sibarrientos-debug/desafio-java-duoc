//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Estudiante estudiante= new Estudiante("Ana","Ingenería en Informática",20);
        estudiante.mostrarInformacion();
    }
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese carrera: ");
        String carrera = scanner.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();
        Estudiante estudiante = new Estudiante(nombre, carrera, edad);

        estudiante.mostrarInformacion();
    }
}


