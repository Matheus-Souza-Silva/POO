/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle.funcionarios;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ControleDePonto {
    public void registraEntrada(Funcionarios f) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date agora = new Date();

        System.out.println("ENTRADA: " + f.getCodigo());
        System.out.println("DATA:    " + sdf.format(agora));
    }

    public void registraSaida(Funcionarios f) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date agora = new Date();

        System.out.println("SAIDA: " + f.getCodigo());
        System.out.println("DATA:  " + sdf.format(agora));
    }
}
