package Java_6_Bucles;

import java.util.ArrayList;
import java.util.Random;

public class Bucles {
    // 1. Caja Registradora
    // -------------------------------

    public static double precioProducto(int opcion) {
        switch (opcion) {
            case 1: return 50;  // Hamburguesa
            case 2: return 30;  // Papas
            case 3: return 20;  // Refresco
            default: return 0;
        }
    }
    // 2. Calculadora de Descuentos
    // -------------------------------

    public static double aplicarDescuento(double precio, int porcentaje) {
        return precio - (precio * porcentaje / 100);
    }

    // 3. Tabla de Multiplicar
    // -------------------------------

    public static void mostrarTabla(int numero) {
        int i = 1;
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }
    }
    // 4. Cajero Automático
    // -------------------------------

    public static double consultarSaldo(double saldo) {
        return saldo;
    }

    public static double depositar(double saldo, double monto) {
        return saldo + monto;
    }

    public static double retirar(double saldo, double monto) {
        if (monto <= saldo) return saldo - monto;
        return -1; // error
    }


    // 5. Generador de Contraseñas
    // -------------------------------

    public static String generarPassword(int longitud) {
        Random rand = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*";

        String pass = "";
        for (int i = 0; i < longitud; i++) {
            int index = rand.nextInt(caracteres.length());
            pass += caracteres.charAt(index);
        }
        return pass;
    }
    // 6. Control de Asistencia
    // -------------------------------

    public static void registrarAsistencia(
            ArrayList<String> presentes,
            ArrayList<String> ausentes,
            String nombre,
            String estado
    ) {
        if (estado.equalsIgnoreCase("s"))
            presentes.add(nombre);
        else
            ausentes.add(nombre);
    }

    // 7. Calculadora de Promedios
    // -------------------------------

    public static String evaluarPromedio(double promedio) {
        if (promedio < 6) return "Reprobado";
        if (promedio < 8) return "Aprobado";
        return "Excelente";
    }
}

