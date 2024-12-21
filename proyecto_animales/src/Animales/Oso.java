package Animales;

import java.util.Random;

public class Oso extends Animal implements ICarnivoro,IReproducible,IMuerto{
    public Oso (String name, int pX, int pY){
        super.setName(name);
        super.setPosicionEnX(pX);
        super.setPosicionEnY(pY);
        super.getVida();
        super.posicionEnX = pX;
        super.posicionEnY = pY;
    }

    public void moverDerecha(int dx){
        int nuevaPosX = this.getPosicionX() + dx;
        if (nuevaPosX > (CreadorObjetos.a-1)) {
            if(Mapa.matrizVerif[CreadorObjetos.a-1][this.getPosicionY()] instanceof Oso) {
                this.setPosicionEnX(this.posicionEnX);
            } else if (Mapa.matrizVerif[CreadorObjetos.a-1][this.getPosicionY()] instanceof Lobo) {
                this.setPosicionEnX(this.posicionEnX);
            } else if (Mapa.matrizVerif[CreadorObjetos.a-1][this.getPosicionY()] instanceof Aguila) {
                this.setPosicionEnX(this.posicionEnX);
            } else if (Mapa.matrizVerif[CreadorObjetos.a-1][this.getPosicionY()] instanceof Zorro) {
                this.setPosicionEnX(this.posicionEnX);
            } else if (Mapa.matrizVerif[CreadorObjetos.a-1][this.getPosicionY()] instanceof Oruga) {
                this.setPosicionEnX(this.posicionEnX);
            } else if (Mapa.matrizVerif[CreadorObjetos.a-1][this.getPosicionY()] instanceof Planta) {
                this.setPosicionEnX(this.posicionEnX);
            } else {
                this.cazar(CreadorObjetos.a-1,this.getPosicionY());
                this.setPosicionEnX(CreadorObjetos.a-1);
            }
        } else {
            if(Mapa.matrizVerif[nuevaPosX][this.getPosicionY()] instanceof Oso) {
                this.setPosicionEnX(this.posicionEnX);
            } else if (Mapa.matrizVerif[nuevaPosX][this.getPosicionY()] instanceof Lobo) {
                this.setPosicionEnX(this.posicionEnX);
            } else if (Mapa.matrizVerif[nuevaPosX][this.getPosicionY()] instanceof Aguila) {
                this.setPosicionEnX(this.posicionEnX);
            } else if (Mapa.matrizVerif[nuevaPosX][this.getPosicionY()] instanceof Zorro) {
                this.setPosicionEnX(this.posicionEnX);
            } else if (Mapa.matrizVerif[nuevaPosX][this.getPosicionY()] instanceof Oruga) {
                this.setPosicionEnX(this.posicionEnX);
            } else if (Mapa.matrizVerif[nuevaPosX][this.getPosicionY()] instanceof Planta) {
                this.setPosicionEnX(this.posicionEnX);
            } else {
                this.cazar(nuevaPosX,this.getPosicionY());
                this.setPosicionEnX(nuevaPosX);
            }
        }
    }
    public void moverIzquierda(int dx){
        int nuevaPosX = this.getPosicionX() - dx;
        if(nuevaPosX < 0){
            if(Mapa.matrizVerif[0][this.getPosicionY()] instanceof Oso) {
                this.setPosicionEnX(this.posicionEnX);
            } else if (Mapa.matrizVerif[0][this.getPosicionY()] instanceof Lobo) {
                this.setPosicionEnX(this.posicionEnX);
            } else if (Mapa.matrizVerif[0][this.getPosicionY()] instanceof Aguila) {
                this.setPosicionEnX(this.posicionEnX);
            } else if (Mapa.matrizVerif[0][this.getPosicionY()] instanceof Zorro) {
                this.setPosicionEnX(this.posicionEnX);
            } else if (Mapa.matrizVerif[0][this.getPosicionY()] instanceof Oruga) {
                this.setPosicionEnX(this.posicionEnX);
            } else if (Mapa.matrizVerif[0][this.getPosicionY()] instanceof Planta) {
                this.setPosicionEnX(this.posicionEnX);
            } else {
                this.cazar(0,this.getPosicionY());
                this.setPosicionEnX(0);
            }
        }else {
            if(Mapa.matrizVerif[nuevaPosX][this.getPosicionY()] instanceof Oso) {
                this.setPosicionEnX(this.posicionEnX);
            } else if (Mapa.matrizVerif[nuevaPosX][this.getPosicionY()] instanceof Lobo) {
                this.setPosicionEnX(this.posicionEnX);
            } else if (Mapa.matrizVerif[nuevaPosX][this.getPosicionY()] instanceof Aguila) {
                this.setPosicionEnX(this.posicionEnX);
            } else if (Mapa.matrizVerif[nuevaPosX][this.getPosicionY()] instanceof Zorro) {
                this.setPosicionEnX(this.posicionEnX);
            } else if (Mapa.matrizVerif[nuevaPosX][this.getPosicionY()] instanceof Oruga) {
                this.setPosicionEnX(this.posicionEnX);
            } else if (Mapa.matrizVerif[nuevaPosX][this.getPosicionY()] instanceof Planta) {
                this.setPosicionEnX(this.posicionEnX);
            } else {
                this.cazar(nuevaPosX,this.getPosicionY());
                this.setPosicionEnX(nuevaPosX);
            }
        }
    }
    public void moverAbajo(int dx){
        int nuevaPosY = this.getPosicionY() + dx;
        if(nuevaPosY > (CreadorObjetos.b-1)){
            if(Mapa.matrizVerif[this.getPosicionX()][CreadorObjetos.b-1] instanceof Oso) {
                this.setPosicionEnY(this.posicionEnY);
            } else if (Mapa.matrizVerif[this.getPosicionX()][CreadorObjetos.b-1] instanceof Lobo) {
                this.setPosicionEnY(this.posicionEnY);
            } else if (Mapa.matrizVerif[this.getPosicionX()][CreadorObjetos.b-1] instanceof Aguila) {
                this.setPosicionEnY(this.posicionEnY);
            } else if (Mapa.matrizVerif[this.getPosicionX()][CreadorObjetos.b-1] instanceof Zorro) {
                this.setPosicionEnY(this.posicionEnY);
            } else if (Mapa.matrizVerif[this.getPosicionX()][CreadorObjetos.b-1] instanceof Oruga) {
                this.setPosicionEnY(this.posicionEnY);
            } else if (Mapa.matrizVerif[this.getPosicionX()][CreadorObjetos.b-1] instanceof Planta) {
                this.setPosicionEnY(this.posicionEnY);
            } else {
                this.cazar(this.getPosicionX(),CreadorObjetos.b-1);
                this.setPosicionEnY(CreadorObjetos.b-1);
            }
        }else {
            if(Mapa.matrizVerif[this.getPosicionX()][nuevaPosY] instanceof Oso) {
                this.setPosicionEnY(this.posicionEnY);
            } else if (Mapa.matrizVerif[this.getPosicionX()][nuevaPosY] instanceof Lobo) {
                this.setPosicionEnY(this.posicionEnY);
            } else if (Mapa.matrizVerif[this.getPosicionX()][nuevaPosY] instanceof Aguila) {
                this.setPosicionEnY(this.posicionEnY);
            } else if (Mapa.matrizVerif[this.getPosicionX()][nuevaPosY] instanceof Zorro) {
                this.setPosicionEnY(this.posicionEnY);
            } else if (Mapa.matrizVerif[this.getPosicionX()][nuevaPosY] instanceof Oruga) {
                this.setPosicionEnY(this.posicionEnY);
            } else if (Mapa.matrizVerif[this.getPosicionX()][nuevaPosY] instanceof Planta) {
                this.setPosicionEnY(this.posicionEnY);
            } else {
                this.cazar(this.getPosicionX(), nuevaPosY);
                this.setPosicionEnY(nuevaPosY);
            }
        }
    }
    public void moverArriba(int dx){
        int nuevaPosY = this.getPosicionY() - dx;
        if(nuevaPosY < 0){
            if(Mapa.matrizVerif[this.getPosicionX()][0] instanceof Oso) {
                this.setPosicionEnY(this.posicionEnY);
            } else if (Mapa.matrizVerif[this.getPosicionX()][0] instanceof Lobo) {
                this.setPosicionEnY(this.posicionEnY);
            } else if (Mapa.matrizVerif[this.getPosicionX()][0] instanceof Aguila) {
                this.setPosicionEnY(this.posicionEnY);
            } else if (Mapa.matrizVerif[this.getPosicionX()][0] instanceof Zorro) {
                this.setPosicionEnY(this.posicionEnY);
            } else if (Mapa.matrizVerif[this.getPosicionX()][0] instanceof Oruga) {
                this.setPosicionEnY(this.posicionEnY);
            } else if (Mapa.matrizVerif[this.getPosicionX()][0] instanceof Planta) {
                this.setPosicionEnY(this.posicionEnY);
            } else {
                this.cazar(this.getPosicionX(), 0);
                this.setPosicionEnY(0);
            }
        }else {
            if(Mapa.matrizVerif[this.getPosicionX()][nuevaPosY] instanceof Oso) {
                this.setPosicionEnY(this.posicionEnY);
            } else if (Mapa.matrizVerif[this.getPosicionX()][nuevaPosY] instanceof Lobo) {
                this.setPosicionEnY(this.posicionEnY);
            } else if (Mapa.matrizVerif[this.getPosicionX()][nuevaPosY] instanceof Aguila) {
                this.setPosicionEnY(this.posicionEnY);
            } else if (Mapa.matrizVerif[this.getPosicionX()][nuevaPosY] instanceof Zorro) {
                this.setPosicionEnY(this.posicionEnY);
            } else if (Mapa.matrizVerif[this.getPosicionX()][nuevaPosY] instanceof Oruga) {
                this.setPosicionEnY(this.posicionEnY);
            } else if (Mapa.matrizVerif[this.getPosicionX()][nuevaPosY] instanceof Planta) {
                this.setPosicionEnY(this.posicionEnY);
            } else {
                this.cazar(this.getPosicionX(), nuevaPosY);
                this.setPosicionEnY(nuevaPosY);
            }
        }
    }

