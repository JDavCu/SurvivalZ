package org.zabalburu.app;

import java.util.Scanner;

import org.zabalburu.domain.Personaje;

public class Main {
    public static void main(String[] args) {
        
        Personaje user1 = new Personaje("Flavio", "Médico", 120, 6, 3);
        System.out.println(user1);
        
        Scanner sc = new Scanner(System.in);
        

        
            
            System.out.println("==== Creación de Personaje ====");
            System.out.println("===============================");
        
            System.out.print("Introduce el Nombre: ");
            String nombre = sc.nextLine().trim();
            System.out.println(""" 
                Elige la Clase:
                1. Médico.
                2. Policía.
                3. Bombero. 
            """);
            System.out.print("Eligi una opción: ");
            String clase = sc.nextLine().trim();
            

            
            

            
       


       
    }
}