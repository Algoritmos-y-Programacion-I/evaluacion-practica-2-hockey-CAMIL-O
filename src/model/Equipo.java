package model;

public class Equipo {

    private final int CANTIDAD_JUGADORES = 6;
    private String nombreEquipo;
    private int contadorJugadores; 


    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.contadorJugadores = 0; 
    }

    private JugadorHockey[] jugadores = new JugadorHockey[CANTIDAD_JUGADORES];

    public void addPlayer(JugadorHockey jugador) {
        if (contadorJugadores < jugadores.length) {
            jugadores[contadorJugadores] = jugador;

            System.out.println("Jugador agregado exitosamente");
        }else {
            System.out.println("Maximo de jugadores alxanzado.");
            
        }
    }

    public JugadorHockey[] getJugadores() {
        return jugadores;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    
}