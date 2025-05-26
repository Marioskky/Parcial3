import java.util.Arrays;

public class Empleados {
    Empleado[] lista;

    public Empleados() {
        this.lista = new Empleado[0];
    }

    public void altaEmpleado(Empleado empleado) {
        lista = Arrays.copyOf(lista, lista.length + 1);
        lista[lista.length - 1] = empleado;
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    public void mostrarEmpleados() {
        System.out.println(Mensajes.LISTA_EMPLEADOS);
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }
}
