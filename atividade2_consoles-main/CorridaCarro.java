public class CorridaCarro {

	final static int TOTAl = 800; //linha de chegada
    static int numCarros = 5; //quantidade de carros
   
    public static void main(String[] args) {
        
        for(int i = 1; i <= numCarros; i++){
            new IteraCar("Carro_" + i, TOTAl).start();
        }
    }
} //end
