package Animales;

import java.util.ArrayList;
import java.util.List;

public class Mapa extends Thread {
    static int numMov = 1;
    static Object[][] matrizNueva = CreadorObjetos.matriz4;
    static Object[][] matrizCambios = new Object[CreadorObjetos.a][CreadorObjetos.b];
    static Object[][] matrizVerif = new Object[CreadorObjetos.a][CreadorObjetos.b];
    static Object[][] matrizVacia = new Object[CreadorObjetos.a][CreadorObjetos.b];
    private boolean ejecucion = true;

    public synchronized void run() {
        while (ejecucion) {

            Mapa.intercambiandoPosiciones(Mapa.matrizNueva);
            Mapa.mapaActualizado(Mapa.matrizCambios);
            try {
                Thread.sleep(1500); // Una iteración cada 1.5 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        System.out.println("Fin de la simulación.");
    }

    public void detener() {
        ejecucion = false;
    }

    public static void posicionInicial() {
        System.out.println("  ");
        System.out.println("Inicio del mapa: ");
        for (int i = 0; i < CreadorObjetos.a; i++) {
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (CreadorObjetos.matriz3[i][j] != null) {
                    System.out.print(CreadorObjetos.matriz3[i][j] + ", ");
                } else {
                    System.out.print("- -" + ", ");
                }
            }
            System.out.println(" ");
        }
    }

    public static void intercambiandoPosiciones(Object[][] matrizEntrada) {
        //System.out.println(" ");
        System.out.println("¡¡Los animales se están moviendo!!");
        Object[][] matrizTemp = new Object[CreadorObjetos.a][CreadorObjetos.b];
        Object[][] matrizTemp2 = new Object[CreadorObjetos.a][CreadorObjetos.b];
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Oso) {
                        Oso osin = ((Oso) matrizEntrada[i][j]);
                        osin.moverse();
                        matrizTemp[osin.getPosicionX()][osin.getPosicionY()] = osin.getName();
                        matrizTemp2[osin.getPosicionX()][osin.getPosicionY()] = osin;
                        matrizVerif[osin.getPosicionX()][osin.getPosicionY()] = osin;
                        //ESTA MATRIZ TEMP2 DEBERIA ESTAR FUERA, SER UNA VARIABLE GENERAL Y NO DE METODO
                        //PORQUE AL HACER LA LECTURA DESDE EL METODO NO RESPETA LA LISTA SI OTRO OBJETO
                        //SE MOVIÓ ANTES..
                        matrizNueva[i][j] = null;
                    }
                }
            }
        }
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Boa) {
                        Boa boin = ((Boa) matrizEntrada[i][j]);
                        boin.moverse();
                        matrizTemp[boin.getPosicionX()][boin.getPosicionY()] = boin.getName();
                        matrizTemp2[boin.getPosicionX()][boin.getPosicionY()] = boin;
                        matrizVerif[boin.getPosicionX()][boin.getPosicionY()] = boin;
                        matrizNueva[i][j] = null;
                    }
                }
            }
        }
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Lobo) {
                        Lobo lobin = ((Lobo) matrizEntrada[i][j]);
                        lobin.moverse();
                        matrizTemp[lobin.getPosicionX()][lobin.getPosicionY()] = lobin.getName();
                        matrizTemp2[lobin.getPosicionX()][lobin.getPosicionY()] = lobin;
                        matrizVerif[lobin.getPosicionX()][lobin.getPosicionY()] = lobin;
                        matrizNueva[i][j] = null;
                    }
                }
            }
        }
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Aguila) {
                        Aguila aguilin = ((Aguila) matrizEntrada[i][j]);
                        aguilin.moverse();
                        matrizTemp[aguilin.getPosicionX()][aguilin.getPosicionY()] = aguilin.getName();
                        matrizTemp2[aguilin.getPosicionX()][aguilin.getPosicionY()] = aguilin;
                        matrizVerif[aguilin.getPosicionX()][aguilin.getPosicionY()] = aguilin;
                        matrizNueva[i][j] = null;
                    }
                }
            }
        }
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Zorro) {
                        Zorro zorrin = ((Zorro) matrizEntrada[i][j]);
                        zorrin.moverse();
                        matrizTemp[zorrin.getPosicionX()][zorrin.getPosicionY()] = zorrin.getName();
                        matrizTemp2[zorrin.getPosicionX()][zorrin.getPosicionY()] = zorrin;
                        matrizVerif[zorrin.getPosicionX()][zorrin.getPosicionY()] = zorrin;
                        matrizNueva[i][j] = null;
                    }
                }
            }
        }
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Caballo) {
                        Caballo caballin = ((Caballo) matrizEntrada[i][j]);
                        caballin.moverse();
                        matrizTemp[caballin.getPosicionX()][caballin.getPosicionY()] = caballin.getName();
                        matrizTemp2[caballin.getPosicionX()][caballin.getPosicionY()] = caballin;
                        matrizVerif[caballin.getPosicionX()][caballin.getPosicionY()] = caballin;
                        matrizNueva[i][j] = null;
                    }
                }
            }
        }
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Conejo) {
                        Conejo conejin = ((Conejo) matrizEntrada[i][j]);
                        conejin.moverse();
                        matrizTemp[conejin.getPosicionX()][conejin.getPosicionY()] = conejin.getName();
                        matrizTemp2[conejin.getPosicionX()][conejin.getPosicionY()] = conejin;
                        matrizVerif[conejin.getPosicionX()][conejin.getPosicionY()] = conejin;
                        matrizNueva[i][j] = null;
                    }
                }
            }
        }
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Bufalo) {
                        Bufalo bufalin = ((Bufalo) matrizEntrada[i][j]);
                        bufalin.moverse();
                        matrizTemp[bufalin.getPosicionX()][bufalin.getPosicionY()] = bufalin.getName();
                        matrizTemp2[bufalin.getPosicionX()][bufalin.getPosicionY()] = bufalin;
                        matrizVerif[bufalin.getPosicionX()][bufalin.getPosicionY()] = bufalin;
                        matrizNueva[i][j] = null;
                    }
                }
            }
        }
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Ciervo) {
                        Ciervo ciervin = ((Ciervo) matrizEntrada[i][j]);
                        ciervin.moverse();
                        matrizTemp[ciervin.getPosicionX()][ciervin.getPosicionY()] = ciervin.getName();
                        matrizTemp2[ciervin.getPosicionX()][ciervin.getPosicionY()] = ciervin;
                        matrizVerif[ciervin.getPosicionX()][ciervin.getPosicionY()] = ciervin;
                        matrizNueva[i][j] = null;
                    }
                }
            }
        }
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Cabra) {
                        Cabra cabrin = ((Cabra) matrizEntrada[i][j]);
                        cabrin.moverse();
                        matrizTemp[cabrin.getPosicionX()][cabrin.getPosicionY()] = cabrin.getName();
                        matrizTemp2[cabrin.getPosicionX()][cabrin.getPosicionY()] = cabrin;
                        matrizVerif[cabrin.getPosicionX()][cabrin.getPosicionY()] = cabrin;
                        matrizNueva[i][j] = null;
                    }
                }
            }
        }
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Jabali) {
                        Jabali jabalin = ((Jabali) matrizEntrada[i][j]);
                        jabalin.moverse();
                        matrizTemp[jabalin.getPosicionX()][jabalin.getPosicionY()] = jabalin.getName();
                        matrizTemp2[jabalin.getPosicionX()][jabalin.getPosicionY()] = jabalin;
                        matrizVerif[jabalin.getPosicionX()][jabalin.getPosicionY()] = jabalin;
                        matrizNueva[i][j] = null;
                    }
                }
            }
        }
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Oruga) {
                        Oruga oruguin = ((Oruga) matrizEntrada[i][j]);
                        oruguin.moverse();
                        matrizTemp[oruguin.getPosicionX()][oruguin.getPosicionY()] = oruguin.getName();
                        matrizTemp2[oruguin.getPosicionX()][oruguin.getPosicionY()] = oruguin;
                        matrizVerif[oruguin.getPosicionX()][oruguin.getPosicionY()] = oruguin;
                        matrizNueva[i][j] = null;
                    }
                }
            }
        }
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Oveja) {
                        Oveja ovejin = ((Oveja) matrizEntrada[i][j]);
                        ovejin.moverse();
                        matrizTemp[ovejin.getPosicionX()][ovejin.getPosicionY()] = ovejin.getName();
                        matrizTemp2[ovejin.getPosicionX()][ovejin.getPosicionY()] = ovejin;
                        matrizVerif[ovejin.getPosicionX()][ovejin.getPosicionY()] = ovejin;
                        matrizNueva[i][j] = null;
                    }
                }
            }
        }
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Pato) {
                        Pato patin = ((Pato) matrizEntrada[i][j]);
                        patin.moverse();
                        matrizTemp[patin.getPosicionX()][patin.getPosicionY()] = patin.getName();
                        matrizTemp2[patin.getPosicionX()][patin.getPosicionY()] = patin;
                        matrizVerif[patin.getPosicionX()][patin.getPosicionY()] = patin;
                        matrizNueva[i][j] = null;
                    }
                }
            }
        }
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Raton) {
                        Raton ratoncin = ((Raton) matrizEntrada[i][j]);
                        ratoncin.moverse();
                        matrizTemp[ratoncin.getPosicionX()][ratoncin.getPosicionY()] = ratoncin.getName();
                        matrizTemp2[ratoncin.getPosicionX()][ratoncin.getPosicionY()] = ratoncin;
                        matrizVerif[ratoncin.getPosicionX()][ratoncin.getPosicionY()] = ratoncin;
                        matrizNueva[i][j] = null;
                    }
                }
            }
        }for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Planta) {
                        Planta plantin = ((Planta) matrizEntrada[i][j]);
                        matrizTemp[plantin.getPosicionX()][plantin.getPosicionY()] = plantin.getName();
                        matrizTemp2[plantin.getPosicionX()][plantin.getPosicionY()] = plantin;
                        matrizVerif[plantin.getPosicionX()][plantin.getPosicionY()] = plantin;
                        matrizNueva[i][j] = null;
                    }
                }
            }
        }

        matrizCambios = matrizTemp;
        matrizNueva = matrizTemp2;
        matrizVerif = matrizVacia;
    }

    public static void mapaActualizado(Object[][] matrizEntrada) {
        System.out.println(" ");
        System.out.println("Movimiento no. " + numMov);
        System.out.println("Mapa:");
        for (int i = 0; i < CreadorObjetos.a; i++) {
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    System.out.print(matrizEntrada[i][j] + ", ");
                } else {
                    System.out.print("- -" + ", ");
                }
            }
            System.out.println(" ");
        }
        numMov++;

    }
    //matrizNueva
    public static void lecturaFinal (Object[][] matrizEntrada){
        System.out.println();
        System.out.println("¡Resultado final de la simulación!");
        System.out.print("Osos finales: ");
        for(int i = 0; i < CreadorObjetos.a; i++){
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] instanceof Oso) {
                    System.out.print(((Oso) matrizEntrada[i][j]).getName() + "  ");
                }}}
        System.out.println();
        System.out.print("Boas finales: ");
        for(int i = 0; i < CreadorObjetos.a; i++){
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] instanceof Boa) {
                    System.out.print(((Boa) matrizEntrada[i][j]).getName() + "  ");
                }}}
        System.out.println();
        System.out.print("Lobos finales: ");
        for(int i = 0; i < CreadorObjetos.a; i++){
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] instanceof Lobo) {
                    System.out.print(((Lobo) matrizEntrada[i][j]).getName() + "  ");
                }}}
        System.out.println();
        System.out.print("Aguilas finales: ");
        for(int i = 0; i < CreadorObjetos.a; i++){
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] instanceof Aguila) {
                    System.out.print(((Aguila) matrizEntrada[i][j]).getName() + "  ");
                }}}
        System.out.println();
        System.out.print("Zorros finales: ");
        for(int i = 0; i < CreadorObjetos.a; i++){
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] instanceof Zorro) {
                    System.out.print(((Zorro) matrizEntrada[i][j]).getName() + "  ");
                }}}
        System.out.println();
        System.out.print("Caballos finales: ");
        for(int i = 0; i < CreadorObjetos.a; i++){
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] instanceof Caballo) {
                    System.out.print(((Caballo) matrizEntrada[i][j]).getName() + "  ");
                }}}
        System.out.println();
        System.out.print("Conejos finales: ");
        for(int i = 0; i < CreadorObjetos.a; i++){
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] instanceof Conejo) {
                    System.out.print(((Conejo) matrizEntrada[i][j]).getName() + "  ");
                }}}
        System.out.println();
        System.out.print("Bufalos finales: ");
        for(int i = 0; i < CreadorObjetos.a; i++){
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] instanceof Bufalo) {
                    System.out.print(((Bufalo) matrizEntrada[i][j]).getName() + "  ");
                }}}
        System.out.println();
        System.out.print("Ciervos finales: ");
        for(int i = 0; i < CreadorObjetos.a; i++){
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] instanceof Ciervo) {
                    System.out.print(((Ciervo) matrizEntrada[i][j]).getName() + "  ");
                }}}
        System.out.println();
        System.out.print("Cabras finales: ");
        for(int i = 0; i < CreadorObjetos.a; i++){
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] instanceof Cabra) {
                    System.out.print(((Cabra) matrizEntrada[i][j]).getName() + "  ");
                }}}
        System.out.println();
        System.out.print("Jabalies finales: ");
        for(int i = 0; i < CreadorObjetos.a; i++){
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] instanceof Jabali) {
                    System.out.print(((Jabali) matrizEntrada[i][j]).getName() + "  ");
                }}}
        System.out.println();
        System.out.print("Orugas finales: ");
        for(int i = 0; i < CreadorObjetos.a; i++){
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] instanceof Oruga) {
                    System.out.print(((Oruga) matrizEntrada[i][j]).getName() + "  ");
                }}}
        System.out.println();
        System.out.print("Ovejas finales: ");
        for(int i = 0; i < CreadorObjetos.a; i++){
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] instanceof Oveja) {
                    System.out.print(((Oveja) matrizEntrada[i][j]).getName() + "  ");
                }}}
        System.out.println();
        System.out.print("Patos finales: ");
        for(int i = 0; i < CreadorObjetos.a; i++){
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] instanceof Pato) {
                    System.out.print(((Pato) matrizEntrada[i][j]).getName() + "  ");
                }}}
        System.out.println();
        System.out.print("Ratones finales: ");
        for(int i = 0; i < CreadorObjetos.a; i++){
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] instanceof Raton) {
                    System.out.print(((Raton) matrizEntrada[i][j]).getName() + "  ");
                }}}
        System.out.println();
        System.out.print("Plantas finales: ");
        for(int i = 0; i < CreadorObjetos.a; i++){
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] instanceof Planta) {
                    System.out.print(((Planta) matrizEntrada[i][j]).getName() + "  ");
                }}}
    }
}