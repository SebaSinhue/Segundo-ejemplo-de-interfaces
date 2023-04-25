package org.example.ejemplo2;

public class driverVehiculo {
    public static void main(String[] args) {
        camion Camion = new camion("Diesel",3);
        System.out.println(Camion.encender());
        Camion.encender();
        Camion.avanzar();
        Camion.frenar();
        Camion.apagar();
        System.out.println(Camion.apagar());
        System.out.println("------Motocicleta------");
        motocicleta Motocicleta = new motocicleta(150, "Mortalika");
        System.out.println(Motocicleta.encender());
        Motocicleta.encender();
        Motocicleta.avanzar();
        Motocicleta.hacerCaballito();
        Motocicleta.frenar();
        Motocicleta.apagar();
        System.out.println(Motocicleta.apagar());


    }
}
