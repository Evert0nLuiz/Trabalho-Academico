
public class MecanicasDoJogo 
{
    int vida;
    int furtividade;
    int forca;
    int inteligencia;
    int maximoDeItens = 3;
    String mochila [] = new String [maximoDeItens];

    public void setClasseSoldado()
    {
        vida = 100;
        inteligencia = 100;
        forca = 100;
        furtividade = 100;


    }
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




    public int damage(int dano){
        vida = vida - dano;

        return vida;
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


}