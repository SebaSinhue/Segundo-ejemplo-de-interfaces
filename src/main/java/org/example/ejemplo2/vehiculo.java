package org.example.ejemplo2;

public interface vehiculo {
    public static final int VELOCIDAD_MAXIMA = 160;
    public static final char CLASIFICACION_EFICIENCIA = 'A';


    public abstract boolean encender();
    public abstract boolean apagar();
    public abstract void avanzar();
    public abstract void frenar();


}
