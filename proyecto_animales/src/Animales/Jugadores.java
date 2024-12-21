package Animales;

public class Jugadores {
    public int posicionEnX;
    public int posicionEnY;
    private String name;
    private int vida = 100;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getVida(){
        return vida;
    }
    public void setVida(int vida){
        this.vida = vida;
    }

    public int getPosicionX(){
        return posicionEnX;
    }
    public void setPosicionEnX(int valor){
        this.posicionEnX = valor;
    }
    public int getPosicionY(){
        return posicionEnY;
    }
    public void setPosicionEnY(int valor){
        this.posicionEnY = valor;
    }
}
