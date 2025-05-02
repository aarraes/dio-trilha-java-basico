public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canalAtual);
        System.out.println("Volume atual: " + smartTv.volumeAtual);
                
        smartTv.ligar();
        System.out.println("A TV está ligada? " + smartTv.ligada);

        smartTv.desligar(); 
        System.out.println("A TV está ligada? " + smartTv.ligada);
        
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volumeAtual);

    }
}
