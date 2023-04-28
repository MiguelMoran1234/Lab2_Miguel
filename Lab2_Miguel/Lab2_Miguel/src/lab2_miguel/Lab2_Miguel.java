/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2_miguel;

import java.util.Scanner;

/**
 *
 * @author flash
 */
public class Lab2_Miguel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Clasificando Numeros");
        System.out.println("2.Aproximacion de pi");
        System.out.println("3.MCD");
        System.out.println("4.Salir");
        System.out.println("Ingrese una opcion");
        int opcion = sc.nextInt();
        while (opcion != 4){
            switch(opcion){
                
                case 1:
                    System.out.println("Ingrese numero positivo");
                    int numero = sc.nextInt();
                    while (numero <= 0){
                        System.out.println("Porfavor ingrese un numero positivo");
                        System.out.println("Ingrese un numero positivo");
                        numero = sc.nextInt();
                    }
                    boolean par;
                    if (numero % 2 == 1){
                        par = false;
                    }
                    else {
                        par = true;
                    }
                    int verificador = 2;
                    int result = 1;
                    while (result != 0){
                        result = numero % verificador;
                        verificador = verificador + 1;
                    }
                    verificador = verificador - 1;
                    boolean primo;
                    if (verificador == numero){
                        primo = true;
                    }
                    else{
                        primo = false;
                    }
                    if (par == true){
                      if(primo == true){
                          System.out.println("El numero es par y primo");
                      }  
                      else{
                          System.out.println("El numero es par pero no es primo");
                      }
                    }
                    else{
                        if(primo == true){
                            System.out.println("El numero es impar y primo");
                        }
                        else{
                            System.out.println("El numero es impar pero no es primo");
                        }
                    }
                    break;
                    
                case 2:
                    System.out.println("Ingrese el grado de presicion con el que desea aproximar pi");
                    numero = sc.nextInt();
                    while (numero <= 0){
                        System.out.println("Porfavor ingrese un numero positivo");
                        System.out.println("Ingrese el grado de presicion con el que desea aproximar pi");
                        numero = sc.nextInt();
                    }
                    double pi = 1;
                    int i = 1;
                    while (i <= numero){
                        pi = pi *(4*i*i)/((4*i*i) - 1);
                        i = i + 1;
                    }
                    pi = 2 * pi;
                    System.out.println("Pi: "+pi);
                    break;
                    
                case 3:
                    System.out.println("Ingrese un numero positivo");
                    int numeroA = sc.nextInt();
                    System.out.println("Ingrese otro numero positivo");
                    int numeroB = sc.nextInt();
                    while (numeroA <= 0 || numeroB <= 0){
                        System.out.println("Porfavor ingrese un numero positivo");
                        System.out.println("Ingrese un numero positivo");
                        numeroA = sc.nextInt();
                        System.out.println("Ingrese otro numero positivo");
                        numeroB = sc.nextInt();
                    }
                    int factorA = numeroA;
                    int factorB = numeroB;        
                    while (factorA != factorB){
                        if (factorB < factorA){
                            factorA = factorA - factorB;
                        }
                        else {
                            factorB = factorB - factorA;
                        }
                    }
                    System.out.println("El MCD de "+numeroA+" y "+numeroB+" es: "+factorA);
                    break;
                    
                default: System.out.println("Porfavor ingrese una opcion valida");
                
            }
        System.out.println("");
        System.out.println("1.Clasificando Numeros");
        System.out.println("2.Aproximacion de pi");
        System.out.println("3.MCD");
        System.out.println("4.Salir");
        System.out.println("Ingrese una opcion");
        opcion = sc.nextInt();    
        }
    }  
}
