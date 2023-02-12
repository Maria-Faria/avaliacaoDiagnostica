/*Crie um programa em JAVA que faça a leitura de um arquivo de texto contendo um número inteiro em cada linha onde: O número da primeira 
linha é o valor de N e os números subsequentes são a sequência numérica de interesse. Armazene os valores lidos em um vetor e exiba-o. 
Aproveite sua implementação do Exercício 1. e escreva em outro arquivo a sequência numérica em ordem inversa.*/

package diagnostica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        try{
            arquivo2();
        
        }catch(IOException e) {
            e.printStackTrace();
        }

        String numeros[] = new String[6];

        String n = lerArquivo("numeros.txt", numeros);
        vetor(n, numeros);
    }

    public static File arquivo2() throws IOException{
        File f = new File("numerosInverso.txt");

        return f;
    }
    public static String lerArquivo(String nomeArq, String[] numeros) {
        String n = null;

        try{
            FileReader fr = new FileReader(nomeArq);
            BufferedReader in = new BufferedReader(fr);

            String linha = null;
            int i = 0;

            while((linha = in.readLine()) != null) {
                if(i == 0) {
                    n = linha;
                
                }else{
                    numeros[i] = linha;
                }

                i++;
            }

            in.close();

        }catch(IOException e) {
            e.printStackTrace();
        }

        return n;

    }

    public static void vetor(String n, String[] numeros) {
        int n2 = Integer.parseInt(n);
        int numeros2[] = new int[n2];
        int i, j = 1;

        for(i = 0; i < n2; i++) {
            numeros2[i] = Integer.parseInt(numeros[j]);
            j++;
        }

        System.out.println(Arrays.toString(numeros2));
        escreverArquivo(n2, numeros2);
    }

    public static void escreverArquivo(int n2, int[] numeros2) {
        try{
            FileWriter writer = new FileWriter("numerosInverso.txt");
            PrintWriter printwriter = new PrintWriter(writer); 

            for(int i = (n2 - 1); i >= 0; i--) {
                printwriter.println(numeros2[i]);
            }

            printwriter.close();

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
