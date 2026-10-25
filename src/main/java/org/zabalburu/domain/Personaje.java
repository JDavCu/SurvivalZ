package org.zabalburu.domain;

public class Personaje {
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
    @Override
    public String toString() {
        return "Personaje [nombre=" + nombre 
             + ", tipo=" + tipo + ", vida=" + vida 
             + ", habilidad=" + habilidad
             + ", botiquines=" + botiquines + "]";
    }
    

    
}
