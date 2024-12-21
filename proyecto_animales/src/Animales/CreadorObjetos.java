package Animales;

import java.util.*;

public class CreadorObjetos extends Jugadores{
     static List<Animal> animalesFinales = new ArrayList<>();
    static int a = 20;
    static int b = 12;

    static Object [][] matriz3 = new Object[a][b];
    static Object [][] matriz4 = new Object[a][b];

    public static void creadorGlobal(){
        creandoOsos();//CREANDO OSOS
        creandoBoas();//CREANDO BOAS
        creandoLobos();//CREANDO LOBOS
        creandoAguilas();//CREANDO AGUILAS
        creandoZorros();//CREANDO ZORROS
        creandoCaballos();//CREANDO CABALLOS
        creandoConejos();//CREANDO CONEJOS
        creandoBufalos();//CREANDO BUFALOS
        creandoCiervos();//CREANDO CIERVOS
        creandoCabras();//CREANDO CABRAS
        creandoJabalis();//CREANDO JABALIS
        creandoOrugas(); //CREANDO ORUGAS
        creandoOvejas();//CREANDO OVEJAS
        creandoPatos();//CREANDO PATOS
        creandoRatones();//CREANDO RATONES
        creandoPlantas();//CREANDO PLANTAS

        //IMPRESIÓN DE COORDENADAS
        /*for(int i = 0; i<CreadorObjetos.animalesFinales.size(); i++){
            System.out.println("El " + CreadorObjetos.animalesFinales.get(i).getName() + " está en la coordenada: " +
                    (CreadorObjetos.animalesFinales.get(i).posicionEnY + 1) + " , " + (CreadorObjetos.animalesFinales.get(i).posicionEnX + 1));
        }*/
    }
    //MÉTODOS CREADORES DE NOMBRE Y COORDENADAS
    public static void creandoOsos(){
        int serieOsos = 1;
        //System.out.println("Digite la cantidad de osos que desea crear: ");
        //Scanner entradaOsos = new Scanner(System.in);
        Random entradaOsos = new Random();
        int numOsitos = entradaOsos.nextInt(3)+2;
        Animal[] ososCreados = new Oso[numOsitos];
        for(int i = 0; i<numOsitos; i++){
            ososCreados[i] = nombrePosicionOsos(serieOsos);
            animalesFinales.add(ososCreados[i]);
            matriz3[ososCreados[i].getPosicionX()][ososCreados[i].getPosicionY()] = ososCreados[i].getName();
            matriz4[ososCreados[i].getPosicionX()][ososCreados[i].getPosicionY()] = ososCreados[i];
            serieOsos++;
        }
        System.out.println();
        System.out.println("Se crearon los siguientes osos: ");
        for(Animal osos : ososCreados){
            System.out.print(osos.getName() + "  ");
        }

    }
    public static Animal nombrePosicionOsos(int serie){
        Random randomX = new Random();
        Random randomY = new Random();
        int posicionX = randomX.nextInt(a);
        int posicionY = randomY.nextInt(b);
        Animal osito = new Oso("\uD83D\uDC3B"/* + serie*/, posicionX, posicionY);
        if(matriz3[posicionX][posicionY] == null){
            matriz3[posicionX][posicionY] = osito;
        }else{
            osito = nombrePosicionOsos(serie);
        }
        return osito;
    }

