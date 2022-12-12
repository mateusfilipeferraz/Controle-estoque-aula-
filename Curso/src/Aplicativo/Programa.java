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
        
// até aqui foi orientação do professor mas resolvir incrementar com uma estrutura de repetição 

        System.out.print("Entre com a quantidade de produtos para add no estoque:");
        int quantidade = sc.nextInt();
        produto.addProduto(quantidade);
        System.out.println("");
        System.out.println("Atualização " + produto);
        System.out.println("");
        
        
        System.out.print("Entre com a quantidade para retirar do estoque:");
        int quanidade =sc.nextInt();
        produto.removerPoduto(quantidade);
        System.out.println("");
        System.out.println("Atualização " + produto);

        sc.close();

    }

}
