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

        System.out.println("Insira os dados do produto: ");

        System.out.print("Nome:");
        String nome = sc.nextLine();

        System.out.print("Preço:");
        double preço = sc.nextDouble();

        Produto produto = new Produto(nome, preço);
        System.out.println("----------------------------------------------------------");
        System.out.println("Dados do produto:" + produto);
        System.out.println("----------------------------------------------------------");
        System.out.println("");
// até aqui foi orientação do professor mas resolvir incrementar com uma estrutura de repetição .
        String escolha = "";
        String controlador = "";

        System.out.println("Para adicionar produto digite 'add' e para remover 're' sair 's' ");
        do {   //perguntando oque o usuario quer fazer no programa.

            escolha = sc.nextLine();

            if (null != escolha) {

                switch (escolha) {
                    case "add": {

                        System.out.print("Digite a quantidade que quer adicionar:");
                        int quantidade = sc.nextInt();
                        produto.addProduto(quantidade);
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Atualização " + produto);
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Para adicionar produto digite 'add' e para remover 're' sair 's' ");
                        break;
                    }
                    case "re": {

                        System.out.print("Digite a quantidade que quer remover:");
                        int quantidade = sc.nextInt();
                        produto.removerPoduto(quantidade);
                       System.out.println("----------------------------------------------------------");
                        System.out.println("Atualização " + produto);
                       System.out.println("----------------------------------------------------------");
                        System.out.println("Para adicionar produto digite 'add' e para remover 're' sair 's' ");
                        break;
                    }
                    case "s":
                        controlador = escolha;
                        System.out.println("Atualização " + produto);
                        System.out.println("-------------------------");
                        System.out.println("    PROGRAMA ENCERRADO.  ");
                        System.out.println("-------------------------");
                        break;

                    default:
                        break;
                }
            }

        } while ("".equals(controlador));
        {

        }

        //perguntando oque o usuario quer fazer no programa.
        sc.close();
    }

}
