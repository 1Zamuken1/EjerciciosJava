package herencia;

public abstract class empleado {
    String cedula;
    String nombres;
    String apellidos;

  public empleado(String cedula, String nombres, String apellidos) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    
    public String getCedula() {return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }
    
    //@Override
    //public String toString(){
    //return String.format("\n%s%s%s$",getNombres(),getApellidos(),getCedula());
    //\nEmpleadoporHoras: %s\n%s $%s $%,.2f%s %,.2f", &}
    
    @Override
    public String toString() { return "empleado{" + "cedula=" + cedula + ", nombres=" + nombres + ", apellidos=" + apellidos + '}'; }
}
