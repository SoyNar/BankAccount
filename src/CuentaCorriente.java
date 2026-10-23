public class CuentaCorriente extends CuentaBancaria {

    private double limiteSobregiro = 50000.0;
    private double porcentajeComisionSobregiro = 5.0;

    public CuentaCorriente(String numeroCuenta, String titular, double saldoInicial, double limiteSobregiro, double porcentajeComisionSobregiro) {
        super(numeroCuenta, titular, saldoInicial, 0.0);
        this.limiteSobregiro = limiteSobregiro;
        this.porcentajeComisionSobregiro = porcentajeComisionSobregiro;
    }

    public CuentaCorriente(String numeroCuenta, String titular, double saldoInicial) {
        super(numeroCuenta, titular, saldoInicial, 0.0);
        this.limiteSobregiro = 50000.0;
        this.porcentajeComisionSobregiro = 5.0;
    }

    @Override
    public void retirar(double monto) {
        double saldo =getSaldo();
        if (monto <= (limiteSobregiro + saldo)) {
            saldo = saldo - monto;

            if (saldo < 0) {

                double comision = (saldo*-1) * (porcentajeComisionSobregiro);
                saldo = saldo - comision;

                System.out.println("Retiro Exitoso");
                System.out.println("Comisión por sobregiro: " + comision);
                System.out.println("Nuevo saldo: " + saldo);
            } else {
                System.out.println("Retiro Exitoso");
                System.out.println("Nuevo saldo: " + saldo);
            }
        } else {
            System.out.println("Error: Fondos insuficientes, incluso usando el sobregiro.");
        }
    }
}