public class Calculadora {
    private float operando1;
    private float operando2;
    private String operacion;

    public Calculadora(float operando1, float operando2, String operacion) {
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.operacion = operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public void setOperando(int numOperando, float valorOperando) {
        if (numOperando == 1) {
            this.operando1 = valorOperando;
        } else if (numOperando == 2) {
            this.operando2 = valorOperando;
        }
    }

    public float obtenerResultado() {
        float resultado = 0;
        switch (operacion) {
            case "+":
                resultado = operando1 + operando2;
                break;
            case "-":
                resultado = operando1 - operando2;
                break;
            case "*":
                resultado = operando1 * operando2;
                break;
            case "/":
                resultado = operando1 / operando2;
                break;
        }
        return resultado;
    }
}
