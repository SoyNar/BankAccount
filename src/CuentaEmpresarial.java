public class CuentaEmpresarial extends CuentaBancaria {

    private String nombreEmpresa;
    private String RUT;
    private double comisionRetiro = 2000;
    private double SALDO_MINIMO_CUENTA = 100000;

    public CuentaEmpresarial(String numeroCuenta, String titular, double saldoInicial,
                             String nombreEmpresa, String RUT) {

        super(numeroCuenta, titular, saldoInicial, 1.5);
        this.nombreEmpresa = nombreEmpresa;
        this.RUT = RUT;
        this.comisionRetiro = comisionRetiro;

        if (saldoInicial < SALDO_MINIMO_CUENTA) {
            throw new IllegalArgumentException("Su saldo es menor al permitido");
        }
    }

    @Override
    public void retirar(double monto) {
        if (monto <= comisionRetiro){
            System.out.println("El monto a retirar debe ser mayor a la comision por retiro: " + comisionRetiro);
            return;
        }
        if(this.getSaldo() < monto){
            System.out.println("Error: Saldo insuficiente. No se puede retirar $" + String.format("%.2f", monto));
            return;
        }
        if (monto + comisionRetiro > getSaldo()) {
            System.out.println("Saldo insuficiente. No se puede retirar $" + String.format("%.2f", monto));
            return;
        }

        descontarSaldo(monto);
        descontarSaldo(comisionRetiro);
        System.out.println("Retiro Exitoso");
        System.out.println("Comision Por Retiro: " + comisionRetiro);
        System.out.println("Nuevo Saldo: " + String.format("%.2f", getSaldo()));
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cuenta Empresarial ");
        System.out.println("Nombre de la Empresa" + nombreEmpresa);
        System.out.println("RUT: " + RUT);
    }

}
