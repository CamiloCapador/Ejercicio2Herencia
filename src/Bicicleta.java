public class Bicicleta extends Vehiculo{

    private String tipo;
    private int numvelocidades;
    private int tamañorin;

    public Bicicleta() {
    }

    public Bicicleta(String marca, String modelo, String color, double precio, String tipo, int numvelocidades, int tamañorin) {
        super(marca, modelo, color, precio);
        this.tipo = tipo;
        this.numvelocidades = numvelocidades;
        this.tamañorin = tamañorin;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumvelocidades() {
        return numvelocidades;
    }

    public void setNumvelocidades(int numvelocidades) {
        this.numvelocidades = numvelocidades;
    }

    public int getTamañorin() {
        return tamañorin;
    }

    public void setTamañorin(int tamañorin) {
        this.tamañorin = tamañorin;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "tipo='" + tipo + '\'' +
                ", numvelocidades=" + numvelocidades +
                ", tamañorin=" + tamañorin +
                '}';
    }

    public void pedalear(){
        System.out.println("Se debe pedalear para avanzar");
    }
}
