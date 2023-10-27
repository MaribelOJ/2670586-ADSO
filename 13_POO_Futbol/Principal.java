public class Pincipal{
    public static void main(String[] args){

        Jugador [] lista = new Jugador[16];

        Jugador lista[0] = new Jugador(1088340376, "Mario Cazas", 25, "portero");
        Jugador lista[1] = new Jugador(1333568246, "Maluma Baby", 28, "defensa central");
        Jugador lista[2] = new Jugador(26441375, "Ricky Martin", 30, "defensa lateral");
        Jugador lista[3] = new Jugador(26441375, "Neimar Barchala", 30, "centro campista");
        Jugador lista[4] = new Jugador(19945565, "Joe Ferreira", 30, "media punta");
        Jugador lista[5] = new Jugador(108849562, "Gabriel Murillo", 27, "medio centro defensivo");


        Equipos equipo1 = new equipos("Arcoiris", 1997, 5, 10, 9);

        equipo1.makePlayersList(lista);



    }
}