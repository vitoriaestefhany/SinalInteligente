/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinalinteligente;

import sinalinteligente.SinalInteligente.SensorDeTrafego;


class SensorDeBicicletas implements SensorDeTrafego {
        private int numeroDeBicicletas;

        public SensorDeBicicletas(int numeroDeBicicletas) {
            this.numeroDeBicicletas = numeroDeBicicletas;
        }

        @Override
        public boolean detectar() {
            return numeroDeBicicletas > 0;
        }
    }
