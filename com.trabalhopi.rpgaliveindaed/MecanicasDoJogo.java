/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabalhopi.rpgaliveindead;
/**
 *
 * @author everton.lcsousa
 */
import java.util.Random;

public class MecanicasDoJogo 
{
    int vida;
    int furtividade;
    int forca;
    int inteligencia;
    int maximoDeEspacosNaMochila = 3;
    String mochila [] = new String [maximoDeEspacosNaMochila];
    int especialUsos = 0;
    int vidaZumbi;
    int forcaZumbi;
    int vidaBoss;
    int forcaBoss;

    //escolha de classes
    public void setClasseSoldado()
    {
        vida = 100;
        inteligencia = 3;
        forca = 9;
        furtividade = 5;
    }
    public void setClasseCientista()
    {
        vida = 100;
        inteligencia = 10;
        forca = 3;
        furtividade = 5;
    }
    public void setClassePrisioneiro()
    {
        vida = 100;
        inteligencia = 5;
        forca = 3;
        furtividade = 9;
    }

    
    public void criaZumbi()
    {
        vidaZumbi = 100;
        forcaZumbi = 10;

    }
    public int getForcaZumbi()
    {
        return forcaZumbi;
    }
    public int getVidaZumbi()
    {
        return vidaZumbi;
    }
    public void setForcaZumbi(int forca){
        this.forcaZumbi = forca;
    }
    public void setVidaZumbi(int vida){
        this.vidaZumbi = vida;
    }
     
    public void criaBoss()
    {
        vidaBoss = 200;
        forcaBoss = 10;

    }
    public int getForcaBoss()
    {
        return forcaBoss;
    }
    public int getVidaBoss()
    {
        return vidaBoss;
    }
    public void setForcaBoss(int forca){
        this.forcaBoss = forca;
    }
    public void setVidaBoss(int vida){
        this.vidaBoss = vida;
    }



    //pegar os Stats
    public int getVida(){
        return vida;
    }
    public  int getInteligencia(){
        return inteligencia;
    }
    public int getFurtividade(){
        return furtividade;     
    }
    public int getForca(){
        return forca;     
    }

    public int getEspecial()
    {
      especialUsos = 2;
      return especialUsos;
    }
   
    




   public String adicionarItensNaMochila(String item)
   {
    int indexNaLista = 0;

    for(;;)
    {
        if (mochila[indexNaLista] == null)
        {
            mochila[indexNaLista] = item;
            break;
        }else
        {
            indexNaLista += 1;
        }
    }


    return mochila[indexNaLista];
    
   }

   public void mostrarMochila()
   {
    String estadoDaMochila = "Compartimento vazio";
    for (int i = 0; i < mochila.length; i++)
    {
        if (i == 0 && mochila[i] == null)
        {
            System.out.println("Sua mochila estÃ¡ vazia");
            break;
        }
        if (i > 0 && mochila[i] == null)
        {
            System.out.println(estadoDaMochila);
            break;
        }
        System.out.println("O compartimento: " + i + " Tem: " + mochila[i]);
        
    }
   }





}