    public static void creandoCaballos(){
        int serieCaballos = 1;
        //System.out.println("Digite la cantidad de caballos que desea crear: ");
        //Scanner entradaCaballos = new Scanner(System.in);
        Random entradaCaballos = new Random();
        int numCaballitos = entradaCaballos.nextInt(3)+2;
        Animal[] caballosCreados = new Caballo[numCaballitos];
        for(int i = 0; i<numCaballitos; i++){
            caballosCreados[i] = nombrePosicionCaballos(serieCaballos);
            animalesFinales.add(caballosCreados[i]);
            matriz3[caballosCreados[i].getPosicionX()][caballosCreados[i].getPosicionY()] = caballosCreados[i].getName();
            matriz4[caballosCreados[i].getPosicionX()][caballosCreados[i].getPosicionY()] = caballosCreados[i];
            serieCaballos++;
        }
        System.out.println();
        System.out.println("Se crearon los siguientes caballos: ");
        for(Animal caballos : caballosCreados){
            System.out.print(caballos.getName() + "  ");
        }
    }
    public static Animal nombrePosicionCaballos(int serie){
        Random randomX = new Random();
        Random randomY = new Random();
        int posicionX = randomX.nextInt(a);
        int posicionY = randomY.nextInt(b);
        Animal caballito = new Caballo("\uD83D\uDC0E"/* + serie*/, posicionX, posicionY);
        if(matriz3[posicionX][posicionY] == null){

            matriz3[posicionX][posicionY]=caballito;
        }else{
            caballito = nombrePosicionCaballos(serie);
        }
        return caballito;
    }

    public static void creandoBoas(){
        int serieBoas = 1;
        //System.out.println("Digite la cantidad de boas que desea crear: ");
        //Scanner entradaBoas = new Scanner(System.in);
        Random entradaBoas = new Random();
        int numBoitas = entradaBoas.nextInt(3)+2;
        Animal[] boasCreadas = new Boa[numBoitas];
        for(int i = 0; i<numBoitas; i++){
            boasCreadas[i] = nombrePosicionBoas(serieBoas);
            animalesFinales.add(boasCreadas[i]);
            matriz3[boasCreadas[i].getPosicionX()][boasCreadas[i].getPosicionY()] = boasCreadas[i].getName();
            matriz4[boasCreadas[i].getPosicionX()][boasCreadas[i].getPosicionY()] = boasCreadas[i];
            serieBoas++;
        }
        System.out.println();
        System.out.println("Se crearon las siguientes boas: ");
        for(Animal boas : boasCreadas){
            System.out.print(boas.getName() + "  ");
        }
    }
    public static Animal nombrePosicionBoas(int serie){
        Random randomX = new Random();
        Random randomY = new Random();
        int posicionX = randomX.nextInt(a);
        int posicionY = randomY.nextInt(b);
        Animal boita = new Boa("\uD83D\uDC0D"/* + serie*/, posicionX, posicionY);
        if(matriz3[posicionX][posicionY] == null){

            matriz3[posicionX][posicionY]=boita;
        }else{
            boita = nombrePosicionBoas(serie);
        }
        return boita;
    }

    public static void creandoLobos(){
        int serieLobos = 1;
        //System.out.println("Digite la cantidad de lobos que desea crear: ");
        //Scanner entradaLobos = new Scanner(System.in);
        Random entradaLobos = new Random();
        int numLobitos = entradaLobos.nextInt(3)+2;
        Animal[] lobosCreados = new Lobo[numLobitos];
        for(int i = 0; i<numLobitos; i++){
            lobosCreados[i] = nombrePosicionLobos(serieLobos);
            animalesFinales.add(lobosCreados[i]);
            matriz3[lobosCreados[i].getPosicionX()][lobosCreados[i].getPosicionY()] = lobosCreados[i].getName();
            matriz4[lobosCreados[i].getPosicionX()][lobosCreados[i].getPosicionY()] = lobosCreados[i];
            serieLobos++;
        }
        System.out.println();
        System.out.println("Se crearon los siguientes lobos: ");
        for(Animal lobos : lobosCreados){
            System.out.print(lobos.getName() + "  ");
        }
    }
    public static Animal nombrePosicionLobos(int serie){
        Random randomX = new Random();
        Random randomY = new Random();
        int posicionX = randomX.nextInt(a);
        int posicionY = randomY.nextInt(b);
        Animal lobito = new Lobo("\uD83D\uDC3A"/* + serie*/, posicionX, posicionY);
        if(matriz3[posicionX][posicionY] == null){

            matriz3[posicionX][posicionY]=lobito;
        }else{
            lobito = nombrePosicionLobos(serie);
        }
        return lobito;
    }

