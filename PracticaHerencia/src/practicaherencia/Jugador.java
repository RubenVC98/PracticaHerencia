package practicaherencia;

enum Posicion {
    Base, Escolta, Alero, Ala_pivot, Pivot
}

public class Jugador extends Persona {

    //añadimos los atributos
    private double altura;
    private int nPartidos;
    private boolean jugando;

    private Posicion posicion;

    public Jugador(String nombre, String direccion, String DNI, boolean sexo, double altura, Posicion posicion) {
        super(nombre, direccion, DNI, sexo);
        this.nPartidos = 0;
        this.jugando = false;
        this.posicion = posicion;

        if (altura < 1.65) {
            this.altura = 1.7;
        } else {
            this.altura = altura;
        }
    }

    public void jugando() {
        String res = "";
        if (this.sexo == true) {
            if (jugando == true) {
                res = "El jugador " + Jugador.super.getNombre() + " está jugando.";
            } else {
                res = "El jugador " + Jugador.super.getNombre() + " no está jugando.";
            }

        } else {
            if (jugando == true) {
                res = "La jugadora " + Jugador.super.getNombre() + " está jugando.";
            } else {
                res = "La jugadora " + Jugador.super.getNombre() + " no está jugando.";
            }
        }
        System.out.println(res);
    }

    @Override
    public String toString() {
        String res = "";

        if (jugando == true) {
            res = "Ahora mismo está jugando";
        } else {
            res = "Ahora mismo no está jugando.";
        }

        return super.toString()
                + "\nAltura: " + this.altura
                + "\nSu posición es: " + this.posicion
                + "\nJugador/Jugadora en " + this.nPartidos + " partidos."
                + "\n" + res;
    }

}
