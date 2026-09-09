//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Estudiante estudiante= new Estudiante("Ana","Ingenería en Informática",20);
        estudiante.mostrarInformacion();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese carrera: ");
        String carrera = scanner.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();
        Estudiante estudiante1 = new Estudiante(nombre, carrera, edad);

        estudiante1.mostrarInformacion();

        if(edad<18){
            System.out.println("Estudiante menor de edad.");
        } else if (edad<25) {
            System.out.println("Estudiante Joven");
        }else{
            System.out.println("Estudiante adulto.");
        }

        for(int i=1;i<=5;i++){
            System.out.println("Procesando estudiante" +i);

        }

        for (int contador = 1; contador <=5; contador++) {
            System.out.println("Procesando registro " + contador);
        }
    }

}


