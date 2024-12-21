package Animales;


public class Main {
    public static void main(String[] args) {
        //METODO DE INICIO
        CreadorObjetos.creadorGlobal();

        //MAPA INICIAL
        Mapa.posicionInicial();

        Mapa actualizar = new Mapa();
        actualizar.start();
        ReproduciendoBebes bebes = new ReproduciendoBebes();
        bebes.start();
        try{
            Thread.sleep(15000); // La duración del hilo principal es de 15 segundos
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actualizar.detener();
        bebes.detener();

        Mapa.lecturaFinal(Mapa.matrizNueva);
    }
}
