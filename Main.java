import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        String titulo = "RPG";

        String nome = JOptionPane.showInputDialog(
            null,
            "Qual seu Nome?",
            null);

        JOptionPane.showMessageDialog(
        null,
        "Seja bem vindo " + nome,
        titulo,
        JOptionPane.PLAIN_MESSAGE);
        
        String [] classes = {"Soldado","Prisioneiro","Cientista"};
        int respota = JOptionPane.showOptionDialog(
            null, "Qual sua classe?",
            titulo,
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            classes,
            0);
        System.out.println(respota);
    }
}
