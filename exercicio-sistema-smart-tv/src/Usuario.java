public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("A televisão está ligada? " + smartTv.ligada);
        System.out.println("Qual canal está? " + smartTv.canal);
        System.out.println("Qual volume está? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status: A televisão está ligada? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Novo status: A televisão está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Qual volume está? " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Qual volume está? " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Em qual canal está atualmente? " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Em qual canal está atualmente? " + smartTv.canal);
        smartTv.mudarCanal(10);
        System.out.println("Em qual canal está atualmente? " + smartTv.canal );

    }       
}
