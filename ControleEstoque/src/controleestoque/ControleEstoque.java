/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controleestoque;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mateus Ferraz
 */
public class ControleEstoque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Dicione o nome ,valor e quantidade de produtos");
        String nome = sc.nextLine();
        double valor = sc.nextDouble();
        double qtd = sc.nextDouble();

        System.out.println("Produto: " + nome + ", R$ " + valor + ", Unidade " + qtd + ", Total R$" + qtd * valor);
        int tcl = 1;    

        while (tcl!=0) {            
       System.out.println("Para adicior produto digite 2 e para remover digite 3 sair 0");
       
       tcl=sc.nextInt();
 
     
        if (tcl==2) {
            System.out.println("Digite a quantidade que quer adicionar ");
            double novoqtd = sc.nextDouble();
            qtd += novoqtd;
        }else if (tcl==3){
            System.out.println("Coloque a quantidade que quer remover");
            double novoqtd = sc.nextDouble();
            qtd -= novoqtd;
        } else if(tcl==0){
        tcl*=0;
        }
           
        System.out.println("Produto: " + nome + ", R$ " + valor + ", Unidade " + qtd + ", Total R$" + qtd * valor);
       
        }

        sc.close();
     
    }
    
}
