package Java_6_Bucles;
import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. CAJA REGISTRADORA
        // -----------------------------------
        double total = 0;
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE COMIDA RÁPIDA ---");
            System.out.println("1. Hamburguesa $50");
            System.out.println("2. Papas $30");
            System.out.println("3. Refresco $20");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            double precio = Bucles.precioProducto(opcion);
            total += precio;

        } while (opcion != 4);

        System.out.println("Total: $" + (total - Bucles.precioProducto(4)));

        System.out.print("Pago: ");
        double pago = sc.nextDouble();

        if (pago >= total)
            System.out.println("Cambio: $" + (pago - total));
        else
            System.out.println("Pago insuficiente.");


        // 2. CALCULADORA DE DESCUENTOS
        // -----------------------------------

        System.out.print("\nPrecio del producto: ");
        double precioBase = sc.nextDouble();

        for (int d = 10; d <= 50; d += 10) {
            System.out.println(d + "% -> " + Bucles.aplicarDescuento(precioBase, d));
        }


        // 3. TABLA DE MULTIPLICAR
        // -----------------------------------

        int numero;
        do {
            System.out.print("\nNúmero del 1 al 10: ");
            numero = sc.nextInt();
        } while (numero < 1 || numero > 10);

        Bucles.mostrarTabla(numero);

        // 4. CAJERO AUTOMÁTICO
        // -----------------------------------

        double saldo = 1000;
        do {
            System.out.println("\n--- CAJERO ---");
            System.out.println("1. Consultar");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo: " + Bucles.consultarSaldo(saldo));
                    break;
                case 2:
                    System.out.print("Monto: ");
                    saldo = Bucles.depositar(saldo, sc.nextDouble());
                    break;
                case 3:
                    System.out.print("Monto: ");
                    double resultado = Bucles.retirar(saldo, sc.nextDouble());
                    if (resultado == -1)
                        System.out.println("Fondos insuficientes.");
                    else
                        saldo = resultado;
                    break;
            }
        } while (opcion != 4);


        // 5. GENERADOR DE CONTRASEÑAS
        // -----------------------------------

        System.out.print("\nLongitud de la contraseña: ");
        int longPass = sc.nextInt();

        System.out.println("Contraseña: " + Bucles.generarPassword(longPass));


        // 6. CONTROL DE ASISTENCIA
        // -----------------------------------

        ArrayList<String> presentes = new ArrayList<>();
        ArrayList<String> ausentes = new ArrayList<>();

        System.out.print("\nCantidad de estudiantes: ");
        int cant = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= cant; i++) {
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("¿Presente? (s/n): ");
            String estado = sc.nextLine();

            Bucles.registrarAsistencia(presentes, ausentes, nombre, estado);
        }

        System.out.println("\nPresentes: " + presentes);
        System.out.println("Ausentes: " + ausentes);

        // 7. CALCULADORA DE PROMEDIOS
        // -----------------------------------

        System.out.print("\nCantidad de notas: ");
        int n = sc.nextInt();

        double suma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Nota " + i + ": ");
            suma += sc.nextDouble();
        }

        double promedio = suma / n;
        System.out.println("Promedio: " + promedio);

        System.out.println("Resultado: " + Bucles.evaluarPromedio(promedio));

        sc.close();
    }
}

