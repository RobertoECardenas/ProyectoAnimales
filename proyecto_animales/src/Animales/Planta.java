package Animales;

import java.util.Random;

public class Planta extends Jugadores implements IPlantaComida, IReproducible{

    public Planta (String name, int pX, int pY) {
        super.setName(name);
        super.setPosicionEnX(pX);
        super.setPosicionEnY(pY);
        super.getVida();
        super.posicionEnX = pX;
        super.posicionEnY = pY;
    }


    @Override
    public void comida(Planta planta) {
        //System.out.println("La planta: " + super.getName() + " fue deborado :(");
        Mapa.matrizNueva[this.getPosicionX()][this.getPosicionY()]= null;
    }

    @Override
    public void reproduce() {
        Random randomNum = new Random();
        int posibilidad = randomNum.nextInt(6);

        switch (posibilidad){
            case 0:
                creandoPlantasBebes();
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
    }
    public void creandoPlantasBebes() {
        Planta plantaCreada = nombrePosicionPlantas();
        Mapa.matrizCambios[plantaCreada.getPosicionX()][plantaCreada.getPosicionY()] = plantaCreada.getName();
        Mapa.matrizNueva[plantaCreada.getPosicionX()][plantaCreada.getPosicionY()] = plantaCreada;

        System.out.println("Ha nacido una nueva planta: " + plantaCreada.getName());
    }
    public Planta nombrePosicionPlantas(){
        Random randomX = new Random();
        Random randomY = new Random();
        int posicionX = randomX.nextInt(CreadorObjetos.a);
        int posicionY = randomY.nextInt(CreadorObjetos.b);
        Planta plantita = new Planta("\uD83C\uDF3F", posicionX, posicionY);
        if(Mapa.matrizCambios[posicionX][posicionY] == null){

            Mapa.matrizCambios[posicionX][posicionY]=plantita;
        }else{
            plantita = nombrePosicionPlantas();
        }
        return plantita;
    }
}
