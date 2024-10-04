/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinalinteligente;

import sinalinteligente.SinalInteligente.SensorDeTrafego;


class SensorDePedestres implements SensorDeTrafego {
        private int numeroDePedestres;

        public SensorDePedestres(int numeroDePedestres) {
            this.numeroDePedestres = numeroDePedestres;
        }

        @Override
        public boolean detectar() {
            return numeroDePedestres > 0;
        }
    }
