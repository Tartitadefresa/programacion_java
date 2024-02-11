public class Programador extends Empleado {
    protected int lineasDeCodigoPorHora;
    protected String lenguajeDominante;
    
    Programador(String nombre, String cedula, int edad, boolean casado, double salario) {
        super(nombre, cedula, edad, casado, salario);
    }

    Programador() {
        super();
    }


}
