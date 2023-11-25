import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Ingrese el nombre del empleado:"); String nombre = sc.nextLine();

        System.out.println("Ingrese el salario mensual del empleado:"); double salarioMensual = sc.nextDouble();

        System.out.println("Ingrese las horas trabajadas por semana del empleado:"); int horasTrabajadasPorSemana = sc.nextInt();


        Empleado empleado1 = new Empleado(nombre, salarioMensual, horasTrabajadasPorSemana);

        System.out.println(" ");
        
        empleado1.calcularSalarioAnual();
        empleado1.calcularSalarioSemanal();
        empleado1.calcularHorasExtras();
        empleado1.calcularPagoHorasExtras();
        empleado1.calcularSalarioTotal();

        empleado1.mostrarResultado();


    }
}
