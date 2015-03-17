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
public class MaqGomaVendida extends AStateMaquina {
    private int qtdGomas;
    
    public MaqGomaVendida(Maquina maquina)
    {
        super(maquina);
        this.qtdGomas = maquina.getQtdGomas();
        
    }

    @Override
    public void verificarMoeda(String moeda) {
        System.out.println("Error");
        if(maquina.getQtdGomas() == 0){
            maquina.setState(maquina.getMaqGomasAcabaram());
        }else
            maquina.setState(maquina.getMaqSemMoeda());
    }

    @Override
    public void alavancaPull() {
        qtdGomas-=1;
        System.out.println("Entregar Goma");
        if(0 == qtdGomas){
            maquina.setState(maquina.getMaqGomasAcabaram());
        }else
            maquina.setState(maquina.getMaqSemMoeda());
    }
   
}
