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
public class MaqRecebeuMoeda extends AStateMaquina {
    
    public MaqRecebeuMoeda(Maquina maquina) {
        super(maquina);
    }

    @Override
    public void verificarMoeda(String moeda) {
        if(moeda.equals("1") && maquina.getQtdGomas()>=1){
           System.out.println("Moeda validada");
           maquina.setState(maquina.getMaqGomaVendida());
        }else{
            if( maquina.getQtdGomas()==0){
                System.out.println("Nao possui gomas: Ejetando modeda");
                maquina.setState(maquina.getMaqGomasAcabaram());
            }else{
                System.out.println("Apenas moedas de 1 real: Ejetando modeda");
                maquina.setState(maquina.getMaqSemMoeda());    
            }
            
        }   
    }

    @Override
    public void alavancaPull() {
        System.out.println("Processando moeda: Aguarde");
    } 
    
}
