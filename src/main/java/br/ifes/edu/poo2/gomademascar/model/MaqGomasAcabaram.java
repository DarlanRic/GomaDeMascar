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
public class MaqGomasAcabaram extends AStateMaquina {

    public MaqGomasAcabaram(Maquina maquina) {
        super(maquina);
    }

    @Override
    public void verificarMoeda(String moeda) {
        System.out.println("Error: Acabaram as Gomas ejetar moeda");
        maquina.setState(maquina.getMaqSemMoeda());
    }

    @Override
    public void alavancaPull() {
        System.out.println("Error: Insiera Moeda");
        maquina.setState(maquina.getMaqSemMoeda());
    }
    
   
    
}
