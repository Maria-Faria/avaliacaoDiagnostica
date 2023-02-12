/*Crie um programa em JAVA que solicita ao usuário o valor de N e, posteriormente, 
alimente o vetor com valores aleatórios entre 0 e M (M também é informado pelo usuário). Exiba o vetor gerado.*/ 

package diagnostica;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex2 {
    public static void main(String[] args) {
        int n, m, i;

        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de N (tamanho do vetor)"));
        m = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de M (valor máximo do número a ser sorteado)"));

        int vetor[] = new int[n];

        for(i = 0; i < n; i++) {
            vetor[i] = (int)(Math.random() * m);
        }

        JOptionPane.showMessageDialog(null, "Vetor gerado: " + Arrays.toString(vetor));
    }
}
