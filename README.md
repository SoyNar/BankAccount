# Sistema de Cuentas Bancarias (BankAccount)

Este proyecto contiene la solución al laboratorio de Programación Orientada a Objetos en Java (`TIFC2DEV-JAVA-MJ3 LAB`), enfocado en la gestión de cuentas bancarias independientes mediante la aplicación de conceptos como abstracción, herencia, encapsulamiento y polimorfismo.

---

## Integrantes del Equipo

* Cristian Beltrán
* Narciris Mena
* Diana Ocampo
* Darwin Noriega

---

## Descripción de la Solución

El sistema gestiona tres tipos de cuentas financieras con reglas de negocio específicas, derivando de una clase abstracta común:

1. **Cuenta de Ahorro (`CuentaAhorro`):**
    * Exige un saldo mínimo de apertura de $10,000.
    * Aplica una tasa fija de interés del 2.5% anual.
    * No permite retiros que superen el saldo disponible.

2. **Cuenta Corriente (`CuentaCorriente`):**
    * Maneja un límite de sobregiro por defecto de $50,000.
    * Permite retiros por encima del saldo hasta dicho límite.
    * Aplica una comisión del 5.0% sobre el saldo negativo en caso de sobregiro.

3. **Cuenta Empresarial (`CuentaEmpresarial`):**
    * Exige un saldo mínimo de apertura de $100,000.
    * Aplica una tasa fija de interés del 1.5% anual.
    * Cobra una comisión fija de $2,000 por cada transacción de retiro.

---

## Estructura del Proyecto

El código está distribuido en la carpeta `src/` bajo los siguientes archivos:

* `CuentaBancaria.java`: Clase base abstracta que define los atributos generales, getters, métodos concretos de depósito e interés, y la firma del método abstracto de retiro.
* `CuentaAhorro.java`: Implementación de la cuenta de ahorros.
* `CuentaCorriente.java`: Implementación de la cuenta corriente y lógica de sobregiros.
* `CuentaEmpresarial.java`: Implementación de la cuenta empresarial con comisión por retiro.
* `TestBanco.java`: Programa principal que ejecuta el flujo de pruebas secuencial y genera las métricas requeridas.

---

## Ejecución

1. Clonar el repositorio o descargar el código fuente.
2. Abrir el proyecto en un entorno de desarrollo con soporte para Java (como IntelliJ IDEA, Eclipse o VS Code).
3. Asegurarse de que la carpeta `src/` esté configurada como directorio de fuentes (*Sources Root*).
4. Ejecutar el archivo `TestBanco.java` para vislumbrar la salida de las operaciones en consola.