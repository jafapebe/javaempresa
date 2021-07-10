package empresa;

public class Cliente extends Persona {

    private Long telefono= 3166488879L;

    public Cliente(String nombre, Integer edad, Long telefono){
        SetNombre(nombre);
        SetEdad(edad);
        this.telefono=telefono;

    }

    @Override
    public void mostrar() {
        String nombre = GetNombre();
        Integer edad = GetEdad();

        System.out.println("E nombre es: "+ nombre + " la edad es: "+ edad + " telfono es: " + telefono);
        
    }

    
}
