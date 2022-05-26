package proyecto9;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "John";
        cliente.edad = 20;
        cliente.telefono = 605548897;
        cliente.credito = 200;

        System.out.println(cliente.nombre + " " +  cliente.edad + " " +  cliente.telefono + " " +  cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Fer";
        trabajador.edad = 50;
        trabajador.telefono = 565512254;
        trabajador.salario = 8000;

        System.out.println(trabajador.nombre + " " +  trabajador.edad + " " +  trabajador.telefono + " " +  trabajador.salario);


    }
}