    public static void creandoZorros(){
        int serieZorros = 1;
        //System.out.println("Digite la cantidad de zorros que desea crear: ");
        //Scanner entradaZorros = new Scanner(System.in);
        Random entradaZorros = new Random();
        int numZorritos = entradaZorros.nextInt(3)+2;
        Animal[] zorrosCreados = new Zorro[numZorritos];
        for(int i = 0; i<numZorritos; i++){
            zorrosCreados[i] = nombrePosicionZorros(serieZorros);
            animalesFinales.add(zorrosCreados[i]);
            matriz3[zorrosCreados[i].getPosicionX()][zorrosCreados[i].getPosicionY()] = zorrosCreados[i].getName();
            matriz4[zorrosCreados[i].getPosicionX()][zorrosCreados[i].getPosicionY()] = zorrosCreados[i];
            serieZorros++;
        }
        System.out.println();
        System.out.println("Se crearon los siguientes zorros: ");
        for(Animal zorros : zorrosCreados){
            System.out.print(zorros.getName() + "  ");
        }
    }
    public static Animal nombrePosicionZorros(int serie){
        Random randomX = new Random();
        Random randomY = new Random();
        int posicionX = randomX.nextInt(a);
        int posicionY = randomY.nextInt(b);
        Animal zorrito = new Zorro("\uD83E\uDD8A"/* + serie*/, posicionX, posicionY);
        if(matriz3[posicionX][posicionY] == null){

            matriz3[posicionX][posicionY]=zorrito;
        }else{
            zorrito = nombrePosicionZorros(serie);
        }
        return zorrito;
    }

    public static void creandoAguilas(){
        int serieAguilas = 1;
        //System.out.println("Digite la cantidad de aguilas que desea crear: ");
        //Scanner entradaAguilas = new Scanner(System.in);
        Random entradaAguilas = new Random();
        int numAguilitas = entradaAguilas.nextInt(3)+2;
        Animal[] aguilasCreadas = new Aguila[numAguilitas];
        for(int i = 0; i<numAguilitas; i++){
            aguilasCreadas[i] = nombrePosicionAguilas(serieAguilas);
            animalesFinales.add(aguilasCreadas[i]);
            matriz3[aguilasCreadas[i].getPosicionX()][aguilasCreadas[i].getPosicionY()] = aguilasCreadas[i].getName();
            matriz4[aguilasCreadas[i].getPosicionX()][aguilasCreadas[i].getPosicionY()] = aguilasCreadas[i];
            serieAguilas++;
        }
        System.out.println();
        System.out.println("Se crearon las siguientes aguilas: ");
        for(Animal aguilas : aguilasCreadas){
            System.out.print(aguilas.getName() + "  ");
        }
    }
    public static Animal nombrePosicionAguilas(int serie){
        Random randomX = new Random();
        Random randomY = new Random();
        int posicionX = randomX.nextInt(a);
        int posicionY = randomY.nextInt(b);
        Animal aguilita = new Aguila("\uD83E\uDD85"/* + serie*/, posicionX, posicionY);
        if(matriz3[posicionX][posicionY] == null){

            matriz3[posicionX][posicionY]=aguilita;
        }else{
            aguilita = nombrePosicionAguilas(serie);
        }
        return aguilita;
    }

