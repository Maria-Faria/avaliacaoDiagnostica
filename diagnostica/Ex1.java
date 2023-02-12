/*Crie um programa em que solicita ao usuário o valor de N e, posteriormente os N números que devem ser armazenados em um vetor. 
Em um segundo momento, exiba o vetor na ordem em que os elementos foram digitados e em ordem inversa.*/ 

package diagnostica;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ex1 {
    public static void main(String[] args) {
        int n, i, j = 0;

        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor N (tamanho do vetor)"));

        int vetor[] = new int[n];
        int vetor2[] = new int[n];

        for(i = 0; i < n; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Digite o %dº valor do vetor", (i + 1))));
        }

        for(i = (n - 1); i >= 0; i--) {
            vetor2[i] = vetor[j];
            j++;
        }

        System.out.println("----- Vetor na ordem em que os elementos foram digitados -----");
        System.out.println(Arrays.toString(vetor));

        System.out.println("\n----- Vetor na ordem inversa -----");
        System.out.println(Arrays.toString(vetor2));
    }
}