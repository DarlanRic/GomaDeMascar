/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.gomademascar.control;

import br.ifes.edu.poo2.gomademascar.model.Maquina;
import br.ifes.edu.poo2.gomademascar.model.MaquinaImpl;

/**
 *
 * @author Gustavo
 */
public class MaquinaControl {
    private Maquina maquina = new MaquinaImpl();
    public void startMaquina(){
        maquina.setQtdGomas(0);
        maquina.inserirMoeda("1");
        maquina.pull();
    }
}
