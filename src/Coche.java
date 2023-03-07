public class Coche extends Vehiculo{

    private String tipocaja;
    private String combustible;

    private int numsillas;
    private int numpuertas;

    public Coche() {
    }

    public Coche(String marca, String modelo, String color, double precio, String tipocaja, String combustible, int numsillas, int numpuertas) {
        super(marca, modelo, color, precio);
        this.tipocaja = tipocaja;
        this.combustible = combustible;
        this.numsillas = numsillas;
        this.numpuertas = numpuertas;
    }

    public String getTipocaja() {
        return tipocaja;
    }

    public void setTipocaja(String tipocaja) {
        this.tipocaja = tipocaja;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getNumsillas() {
        return numsillas;
    }

    public void setNumsillas(int numsillas) {
        this.numsillas = numsillas;
    }

    public int getNumpuertas() {
        return numpuertas;
    }

    public void setNumpuertas(int numpuertas) {
        this.numpuertas = numpuertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "tipocaja='" + tipocaja + '\'' +
                ", combustible='" + combustible + '\'' +
                ", numsillas=" + numsillas +
                ", numpuertas=" + numpuertas +
                '}';
    }

    public void acelerar(){
        System.out.println("Se debe acelerar para avanzar");
    }
}
