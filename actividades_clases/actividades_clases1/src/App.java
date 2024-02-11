public class App {
    public static void main(String[] args) throws Exception {
        Pizza margarita = new Pizza("familiar", "margarita");
        Pizza cuatroQuesos = new Pizza("mediana", "cuatro quesos");
        Pizza funghi = new Pizza("familiar", "funghi");

        margarita.modificarTamaño();
        cuatroQuesos.servirPizza();

        margarita.mostrarPizza();
        System.out.println("---");
        cuatroQuesos.mostrarPizza();
        System.out.println("---");
        funghi.mostrarPizza();
    }
}
