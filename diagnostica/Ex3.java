/*Crie um método chamado Insere_Exclusivo(int vet[], int N) que alimenta um vetor de N elementos com valores aleatórios entre 1 e N sem 
que ocorram números repetidos. Exiba o vetor gerado.*/

package diagnostica;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ex3 {
    public static void main(String[] args) {
        int n, i;

        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de elementos do vetor"));

        int vet[] = new int[n];

        for(i = 0; i < n; i++) {
            vet[i] = (int)(Math.random() * n);
        }

        Insere_Exclusivo(vet, n);
        JOptionPane.showMessageDialog(null, Arrays.toString(vet));
    }

    public static void Insere_Exclusivo(int vet[], int n) {
        int i, j;

        for(i = 0; i < n; i++) {
            for(j = 0; j < i; j++) {
                if(i > 0) {
                    while(vet[i] == vet[j]) {
                        vet[i] = (int)(Math.random() * n);
                        Insere_Exclusivo(vet, n);
                    }
                }
            }
        }
    }
}