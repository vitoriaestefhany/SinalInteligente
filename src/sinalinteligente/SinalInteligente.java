/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sinalinteligente;

import java.util.ArrayList;
import java.util.List;

public class SinalInteligente {

 interface SensorDeTrafego {
        boolean detectar();
    }
 
public static void main(String[] args) {
        ControladorDeSemaforo controlador = new ControladorDeSemaforo();

        controlador.adicionarSensor(new SensorDeVeiculos(5));
        controlador.adicionarSensor(new SensorDePedestres(2));
        controlador.adicionarSensor(new SensorDeBicicletas(1));

        int tempo = 30;
        double pedestres = 20;
        String estadoDoSinal = controlador.determinarEstadoDoSinal(tempo);
        String estadoDoSinalPedestres = controlador.determinarEstadoDoSinal(pedestres);

        System.out.println("O sinal dos veiculos esta " + estadoDoSinal);
        System.out.println("O sinal dos pedestres esta " + estadoDoSinalPedestres);
    }
}

