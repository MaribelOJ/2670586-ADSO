public class equipos{
    String nombre;
    int origen;
    int partidosGanados;
    int partidosEmpatados;
    int partidosPerdidos;
    Jugador [] jugadores;


    public equipos(String name, int fundationYear, int wonGames, int tiedGames, lostGames) {

        nombre = name;
        origen = fundationYear;
        partidosGanados = wonGames;
        partidosEmpatados = tiedGames;
        partidosPerdidos = lostGames;
        jugadores = new Jugador[16];
    }

    public void makePlayersList(Jugador [] infoJugadores){
        for(int i = 0; i < infoJugadores.length; i++){
            if(infoJugadores[i] != null){
                jugadores[i] = infoJugadores[i];
            }
        }
    }

    public void


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getOrigen() {
        return this.origen;
    }

    public void setOrigen(int origen) {
        this.origen = origen;
    }

    public int getPartidosGanados() {
        return this.partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getPartidosEmpatados() {
        return this.partidosEmpatados;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public int getPartidosPerdidos() {
        return this.partidosPerdidos;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public String[] getJugadores() {
        return this.jugadores;
    }

    public void setJugadores(String[] jugadores) {
        this.jugadores = jugadores;
    }

}