//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("Prueba cuenta de ahorrors");
        CuentaAhorro cuentaAna = new CuentaAhorro("AH001", "Ana Pérez", 50000.0, "2024-01-15");
        cuentaAna.mostrarInfo();
        System.out.println("Deposito y retiro");
        cuentaAna.depositar(10000);
        cuentaAna.retirar(0);


    }
}