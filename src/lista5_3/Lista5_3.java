package lista5_3;

import java.util.Arrays;
import javax.swing.JOptionPane;



public class Lista5_3 {
    public static void main(String[] args) {
        final int TAM = 10;
        final int LIMITE = 50;
        int vet[] = new int [TAM];
        for(int x=0; x < TAM; x++){
            do{
                vet[x] = (int) (Math.random() * (LIMITE+1));
            }while(vet[x] % 2 != 0);
        }
        JOptionPane.showMessageDialog( null, "Vetor: "+Arrays.toString(vet));
    }    
}
