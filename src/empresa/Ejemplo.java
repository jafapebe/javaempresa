package empresa;

public class Ejemplo {
    public static void main(String[] args) {
        Cliente uno = new Cliente("Jairo", 28, 316966798L);

        System.out.println("hola");

        uno.SetEdad(40);

        uno.mostrar();
    }
}
