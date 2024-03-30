public class App {
    public static void main(String[] args) throws Exception {
        Club club = new Club("Club", 1, 2000);

        Jugador jugador = new Jugador(1, "Jugador", 20, "Nacionalidad", "Posicion");
        Jugador jugador2 = new Jugador(2, "Jugador2", 20, "Nacionalidad", "Posicion");

        Entrenador entrenador = new Entrenador(1, "Entrenador", 20, "Nacionalidad", 10);

        Equipo equipo = new Equipo("Equipo", "Categoria");

        equipo.setEntrenador(entrenador);
        equipo.agregarJugador(jugador);
        equipo.agregarJugador(jugador2);

        club.agregarEquipo(equipo);

        System.out.println(club.toString());
    }
}
