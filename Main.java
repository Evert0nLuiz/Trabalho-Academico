public class Main extends MecanicasDoJogo{

    public static void main(String[] args) {
        MecanicasDoJogo cientista = new MecanicasDoJogo();
        int vida;
        int inteligencia;
        int furtividade;
        int forca;

        cientista.setClasseSoldado();

        vida = cientista.getVida();
        forca = cientista.getForca();
        inteligencia = cientista.getInteligencia();
        furtividade = cientista.getFurtividade();

        vida = cientista.heal(22);


        System.out.println("Sua vida atual: " + vida + "\nForça: " + forca + " \nInteligência: " + inteligencia + "\nFurtividade: " + furtividade);
    }
}


