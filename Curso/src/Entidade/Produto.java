/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidade;

/**
 *
 * @author Mateus Ferraz
 */
public class Produto {

    private String nome;
    private double preço;
    private double quantidade;

    public Produto(String nome, double preço, double quantidade) {
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preço) {
        this.nome = nome;
        this.preço = preço;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public double totalEstoque() {
        return this.preço * quantidade;
    }

    public void addProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerPoduto(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return nome + ", R$ " + String.format("%.2f", preço) + ", " + quantidade
                + " Unidade, Total: R$" + String.format("%.2f", totalEstoque());
    }
}
