package com.trabalhopi.rpgaliveindead;
import java.util.Random;
import javax.swing.*;
import java.util.Scanner;

public class Batalhas extends com.trabalhopi.rpgaliveindead.MecanicasDoJogo {

    public int imprimeHP(int vidaJogador, int especialUsos, int vidaInimigo){
        int escolhaJogador;
        String [] acoesJogador = {"Socar", "Especial", "Fugir"};


        escolhaJogador = JOptionPane.showOptionDialog(null, "Hp: " + vidaJogador + "             Hp Inimigo: " + vidaInimigo + "\nEspecial: "+ especialUsos
        ,"O que vocÊ irá fazer para derrota-lo"
        ,JOptionPane.YES_NO_CANCEL_OPTION
        , JOptionPane.QUESTION_MESSAGE
        ,null
        ,acoesJogador
        ,0);
        return escolhaJogador;
    }

public int batalha(int vidaJogador, int especialUsos,int forcaJogador, int statusCoringa, int vidaInimigo, int forcaMob){
    Random rnd = new Random();
    int vidaMob = vidaInimigo;
    int escolhaInimigo;
    int escolhaOqFazerJogador;
    int danoJogador;
    //multiplicador de dano, dependendo da classe
    if(forcaJogador > 6){
         danoJogador = forcaJogador * 3;
    } else {
        danoJogador = forcaJogador * 7;
    }
    
    int danoMob = forcaMob * 2;
    int mediaDeTeste = 8;
    boolean fugir = false;

    while(vidaJogador > 0 && vidaMob > 0 && fugir == false)
    {
        System.out.println(forcaZumbi);
        escolhaOqFazerJogador = imprimeHP(vidaJogador, especialUsos, vidaMob);

        if(vidaJogador > 0)
        {
        if(escolhaOqFazerJogador == -1){
            break;
        }
        
         switch(escolhaOqFazerJogador){
                case 0:
                    //ataque normal            
                int dano = rnd.nextInt(danoJogador)+1;

                    JOptionPane.showMessageDialog(
                null,
                "Voce deu: " + dano + " de dano" ,
                null,
                JOptionPane.INFORMATION_MESSAGE);
                vidaMob -= dano;
                    
                break;
                case 1:
                if (especialUsos == 0)
                {
                    JOptionPane.showMessageDialog(
                null,
                "Você não tem mais especiais, você esqueceu como usar essa magica antiga, você tropeça e cai, você ficou vuneravel e sofreu um ataque, mesmo sem ter atacado" ,
                null,
                JOptionPane.INFORMATION_MESSAGE);
                }
                if(especialUsos > 0){
                    //ataque especial

                int danoEspecial = danoJogador;

                    JOptionPane.showMessageDialog(
                null,
                "Voce deu: " + danoEspecial + " de dano" ,
                null,
                JOptionPane.INFORMATION_MESSAGE);
                    vidaMob -= danoEspecial;
                    especialUsos -= 1;
                break;
                }
                case 2:
                    if (statusCoringa >= mediaDeTeste)
                    {
                        JOptionPane.showMessageDialog(
                null,
                "Você tem furtividade suficiente e consegue fugir" ,
                null,
                JOptionPane.INFORMATION_MESSAGE);
                    fugir = true;
                        break;
                        }else{
                            JOptionPane.showMessageDialog(
                                null,
                                "Você não furtividade suficiente, o inimigo te vê e te bate, você perdeu sua vez para isso ?" ,
                                null,
                                JOptionPane.INFORMATION_MESSAGE);
                        }                
                break;
                
            
        }
    }
         if(vidaMob > 0 && fugir == false)
        {
            escolhaInimigo = rnd.nextInt(1)+ 1 ;
            switch(escolhaInimigo){
                case 1:
                //ataque normal 
                int dano = rnd.nextInt(danoMob)+1;
                JOptionPane.showMessageDialog(
                    null,
                    "O inimigo deu: " + dano + " de dano" ,
                    null,
                    JOptionPane.WARNING_MESSAGE);
                               
                    vidaJogador -= dano;
                    
                break;
                 case 2:
                //ataque especial
                int danoEspecial = rnd.nextInt(danoMob)+1;
                JOptionPane.showMessageDialog(
                    null,
                    "O inimigo deu: " + danoEspecial + " de dano" ,
                    null,
                    JOptionPane.WARNING_MESSAGE);
          
                   vidaJogador -= danoEspecial;
                    
                break;
           
    }
    

         }


    }
    if (vidaJogador <= 0)
    {
        JOptionPane.showMessageDialog(
                    null,
                    "Você morreu!",
                    null,
                    JOptionPane.WARNING_MESSAGE);
    }
    return vidaJogador;

}
}
