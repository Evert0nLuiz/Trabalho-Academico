/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabalhopi.rpgaliveindead;

/**
 *
 * @author everton.lcsousa
 */
import javax.swing.JOptionPane;

public class Main extends MecanicasDoJogo {
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
                "Em 7 de Dezembro de 1941, houve o ataque japonês a base naval americana de Pearl Harbor, em Honolulu, no território do Havaí\nVocê é um sobrevivente a este ataque e esta em busca de sair da ilha, que devido as bombas, os mortos estavam voltando a vida!\nVocê será capaz de enfrentar esta jornada perigosa e desafiante?\nBoa Sorte Guerreiro!!! ",
                titulo,
                JOptionPane.INFORMATION_MESSAGE);

        String nome = ""; // variável do nome
        nome = JOptionPane.showInputDialog("Qual seu nome?");
        if (nome.equals("")){
         while (nome.equals("")) {
            nome = JOptionPane.showInputDialog("Esse nome não é valido, tente novamente");
        }}


        JOptionPane.showMessageDialog(
                null,
                "Nosso jogo é baseado em classes e escolhas do jogador, no próximo pop-up escolha sua classe",
                titulo,
                JOptionPane.INFORMATION_MESSAGE);

        String classes[] = {"Soldado", "Prisioneiro", "Cientista"};//classes existentes


        int respostaClasse = 0;
        String classeNome = null;
        //soldado = 0
        //prisioneiro = 1
        //cientista = 2

        MecanicasDoJogo status = null;
        int classe = 4;
        while (classe == 4) { //inicio escolha de classes

            resposta = JOptionPane.showOptionDialog(
                    null,
                    "Escolha sua classe abaixo, ao clicar você poderá ver os status da sua classe e voltar para esse menu.",
                    titulo,
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    classes,
                    titulo
            );

            status = definirStatsClasse(resposta);
            String tipoClasse = "";
            switch (resposta) {
                case 0:
                    System.out.println("Soldado");
                    tipoClasse = "Soldado";
                    respostaClasse = definirClasse(tipoClasse, status, titulo);
                    if (respostaClasse == 0) {
                        classe = 0;
                        classeNome = "SOLDADO";
                    }
                    break;

                case 1:
                    System.out.println("Prisioneiro");
                    tipoClasse = "Prisioneiro";
                    respostaClasse = definirClasse(tipoClasse, status, titulo);
                    if (respostaClasse == 0) {
                        classe = 1;
                        classeNome = "PRISIONEIRO";
                    }
                    break;

                case 2:
                    System.out.println("Cientista");
                    tipoClasse = "Cientista";
                    respostaClasse = definirClasse(tipoClasse, status, titulo);
                    if (respostaClasse == 0) {
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


        String opcoesEscombros[] = {"Empurrar os escombros", "Nada"};

        resposta = JOptionPane.showOptionDialog(
                null,
                "Você acabou de acordar e se encontra de baixo dos escombros, o que deseja fazer?",
                titulo,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                opcoesEscombros,
                1);

        if (resposta == 1) {
            JOptionPane.showMessageDialog(null, "Os escombros te esmagam e você não consegue respirar\n\nVocê morreu", titulo, JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        JOptionPane.showMessageDialog(null, "Você começa a empurrar os escombro e consegue sair deles", titulo, JOptionPane.PLAIN_MESSAGE);

        String opcoesBase1[] = {"Tentar se esconder", "Investigar o Barulho"};
        resposta = JOptionPane.showOptionDialog(
                null,
                "Você sai dos escombros e vê que a base está totalmente destruida sem sinal de vida aparente.\n Você ouve passos se aproximando de você, o que você faz?",
                titulo,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                opcoesBase1,
                1
        );

        int pularBatalha = 0;
        if (resposta == 0) {
            if (status.furtividade >= 8) {
                JOptionPane.showMessageDialog(null, "Você é furtivo o suficiente e consegue se esconder do zumbi até que ele passe", titulo, JOptionPane.PLAIN_MESSAGE);
                pularBatalha = 1;
            } else {
                JOptionPane.showMessageDialog(null, "Você tenta se esconder porém pela falta de furtividade acaba caindo denovo", titulo, JOptionPane.PLAIN_MESSAGE);
                pularBatalha = 0;
            }

            if (pularBatalha == 0) {
                JOptionPane.showMessageDialog(null, "Quando você consegue se levantar você acha um zumbi na sua frente, pelo visto sua única opção é enfrenta-lo", titulo, JOptionPane.PLAIN_MESSAGE);
                // realizar todo o código da batalha dentro desse IF

                // se ganhar defina vitória 1 e derrota 0
                int batalha = 0;
                if (batalha == 0) {
                    JOptionPane.showMessageDialog(null, "Você falha miseravelmente em matar o primeiro boss do jogo, parabéns\n\nVocê morreu", titulo, JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
            }
        }


        //fim batalha 1

        String armaClasse[] = {"Arma","Taco de Baisebol","Arma de Choque"};

        JOptionPane.showMessageDialog(
        null,
        "Parabéns, você venceu sua primeira batalha, ao derrota-lo você acha um(a) " + armaClasse[classe] + " no chão.", 
        titulo, 
        JOptionPane.INFORMATION_MESSAGE);
        
        String opcoesFios[]= {"Vermelho","Azul","Chutar a porta"};
        int pularFios = 0;
  

        while(pularFios != 1){
        int respotaFio = JOptionPane.showOptionDialog(
        null,
        "Você tenta sair da sala onde você se encontra e se depara com uma porta a sua frente com dois fios suspeitos a amostra, o que você faz?",
        titulo, 
        JOptionPane.YES_NO_CANCEL_OPTION, 
        JOptionPane.WARNING_MESSAGE, 
        null, 
        opcoesFios, 
        null);


            switch(respotaFio){
                case 0:
                JOptionPane.showMessageDialog(
                    null, 
                    "Você cortou o fio vermelho, com isso uma luz magicamente se acende e você consegue abrir a porta a sua frete", 
                    titulo, 
                    JOptionPane.INFORMATION_MESSAGE);
                pularFios = 1;
                break;

                case 1:
                JOptionPane.showMessageDialog(
                    null, 
                    "Você cortou o fio azul, e não acontece nada.\nTodo mundo sabe que o fio certo é o vermelho...", 
                    titulo, 
                    JOptionPane.WARNING_MESSAGE);
                break;

                case 2:
                if (status.forca >= 8) {
                    JOptionPane.showMessageDialog(null, "Você é forte o suficiente e consegue derrubar a porta com um chute\n\nO de hoje ta pago em!!", titulo, JOptionPane.INFORMATION_MESSAGE);
                    pularFios = 1;
                } else {
                    JOptionPane.showMessageDialog(null, "Você tenta chutar a porta mas não tomou seu pré-treino e acaba machucando seu pé, o que resta é cortar os fios", titulo, JOptionPane.WARNING_MESSAGE);
                    pularFios = 0;
                }
                break;
            }
       

    }

    JOptionPane.showMessageDialog(
        null,
        "Incrivelmente você conseguiu chegar até aqui, com isso, ao sair da sala, você se depara 2 corredores (no caso são corredores de corredor, e não maratonistas kkk)",
        titulo, 
        JOptionPane.INFORMATION_MESSAGE);
        
        String opcoesCorredor[]= {"Esquerda","Direita","Tentar ler as placas"};
        int pularCorredor = 0;

        while(pularCorredor != 1){
        int respotaCorredor = JOptionPane.showOptionDialog(
        null,
        "Você percebe que há placas em uma língua estranha indicando o corredor correto até a saída, o que você faz?",
        titulo, 
        JOptionPane.YES_NO_CANCEL_OPTION, 
        JOptionPane.WARNING_MESSAGE, 
        null, 
        opcoesCorredor, 
        null);


            switch(respotaCorredor){
                case 0:
                JOptionPane.showMessageDialog(
                    null, 
                    "Você virou a esquerda e enxerga uma luz no fim do túnel, porém, ao tentar alcança-la você cai em um buraco e morre!", 
                    titulo, 
                    JOptionPane.WARNING_MESSAGE);
                System.exit(0);
                break;

                case 1:
                JOptionPane.showMessageDialog(
                    null, 
                    "Você virou a direita e enxerga uma luz. Ao caminhar até ela, sua visão se ofusca pelo brilho do sol... \n Mas a jornarda ainda não terminou!", 
                    titulo, 
                    JOptionPane.INFORMATION_MESSAGE);
                    pularCorredor = 1;
                break;

                case 2:
                if (status.inteligencia >= 8) {
                    JOptionPane.showMessageDialog(null, "Você é inteligente suficiente e consegue decifrar a lingua, assim escolhendo o caminho certo\nBoa Einstein", titulo, JOptionPane.INFORMATION_MESSAGE);
                    pularCorredor = 1;
                } else {
                    JOptionPane.showMessageDialog(null, "Você tenta ler aquelas palavras e figuras e só de tentar entender começa a ficar com dor de cabeça.\nNão temos neusadina, então vai ter que escolher na sorte :D", titulo, JOptionPane.WARNING_MESSAGE);
                    pularCorredor = 0;
                }
                break;
            }
       
        }

        JOptionPane.showMessageDialog(null, "Basta agora escolher o caminho para a glória e sonhada liberdade!", titulo, JOptionPane.PLAIN_MESSAGE);

        String opcoesSaida [] = {"Ponte", "Cais"};

        int respostaSaida = JOptionPane.showOptionDialog(null, "Qual saída deseja escolher?", titulo, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoesSaida, null);

        if (respostaSaida == 0) {
            JOptionPane.showMessageDialog(null, "Ao seguir pelo caminho da ponte, alegre e saltitante pela sonhada liberdade, você se depara com uma horda gigantesca de zumbis...\nQue logo percebem sua presença e partem pra cima de você\nVocê morreu!", titulo, JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }

        JOptionPane.showMessageDialog(null, "Ao seguir pelo caminho do cais, você se depara com um barco, incrivelmente inteiro, ainda mais com o ataque\nMas quando a esmola é muito grande, o santo desconfia...\nVocê se depara com um guarda fazendo a vigia do barco, mas seu foco é sair da ilha, então vai a batalha", titulo, JOptionPane.PLAIN_MESSAGE);

        // inicio batalha

        // se ganhar defina vitoriaBatalha = 1
        int vitoriaBatalha = 1;

        if (vitoriaBatalha == 0){
            JOptionPane.showMessageDialog(null, "Você chegou tão perto, infelizmente, o guarda era mais forte e conseguiu te derrotar\nVocê Morreu!", titulo, JOptionPane.WARNING_MESSAGE);
            System.exit(1);
        }

        JOptionPane.showMessageDialog(null, "Você conseguiu!!!\nParabéns guerreiro, depois dessa árdua batalha para escapar dessa ilha infernal, chegou a hora de descansar!", titulo, JOptionPane.INFORMATION_MESSAGE);

    }

    

    public static MecanicasDoJogo definirStatsClasse(int escolha) {
        MecanicasDoJogo mecanicas = new MecanicasDoJogo();
        if (escolha == 0) {
            mecanicas.setClasseSoldado();
            return mecanicas;
        } else if (escolha == 1) {
            mecanicas.setClassePrisioneiro();
            return mecanicas;
        } else {
            mecanicas.setClasseCientista();
            return mecanicas;
        }
    }

    public static int definirClasse(String classe, MecanicasDoJogo status, String titulo) {
        return (JOptionPane.showOptionDialog(
                null,
                "Ele possui "
                        + status.vida + " de VIDA, "
                        + status.forca + " de FORÇA, "
                        + status.inteligencia + " de INTELIGENCIA e "
                        + status.furtividade + " de FURTIVIDADE \n"
                        + "Saiba que cada aspecto impacta diretamente nas suas escolhas \n"
                        + "Escolha SIM para selecionar e NÃO para voltar ao menu",
                classe,
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                null,
                titulo)
        );
    }


}