    public void moverse() {
        Random random1 = new Random();
        int numPasos = random1.nextInt(2)+1;

        Random random2 = new Random();
        int direccion = random2.nextInt(4);

        switch (direccion) {
            case 0: //DERECHA
                this.moverDerecha(numPasos);
                break;
            case 1: //IZQUIERDA
                this.moverIzquierda(numPasos);
                break;
            case 2: //ABAJO
                this.moverAbajo(numPasos);
                break;
            case 3: //ARRIBA
                this.moverArriba(numPasos);
                break;
        }

        //System.out.println("El " + this.getName() + " está en la coordenada: " + (this.getPosicionY() + 1) + ", " + (this.getPosicionX() + 1));
    }
    @Override
    public void cazar(int posX, int posY){
        if (Mapa.matrizNueva[posX][posY] != null){
            if(Mapa.matrizNueva[posX][posY] instanceof Boa){
                Boa laBoa = (Boa) Mapa.matrizNueva[posX][posY];
                System.out.println("El oso: " + this.getName() + " está comiendo: " + laBoa.getName());
                laBoa.muerto(laBoa);
            }
            if(Mapa.matrizNueva[posX][posY] instanceof Conejo){
                Conejo elConejo = (Conejo) Mapa.matrizNueva[posX][posY];
                System.out.println("El oso: " + this.getName() + " está comiendo: " + elConejo.getName());
                elConejo.muerto(elConejo);
            }
            if(Mapa.matrizNueva[posX][posY] instanceof Caballo){
                Caballo elCaballo = (Caballo) Mapa.matrizNueva[posX][posY];
                System.out.println("El oso: " + this.getName() + " está comiendo: " + elCaballo.getName());
                elCaballo.muerto(elCaballo);
            }
            if(Mapa.matrizNueva[posX][posY] instanceof Ciervo){
                Ciervo elCiervo = (Ciervo) Mapa.matrizNueva[posX][posY];
                System.out.println("El oso: " + this.getName() + " está comiendo: " + elCiervo.getName());
                elCiervo.muerto(elCiervo);
            }
            if(Mapa.matrizNueva[posX][posY] instanceof Cabra){
                Cabra laCabra = (Cabra) Mapa.matrizNueva[posX][posY];
                System.out.println("El oso: " + this.getName() + " está comiendo: " + laCabra.getName());
                laCabra.muerto(laCabra);
            }
            if(Mapa.matrizNueva[posX][posY] instanceof Raton){
                Raton elRaton = (Raton) Mapa.matrizNueva[posX][posY];
                System.out.println("El oso: " + this.getName() + " está comiendo: " + elRaton.getName());
                elRaton.muerto(elRaton);
            }
            if(Mapa.matrizNueva[posX][posY] instanceof Oveja){
                Oveja laOveja = (Oveja) Mapa.matrizNueva[posX][posY];
                System.out.println("El oso: " + this.getName() + " está comiendo: " + laOveja.getName());
                laOveja.muerto(laOveja);
            }
            if(Mapa.matrizNueva[posX][posY] instanceof Bufalo){
                Bufalo elBufalo = (Bufalo) Mapa.matrizNueva[posX][posY];
                System.out.println("El oso: " + this.getName() + " está comiendo: " + elBufalo.getName());
                elBufalo.muerto(elBufalo);
            }
            if(Mapa.matrizNueva[posX][posY] instanceof Jabali){
                Jabali elJabali = (Jabali) Mapa.matrizNueva[posX][posY];
                System.out.println("El oso: " + this.getName() + " está comiendo: " + elJabali.getName());
                elJabali.muerto(elJabali);
            }
            if(Mapa.matrizNueva[posX][posY] instanceof Pato){
                Pato elPato = (Pato) Mapa.matrizNueva[posX][posY];
                System.out.println("El oso: " + this.getName() + " está comiendo: " + elPato.getName());
                elPato.muerto(elPato);
            }
        }
    }
    @Override
    public void reproduce() {
        Random randomNum = new Random();
        int posibilidad = randomNum.nextInt(12);

        switch (posibilidad){
            case 0:
                creandoOsosBebes();
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
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
        }
    }
    public void creandoOsosBebes() {
        Animal ososCreados = nombrePosicionOsos();
        Mapa.matrizCambios[ososCreados.getPosicionX()][ososCreados.getPosicionY()] = ososCreados.getName();
        Mapa.matrizNueva[ososCreados.getPosicionX()][ososCreados.getPosicionY()] = ososCreados;

        System.out.println("Ha nacido un nuevo oso: " + ososCreados.getName());
    }
    public Animal nombrePosicionOsos(){
        Random randomX = new Random();
        Random randomY = new Random();
        int posicionX = randomX.nextInt(CreadorObjetos.a);
        int posicionY = randomY.nextInt(CreadorObjetos.b);
        Animal osito = new Oso("\uD83D\uDC3B", posicionX, posicionY);
        if(Mapa.matrizCambios[posicionX][posicionY] == null){

            Mapa.matrizCambios[posicionX][posicionY]=osito;
        }else{
            osito = nombrePosicionOsos();
        }
        return osito;
    }
    @Override
    public void muerto(Animal animal) {
        //System.out.println("El oso: " + super.getName() + " ha muerto.");
        super.setVida(0);
    }

}
