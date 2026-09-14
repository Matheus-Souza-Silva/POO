package br.com.controle;

public class Calculadora {
    private double valor1;
    private double valor2;
    private double soma;
    
    public double adição(double valor1, double valor2){
        return valor1 + valor2;
    }
    
    public double subtração(double valor1, double valor2){
        return valor1 - valor2;
    }
    
    public double multiplicação(double valor1, double valor2){
        return valor1 * valor2;
    }
    
    public double divisão(double valor1, double valor2){
        return valor1 / valor2;
    }
    
    public void somatoria(double valor1, double valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.soma += this.valor1 + this.valor2;
    }
    
    public double somatoria(){
        return this.soma;
    }
    
    public void setValores(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    public double raiz(int escolha) {
        return raiz(this.valor1, this.valor2, escolha);
    }

    public double raiz(double valor1, double valor2, int escolha) {
        if (escolha == 1) {
            return Math.sqrt(valor1);
        } else if (escolha == 2) {
            return Math.sqrt(valor2);
        } else {
            throw new IllegalArgumentException("Escolha 1 para Valor 1 ou 2 para Valor 2.");
        }
    }
}
