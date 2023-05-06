public class Main extends MecanicasDoJogo{

    public static void main(String[] args) {
        MecanicasDoJogo cientista = new MecanicasDoJogo();
        int vida;
        int inteligencia;
        int furtividade;
        int forca;
        String mochila[] = new String [2];
        cientista.setClasseSoldado();

        vida = cientista.getVida();
        forca = cientista.getForca();
        inteligencia = cientista.getInteligencia();
        furtividade = cientista.getFurtividade();


        System.out.println("Sua vida atual: " + vida + "\nForça: " + forca + " \nInteligência: " + inteligencia + "\nFurtividade: " + furtividade);
        
       

    }
}


