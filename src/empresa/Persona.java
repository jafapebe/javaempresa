package empresa;


public abstract class Persona {
    private String nombre="jairo";
    private Integer edad=40;


    public abstract void mostrar();

    public void ejemplo(){

    }

    public void SetNombre(String nombre){
       this.nombre = nombre;
    }
    
    public String GetNombre(){
        return this.nombre;
    }
    public void SetEdad(Integer edad){
        this.edad = edad;
     }
     
     public Integer GetEdad(){
         return this.edad;
     }
}
