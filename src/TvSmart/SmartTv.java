package TvSmart;


public class SmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 18;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal ++;
        System.out.println("aumentando canal");
    }

    public void diminuirCanal(){
        canal --;
        System.out.println("diminuindo canal");
    }
    
    public void aumentarVolume(){
        volume ++;
        System.out.println("aumentando volume");
    }

    public void diminuirVolume(){
        volume --;
         System.out.println("diminuindo volume");
    }
}
