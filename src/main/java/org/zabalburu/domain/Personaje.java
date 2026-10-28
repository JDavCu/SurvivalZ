package org.zabalburu.domain;


public class Personaje {
    public static final int VIDA_MAXIMA_MEDICO = 120;
    public static final int HABILIDAD_INICIAL_MEDICO = 6;
    public static final int BOTIQUINES_INICIALES_MEDICO = 3;

    public static final int VIDA_MAXIMA_POLICIA = 100;
    public static final int HABILIDAD_INICIAL_POLICIA = 8;
    public static final int BOTIQUINES_INICIALES_POLICIA = 2;

    public static final int VIDA_MAXIMA_BOMBERO = 140;
    public static final int HABILIDAD_INICIAL_BOMBERO = 7;
    public static final int BOTIQUINES_INICIALES_BOMBERO = 1;
    private String nombre; 
    private String tipo;
    private int vida;
    private int habilidad;
    private int botiquines;
    
    public Personaje(String nombre, String tipo, int vida, int habilidad, int botiquines) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
        this.habilidad = habilidad;
        this.botiquines = botiquines;
    }

    public String getNombre() {
        return nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public int getVida() {
        return vida;
    }
    public int getHabilidad() {
        return habilidad;
    }
    public int getBotiquines() {
        return botiquines;
    }

    public int dañoRecibido(int daño){
        return vida - daño;
    }


    @Override
    public String toString() {
        return "Personaje: nombre=" + nombre 
             + ", tipo=" + tipo + ", vida=" + vida 
             + ", habilidad=" + habilidad
             + ", botiquines=" + botiquines + ".";
    }
    

    
}
