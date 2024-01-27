import javax.swing.JOptionPane;

public class Animal {
    private String nombre;
    private double peso;

    public Animal(String nombre, double peso) {
        super();
        this.nombre = nombre;
        this.peso = peso;
    }

    public void comer() {
        JOptionPane.showMessageDialog(null, "Comer");
    }

    public String getNombre() {
        return nombre;
    }
    
    public double getPeso() {
        return peso;
    }
}