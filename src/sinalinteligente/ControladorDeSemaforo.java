/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinalinteligente;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import sinalinteligente.SinalInteligente.SensorDeTrafego;

    class ControladorDeSemaforo {
        private List<SensorDeTrafego> sensores;

        public ControladorDeSemaforo() {
            sensores = new ArrayList<>();
        }

        public void adicionarSensor(SensorDeTrafego sensor) {
            sensores.add(sensor);
        }

        public String determinarEstadoDoSinal(int tempo) {
            boolean veiculosPresentes = sensores.stream()
                    .filter(sensor -> sensor instanceof SensorDeVeiculos || sensor instanceof SensorDeBicicletas)
                    .anyMatch(SensorDeTrafego::detectar);

            if (tempo >= 30 && veiculosPresentes) {
                return "vermelho";
            } else if (tempo >= 20 && veiculosPresentes) {
                return "amarelo";
            } else {
                return "verde";
            }
        }

        public String determinarEstadoDoSinal(double pedestres) {
            boolean pedestresPresentes = sensores.stream()
                    .filter(sensor -> sensor instanceof SensorDePedestres)
                    .anyMatch(SensorDeTrafego::detectar);

            if (pedestres >= 30 && pedestresPresentes) {
                return "vermelho";
            } else if (pedestres >= 20 && pedestresPresentes) {
                return "amarelo";
            } else {
                return "verde";
            }
        }
    }