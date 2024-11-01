package model;

import model.Arbitro;
import model.IDesplazarseEnPistaSinPalo;

public class ArbitroPrincipal extends Arbitro {

    public ArbitroPrincipal(String nombre, int edad) {
        super(nombre, edad);
    }
    
    public String getNombre() {
        return nombre;
    }

    
    public void mover() {
        System.out.println(nombre + " se mueve por la pista como Arbitro Principal.");
    }

}

