
public class CuentaAhorro extends CuentaBancaria{

    private String fechaApertura;
    private static final double TASA_INTERES = 2.5;
    private static final double SALDO_MINIMO_CUENTA = 10000;

    public CuentaAhorro(String numeroCuenta, String titular,double saldoInicial, String fechaApertura) {
        super(numeroCuenta, titular, saldoInicial, TASA_INTERES);

        if (saldoInicial < SALDO_MINIMO_CUENTA){
            throw new IllegalArgumentException("Su saldo es menor al permitido");
        }

            this.fechaApertura = fechaApertura;
    }

    @Override
    public void retirar(double monto) {
        if (monto <= 0){
            System.out.println("El monto a retirar debe ser mayor a cero");
            return;
        }
        if(this.getSaldo() < monto){
            System.out.println("Error: Saldo insuficiente. No se puede retirar $" + String.format("%.2f", monto));
            return;
        }

            this.descontarSaldo(monto);
        System.out.println("Retiro exitoso de $" + String.format("%.2f", monto) + ". Su nuevo saldo es: $" + String.format("%.2f", getSaldo()));


    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cuenta de ahrros ");
        System.out.println("Fecha de apertura" + fechaApertura);
        System.out.println("-----------------------------------");
    }
}
