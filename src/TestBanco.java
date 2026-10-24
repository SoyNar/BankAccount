import java.util.ArrayList;
import java.util.List;

public class TestBanco {
    public static void main(String[] args) {
        //1.creacion de cuentas
        //cuenta Ana Perez
        System.out.println("Creacion de cuentas");
        CuentaAhorro cuentaAna = new CuentaAhorro("AH001", "Ana Pérez", 50000.0, "2024-01-15");
        //crear cuenta Luis
        CuentaCorriente cuentaLuis = new CuentaCorriente("CC001", "Luis", 20000.0);
        //Crear cuenta Empresarial algo asii
        //CuentaEmpresarial cuentaTech = new CuentaEmpresarial("EM001",200000, "nombreEmpresa", "rut");
        //cuenta Maria Lopez
        CuentaAhorro cuentaMaria = new CuentaAhorro("AH002,", "Maria Lopez", 15000.0, "2024-02-01");

        //2. mostrar informacion inicial cuentas
        System.out.println("Informacion todas las cuentas");
        cuentaAna.mostrarInfo();
        cuentaLuis.mostrarInfo();
        //cuentaTech.mostrarInfo();
        cuentaMaria.mostrarInfo();

        //3. operaciones de cuentas
        System.out.println("Operaciones bancarias");
        System.out.println("Deposito Ana");
        cuentaAna.depositar(10000);
        System.out.println("Retiro de luis");
        cuentaLuis.retirar(25000);
        System.out.println("Retiro de Tech");
        //cuentaTech.retirar(10000);
        System.out.println("Retiro de Maria");
        cuentaMaria.retirar(20000);

        //4. aplicar interes a las cuentas
        System.out.println("aplicando intereses a las cuentas");
        System.out.println("aplicando intereses cuenta Ana");
        cuentaAna.aplicarInteres();
        System.out.println("aplicando intereses cuenta Luis");
        cuentaLuis.aplicarInteres();
        System.out.println("aplicando intereses cuenta Tech");
        //cuentaTech.aplicarInteres();
        System.out.println("aplicando intereses cuenta Maria");
        cuentaMaria.aplicarInteres();

        //5. Mostrar info despues de las operaciones
        System.out.println("Mostrar info despues de moviminetos bancarios");
        cuentaAna.mostrarInfo();
        cuentaLuis.mostrarInfo();
        //cuentaTech.mostrarnfo();
        cuentaMaria.mostrarInfo();

        //6. calcular y mostrar resumen

        System.out.println("\n~~~~~~~~~RESUMEN DE LA CUENTA BANCARIA ~~~~~~~~~~");

        List<CuentaBancaria> cuentas = new ArrayList<>();
        cuentas.add(cuentaAna);
        cuentas.add(cuentaLuis);
        cuentas.add(cuentaMaria);

        double saldoTotal = 0;
        CuentaBancaria cuentaMayor = cuentas.get(0);

        for (CuentaBancaria cuenta : cuentas) {
            saldoTotal += cuenta.getSaldo();

            if (cuenta.getSaldo() > cuentaMayor.getSaldo()) {
                cuentaMayor = cuenta;
            }
        }

        int totalCuentas = cuentas.size();
        double promedio = saldoTotal / totalCuentas;

        System.out.println("Total de cuentas: " + totalCuentas);
        System.out.println("Saldo total: " + saldoTotal);
        System.out.println(String.format("Promedio de saldo: $%.2f%n ", promedio));

        System.out.println("\nCuenta con mayor saldo:");
        System.out.println("Número de cuenta: " + cuentaMayor.getNumeroCuenta());
        System.out.println("Titular: " + cuentaMayor.getTitular());
        System.out.println("Saldo: " + cuentaMayor.getSaldo());





    }
}
