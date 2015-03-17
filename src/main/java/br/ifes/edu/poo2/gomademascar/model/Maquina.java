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
public interface Maquina {
    
    public void pull();
    public void inserirMoeda(String moeda);
    public void setState(StateMaquina maquina);
    public StateMaquina getMaqSemMoeda();
    public StateMaquina getMaqRecebeuMoeda();
    public StateMaquina getMaqGomasAcabaram();
    public StateMaquina getMaqGomaVendida();
    public int getQtdGomas();
    public void setQtdGomas(int qtd);
    
}