    public static void creandoCiervos(){
        int serieCiervos = 1;
        //System.out.println("Digite la cantidad de ciervos que desea crear: ");
        //Scanner entradaCiervos = new Scanner(System.in);
        Random entradaCiervos = new Random();
        int numCiervitos = entradaCiervos.nextInt(3)+2;
        Animal[] ciervosCreados = new Ciervo[numCiervitos];
        for(int i = 0; i<numCiervitos; i++){
            ciervosCreados[i] = nombrePosicionCiervos(serieCiervos);
            animalesFinales.add(ciervosCreados[i]);
            matriz3[ciervosCreados[i].getPosicionX()][ciervosCreados[i].getPosicionY()] = ciervosCreados[i].getName();
            matriz4[ciervosCreados[i].getPosicionX()][ciervosCreados[i].getPosicionY()] = ciervosCreados[i];
            serieCiervos++;
        }
        System.out.println();
        System.out.println("Se crearon los siguientes ciervos: ");
        for(Animal ciervos : ciervosCreados){
            System.out.print(ciervos.getName() + "  ");
        }
    }
    public static Animal nombrePosicionCiervos(int serie){
        Random randomX = new Random();
        Random randomY = new Random();
        int posicionX = randomX.nextInt(a);
        int posicionY = randomY.nextInt(b);
        Animal ciervito = new Ciervo("\uD83E\uDD8C"/* + serie*/, posicionX, posicionY);
        if(matriz3[posicionX][posicionY] == null){

            matriz3[posicionX][posicionY]=ciervito;
        }else{
            ciervito = nombrePosicionCiervos(serie);
        }
        return ciervito;
    }

    public static void creandoConejos(){
        int serieConejos = 1;
        //System.out.println("Digite la cantidad de conejos que desea crear: ");
        //Scanner entradaConejos = new Scanner(System.in);
        Random entradaConejos = new Random();
        int numConejitos = entradaConejos.nextInt(3)+2;
        Animal[] conejosCreados = new Conejo[numConejitos];
        for(int i = 0; i<numConejitos; i++){
            conejosCreados[i] = nombrePosicionConejos(serieConejos);
            animalesFinales.add(conejosCreados[i]);
            matriz3[conejosCreados[i].getPosicionX()][conejosCreados[i].getPosicionY()] = conejosCreados[i].getName();
            matriz4[conejosCreados[i].getPosicionX()][conejosCreados[i].getPosicionY()] = conejosCreados[i];
            serieConejos++;
        }
        System.out.println();
        System.out.println("Se crearon los siguientes conejos: ");
        for(Animal conejos : conejosCreados){
            System.out.print(conejos.getName() + "  ");
        }
    }
    public static Animal nombrePosicionConejos(int serie){
        Random randomX = new Random();
        Random randomY = new Random();
        int posicionX = randomX.nextInt(a);
        int posicionY = randomY.nextInt(b);
        Animal conejito = new Conejo("\uD83D\uDC07"/* + serie*/, posicionX, posicionY);
        if(matriz3[posicionX][posicionY] == null){

            matriz3[posicionX][posicionY]=conejito;
        }else{
            conejito = nombrePosicionConejos(serie);
        }
        return conejito;
    }

    public static void creandoRatones(){
        int serieRatones = 1;
        //System.out.println("Digite la cantidad de ratones que desea crear: ");
        //Scanner entradaRatones = new Scanner(System.in);
        Random entradaRatones = new Random();
        int numRatoncitos = entradaRatones.nextInt(3)+2;
        Animal[] ratonesCreados = new Raton[numRatoncitos];
        for(int i = 0; i<numRatoncitos; i++){
            ratonesCreados[i] = nombrePosicionRatones(serieRatones);
            animalesFinales.add(ratonesCreados[i]);
            matriz3[ratonesCreados[i].getPosicionX()][ratonesCreados[i].getPosicionY()] = ratonesCreados[i].getName();
            matriz4[ratonesCreados[i].getPosicionX()][ratonesCreados[i].getPosicionY()] = ratonesCreados[i];
            serieRatones++;
        }
        System.out.println();
        System.out.println("Se crearon los siguientes ratones: ");
        for(Animal ratones : ratonesCreados){
            System.out.print(ratones.getName() + "  ");
        }
    }
    public static Animal nombrePosicionRatones(int serie){
        Random randomX = new Random();
        Random randomY = new Random();
        int posicionX = randomX.nextInt(a);
        int posicionY = randomY.nextInt(b);
        Animal ratoncito = new Raton("\uD83D\uDC01"/* + serie*/, posicionX, posicionY);
        if(matriz3[posicionX][posicionY] == null){

            matriz3[posicionX][posicionY]=ratoncito;
        }else{
            ratoncito = nombrePosicionRatones(serie);
        }
        return ratoncito;
    }

