public class AppAnimales {
    public static void main(String[] args) {
        Oviparo oviparo = new Oviparo("Pato", 2.5, true);
        Mamifero mamifero = new Mamifero("Perro", 5.5, true);

        oviparo.comer();
        mamifero.comer();

        oviparo.ponerHuevos();
        mamifero.parir();
    }
}
