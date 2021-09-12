public class Singleton {

    public static void main(String[] args) {
       
       Clase clase = Clase.getInstancia();
       String nombre = clase.getNombre();
        System.out.println(nombre);

    }
}

class Clase{
    private static Clase instancia;
    
    private Clase(){

    }
    
    static{
        instancia = new Clase();
    }
    
    public static Clase getInstancia(){
        
        return instancia;
    } 
    
    public String getNombre(){
        return "Pepe";
    }
}
