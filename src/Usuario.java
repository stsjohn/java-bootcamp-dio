public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Qual canal? " + smartTv.canal);
        System.out.println("Volume atua?   " + smartTv.volume);

        smartTv.ligar();

       System.out.println("Novo status --> TV ligada? " + smartTv.ligada);

       smartTv.desligar();

       System.out.println("Novo status --> TV ligada? " + smartTv.ligada);
       smartTv.aumentarVolume();
       smartTv.aumentarVolume();
       smartTv.aumentarVolume();
       System.out.println("Volume atual?   " + smartTv.volume);
       System.out.println("Qual canal? " + smartTv.canal);

       smartTv.aumentarCanal();
       System.out.println("Qual canal? " + smartTv.canal);
      
    }
}
