import javax.swing.border.EmptyBorder;

public class AppEmpresa {
    public static void main(String[] args) throws Exception {
    Empresa empresa = new Empresa("LoMismoDaw", "111111X");
    empresa.registrarVehiculo(new Coche("ABC123", "Renault", "Clio"));
    empresa.registrarVehiculo(new Moto("DEF456", "Honda", "CBR"));
    empresa.registrarVehiculo(new Camion("GHI789", "Volvo", "FH16"));

    empresa.listarVehiculosPorTipo();
    empresa.getInfoTaller();
    }
}
