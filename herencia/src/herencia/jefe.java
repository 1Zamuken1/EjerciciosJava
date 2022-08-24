package herencia;

public abstract class jefe {
    private String nombres;
    private String apellidos;
    private String sucursal;

    @Override
    public String toString() {
        return "jefe{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", sucursal=" + sucursal + '}';
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public jefe(String nombres, String apellidos, String sucursal) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sucursal = sucursal;
    }
    
}

/* 
Alt + Insert
1. Generate constructor
2. Getter and Setter
3. to String()
*/

