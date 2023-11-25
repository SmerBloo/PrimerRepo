
public class Empleado {
    
    String nombre;
    double salarioMensual;
    int horasTrabajadas;

    public Empleado(String nombre, double salarioMensual, int horasTrabajadas) {
        this.nombre = nombre;
        this.salarioMensual = salarioMensual;
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public double calcularSalarioAnual(){
        double salarioAnual = salarioMensual*12;
        return salarioAnual;
    }
    
    public double calcularSalarioSemanal(){
        return salarioMensual/4.33;     
    }
    
    public int calcularHorasExtras(){
        int horasRegulares = 160;
        int horasExtras = horasTrabajadas-horasRegulares;
        if (horasExtras >0) {
            return horasExtras;
        }
        else
            return 0;
    }
    
    public double calcularPagoHorasExtras(){
        double tasaPagoExtra = 1.5;
        int horasExtras = calcularHorasExtras();
        double pagoHorasExtras = horasExtras * tasaPagoExtra;
        return pagoHorasExtras;
    }
    
    public double calcularSalarioTotal(){
        double calcularSalarioTotal = calcularPagoHorasExtras()+salarioMensual;
        return calcularSalarioTotal;
    }
    
    public void mostrarResultado() {
        System.out.println("Empleado: "+ nombre);
        System.out.println("Salario anuel: " + calcularSalarioAnual());
        System.out.println("Salario Semanala: " + calcularSalarioSemanal());
        System.out.println("Horas extras: " + calcularHorasExtras());
        System.out.println("Pago por horas extras: " + calcularPagoHorasExtras());
        System.out.println("Salario Total: " + calcularSalarioTotal());
    }
    
}
