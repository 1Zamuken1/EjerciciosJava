package herencia;

public class Herencias {

    public static void main(String[] args) {
        EmpleadoAsalariado empleado1 = new EmpleadoAsalariado(8000000, "10321:", "Martoria", "Guerrero");
        EmpleadoPorComision empleado2 = new EmpleadoPorComision(8000000, 0.12, "10322", "Andreija", "pechurrio");
        EmpleadoporHoras empleado3 = new EmpleadoporHoras(8000000, 224.0, "10323", "Ernesto", "Farias");
        EmpleadoBaseMasComision empleado4 = new EmpleadoBaseMasComision(380000.0, 23000000, 0.045, "10324", "Coinosa", "Manchado");
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
        System.out.println(empleado4.toString());
        System.out.println();
    }
}
