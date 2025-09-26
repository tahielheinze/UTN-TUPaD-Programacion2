// Modelar una clase Empleado que represente a un trabajador en una empresa.
// Uso de this , constructores sobrecargados, Métodos sobrecargados actualizarSalario
// Método toString(), Método estático mostrarTotalEmpleados(), Encapsulamiento en los atributos.

class Empleado {
    // ATRIBUTOS PRIVADOS
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    private static int totalempleados = 0;

    // CONSTRUCTOR SOBRECARGADO 1 (TODOS LOS ATRIBUTOS)
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalempleados++;
    }

    // CONSTRUCTOR SOBRECARGADO 2 (SIN SALARIO)
    public Empleado(String nombre, String puesto) {
        this.id = totalempleados +1;
        this.nombre = nombre;
        this.puesto = puesto;
        totalempleados++;
    }

    // MÉTODO SOBRECARGADO 1 (actualizarSalario)
    public void actualizarSalario(double porcentaje) {
        this.salario = this.salario + (this.salario * porcentaje / 100);
    }

    // MÉTODO SOBRECARGADO 2 (actualizarSalario)
    public void actualizarSalario(int cantidad){
        this.salario = this.salario + cantidad;
    }

    // METODO toString()
    @Override
    public String toString() {
        return String.format("Empleado:  ID: %d, Nombre: %s, Puesto: %s, Salario: %.2f]", 
            this.id, this.nombre, this.puesto, this.salario);
    }

    // METODO ESTÁTICO mostrarTotalEmpleados()
    public static int mostrarTotalEmpleados() {
        return totalempleados;
    }

    // GETTERS Y SETTERS
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    } 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return this.puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}

public class PruebaEmpleados {
    public static void main(String[] args) {
        System.out.println(""); //Salto de linea visual
        System.out.println("--- SISTEMA DE GESTION DE EMPLEADOS ---");

        // CREAR EMPLEADO CON EL CONSTRUCTOR 1
        System.out.println(""); //Salto de linea visual
        System.out.println("Creando empleado con constructor 1 (todos los atributos):");
        Empleado emp1 = new Empleado(1, "Juan Perez", "Desarrollador", 15000.0);
        Empleado emp2 = new Empleado(2, "Ana Gomez", "Diseñadora", 13000.0);
        
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());
        System.out.println(""); //Salto de linea visual

        // CREAR EMPLEADO CON EL CONSTRUCTOR 2
        System.out.println("Creando empleado con constructor 2 (sin salario):");
        Empleado emp3 = new Empleado("Luis Martinez", "Analista");
        System.out.println(emp3);
        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());
        System.out.println(""); //Salto de linea visual

        // ACTUALIZAR SALARIO
        System.out.println("Empleado antes de actualizar salario:");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(""); //Salto de linea visual

        System.out.println("Actualizando salario de " + emp1.getNombre() + " en un 10%:");
        emp1.actualizarSalario(10.0); 

        System.out.println("Actualizando salario de " + emp2.getNombre() + " en $2000:");
        emp2.actualizarSalario(2000);

        System.out.println("Actualizando salario de " + emp3.getNombre() + " en un 5%:");
        emp3.actualizarSalario(5.0); 

        System.out.println("Empleados después de actualizar salarios:");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(""); //Salto de linea visual

        // USO DE GETTERS Y SETTERS
        System.out.println(""); //Salto de linea visual
        System.out.println("--- Modificando datos empleados usando getters y setters --- ");
        System.out.println("Puesto actual de Ana: " + emp2.getPuesto());
        emp2.setPuesto("Directora de ventas");
        System.out.println("Nuevo puesto de Ana: " + emp2.getPuesto());
        emp2.actualizarSalario(20.0);
        System.out.println("Información de Ana después de los cambios:");
        System.out.println(emp2);

        // DATOS FINALES
        System.out.println(""); //Salto de linea visual
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
        System.out.println(""); //Salto de linea visual

        System.out.println("Datos finales de los empleados:");
        System.out.println(""); //Salto de linea visual
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(""); //Salto de linea visual

    }
}