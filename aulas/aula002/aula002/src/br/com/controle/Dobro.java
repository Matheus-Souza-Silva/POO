/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author matheussouza.silva
 */

/*
    Projeto
    ||_pacotes
    |   |_modelo    |
    |   |_visao     |-MVC
    |   |_controle  |
    |lib
      |_JDK
*/

// Encapsulamento / Tipo / Nome
public class Dobro {
    private double valor; // Atributo
    
    public void setValor(double valor){ // Metodo
        this.valor = valor;
    }
    
    public double getValor(){
        return valor;
    }
    
    public double getDobro(){
        return this.valor * 2;
    }
}