    public static void creandoCabras(){
        int serieCabras = 1;
        //System.out.println("Digite la cantidad de cabras que desea crear: ");
        //Scanner entradaCabras = new Scanner(System.in);
        Random entradaCabras = new Random();
        int numCabritos = entradaCabras.nextInt(3)+2;
        Animal[] cabrasCreadas = new Cabra[numCabritos];
        for(int i = 0; i<numCabritos; i++){
            cabrasCreadas[i] = nombrePosicionCabras(serieCabras);
            animalesFinales.add(cabrasCreadas[i]);
            matriz3[cabrasCreadas[i].getPosicionX()][cabrasCreadas[i].getPosicionY()] = cabrasCreadas[i].getName();
            matriz4[cabrasCreadas[i].getPosicionX()][cabrasCreadas[i].getPosicionY()] = cabrasCreadas[i];
            serieCabras++;
        }
        System.out.println();
        System.out.println("Se crearon los siguientes cabras: ");
        for(Animal cabras : cabrasCreadas){
            System.out.print(cabras.getName() + "  ");
        }
    }
    public static Animal nombrePosicionCabras(int serie){
        Random randomX = new Random();
        Random randomY = new Random();
        int posicionX = randomX.nextInt(a);
        int posicionY = randomY.nextInt(b);
        Animal cabrito = new Cabra("\uD83D\uDC10"/* + serie*/, posicionX, posicionY);
        if(matriz3[posicionX][posicionY] == null){

            matriz3[posicionX][posicionY]=cabrito;
        }else{
            cabrito = nombrePosicionCabras(serie);
        }
        return cabrito;
    }

    public static void creandoOvejas(){
        int serieOvejas = 1;
        //System.out.println("Digite la cantidad de ovejas que desea crear: ");
        //Scanner entradaOvejas = new Scanner(System.in);
        Random entradaOvejas = new Random();
        int numOvejitas = entradaOvejas.nextInt(3)+2;
        Animal[] ovejasCreadas = new Oveja[numOvejitas];
        for(int i = 0; i<numOvejitas; i++){
            ovejasCreadas[i] = nombrePosicionOvejas(serieOvejas);
            animalesFinales.add(ovejasCreadas[i]);
            matriz3[ovejasCreadas[i].getPosicionX()][ovejasCreadas[i].getPosicionY()] = ovejasCreadas[i].getName();
            matriz4[ovejasCreadas[i].getPosicionX()][ovejasCreadas[i].getPosicionY()] = ovejasCreadas[i];
            serieOvejas++;
        }
        System.out.println();
        System.out.println("Se crearon los siguientes ovejas: ");
        for(Animal ovejas : ovejasCreadas){
            System.out.print(ovejas.getName() + "  ");
        }
    }
    public static Animal nombrePosicionOvejas(int serie){
        Random randomX = new Random();
        Random randomY = new Random();
        int posicionX = randomX.nextInt(a);
        int posicionY = randomY.nextInt(b);
        Animal ovejita = new Oveja("\uD83D\uDC11"/* + serie*/, posicionX, posicionY);
        if(matriz3[posicionX][posicionY] == null){

            matriz3[posicionX][posicionY]=ovejita;
        }else{
            ovejita = nombrePosicionOvejas(serie);
        }
        return ovejita;
    }

