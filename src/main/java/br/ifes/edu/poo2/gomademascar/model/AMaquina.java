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
public abstract class AMaquina implements Maquina {
    
    private StateMaquina atualEstado;
    private StateMaquina maqSemMoeda;
    private StateMaquina maqRecebeuMoeda;
    private StateMaquina maqGomasAcabaram;
    private StateMaquina maqGomaVendida;
    private int qtdGomas;
    
    public AMaquina(){
        maqSemMoeda = new MaqSemMoeda(this);
        maqRecebeuMoeda = new MaqRecebeuMoeda(this);
        maqGomasAcabaram = new MaqGomasAcabaram(this);
        maqGomaVendida = new MaqGomaVendida(this);
        setState(maqSemMoeda);
    }
    
    public void pull(){
        atualEstado.alavancaPull();
    }
    
    public void inserirMoeda(String moeda){
        atualEstado.verificarMoeda(moeda);
    }
    
    public int getQtdGomas() {
        return qtdGomas;
    }

    public void setQtdGomas(int qtdGomas) {
        this.qtdGomas = qtdGomas;
    }
    
    public void setState(StateMaquina novoEstado){
        this.atualEstado = novoEstado;
    }
    
    public StateMaquina getMaqSemMoeda() {
        return maqSemMoeda;
    }

    public StateMaquina getMaqRecebeuMoeda() {
        return maqRecebeuMoeda;
    }

    public StateMaquina getMaqGomasAcabaram() {
        return maqGomasAcabaram;
    }

    public StateMaquina getMaqGomaVendida() {
        return maqGomaVendida;
    }
 
}
