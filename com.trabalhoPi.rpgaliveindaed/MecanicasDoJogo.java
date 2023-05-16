/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpgaliveindead;
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
    int vidaZumbi = 0;
    int forcaZumbi;

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
        vidaZumbi = 60;
        forcaZumbi = 2;        


    }
    public int getForcaZumbi()
    {
        return forcaZumbi;
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




    //mecanica de dano para batalha


    public int damage(int dano){
        vida = vida - dano;

        return vida;
    }
   public int getDanoDoOponente()
   {
    Random rnd = new Random();
    forcaZumbi = getForcaZumbi()*10;

    int danoMob;

    danoMob = rnd.nextInt((forcaZumbi)); 
    return danoMob;
   }


    public int getEspecial()
    {
        if (especialUsos <= 0)
        {
            return especialUsos;
        }else{
            especialUsos -=1;
            return especialUsos;
        }
        
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
