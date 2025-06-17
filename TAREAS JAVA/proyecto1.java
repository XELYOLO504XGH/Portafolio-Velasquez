import java.util.Scanner; 

public class CalculadoraPropinas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner

        // Pide el monto total de la cuenta
        System.out.print("Ingresa el monto total de la cuenta : ");
        double montoCuenta = scanner.nextDouble();

        // Pide el porcentaje de propina
        System.out.print("Ingresa el porcentaje de propina : ");
        double porcentajePropina = scanner.nextDouble();

        // Calcula la propina
        double propina = montoCuenta * (porcentajePropina / 100);

        // Calcula el total a pagar
        double totalPagar = montoCuenta + propina;

        // Muestra los resultados
        System.out.println("\n--- Resumen ---");
        System.out.printf("Monto de la cuenta: ", montoCuenta);
        System.out.printf("Porcentaje de propina: ", porcentajePropina);
        System.out.printf("Monto de la propina: ", propina);
        System.out.printf("Total a pagar: ", totalPagar);

        scanner.close(); // Cierra el Scanner
    }
}