package model;
import model.Arbitro; 
import model.Equipo; 
import model.*; 

import java.util.Random;

public class Controller {

    private Equipo[] equipos;
    private Arbitro[] arbitros;

    private final int CANTIDAD_EQUIPOS = 4;
    private final int CANTIDAD_ARBITROS = 4;

    private int contadorEquipos = 0;
    private int contadorArbitros = 0; 

    /**
     * Constructor de la clase Controller para inicializar variables globales.
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Controller con un arreglo de personas vacío.
     */
    public Controller() {
        equipos = new Equipo[CANTIDAD_EQUIPOS];
        arbitros = new Arbitro[CANTIDAD_ARBITROS];
    }

    public String fixture() {
        String fixture = "";
        Random random = new Random();
        int equipo1 = random.nextInt(4);
        int equipo2;
        do {
            equipo2 = random.nextInt(4);
        } while (equipo2 == equipo1);

        fixture += "Partido 1: Equipo " + equipo1 + " vs Equipo " + equipo2;
        fixture += "\n";

        do {
            equipo1 = random.nextInt(4);
            equipo2 = random.nextInt(4);
        } while (equipo2 == equipo1);

        fixture += "Partido 2: Equipo " + equipo1 + " vs Equipo " + equipo2;
        return fixture;
    }


    public Equipo registerTeam(String nombreEquipo) {
        Equipo equipo = new Equipo(nombreEquipo);
        
        return equipo; 
    }

    public JugadorHockey registerPlayer(String nombre, int edad, Posicion posicion){
        JugadorHockey jugador = new JugadorHockey(nombre, edad,posicion); 

        return jugador; 
    }

    public void addTeam(Equipo equipo) {
        
        if (contadorEquipos < CANTIDAD_EQUIPOS) {
            equipos[contadorEquipos] = equipo;
            contadorEquipos++;
            System.out.println("¡Equipo registrado exitosamente! c:"); 

        } else {
            System.out.println("Maximo de equipo que se pueden registrar.");
        }
    }

    public ArbitroPrincipal registerArbiter(String nombre, int edad){
        ArbitroPrincipal arbitro = new ArbitroPrincipal(nombre, edad); 

        return arbitro; 

    }

    public void addArbiter(ArbitroPrincipal arbitro) {

        if (contadorArbitros < CANTIDAD_ARBITROS) {
            arbitros[contadorArbitros] = arbitro;
            contadorArbitros++;

            System.out.println("¡Arbitro registrado exitosamente!");
        } else {
            System.out.println("Se ha alcanzado el número máximo de árbitros.");
        }

    }

    public Equipo searchTeam(String nombreEquipo) {
        for (int i = 0; i < contadorEquipos; i++) {
            if (equipos[i].getNombreEquipo().equalsIgnoreCase(nombreEquipo)) {
                return equipos[i];
            }
        }
        return null;
    }

    public void addPlayers(String nombreEquipo, JugadorHockey jugador) {
        Equipo equipo = searchTeam(nombreEquipo);
        if (equipo != null) {
            equipo.addPlayer(jugador);
            

        } else {
            System.out.println("The team '" + nombreEquipo + "' not registered.");
        }
    }

    public void crearObjetos(){
        addTeam(registerTeam("Equipo A"));
        addTeam(registerTeam("Equipo B"));

        addPlayers("Equipo A", registerPlayer("Camilo", 27, Posicion.PORTERO));
        addPlayers("Equipo A", registerPlayer("Carlos", 30, Posicion.ALA));
        addPlayers("Equipo A", registerPlayer("Juan", 23, Posicion.CENTRO));
        addPlayers("Equipo A", registerPlayer("Jaime", 25, Posicion.DEFENSA));


        addArbiter(registerArbiter("Harold", 40)); 
        addArbiter(registerArbiter("Andres", 39)); 


        
    }




    


    





    





}