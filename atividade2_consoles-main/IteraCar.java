
public class IteraCar extends Thread{

    String name; //id do carro
    int carDistancia = 0; //distancia do pulo
    int distanciaTotal;
    int iterac = 0;
    int acelerou = 0;
    static int rank = 0;
    final static int MAXVel = 48;

    IteraCar( String name, int totalDist){

        this.name = name;
        this.distanciaTotal = totalDist;
    }

    public void printRank(){
        rank++;
        System.out.println("|||||||"+ name + "|> alcançou a linha de chegada\n e foi o " + rank + " º colocado com " + iterac + " iterações.|||||||");
    }

    public void imprimeCorrida(){
        
        System.out.println("O " + name + "/andou " + acelerou + "m e percorreu a distancia de |" + carDistancia + " m| ...");
    }
 
    public void run(){

        while (carDistancia < distanciaTotal){
            iteraCar();
            imprimeCorrida();
        }
        printRank();
    }
    
    public void iteraCar(){
        iterac++;
        acelerou = (int) (Math.random() * MAXVel);
        carDistancia += acelerou;
        if(carDistancia > distanciaTotal){
            carDistancia = distanciaTotal;
        }
    }
}