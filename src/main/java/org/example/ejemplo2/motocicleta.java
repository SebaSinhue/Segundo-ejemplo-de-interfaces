package org.example.ejemplo2;

public class motocicleta implements vehiculo{
    private int centimetrosCubicos;
    private String marca;

    public motocicleta() {
    }

    public motocicleta(int centimetrosCubicos, String marca) {
        this.centimetrosCubicos = centimetrosCubicos;
        this.marca = marca;
    }

    public int getCentimetrosCubicos() {
        return centimetrosCubicos;
    }

    public void setCentimetrosCubicos(int centimetrosCubicos) {
        this.centimetrosCubicos = centimetrosCubicos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "motocicleta{" +
                "centimetrosCubicos=" + centimetrosCubicos +
                ", marca='" + marca + '\'' +
                '}';
    }
    public void hacerCaballito(){
        System.out.println("Haciendo un caballito ...");
    }

    @Override
    public boolean encender() {
        System.out.println("Encendiendo la motocicleta " + this.marca);
        return true;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando la motocicleta " + this.marca);
        return true ;
    }

    @Override
    public void avanzar() {
        System.out.println("Avanzando con la motocicleta de " + this.centimetrosCubicos + " CC");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando con la motocicleta de " + this.centimetrosCubicos + " CC");
    }
}
