public class Empleado {
    protected String nombre;
    protected String cedula;
    protected int edad;
    protected boolean casado;
    protected double salario;

    Empleado(String nombre, String cedula, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    Empleado() {
        this.nombre = "";
        this.cedula = "";
        this.edad = 0;
        this.casado = false;
        this.salario = 0;
    }

    public void clasificacion(int edad) {
        if (edad <= 21) {
            System.out.println("Principiante");
        }

        if (edad >= 22 && edad <= 35) {
            System.out.println("Intermedio");
        }

        if (edad > 35) {
            System.out.println("Senior");
        }
    }

    public void datosEmpleado() {
        System.out.println(this.nombre + "\n" + this.cedula + "\n" + this.edad + "\n" + this.casado + "\n" + this.salario);
    }

    public void aumentarSalario(double porcentaje) {
        double extra = (this.salario * 100) / porcentaje;
        this.salario += extra; 
    }
}
