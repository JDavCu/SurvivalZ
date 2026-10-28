package org.zabalburu.domain;

public class Zombie {
    private String Tipo;
    private int vida;
    
    
    
    public Zombie() {

    int tipo = 1 + (int)(Math.random()* 3);
        switch (tipo) {
            case 1:
                Tipo = "Caminante";
                vida = 20;
                break;
            case 2:
                Tipo = "Corredor";
                vida = 35;
            default:
                Tipo = "Tanque";
                vida = 50; 
                break;
        }
    }
    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String tipo) {
        Tipo = tipo;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    @Override
    public String toString() {
        return "Zombie  [Tipo=" + Tipo 
                        + ", vida=" + vida + "]";
    } 
    
   
}
