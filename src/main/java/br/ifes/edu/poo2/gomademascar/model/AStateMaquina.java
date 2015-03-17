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
public abstract class AStateMaquina implements StateMaquina{
     
    protected Maquina maquina;
    
    public AStateMaquina(Maquina maquina){
        this.maquina = maquina;
    }
    
    @Override
    public abstract void verificarMoeda(String moeda);

    @Override
    public abstract void alavancaPull();
}
