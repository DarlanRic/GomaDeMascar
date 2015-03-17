package br.ifes.edu.poo2.gomademascar.App;

import br.ifes.edu.poo2.gomademascar.control.MaquinaControl;

/**
 *
 * @author Gustavo
 */
public class MainApp {
    public static void main(String[] args) {
        MaquinaControl maquina = new MaquinaControl();
        maquina.startMaquina();
    }
}
