/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author ADMIN
 */
public class Notas {
    private double media;
    private double total_media;
    private double maior_media;
    private int quantidade;
    
    public double calcularMedia(double nota1, double nota2){
        this.quantidade++;
        return this.media = (nota1 + nota2) / 2;
    }

    public double calcularMaiorMedia(){
        if(this.media >= this.maior_media){
            this.maior_media = this.media;
        }
        
        return this.maior_media;
    }
    
    public double calcularTurmaMedia(){
        if(this.quantidade <= 0){
            return 0;
        }
        
        this.total_media += this.media;
        return this.total_media / this.quantidade;
    }
}
