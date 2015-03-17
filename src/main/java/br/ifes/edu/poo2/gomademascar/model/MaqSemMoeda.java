/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.gomademascar.model;

/**
 *
 * @author Gustavo
 */
public class MaqSemMoeda extends AStateMaquina{

    public MaqSemMoeda(Maquina maquina) {
        super(maquina);
    }

    @Override
    public void verificarMoeda(String moeda) {
        System.out.println("Moeda Recebida");
        maquina.setState(maquina.getMaqRecebeuMoeda());
        maquina.inserirMoeda(moeda);
    }

    @Override
    public void alavancaPull() {
        System.out.println("Error: Insira uma moeda");
    }
  
}
