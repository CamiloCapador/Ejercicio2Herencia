public class Main {
    public static void main(String[] args) {

        //JUAN CAMILO GARZON CAPADOR
        //ID 700935

        System.out.println("Ejercicio 2 Herencia");

        Vehiculo veh = new Vehiculo();
        veh.setMarca("BMW");
        veh.setModelo("320i Sport Line");
        veh.setColor("Gris");
        veh.setPrecio(224900000);

        Coche auto = new Coche("Toyota","Fortuner GR Sport","Gris",295000000,"automatica","Gasolina",7,5);
        Bicicleta bici = new Bicicleta("Scott","Addict RC 20","Negro-Verde",25311000,"Ruta",24,29);

        System.out.println(veh.toString());
        System.out.println(auto.toString());
        System.out.println(bici.toString());
    }
}