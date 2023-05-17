import javax.swing.JOptionPane;

public class Introducao extends MecanicasDoJogo {
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

        String nome = ""; // variável do nome
        while (nome.equals("")) {
            nome = JOptionPane.showInputDialog("Qual seu nome?");
        }


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
                    "Escolha sua classe abaixo, ao clicar você poderá ver os status da sua classe e voltar para esse menu, quando relizar sua escolha, clique SIM na classe desejada",
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
                        classe = 2;
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
                "Você acabou de acordar e se encontra de baixo dos escombros",
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
        } else {
            // codigo ao investigar o barulho
        }


        //fim batalha 1
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
