package model;

public abstract class Arbitro {

    protected String nombre;
    protected int edad; 

    public Arbitro(String nombre, int edad) {
        this.nombre= nombre;
        this.edad= edad; 
    }

    public String desplazarse() {
        return nombre + " se desplaza en la pista como árbitro.";
    }

    public abstract void mover(); 

}
