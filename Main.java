public class Main extends MecanicasDoJogo{

    /**
     * Teste de metodos da classe mecanica
     * @param args
     */
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
        

        System.out.println("Sua vida atual: " + vida + "\nForça: " + forca + " \nInteligência: " + inteligencia + "\nFurtividade: " + furtividade);
        cientista.adicionarItensNaMochila("Chave");
        cientista.adicionarItensNaMochila("Arma");
        cientista.mostrarMochila();
        
       
      
    }
}


