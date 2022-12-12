package Aplicativo;

import Entidade.Produto;
import java.util.Locale;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Mateus Ferraz
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("Insira os dados do produto: ");

        System.out.print("Nome:");
        produto.nome = sc.nextLine();

        System.out.print("Preço:");
        produto.preço = sc.nextDouble();

        System.out.print("Quantidade no estoque:");
        produto.quantidade = sc.nextInt();

        System.out.println("");

        System.out.println("Dados do produto:" + produto + "\n");
        System.out.println("");
// até aqui foi orientação do professor mas resolvir incrementar com uma estrutura de repetição .
        int escolha = 1;//iniciarlizar a variavel com 1.
        //usei o while para enquanto no for 0 o resultado da escolha o programa se repete 
        while (escolha != 0) {

            //perguntando oque o usuario quer fazer no programa.
            System.out.println("Para adicior produto digite 2 e para remover digite 3, sair 0");
            escolha = sc.nextInt();
            
            if (escolha == 2) {
                System.out.println("Digite a quantidade que quer adicionar:");
                int quantidade = sc.nextInt();
                produto.addProduto(quantidade);
              
            } else if (escolha == 3) {
                System.out.println("Digite a quantidade que quer remover:");
                int quantidade = sc.nextInt();
                produto.removerPoduto(quantidade);
            }else{
                /* para sair usei uma expreção de escolha vezes 0 para sempre o ultimo else da zero 
               para não precisarlimpar a varialvel escolha que e a saida do programa 
                */
                escolha*=0;
            }
            System.out.println("");
            System.out.println("Atualização " + produto);

           
        }
         sc.close();
    }

}
