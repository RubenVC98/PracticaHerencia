package practicaherencia;

public class Persona {
    
    //iniciamos todos los atributos necesarios
    private String nombre;
    private String direccion;
    private String DNI;
    protected boolean sexo;

    //creamos un constructor por defecto de Persona
    public Persona(String nombre, String direccion, String DNI, boolean sexo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.DNI = DNI;
        this.sexo = sexo;
    }

    //creamos un constructor de copia 
    public Persona(Persona X) {
        this.nombre = X.nombre;
        this.direccion = X.direccion;
        this.DNI = X.direccion;
        sexo = X.sexo;
    }

    //introducimos todos los getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    //por ultimo crearemos el toString segun nos han indicado
    @Override
    public String toString() {
        
        String res="";
        if (sexo == true) {
            res = "Es un chico ";
        } else {
            res = "Es una chica ";
        }   

        return this.nombre + " - " + this.DNI
                + "\n" + res
                + "\n" + this.direccion;
    }
    
}
