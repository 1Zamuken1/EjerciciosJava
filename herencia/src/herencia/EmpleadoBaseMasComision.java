package herencia;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {

    private double salarioBase;

    public EmpleadoBaseMasComision(double salarioBase, double ventasBrutas, double tarifasComision, String cedula, String nombres, String apellidos) {
        super(ventasBrutas, tarifasComision, cedula, nombres, apellidos);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return "EmpleadoBaseMasComision{" + "salarioBase=" + salarioBase + '}';
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
