package br.com.controle;

public class CalculadoraFilho extends Calculadora{
    @Override
    public double raiz(int escolha) {
        // SOBRESCRITA: valida antes de chamar a implementação da superclasse
        if (escolha != 1 && escolha != 2) {
            throw new IllegalArgumentException("Escolha 1 ou 2.");
        }
        return super.raiz(escolha);
    }
}
