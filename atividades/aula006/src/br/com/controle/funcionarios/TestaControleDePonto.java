/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle.funcionarios;

public class TestaControleDePonto {
    public static void main(String[] args) {
        ControleDePonto gerador = new ControleDePonto();

        Gerentes g = new Gerentes();

        Telefonistas t = new Telefonistas();

        g.setCodigo(34);
        gerador.registraEntrada(g);
        gerador.registraSaida(g);
        
        t.setCodigo(12);
        gerador.registraEntrada(t);
        gerador.registraSaida(t);
    }
}
