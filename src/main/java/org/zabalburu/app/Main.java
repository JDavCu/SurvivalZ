package org.zabalburu.app;

import java.util.Scanner;

import org.zabalburu.domain.Personaje;
import org.zabalburu.domain.Zombie;

public class Main {
    public static void main(String[] args) {

        int vida = 0;
        int botiquin = 0;
        int habilidades = 0;
        String nombreClase = null;
        int clase = 0;

        Personaje user1 = new Personaje("Flavio", "Médico", 120, 6, 3);
        System.out.println(user1);

        Scanner sc = new Scanner(System.in);
        String intento;

        System.out.println("==== Creación de Personaje ====");
        System.out.println("===============================");

        System.out.print("Introduce el Nombre: ");
        String nombre = sc.nextLine().trim();
        do {

            while (clase < 1 || clase > 3) {
                System.out.println("""
                            Elige la Clase:
                            1. Médico.  | Vida = 120 | Botiquin = 3 | Habilidades = 6 |
                            2. Policía. | Vida = 100 | Botiquin = 2 | Habilidades = 8 |
                            3. Bombero. | Vida = 140 | Botiquin = 1 | Habilidades = 7 |
                        """);
                System.out.print("Eligi una opción: ");
                clase = sc.nextInt();
                sc.nextLine();

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
                            habilidades = 7;
                            nombreClase = "Bombero";
                            break;
                    }

                    System.out.println("Tu clase es : %s ".formatted(nombreClase));
                } else {
                    System.out.println("opcion no valida.Introduce una opción");
                    clase = 0;

                }
            }
            System.out.println("Continuar: Si/No");
            intento = sc.nextLine();
            clase = 0;

        } while (intento.equalsIgnoreCase("No"));

        Personaje user2 = new Personaje(
                nombre,
                nombreClase,
                vida,
                habilidades,
                botiquin

        );

        System.out.println("""


                |=======================|
                |Nuevo Personaje Creado.|
                |=======================|

                Tu Nombre es            : %s.
                Tu Clase es             : %s.
                Puntos de Vida          : %d.
                Cantidad de botiquines  : %d.
                Puntos de Destreza      : %d.
                """.formatted(
                user2.getNombre(),
                user2.getTipo(),
                user2.getVida(),
                user2.getBotiquines(),
                user2.getHabilidad()

        ));

        String Dia;

        for (int i = 1; i < 6; i++) {

            Dia = switch (i) {
                case 1 -> "🌞 Día 1 ";
                case 2 -> "🌞 Día 2 ";
                case 3 -> "🌞 Día 3 ";
                case 4 -> "🌞 Día 4 ";
                default -> "🌞 Día 5";

            };

            if (vida <= 30) {
                System.out.println("""
                            =========================
                            |        ESTADO         |
                            =========================

                            Tienes %d puntos de vida.

                            Tu Encuentras en 🚨 Estado Critico.

                        """.formatted(vida));
            } else if (vida <= 70) {
                System.out.println("""
                            =========================
                            |        ESTADO         |
                            =========================

                            Tienes %d puntos de vida.

                            Te Encuentras ⚠️ Herido.

                        """.formatted(vida));

            } else {
                System.out.println("""
                            =========================
                            |        ESTADO         |
                            =========================

                            Tienes %d puntos de vida.

                            Te Encuentras en ✅ Buen Estado.

                        """.formatted(vida));
            }
            int puntosDeMision = 0;

            do {
                System.out.println("""
                            =========================
                            |   Inicia la Aventura  |
                            =========================
                        """);

                System.out.println("Explora la zona");
                int Mision = 1 + (int) (Math.random() * 2);
                String tipoDeMision = switch (Mision) {
                    case 1 -> "Combatir Zombie 🧟";
                    default -> "Explorar Vivienda 🏘️";
                };
                System.out.println("");

                Zombie zombie1 = new Zombie();

                boolean huir = false;

                if (Mision == 1) {
                    while (zombie1.getVida() > 0 && user2.getVida() > 0 && huir == false) {
                        System.out.println("Te encontraste con un Zombie 🧟.");
                        int eleccion = 0;

                        while (eleccion < 1 || eleccion > 3) {

                            System.out.println("""

                                        1️⃣ Atacar.
                                        2️⃣ Huir.
                                        3️⃣ Usar Botiquin.

                                    """);
                            System.out.print("Elige una opción: ");
                            eleccion = sc.nextInt();
                            sc.nextLine();

                            if (eleccion >= 1 || eleccion <= 3) {
                                switch (eleccion) {
                                    case 1:
                                        if (zombie1.getVida() > 0) {

                                            int dañoJugador = 1 + (int) (Math.random() * 10);
                                            int dañoZombie = 1 + (int) (Math.random() * 10);
                                            System.out.println("""
                                                    Has atacado un Zombie 🧟.
                                                    Has realizado %d de daño ⚔️.
                                                    """.formatted(dañoJugador));
                                            System.out.println("""
                                                    El Zombie 🧟 te ha atacado.

                                                    Te a hecho %d puntos de daño ⚔️.
                                                    """.formatted(dañoZombie));
                                            System.out.println("""
                                                    Te quedan %s puntos de vida.
                                                    El zombie 🧟 tiene %d puntos de vida restantes.
                                                    """.formatted(user2.dañoRecibido(dañoZombie), zombie1.dañoRecibido(dañoJugador)));
                                        }
                                        break;
                                    case 2:
                                        vida -= 5;
                                        System.out.println("""
                                                Has huido.
                                                Has Perdido %d Puntos de Vida.
                                                """.formatted(vida));
                                    default:
                                        break;
                                }
                            } else {
                                System.out.println("opcion no valida.Introduce una opción");
                                eleccion = 0;
                            }

                        }
                        if (zombie1.getVida() <= 0) {
                            puntosDeMision += 10 + (int) (Math.random() * 21);
                        }
                        System.out.println("Has huido, no obtienes puntos de misión.");
                    }
                }
            } while (puntosDeMision <= 100);
        }
    }
}