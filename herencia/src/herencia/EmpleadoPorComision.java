package herencia;

public class EmpleadoPorComision extends empleado
{
    private double ventasBrutas;
    private double tarifasComision;
    public EmpleadoPorComision(double ventasBrutas, double tarifasComision, 
            String cedula, String nombres, String apellidos)
    {
        super(cedula, nombres, apellidos);
        this.ventasBrutas = ventasBrutas;
        this.tarifasComision = tarifasComision; 
    }
    
    public double getVentasBrutas() { return ventasBrutas; }
    public void setVentasBrutas(double ventasBrutas) { this.ventasBrutas = ventasBrutas; }
    
    public double getTarifasComision() { return tarifasComision; }
    public void setTarifasComision(double tarifasComision) { this.tarifasComision = tarifasComision; }
    
    public double ingresos() { return getVentasBrutas()*getTarifasComision(); }
    
    public String toString()
    { return String.format("%s%s\n%s $%,.2f%s %,.2f\nIngresos:$%,.2f","\nEmpleadoporComision:", super.toString(),"VentasBrutas:", getVentasBrutas(),"\n TarifaporComision", getTarifasComision(), ingresos()); }
    
    
    //@Override
    //public String toString(){
    //return "EmpleadoPorComision{"+"ventasBrutas="+ ventasBrutas + ",tarifasComision=" +tarifasComision + '}'; }
    
    
    public void settarifasComision(double tarifasComision) { this.tarifasComision=tarifasComision; }
}