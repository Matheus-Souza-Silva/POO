/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author matheussouza.silva
 */
public class Compra {
    private double valor;
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public double getValor(){
        return valor;
    }
    
    public double getDesconto(){
        return this.valor * 0.9;
    }
}
