package personajes;

public class Personaje {
    private int vidaMax, vidaActual;
    private String nombrePersonaje;

    public Personaje(){};
    public Personaje(int vidaMax, String nombrePersonaje){
        this.vidaMax = vidaMax;
        this.nombrePersonaje = nombrePersonaje;
        this.vidaActual = vidaMax;
    }

    public int getVidaMax() {
        return vidaMax;
    }

    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(int vidaActual) {
        this.vidaActual = vidaActual;
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public void restaVida(int resta){

        int vida = this.vidaActual - resta;
        setVidaActual(vida);
        if(vidaActual <= -10) {
            System.out.println("El personaje esta muerto");
        }
//        while (this.vidaActual > -10){
//            int vida = this.vidaActual - resta;
//            setVidaActual(vida);
//            System.out.println(vidaActual);
//        }
    }

    public void sumaVida(int suma){
        int vida = this.vidaActual + suma;
        setVidaActual(vida);
    }



    @Override
    public String toString() {
        return "Personaje{" +
                "vidaMax=" + vidaMax +
                ", vidaActual=" + vidaActual +
                ", nombrePersonaje='" + nombrePersonaje + '\'' +
                '}';
    }
}
