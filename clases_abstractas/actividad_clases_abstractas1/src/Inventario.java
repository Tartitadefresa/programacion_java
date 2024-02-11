import java.util.ArrayList;

public class Inventario {
    protected ArrayList<Mascotas> animales;

    Inventario() {
        this.animales = new ArrayList<Mascotas>();
    }

    public void insertar(Mascotas animal) {
        this.animales.add(animal);
    }

    public void eliminar(String nombre) {
        int indice = this.encuentraAnimal(nombre);

        if (indice >= 0) {
            this.animales.remove(indice);
            System.out.println("Animal eliminado");
        } else {
            System.out.println("Animal no encontrado");
        }
    }

    public void vaciar() {
        this.animales.clear();
        System.out.println("Inventario vaciado");
    }

    public void mostrarDatos(String nombre) {
        int indice = this.encuentraAnimal(nombre);

        if (indice >= 0) {
            this.animales.get(indice).muestra();
        } else {
            System.out.println("Animal no encontrado");
        }
    }

    private int encuentraAnimal(String nombre) {
        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i).getNombre().equals(nombre)) {
                return i;
            }
        }

        return -1;
    }

    public void mostrarAnimales() {
        for (int i = 0; i < animales.size(); i++) {
            animales.get(i).muestra(); 
        }

    }
}

