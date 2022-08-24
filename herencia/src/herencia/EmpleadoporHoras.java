package herencia;

public class EmpleadoporHoras extends empleado {
    private double valorHora;
    private double numeroHoras;
    public EmpleadoporHoras(double valorHora,double numeroHoras,String cedula,String nombres, String apellidos)
    {
        super(cedula, nombres, apellidos);
        this.valorHora = valorHora;
        this.numeroHoras = numeroHoras;
    }
    
    public double getValorHora(){ return valorHora; }
    public void setValorHora(double valorHora) { this.valorHora = valorHora; }
    
    public double getNumeroHoras() { return numeroHoras; }
    public void setNumeroHoras(double numeroHoras) { this.numeroHoras = numeroHoras; }
    
    public double ingresos() { return getValorHora()*getNumeroHoras(); }
    
    public String toString() { return String.format("\nEmpleadoporHoras: %s\n%s$%,.2f%s%,.2f Salario$%,.2f", super.toString(),"Sueldo por Hora", getValorHora(),"\nHoras Laboradas:", getNumeroHoras(),ingresos()); }
    
    
        //@Override
        //public String toString()
        //{
        // return "EmpleadoporHoras{"+"valorHora="+valorHora+",numeroHoras="+numeroHoras+'}';
        //}
    
    
}
