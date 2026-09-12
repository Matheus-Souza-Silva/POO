package br.com.controle;

public class Calculos {
    private double valor1;
    private double valor2;
    
    public void setValor1(double valor1){
        this.valor1 = valor1;
    }
    
    public double getValor1(){
        return valor1;
    }
    
    public void setValor2(double valor2){
        this.valor2 = valor2;
    }
    
    public double getValor2(){
        return valor2;
    }
    
    public double somar(){ // Assinatura do Método
        return this.valor1 + this.valor2;
    }
    
    public String somar(double valor1, double valor2){ // Pode ser criado métodos com o mesmo nome, desde que tenham assinaturas diferentes
        double soma = valor1 + valor2;
        return "A soma foi "+soma; 
    }
}