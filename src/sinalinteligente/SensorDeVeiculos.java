/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinalinteligente;

import sinalinteligente.SinalInteligente.SensorDeTrafego;

 class SensorDeVeiculos implements SensorDeTrafego {
        private int numeroDeVeiculos;

        public SensorDeVeiculos(int numeroDeVeiculos) {
            this.numeroDeVeiculos = numeroDeVeiculos;
        }

        @Override
        public boolean detectar() {
            return numeroDeVeiculos > 0;
        }
    }