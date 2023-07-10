public class EjercicioTema9 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 25;
        cliente.nombre = "Alfonso";
        cliente.telefono = 5223655;
        cliente.credito = (float) 10000.15;

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 35;
        trabajador.nombre = "Juan ";
        trabajador.telefono = 55512346;
        trabajador.salario = (float) 10000.15;

        System.out.println("Datos del cliente:");
        System.out.println("Edad: " + cliente.edad);
        System.out.println("Nombre: " + cliente.nombre);
        System.out.println("Telefono: " + cliente.telefono);
        System.out.println("Credito: " + cliente.credito);

        System.out.println("Datos del Trabajador:");
        System.out.println("Edad: " + trabajador.edad);
        System.out.println("Edad: " + trabajador.nombre);
        System.out.println("Edad: " + trabajador.telefono);
        System.out.println("Edad: " + trabajador.salario);
    }
    static  class Persona {
        int edad;
        String nombre;
        int telefono;
    }
    static class Cliente extends Persona {
        float credito;
    }
    static class Trabajador extends Persona{
        float salario;
    }

}

