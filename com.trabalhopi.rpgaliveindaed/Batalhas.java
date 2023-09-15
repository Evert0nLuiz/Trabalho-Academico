package com.trabalhopi.rpgaliveindead;

import java.util.Random;
import javax.swing.*;
import java.util.Scanner;

public class Batalhas extends com.trabalhopi.rpgaliveindead.MecanicasDoJogo {

    public int imprimeHP(int vidaJogador, int especialUsos, int vidaInimigo) {
        int escolhaJogador;
        String[] acoesJogador = {"Socar", "Especial", "Fugir"};


        escolhaJogador = JOptionPane.showOptionDialog(null, "Hp: " + vidaJogador + "             " +
                        "Hp Inimigo: " + vidaInimigo +
                        "\nEspecial: " + especialUsos
                , "O que você irá fazer para derrota-lo"
                , JOptionPane.YES_NO_CANCEL_OPTION
                , JOptionPane.QUESTION_MESSAGE
                , null
                , acoesJogador
                , 0);
        return escolhaJogador;
    }

    public boolean batalha(MecanicasDoJogo jogo) {
        Random rnd = new Random();
        int escolhaInimigo;
        int escolhaOqFazerJogador;
        int danoJogador;
        especialUsos = jogo.getEspecial();

        //multiplicador de dano, dependendo da classe
        if (jogo.getForca() > 6) {
            danoJogador = jogo.getForca() * 3;
        } else if (jogo.getForca() >= 4 && jogo.getForca() <= 6 ) {
            danoJogador = jogo.getForca() * 5;
        } else {
            danoJogador = jogo.getForca() * 7;
        }

        int danoMob = jogo.getForcaInimigo() * 2;
        int mediaDeTeste = 8;
        boolean fugir = false;

        while (jogo.getVida() > 0 && jogo.getVidaInimigo() > 0 && fugir == false) {
            System.out.println(jogo.getVidaInimigo());
            escolhaOqFazerJogador = imprimeHP(jogo.getVida(), especialUsos, jogo.getVidaInimigo());

            if (jogo.getVida() > 0) {
                if (escolhaOqFazerJogador == -1) {
                    break;
                }

                switch (escolhaOqFazerJogador) {
                    case 0:
                        //ataque normal
                        int dano = rnd.nextInt(danoJogador) + 1;

                        JOptionPane.showMessageDialog(
                                null,
                                "Voce deu: " + dano + " de dano",
                                null,
                                JOptionPane.INFORMATION_MESSAGE);
                        jogo.setVidaInimigo( jogo.getVidaInimigo() - dano);

                        break;
                    case 1:
                        if (especialUsos == 0) {
                            JOptionPane.showMessageDialog(
                                    null,
                                    "Você não tem mais especiais, você esqueceu como usar essa magica antiga, você tropeça e cai, você ficou vuneravel e sofreu um ataque, mesmo sem ter atacado",
                                    null,
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        if (especialUsos > 0) {
                            //ataque especial

                            int danoEspecial = danoJogador;

                            JOptionPane.showMessageDialog(
                                    null,
                                    "Voce deu: " + danoEspecial + " de dano",
                                    null,
                                    JOptionPane.INFORMATION_MESSAGE);
                            jogo.setVidaInimigo(jogo.getVidaInimigo() - danoEspecial);
                            especialUsos -= 1;
                            break;
                        }
                    case 2:
                        if (jogo.getFurtividade() >= mediaDeTeste) {
                            JOptionPane.showMessageDialog(
                                    null,
                                    "Você tem furtividade suficiente e consegue fugir",
                                    null,
                                    JOptionPane.INFORMATION_MESSAGE);
                            fugir = true;
                            break;
                        } else {
                            JOptionPane.showMessageDialog(
                                    null,
                                    "Você não furtividade suficiente, o inimigo te vê e te bate, você perdeu sua vez para isso ?",
                                    null,
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;


                }
            }
            if (jogo.getVidaInimigo() > 0 && fugir == false) {
                escolhaInimigo = rnd.nextInt(1) + 1;

                switch (escolhaInimigo) {
                    case 1:
                        //ataque normal
                        int dano = rnd.nextInt(danoMob);
                        JOptionPane.showMessageDialog(
                                null,
                                "O inimigo deu: " + dano + " de dano",
                                null,
                                JOptionPane.WARNING_MESSAGE);

                        jogo.setVida(jogo.getVida() - dano);

                        break;
                    case 2:
                        //ataque especial
                        int danoEspecial = rnd.nextInt(danoMob) + 2;
                        JOptionPane.showMessageDialog(
                                null,
                                "O inimigo deu: " + danoEspecial + " de dano",
                                null,
                                JOptionPane.WARNING_MESSAGE);

                        jogo.setVida(jogo.getVida() - danoEspecial);

                        break;

                }


            }


        }
        if (jogo.getVida() <= 0) {
            return false;
        }

        return true;
    }
}