    public static void creandoJabalis(){
        int serieJabalis = 1;
        //System.out.println("Digite la cantidad de jabalis que desea crear: ");
        //Scanner entradaJabalis = new Scanner(System.in);
        Random entradaJabalis = new Random();
        int numJabalitos = entradaJabalis.nextInt(3)+2;
        Animal[] jabalisCreados = new Jabali[numJabalitos];
        for(int i = 0; i<numJabalitos; i++){
            jabalisCreados[i] = nombrePosicionJabalis(serieJabalis);
            animalesFinales.add(jabalisCreados[i]);
            matriz3[jabalisCreados[i].getPosicionX()][jabalisCreados[i].getPosicionY()] = jabalisCreados[i].getName();
            matriz4[jabalisCreados[i].getPosicionX()][jabalisCreados[i].getPosicionY()] = jabalisCreados[i];
            serieJabalis++;
        }
        System.out.println();
        System.out.println("Se crearon los siguientes jabalis: ");
        for(Animal jabalis : jabalisCreados){
            System.out.print(jabalis.getName() + "  ");
        }
    }
    public static Animal nombrePosicionJabalis(int serie){
        Random randomX = new Random();
        Random randomY = new Random();
        int posicionX = randomX.nextInt(a);
        int posicionY = randomY.nextInt(b);
        Animal jabalito = new Jabali("\uD83D\uDC17"/* + serie*/, posicionX, posicionY);
        if(matriz3[posicionX][posicionY] == null){

            matriz3[posicionX][posicionY]=jabalito;
        }else{
            jabalito = nombrePosicionJabalis(serie);
        }
        return jabalito;
    }

    public static void creandoBufalos(){
        int serieBufalos = 1;
        //System.out.println("Digite la cantidad de bufalos que desea crear: ");
        //Scanner entradaBufalos = new Scanner(System.in);
        Random entradaBufalos = new Random();
        int numBufalitos = entradaBufalos.nextInt(3)+2;
        Animal[] bufalosCreados = new Bufalo[numBufalitos];
        for(int i = 0; i<numBufalitos; i++){
            bufalosCreados[i] = nombrePosicionBufalos(serieBufalos);
            animalesFinales.add(bufalosCreados[i]);
            matriz3[bufalosCreados[i].getPosicionX()][bufalosCreados[i].getPosicionY()] = bufalosCreados[i].getName();
            matriz4[bufalosCreados[i].getPosicionX()][bufalosCreados[i].getPosicionY()] = bufalosCreados[i];
            serieBufalos++;
        }
        System.out.println();
        System.out.println("Se crearon los siguientes bufalos: ");
        for(Animal bufalos : bufalosCreados){
            System.out.print(bufalos.getName() + "  ");
        }
    }
    public static Animal nombrePosicionBufalos(int serie){
        Random randomX = new Random();
        Random randomY = new Random();
        int posicionX = randomX.nextInt(a);
        int posicionY = randomY.nextInt(b);
        Animal bufalito = new Bufalo("\uD83D\uDC03"/* + serie*/, posicionX, posicionY);
        if(matriz3[posicionX][posicionY] == null){

            matriz3[posicionX][posicionY]=bufalito;
        }else{
            bufalito = nombrePosicionBufalos(serie);
        }
        return bufalito;
    }

    public static void creandoPatos(){
        int seriePatos = 1;
        //System.out.println("Digite la cantidad de patos que desea crear: ");
        //Scanner entradaPatos = new Scanner(System.in);
        Random entradaPatos = new Random();
        int numPatitos = entradaPatos.nextInt(3)+2;
        Animal[] patosCreados = new Pato[numPatitos];
        for(int i = 0; i<numPatitos; i++){
            patosCreados[i] = nombrePosicionPatos(seriePatos);
            animalesFinales.add(patosCreados[i]);
            matriz3[patosCreados[i].getPosicionX()][patosCreados[i].getPosicionY()] = patosCreados[i].getName();
            matriz4[patosCreados[i].getPosicionX()][patosCreados[i].getPosicionY()] = patosCreados[i];
            seriePatos++;
        }
        System.out.println();
        System.out.println("Se crearon los siguientes patos: ");
        for(Animal patos : patosCreados){
            System.out.print(patos.getName() + "  ");
        }
    }
    public static Animal nombrePosicionPatos(int serie){
        Random randomX = new Random();
        Random randomY = new Random();
        int posicionX = randomX.nextInt(a);
        int posicionY = randomY.nextInt(b);
        Animal patito = new Pato("\uD83E\uDD86"/* + serie*/, posicionX, posicionY);
        if(matriz3[posicionX][posicionY] == null){

            matriz3[posicionX][posicionY]=patito;
        }else{
            patito = nombrePosicionPatos(serie);
        }
        return patito;
    }

