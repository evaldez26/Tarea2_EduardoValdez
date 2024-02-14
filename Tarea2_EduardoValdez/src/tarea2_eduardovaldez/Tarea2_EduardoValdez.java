/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea2_eduardovaldez;

import java.util.Scanner;

/**
 *
 * @author guali
 */
public class Tarea2_EduardoValdez {

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        char resp = 's';
        while (resp == 's') {
            System.out.println("**********Menu**********\n1. Replace\n2. Factorial\n3. Mensajes\n4. Promedios\n5. Aprobado o Reprobado\n6. Contains\n7. Salir\nElje una opcion:");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    miMetodoDeReemplazo();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("*****Factorial*****");
                    System.out.print("Ingrese un numero para calcular su factorial: ");
                    int num = leer.nextInt();
                    int facto = Factorial(num);
                    String fact = "";
                    for (int j = 1; j < num + 1; j++) {
                        if (j == num) {
                            fact += j;
                        } else {
                            fact += j + "x";
                        }
                    }
                    System.out.println(fact + "=" + facto);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("*****Mensajes*****");
                    System.out.print("Ingrese una cadena: ");
                    leer.nextLine();
                    String cadena = leer.nextLine();
                    Mensaje(cadena);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("*****Promedio*****");
                    double prom = Promedio();
                    System.out.println("El promedio de las notas ingresadas es de: " + prom);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("*****Aprobado o Reprobado*****");
                    System.out.print("Ingrese su nota: ");
                    int nota = leer.nextInt();
                    AprobadoReprobado(nota);
                    System.out.println();

                    break;
                case 6:
                    System.out.println("Ingrese la cadena principal: ");
                    leer.nextLine();
                    String cad1 = leer.nextLine();
                    System.out.println("Ingrese la cadena que evaluaremos si existe o no dentro de la cadena principal: ");
                    String cad2 = leer.nextLine();
                    boolean contieneSubCadena = contains(cad1, cad2);

                    if (contieneSubCadena) {
                        System.out.println("La segunda cadena si esta dentro de la cadena principal");
                    } else {
                        System.out.println("La segunda cadena si esta dentro de la cadena principal");
                    }
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Salio del programa");
                    resp = 'n';
                    break;
                default:
                    System.out.println("Opcion no valida\n");
                    break;
            }

        }

    }//fin del main

    public static void miMetodoDeReemplazo() {
        System.out.println("*****Replace*****");
        System.out.println("Ingrese una cadena: ");
        leer.nextLine();
        String Cadena = leer.nextLine();
        System.out.println("Elija el caracter quiere remplazar: ");
        char car = leer.next().charAt(0);
        System.out.println("Ingrese el nuevo caracter: ");
        char car2 = leer.next().charAt(0);
        System.out.println(Cadena.replace(car, car2));

    }

    public static int Factorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;

    }

    public static void Mensaje(String Cadena) {
        System.out.println(Cadena);

    }

    public static double Promedio() {
        double promedio = 0;
        System.out.print("Ingrese nota 1: ");
        double nota1 = leer.nextDouble();
        System.out.print("Ingrese nota 2: ");
        double nota2 = leer.nextDouble();
        System.out.print("Ingrese nota 3: ");
        double nota3 = leer.nextDouble();
        System.out.print("Ingrese nota 4: ");
        double nota4 = leer.nextDouble();
        promedio = ((nota1 + nota2 + nota3 + nota4) / 4);
        return promedio;
    }

    public static boolean AprobadoReprobado(int nota) {
        boolean bandera = true;
        if (nota < 60) {
            bandera = false;
            System.out.println("El alumno reprobo");
        } else {
            System.out.println("El alumno aprobo");
        }

        return bandera;
    }

    public static boolean contains(String a, String b) {
        return a.contains(b);
    }

}//fin de la clase
