package herencia;

public class EmpleadoAsalariado extends empleado {

    private double salarioMensual;

    public EmpleadoAsalariado(double salarioMensual, String cedula, String nombres, String apellidos) {
        super(cedula, nombres, apellidos);
        this.salarioMensual = salarioMensual;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    private double ingresos() {
        return getSalarioMensual();
    }

    @Override
    public String toString() {
        return String.format("Empleado Asalariado:%s\n%s $%,.2f", super.toString(), "salario Mensual:", getSalarioMensual());
    }
}
