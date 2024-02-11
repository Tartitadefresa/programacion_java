import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Fecha {
    private int dia;
    private int mes;
    private int año;
    
    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.año = 1900;
    }

    public Fecha(int dia, int mes, int año) {
        valida(dia, mes, año);
    }


    public void leer(int dia, int mes, int año) {
        valida(dia, mes, año);
    }

    public void valida(int dia, int mes, int año) {
        /*Operacion ternaria es igual a if
        if (compruebaDia(dia)) {
            this.dia = dia;
        } else {
            this.dia = 1;
        }*/

        this.dia = compruebaDia(dia) ? dia : 1;
        this.mes = compruebaMes(mes) ? mes : 1;
        this.año = compruebaAño(año) ? año : 1900;
    }

    public void corta() {
        System.out.println("La fecha corta es: " + dia + "-" + mes + "-" + año);
    }

    public long diasTranscurridos() {
        LocalDate fechaInicio = LocalDate.of(1900, 1, 1);
        LocalDate fechaFin = LocalDate.of(this.año, this.mes, this.dia);
        long diasDiferencia = ChronoUnit.DAYS.between(fechaInicio, fechaFin);

        return diasDiferencia;
    }

    public String larga() {
        String mesStr = numeroMes(this.mes);
        return this.dia + " de " + mesStr + " de " + this.año;
    }

    private boolean compruebaDia(int dia) {
        return dia >= 1 && dia <= 31;
    }

    private boolean compruebaMes(int mes) {
        return mes >= 1 && mes <= 12;
    }

    private boolean compruebaAño(int año) {
        return año >= 1900 && año <= 2050;
    }

    private String numeroMes(int mes) {
        switch (mes) {
            case 1:
                return "Enero";
            case 2:
                return "Febrero";
            case 3:
                return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Septiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Noviembre";
            case 12:
                return "Diciembre";
        }

        return "";
    }
}