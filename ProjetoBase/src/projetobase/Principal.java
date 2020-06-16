/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// javac src/projetobase/*.java -d classes
// java -cp classes projetobase.Principal
package projetobase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

import java.util.Scanner;

/**
 *
 * @author Matheus e Ana Flavia
 */
public class Principal {

    /**
     * @param args the command line arguments
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        int t = 0;
    while(t==0){

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("---- Bem vindo ao menu do mercado do JAVA!---------");
        System.out.println("Digite:");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar");
        System.out.println("3 - Sair");
        System.out.println("---------------------------------------------------");

        Scanner teclado = new Scanner(System.in);
       
        int menu = teclado.nextInt();

    

        switch (menu) {
            case 1:

                Itens itens = new Itens();

                
               OutputStream os = new FileOutputStream("arquivos/escrita.txt");
               OutputStreamWriter osw = new OutputStreamWriter(os);
               BufferedWriter bw = new BufferedWriter(osw);
               //BufferedWriter buffWrite = new BufferedWriter(new FileWriter("arquivos.escrita.txt"));

                System.out.print("Digite o nome: ");
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String nome_input = in.readLine();
                itens.nome = nome_input; //nome_input eh o que digitamos no terminal

                System.out.print("Digite o tipo do item: ");
                BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));
                String tipo_input = in2.readLine();
                itens.tipo = tipo_input; 

                System.out.print("Digite o preço do item: ");
                BufferedReader in3 = new BufferedReader(new InputStreamReader(System.in));
                String preco_input = in3.readLine();
                itens.preco = preco_input; 

                itens.MostraInfos();

                bw.write(nome_input + "-" + tipo_input + "-" + preco_input + "\n");  
                bw.newLine();
                //buffWrite.append(nome_input + "-" + tipo_input + "-" + preco_input + "\n");  
               // buffWrite.close();
                bw.close();

                break;

            case 2:

                System.out.println("\n");
                System.out.println("Os produtos do mercado java são:");
                System.out.println("\n");

                InputStream is2 = new FileInputStream("arquivos/escrita.txt");    
                InputStreamReader isr2 = new InputStreamReader(is2);
                BufferedReader br2 = new BufferedReader(isr2);
                String s2 = br2.readLine();
                
                if(s2 == null){

                    System.out.println("A lista de itens está vazia!");

                }
                
                while(s2!= null){

                System.out.println(s2 +"\n");   
                s2 = br2.readLine();
                
                }
            
                
            
            break;
            case 3:
                System.out.println("Deseja realmente sair? Se sim, pressione 1, se não, pressione 0!");
                Scanner teclado2 = new Scanner(System.in);
                 int menu_sair = teclado2.nextInt();
                 if(menu_sair == 1) t=1;
                 else t=0;
                 
            break;
        
            default:
            System.out.println("Verifique se digitou o numero correspondente.");
                break;
        }

              

        /*/===============Leitura do Arquivo================//
        InputStream is = new FileInputStream("arquivos/arquivo.txt");    
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();

        while(s!= null){

            System.out.println(s);
            s = br.readLine();
        }

        //=============================================/*/

        //===== Escrita no arquivo======================//

        /*OutputStream os = new FileOutputStream("arquivos/escrita.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write(nome + "\n");
        bw.close();*/
    }
}
}
