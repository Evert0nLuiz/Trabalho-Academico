package com.trabalhopi.rpgaliveindead;

import javax.swing.*;
import java.util.Scanner;

public class Batalhas extends com.trabalhopi.rpgaliveindead.MecanicasDoJogo {

    public int imprimeHP(int vidaJogador, int especialUsos, int vidaInimigo){
        int escolhaJogador;
        String [] acoesJogador = {"Socar", "Especial", "Fugir"};


        escolhaJogador = JOptionPane.showOptionDialog(null, "Hp: " + vidaJogador + "             Hp Inimigo: " + vidaInimigo + "\nEspecial: "+ especialUsos
        ,"Teste"
        ,JOptionPane.YES_NO_CANCEL_OPTION
        , JOptionPane.WARNING_MESSAGE
        ,null
        ,acoesJogador
        ,0);
        return escolhaJogador;
    }

public int batalha(int vidaJogador, int especialUsos,,int forcaJogador, int vidaInimigo){
    Scanner input = new Scanner(System.in);
    Random rnd = new Random();

    forcaJogador = rnd.nextInt(forca) + 1;
    int escolhaInimigo;
    int escolhaOqFazerJogador;

    while(vidaJogador > 0 && vidaInimigo > 0)
    {
        escolhaOqFazerJogador = imprimeHP(vidaJogador, especialUsos, vidaInimigo);
        if(vidaJogador < 0)
        {
        
         switch(escolhaOqFazerJogador){
                case 0:
                    //ataque normal            
                    vidaInimigo -= forcaJogador;
                break;
                case 1:
                    //ataque especial
                    vidaInimigo -= especial;
                    especial -= 1;
                break;
                case 2:
                    if (furtividade >= 8)
                    {
                        continue;
                    }
                break;
            
        }
    }
         if(vidaInimigo > 0)
        {
            escolhaInimigo = rnd.nextInt(1);
            switch(escolhaInimigo){
                case 0:
                    //ataque normal            
                    vidaJogador -= rnd.nextInt(forcaZumbi);
                break;
                 case 1:
                //ataque especial
                    vidaJogador -= rnd.nextInt(forcaZumbi)*10;
                break;
           
    }
    

    }
    return vidaJogador



}

}
