public abstract class CuentaBancaria {


    private String numeroCuenta;
    private String titular;
    private double saldo;
    private double tasaInteres;

    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial,
                          double tasaInteres) {

        if (saldoInicial < 0) {
            throw new IllegalArgumentException(
                    "El saldo inicial no puede ser negativo"
            );
        }

        if (tasaInteres < 0) {
            throw new IllegalArgumentException(
                    "La tasa de interes no puede ser negativa"
            );
        }

        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
        this.tasaInteres = tasaInteres;

    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }


    public void depositar(double monto) {

        if (monto <= 0) {
            System.out.println("Error: el monto a depositar debe ser positivo.");
            return;
        }

        saldo += monto;

        System.out.println("Deposito realizado: " + monto);

        System.out.print("Nuevo saldo: " + saldo);
    }


    public abstract void retirar(double monto);

    public void aplicarInteres() {

        double interes = saldo * tasaInteres / 100;
        saldo += interes;

        System.out.print("Intereses generados: " + interes);

        System.out.print("Nuevo saldo: " + saldo);
    }

    protected void descontarSaldo(double monto) {
        if(monto > 0) {
            this.saldo -= monto;
        }
    }


    public void mostrarInfo() {

        System.out.println("\n ~~~~~DETALLES DE LA CUENTA ~~~~~~ ");

        System.out.println("Numero de cuenta: " + numeroCuenta);

        System.out.println( "Titular: " + titular);

        System.out.print( "Saldo: " + saldo);

        System.out.print( "Tasa de interes: " + tasaInteres);
    }





}


