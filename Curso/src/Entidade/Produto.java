/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidade;

/**
 *
 * @author Mateus Ferraz
 */
public  class Produto {

    public String nome;
    public double preço;
    public int quantidade;

    public  double totalEstoque() {
        return this.preço *quantidade;
    }

    public void addProduto(int quantidade) {
        this.quantidade += quantidade;
    }
    
    public void removerPoduto (int quantidade){
    this.quantidade-=quantidade;
    }
    public String toString () {
        return nome + ", R$ "+String.format("%.2f",preço)+ ", " +quantidade+
                " Unidade, Total: R$"+ String.format("%.2f", totalEstoque()) ;
}
}
