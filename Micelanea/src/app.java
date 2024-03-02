import co.edu.sena.oop.Data;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);


        double numero1 = 0;
        double numero2 = 0;
        double numero3 = 0;

        int opcion;

        Data data = new Data();


        System.out.println("Ejercicio micelanea OPP Java");
        System.out.println("-----------------------------");
        System.out.println("Menu Principal");
        System.out.println("1. Operadores");
        System.out.println("2. Condicionales");
        System.out.println("3. Ciclos");
        System.out.println("4. Arreglos");
        System.out.println("99.Salir");
        System.out.println("ingrese una opcion");


        opcion = src.nextInt();
        switch (opcion){
            case 1: {
                System.out.println("Categoria Operadores");
                System.out.println("1. Calcular área triángulo");
                System.out.println("2. Sumar dos números");
                System.out.println("ingrese una opcion");
                opcion = src.nextInt();
                switch (opcion) {
                }
                break;
            }
            case 2:{};
            break;
            case 3:{};
            break;
            case 99:{};
            break;
            default:
                System.out.println("opcion no valida");
                break;
        }

//         submenu operadores

        System.out.println("-------------------------------");
        System.out.println("1. Calcular el área de un triángulo");
        System.out.println("Ingrese la base");
        numero1 = src.nextDouble();
        System.out.println("Ingrese la aultura");
        numero2 = src.nextDouble();

        System.out.println("El área del triángulo es : " + data.areaTriangulo(numero1 , numero2));

        System.out.println("-------------------------------");
        System.out.println("2. Sumar dos numeros");
        System.out.println("Ingrese el primer numero");
        numero1 = src.nextDouble();
        System.out.println("Ingrese el segundo numero");
        numero2 = src.nextDouble();

        System.out.println("La sumatoria de los numeros es  : " + data.sumarDosnumeros(numero1 , numero2));







    }




}

