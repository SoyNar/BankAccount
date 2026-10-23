
public class CuentaAhorro extends CuentaBancaria{

    private String fechaApertura;
    private  static final double TASA_INTERES = 2.5;
    private static final double SALDO_MINIMO_CUENTA = 10000;

    public CuentaAhorro(String numeroCuenta, String titular,double saldoInicial, String fechaApertura) {
        if (saldoInicial < SALDO_MINIMO_CUENTA){
            throw new IllegalArgumentException("Su saldo es menor al permitido");
        }

            super(numeroCuenta, titular, saldoInicial, TASA_INTERES);
            this.fechaApertura = fechaApertura;
    }

    @Override
    public void retirar(double monto) {
        if(this.getSaldo() < monto){
            System.out.println("Saldo insufiiciente");
            return;
        }




    }
}
