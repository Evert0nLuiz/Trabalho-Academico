import javax.swing.JOptionPane;

public class Introducao {
    public static void main(String[] args) {
        
        String titulo = "RPG";
    int resposta;
    JOptionPane.showMessageDialog(
        null,
        "Seja bem vindo ao nosso RPG",
        titulo,
        JOptionPane.INFORMATION_MESSAGE);
        
    JOptionPane.showMessageDialog(
        null,
        "INTRODUÇÃO DA HISTÓRIA",
        titulo,
        JOptionPane.INFORMATION_MESSAGE);

    String nome=null; // variável do nome
    while(nome==null){
        nome = JOptionPane.showInputDialog("Qual seu nome?");
    }
    
    
      
    

    JOptionPane.showMessageDialog(
        null,
        "Nosso jogo é baseado em classes e escolhas do jogador, no próximo pop-up escolha sua classe",
        titulo,
        JOptionPane.INFORMATION_MESSAGE); 
    
    String classes[] = {"Soldado","Prisioneiro","Cientista"};//classes existentes

    int classe = 4;
    
    int respostaClasse=0;
    String classeNome = null;
    //soldado = 0
    //prisioneiro = 1
    //cientista = 2
   

    while(classe == 4){ //inicio escolha de classes

        resposta = JOptionPane.showOptionDialog(
        null,
        "Escolha sua classe abaixo, ao clicar você poderá ver os status da sua classe e voltar para esse menu, quando relizar sua escolha, clique SIM na classe desejada", 
        titulo, 
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        classes, 
        titulo);
        
        switch(resposta){
            case 0:
            System.out.println("Soldado");
            respostaClasse = JOptionPane.showOptionDialog(
            null,
            "Ele possue 00 de VIDA, 00 de FORÇA, 00 de INTELIGENCIA e 00 de FURTIVIDADE \n"
            + "Saiba que cada aspecto impacta diretamente nas suas escolhas \n"
            + "Escolha SIM para selecionar e NÃO para voltar ao menu", 
            "SOLDADO", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, 
            null,
            null, 
            titulo);
            if(respostaClasse == 0){
            classe = 0;
            classeNome = "SOLDADO";
            }
            break;

            case 1:
            System.out.println("Prisioneiro");
            respostaClasse = JOptionPane.showOptionDialog(
            null,
            "Ele possue 00 de VIDA, 00 de FORÇA, 00 de INTELIGENCIA e 00 de FURTIVIDADE \n"
            + "Saiba que cada aspecto impacta diretamente nas suas escolhas \n"
            + "Escolha SIM para selecionar e NÃO para voltar ao menu", 
            "PRISIONEIRO", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, 
            null,
            null, 
            titulo);
            if(respostaClasse == 0){
            classe = 2;
            classeNome = "PRISIONEIRO";
            }
            break;

            case 2:
            System.out.println("Cientista");
            respostaClasse = JOptionPane.showOptionDialog(
            null,
            "Ele possue 00 de VIDA, 00 de FORÇA, 00 de INTELIGENCIA e 00 de FURTIVIDADE \n"
            + "Saiba que cada aspecto impacta diretamente nas suas escolhas \n"
            + "Escolha SIM para selecionar e NÃO para voltar ao menu", 
            "CIENTISTA", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, 
            null,
            null, 
            titulo);
            if(respostaClasse == 0){
            classe = 2;
            classeNome = "CIENTISTA";
            }
            break;
        }
        } // fim da escolha da classe
        
        
        

        JOptionPane.showMessageDialog(
        null,
        nome + ", sua classe é " + classeNome + "\nBem-vindo ao Jogo",
        titulo,
        JOptionPane.PLAIN_MESSAGE);
        

        String opcoesEscombros[] = {"Empurrar os escombros","Nada"};

        resposta = JOptionPane.showOptionDialog(
            null, 
            "Você ababou de acordar e se encontra de baixo dos escombros", 
            titulo, 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.WARNING_MESSAGE, 
            null, 
            opcoesEscombros, 
            1);

        if (resposta == 1){
            JOptionPane.showMessageDialog(null, "Os escombros te esmagam e você não consegue respirar\n\nVocê morreu", titulo, JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        JOptionPane.showMessageDialog(null, "Você começa a empurrar os escombro e consegue sair deles", titulo, JOptionPane.PLAIN_MESSAGE);

        String opcoesBase1[] = {"Tentar se esconder","Investigar o Barulho"};
        resposta = JOptionPane.showOptionDialog(
            null, 
            "Você sai dos escombros e vê que a base está totalmente destruida sem sinal de vida aparente.\n Você ouve passos de aproximando de você, o que você faz?", 
            titulo, 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.WARNING_MESSAGE, 
            null, 
            opcoesBase1, 
            1);

        int furtividadeClasse = 0; // uma variável que defina a furtividade da classe escolhida
        if (furtividadeClasse <8){
            JOptionPane.showMessageDialog(null, "Você tenta se esconder porém pela falta de furtividade acaba caindo denovo", titulo, JOptionPane.PLAIN_MESSAGE);
            JOptionPane.showMessageDialog(null, "Quando você consegue se levantar você acha um zumbi na sua frente, pelo visto sua única opção é enfrenta-lo", titulo, JOptionPane.PLAIN_MESSAGE);
            // realizar todo o código da batalha dentro desse IF  

            // se ganhar defina vitória 1 e derrota 0
            int batalha=0;
            if (batalha == 0){
                JOptionPane.showMessageDialog(null, "Você falha miseravelmente em matar o primeiro boss do jogo, parabéns\n\nVocê morreu", titulo, JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            } 
        } else {
            JOptionPane.showMessageDialog(null, "Você é furtivo o suficiente e consegue se esconder do zumbi até que ele passe", titulo, JOptionPane.PLAIN_MESSAGE);  
        }
        
        //fim batalha 1
    }
}
