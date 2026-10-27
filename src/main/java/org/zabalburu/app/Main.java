package org.zabalburu.app;

import java.util.Scanner;

import org.zabalburu.domain.Personaje;

public class Main {
    public static void main(String[] args) {

        Personaje user1 = new Personaje("Flavio", "Médico", 120, 6, 3);
        System.out.println(user1);

        Scanner sc = new Scanner(System.in);
        String intento;

        System.out.println("==== Creación de Personaje ====");
        System.out.println("===============================");

        System.out.print("Introduce el Nombre: ");
        String nombre = sc.nextLine().trim();
        do {
            int clase = 0;

            while (clase < 1 || clase >= 3) {
                System.out.println("""
                            Elige la Clase:
                            1. Médico.  | Vida = 120 | Botiquin = 3 | Habilidades = 6 |
                            2. Policía. | Vida = 100 | Botiquin = 2 | Habilidades = 8 |
                            3. Bombero. | Vida = 140 | Botiquin = 1 | Habilidades = 7 |
                        """);
                System.out.print("Eligi una opción: ");
                clase = sc.nextInt();
                sc.nextLine();
                int vida;
                int botiquin;
                int habilidades;
                String nombreClase = null;

                if (clase >= 1 && clase <= 3) {
                    switch (clase) {
                        case 1:
                            vida = 120;
                            botiquin = 3;
                            habilidades = 6;
                            nombreClase = "Médico";
                            break;
                        case 2:
                            vida = 100;
                            botiquin = 2;
                            habilidades = 8;
                            nombreClase = "Policía";
                            break;
                        case 3:
                            vida = 140;
                            botiquin = 1;
                            habilidades = 8;
                            nombreClase = "Bombero";
                            break;
                    }

                    System.out.println("Tu clase es : %s ".formatted(nombreClase));
                } else {
                    System.out.println("opcion no valida.Introduce una opción");
                    clase = 0;

                }
            }
            System.out.println("Elegir otra clase: Si/No");
            intento = sc.nextLine();

        } while (intento.equalsIgnoreCase("Si"));

    };

}