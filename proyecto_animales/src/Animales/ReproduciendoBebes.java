package Animales;

public class ReproduciendoBebes extends Thread {
    private boolean ejecucion = true;

    public synchronized void run() {
        while (ejecucion) {
            reproduceAguilas(Mapa.matrizNueva);
            reproduceBoas(Mapa.matrizNueva);
            reproduceLobos(Mapa.matrizNueva);
            reproduceOsos(Mapa.matrizNueva);
            reproduceZorros(Mapa.matrizNueva);
            reproduceBufalos(Mapa.matrizNueva);
            reproduceCaballos(Mapa.matrizNueva);
            reproduceCabras(Mapa.matrizNueva);
            reproduceCiervos(Mapa.matrizNueva);
            reproduceConejos(Mapa.matrizNueva);
            reproduceJabalis(Mapa.matrizNueva);
            reproduceOrugas(Mapa.matrizNueva);
            reproduceOvejas(Mapa.matrizNueva);
            reproducePatos(Mapa.matrizNueva);
            reproduceRatones(Mapa.matrizNueva);
            reproducePlantas(Mapa.matrizNueva);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }}}

    public void detener() {
        ejecucion = false;
    }
    public void reproduceAguilas(Object[][] matrizEntrada){
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Aguila) {
                        Aguila aguilin = ((Aguila) matrizEntrada[i][j]);
                        aguilin.reproduce();
                    }}}}}
    public void reproduceBoas(Object[][] matrizEntrada){
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Boa) {
                        Boa boita = ((Boa) matrizEntrada[i][j]);
                        boita.reproduce();
                    }}}}}
    public void reproduceLobos(Object[][] matrizEntrada){
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Lobo) {
                        Lobo lobito = ((Lobo) matrizEntrada[i][j]);
                        lobito.reproduce();
                    }}}}}
    public void reproduceOsos(Object[][] matrizEntrada){
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Oso) {
                        Oso osito = ((Oso) matrizEntrada[i][j]);
                        osito.reproduce();
                    }}}}}
    public void reproduceZorros(Object[][] matrizEntrada){
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Zorro) {
                        Zorro zorrito = ((Zorro) matrizEntrada[i][j]);
                        zorrito.reproduce();
                    }}}}}
    public void reproduceBufalos(Object[][] matrizEntrada){
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Bufalo) {
                        Bufalo bufalin = ((Bufalo) matrizEntrada[i][j]);
                        bufalin.reproduce();
                    }}}}}
    public void reproduceCaballos(Object[][] matrizEntrada){
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Caballo) {
                        Caballo caballin = ((Caballo) matrizEntrada[i][j]);
                        caballin.reproduce();
                    }}}}}
    public void reproduceCabras(Object[][] matrizEntrada){
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Cabra) {
                        Cabra cabrin = ((Cabra) matrizEntrada[i][j]);
                        cabrin.reproduce();
                    }}}}}
    public void reproduceCiervos(Object[][] matrizEntrada){
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Ciervo) {
                        Ciervo ciervin = ((Ciervo) matrizEntrada[i][j]);
                        ciervin.reproduce();
                    }}}}}
    public void reproduceConejos(Object[][] matrizEntrada){
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Conejo) {
                        Conejo conejin = ((Conejo) matrizEntrada[i][j]);
                        conejin.reproduce();
                    }}}}}
    public void reproduceJabalis(Object[][] matrizEntrada){
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Jabali) {
                        Jabali jabalito = ((Jabali) matrizEntrada[i][j]);
                        jabalito.reproduce();
                    }}}}}
    public void reproduceOrugas(Object[][] matrizEntrada){
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Oruga) {
                        Oruga oruguita = ((Oruga) matrizEntrada[i][j]);
                        oruguita.reproduce();
                    }}}}}
    public void reproduceOvejas(Object[][] matrizEntrada){
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Oveja) {
                        Oveja ovejita = ((Oveja) matrizEntrada[i][j]);
                        ovejita.reproduce();
                    }}}}}
    public void reproducePatos(Object[][] matrizEntrada){
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Pato) {
                        Pato patito = ((Pato) matrizEntrada[i][j]);
                        patito.reproduce();
                    }}}}}
    public void reproduceRatones(Object[][] matrizEntrada){
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Raton) {
                        Raton ratoncito = ((Raton) matrizEntrada[i][j]);
                        ratoncito.reproduce();
                    }}}}}
    public void reproducePlantas(Object[][] matrizEntrada){
        for (int i = 0; i < CreadorObjetos.a; i++) { //Crear este bucle for para cada especie, así no se van a encimar
            for (int j = 0; j < CreadorObjetos.b; j++) {
                if (matrizEntrada[i][j] != null) {
                    if (matrizEntrada[i][j] instanceof Planta) {
                        Planta plantita = ((Planta) matrizEntrada[i][j]);
                        plantita.reproduce();
                    }}}}}
}
