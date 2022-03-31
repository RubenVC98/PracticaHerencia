package practicaherencia;

//Enum de especialidad
enum Especialidad {
    Principal, Auxiliar, OficialMesa
}

public class Arbitro extends Persona {

    //Creamos los atributos necesarios para arbitro, y un enum para las especialidades.
    private double sueldo;
    private Especialidad especialidad;

    //Constructor de arbitro con los parametros de persona ya que los hereda.
    public Arbitro(String nombre, String direccion, String DNI, boolean sexo, double sueldo, Especialidad especialidad) {

        super(nombre, direccion, DNI, sexo);

        //Pongo el setter aqui para no repetir codigo y que es buena practica controlarlo todo con setter pero lo demas no es necesario.
        setSueldo(sueldo);

        this.especialidad = especialidad;

    }

    //A partir de aqui estan los getter y los setter
    public double getSueldo() {
        return sueldo;
    }

    //Este setter es especial ya que controla que el sueldo este entre esos valores siempre.
    public void setSueldo(double sueldo) {
        if (sueldo < 800 || sueldo > 1200) {
            this.sueldo = 914;
        } else {
            this.sueldo = sueldo;
        }
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    //Metodo toString usando el de persona y añadiendo la informacion que nos pide.
    @Override
    public String toString() {
        return super.toString()
                + "\nEspecializado/Especializada como " + this.especialidad
                + " que cobra " + this.sueldo + "€ por partido.";
    }

}
