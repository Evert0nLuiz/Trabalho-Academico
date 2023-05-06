
public class MecanicasDoJogo 
{
    int vida;
    int furtividade;
    int forca;
    int inteligencia;
    int maximoDeEspaçosNaMochila = 3;
    String mochila [] = new String [maximoDeEspaçosNaMochila];

    //escolha de classes
    public void setClasseSoldado()
    {
        vida = 100;
        inteligencia = 100;
        forca = 100;
        furtividade = 100;


    }
    public void setClasseCientista()
    {
        vida = 100;
        inteligencia = 100;
        forca = 100;
        furtividade = 100;

    }
    public void setClassePrisioneiro()
    {
        vida = 100;
        inteligencia = 100;
        forca = 100;
        furtividade = 100;
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



    //mecanica de dano

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

   public void mostrarMochila()
   {
    String estadoDaMochila = "Compartimento vazio";
    for (int i = 0; i < mochila.length; i++)
    {
        if (i == 0 && mochila[i] == null)
        {
            System.out.println("Sua mochila está vazia");
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