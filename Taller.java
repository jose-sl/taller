public class Taller {

    public static void main (String args []) {

        System.out.println("Abriendo taller");

        System.out.println("Se recibe el primer vehículo:");
        Vehiculo mazdaSeis = new Vehiculo("Mazda", "6", 2022, "Rojo", "Sedan");
        System.out.println("Se recibió:");
        System.out.println(mazdaSeis.toString());

        System.out.println("Se recibe el segundo vehículo:");
        Vehiculo toyotaCorolla = new Vehiculo("Toyota", "Corolla", 2019, "Gris", "Sedan");
        System.out.println("Se recibió:");
        System.out.println(toyotaCorolla.toString());

        System.out.println("Se recibe el tercer vehículo:");
        Vehiculo toyotaPrado = new Vehiculo("Toyota", "Land Cruiser Prado", 2023, "Negro", "Suburban");
        System.out.println("Se recibió:");
        System.out.println(toyotaPrado.toString());

        System.out.println("Se recibe el cuarto vehículo:");
        Vehiculo hondaCrv = new Vehiculo("Honda", "CRV", 2021, "Blanco", "Suburban");
        System.out.println("Se recibió:");
        System.out.println(hondaCrv.toString());

        System.out.println("Se recibe el quinto vehículo:");
        Vehiculo nissanVersa = new Vehiculo("Nissan", "Versa", 2020, "Azul", "Sedan");
        System.out.println("Se recibió:");
        System.out.println(nissanVersa.toString());

        System.out.println("Cerrando taller");
    }
}
