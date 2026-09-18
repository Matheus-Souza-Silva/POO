/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

public class Soma extends OperacaoMatematica{ // Não precisa de import, porque esta no mesmo pacote (tipo de encapsulamento)
    @Override
    public double calcular(double valor1, double valor2){
        return valor1 + valor2;
    }
}
