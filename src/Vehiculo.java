public class Vehiculo {

    private String marca;
    private String modelo;
    private String color;
    private double precio;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String color, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "\nVehiculo" +
                "\n- Marca = " + marca +
                "\n- Modelo = " + modelo +
                "\n- Color = " + color +
                "\n- Precio = " + precio
                ;
    }

    public void avanzar(){
        System.out.println("El vehiculo esta avanzando");
    }

    public void detenerse(){
        System.out.println("El vehiculo se detiene");
    }
}
