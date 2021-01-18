/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author NANCY
 */
public class Accion implements Runnable{
    int id;
    JLabel label;
    boolean[] cajeros = new boolean[3];

    public Accion() {
    }
    public Accion(int id, JLabel label, boolean[] cajeros) {
        this.id = id;
        this.label = label;
        this.cajeros = cajeros;
    }
    public void avanzar(Thread hilo, int numeroCajero) {
        
       int tiempoCajero = (int) (Math.random() * (20 - 15 + 1) + 15);
        try {
            
            Thread.sleep(tiempoCajero * 100);
            cajeros[numeroCajero] = false;
        } catch (InterruptedException ex) {
            Logger.getLogger(Accion.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        System.out.println((int) (Math.random() * (20 - 15 + 1) + 15));

    }
    public synchronized void salir(Thread hilo) {
        for (int i = 0; i < 13; i++) {
            notifyAll();
            label.setLocation(label.getLocation().x, label.getLocation().y + 30);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Accion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public synchronized void comenzar() {
        int numeroCajero = 0;
        boolean ocupados = false;
        int ubicacionX = label.getLocation().x;
        int ubicacionY = label.getLocation().y;
        try {
            for (int i = 0; i < 3; i++) {
                if (!cajeros[i]) {
                    numeroCajero = i;
                    ocupados = false;
                    cajeros[i] = true;
                    break;
                } else {
                    ocupados = true;
                }
            }
            if (ocupados) {
                this.wait();
            }
            int tiempoLlegarCajero = (int) (Math.random() * (9 - 7 + 1) + 7);
          
            switch (this.id) {
                case 14 -> {
                    switch (numeroCajero) {
                        case 0 -> {
                            int movimiento = 190 / tiempoLlegarCajero;
                            for (int i = 0; i < tiempoLlegarCajero; i++) {
                                label.setLocation(label.getLocation().x + movimiento, label.getLocation().y);
                                Thread.sleep(308);
                            }
                        }
                        case 1 -> {
                            int movimiento2 = 320 / tiempoLlegarCajero;
                            for (int i = 0; i < tiempoLlegarCajero; i++) {
                                label.setLocation(label.getLocation().x + movimiento2, label.getLocation().y);
                                Thread.sleep(300);
                            }
                        }
                        case 2 -> {
                            int movimiento3 = 450 / tiempoLlegarCajero;
                            for (int i = 0; i < tiempoLlegarCajero; i++) {
                                label.setLocation(label.getLocation().x + movimiento3, label.getLocation().y);
                                Thread.sleep(290);
                            }
                        }
                    }
                }
                case 5 -> {
                    switch (numeroCajero) {
                        case 0 -> {
                            int movimiento = 240 / tiempoLlegarCajero;
                            for (int i = 0; i < tiempoLlegarCajero; i++) {
                                label.setLocation(label.getLocation().x + movimiento, label.getLocation().y);
                                Thread.sleep(310);
                            }
                        }
                        case 1 -> {
                            int movimiento2 = 370 / tiempoLlegarCajero;
                            for (int i = 0; i < tiempoLlegarCajero; i++) {
                                label.setLocation(label.getLocation().x + movimiento2, label.getLocation().y);
                                Thread.sleep(300);
                            }
                        }
                        case 2 -> {
                            int movimiento3 = 500 / tiempoLlegarCajero;
                            for (int i = 0; i < tiempoLlegarCajero; i++) {
                                label.setLocation(label.getLocation().x + movimiento3, label.getLocation().y);
                                Thread.sleep(290);
                            }
                        }
                    }
                }
                default -> {
                    switch (numeroCajero) {
                        case 0 -> {
                            int movimiento = 290 / tiempoLlegarCajero;
                            for (int i = 0; i < tiempoLlegarCajero; i++) {
                                label.setLocation(label.getLocation().x + movimiento, label.getLocation().y);
                                Thread.sleep(310);
                            }
                        }
                        case 1 -> {
                            int movimiento2 = 420 / tiempoLlegarCajero;
                            for (int i = 0; i < tiempoLlegarCajero; i++) {
                                label.setLocation(label.getLocation().x + movimiento2, label.getLocation().y);
                                Thread.sleep(300);
                            }
                        }
                        case 2 -> {
                            int movimiento3 = 550 / tiempoLlegarCajero;
                            for (int i = 0; i < tiempoLlegarCajero; i++) {
                                label.setLocation(label.getLocation().x + movimiento3, label.getLocation().y);
                                Thread.sleep(290);
                            }
                        }
                    }
                }
            }
            this.avanzar(new Thread(this), numeroCajero);
            this.salir(new Thread(this));
            notifyAll();
            label.setLocation(ubicacionX, ubicacionY);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public synchronized void run() {
        boolean b = false;
        while (b == false) {
            comenzar();
        }

    }
}

    