    public static void creandoOrugas(){
        int serieOrugas = 1;
        //System.out.println("Digite la cantidad de orugas que desea crear: ");
        //Scanner entradaOrugas = new Scanner(System.in);
        Random entradaOrugas = new Random();
        int numOruguitas = entradaOrugas.nextInt(6)+2;
        Animal[] orugasCreadas = new Oruga[numOruguitas];
        for(int i = 0; i<numOruguitas; i++){
            orugasCreadas[i] = nombrePosicionOrugas(serieOrugas);
            animalesFinales.add(orugasCreadas[i]);
            matriz3[orugasCreadas[i].getPosicionX()][orugasCreadas[i].getPosicionY()] = orugasCreadas[i].getName();
            matriz4[orugasCreadas[i].getPosicionX()][orugasCreadas[i].getPosicionY()] = orugasCreadas[i];
            serieOrugas++;
        }
        System.out.println();
        System.out.println("Se crearon los siguientes orugas: ");
        for(Animal orugas : orugasCreadas){
            System.out.print(orugas.getName() + "  ");
        }
    }
    public static Animal nombrePosicionOrugas(int serie){
        Random randomX = new Random();
        Random randomY = new Random();
        int posicionX = randomX.nextInt(a);
        int posicionY = randomY.nextInt(b);
        Animal oruguita = new Oruga("\uD83D\uDC1B"/* + serie*/, posicionX, posicionY);
        if(matriz3[posicionX][posicionY] == null){

            matriz3[posicionX][posicionY]=oruguita;
        }else{
            oruguita = nombrePosicionOrugas(serie);
        }
        return oruguita;
    }

    public static void creandoPlantas(){
        int seriePlantas = 1;
        //System.out.println("Digite la cantidad de boas que desea crear: ");
        //Scanner entradaBoas = new Scanner(System.in);
        Random entradaPlantas = new Random();
        int numPlantitas = entradaPlantas.nextInt(10)+5;
        Planta[] plantasCreadas = new Planta[numPlantitas];
        for(int i = 0; i<numPlantitas; i++){
            plantasCreadas[i] = nombrePosicionPlantas(seriePlantas);
            matriz3[plantasCreadas[i].getPosicionX()][plantasCreadas[i].getPosicionY()] = plantasCreadas[i].getName();
            matriz4[plantasCreadas[i].getPosicionX()][plantasCreadas[i].getPosicionY()] = plantasCreadas[i];
            seriePlantas++;
        }
        System.out.println();
        System.out.println("Se crearon las siguientes plantas: ");
        for(Planta plantas : plantasCreadas){
            System.out.print(plantas.getName() + "  ");
        }
    }
    public static Planta nombrePosicionPlantas(int serie){
        Random randomX = new Random();
        Random randomY = new Random();
        int posicionX = randomX.nextInt(a);
        int posicionY = randomY.nextInt(b);
        Planta plantita = new Planta("\uD83C\uDF3F"/* + serie*/, posicionX, posicionY);
        if(matriz3[posicionX][posicionY] == null){

            matriz3[posicionX][posicionY]=plantita;
        }else{
            plantita = nombrePosicionPlantas(serie);
        }
        return plantita;
    }
}