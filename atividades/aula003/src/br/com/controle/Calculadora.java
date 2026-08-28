/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author ADMIN
 */
public class Calculadora {
    private double soma;
    private int quantidade;
    
    public void adicionarValor(double valor){
        soma += valor;
        quantidade++;
    }
    
    public double calcularMedia(){
        if(quantidade == 0){
            return 0;
        }
        
        return soma / quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
