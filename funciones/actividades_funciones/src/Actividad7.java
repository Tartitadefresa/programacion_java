import javax.swing.JOptionPane;

public class Actividad7 {
  public static void main(String[] args) {
    int money = Actividad7.showInputEuros();

    double javaBitcoins = Actividad7.euroToBitcoin(money);
    double javaEthers = Actividad7.euroToEther(money);

    JOptionPane.showMessageDialog(
      null, "La cantidad " + money + " en euros equivale a " + javaBitcoins + " bitcoins y " + javaEthers + " ethereum.", 
      "Actividad 7", 
      JOptionPane.INFORMATION_MESSAGE
    );
  }

  private static int showInputEuros() {
    int money = 0;

    do {
      money = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce una cantidad de euros"));
    } while (money <= 0);

    return money;
  }

  private static double euroToBitcoin(int euro) {
    return euro * 0.4;
  }

  private static double euroToEther(int euro) {
    return euro * 0.2;
  }
}
