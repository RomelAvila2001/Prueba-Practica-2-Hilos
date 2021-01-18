/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.Controlador;
import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Cuenta;

/**
 *
 * @author NANCY
 */
public class prueba {
    public static void main(String[] args) throws InterruptedException{
        
        ControladorCliente controlador= new ControladorCliente();
        
        for (int i = 0; i < 100; i++) {
            Cuenta cuenta = new Cuenta (100);
            Cliente cliente = new Cliente(i, cuenta,0);
            controlador.create(cliente);  
            //System.out.println(cliente);
        }
        
        
        for (Cliente c : controlador.getListaGenerica()) {
            if(c.getId()<40){
                Cliente ingresa = new Cliente(c.getId(),c.getCuenta(), 100);
                Thread hilosIngresan100= new Thread(ingresa);
                hilosIngresan100.start();
                controlador.update(ingresa);

            }
            if(c.getId()>39 && c.getId()<60){
                Cliente ingresa = new Cliente(c.getId(),c.getCuenta(), 50);
                Thread hilosIngresan50= new Thread(ingresa);
                hilosIngresan50.start();
                controlador.update(ingresa);

            }
            if(c.getId()>59){
                Cliente ingresa = new Cliente(c.getId(),c.getCuenta(), 20);
                Thread hilosIngresan20= new Thread(ingresa);
                hilosIngresan20.start();
                controlador.update(ingresa);

            }
             if(c.getId()>39 && c.getId()<60){
                Cliente ingresa = new Cliente(c.getId(),c.getCuenta(), 20);
                Thread hilosIngresan20= new Thread(ingresa);
                hilosIngresan20.start();

            }
        }
        
        for (Cliente cliente : controlador.getListaGenerica()) {
            System.out.println(cliente);
        }
        
        for (Cliente c : controlador.getListaGenerica()) {
            if(c.getId()<40){
                Cliente retirar = new Cliente(c.getId(),c.getCuenta(), -100);
                Thread hilosIngresan100= new Thread(retirar);
                hilosIngresan100.start();
                controlador.update(retirar);

            }
            if(c.getId()>39 && c.getId()<60){
                Cliente retirar = new Cliente(c.getId(),c.getCuenta(), -50);
                Thread hilosIngresan50= new Thread(retirar);
                hilosIngresan50.start();
                controlador.update(retirar);

            }
            if(c.getId()>59){
                Cliente retirar = new Cliente(c.getId(),c.getCuenta(), -20);
                Thread hilosIngresan20= new Thread(retirar);
                hilosIngresan20.start();
                controlador.update(retirar);

            }
             if(c.getId()>39 && c.getId()<60){
                Cliente retirar = new Cliente(c.getId(),c.getCuenta(), -20);
                Thread hilosIngresan20= new Thread(retirar);
                hilosIngresan20.start();
                controlador.update(retirar);

            }
        }
        
        for (Cliente cliente : controlador.getListaGenerica()) {
            System.out.println(cliente);
        }
        
        
        System.out.println(controlador.getListaGenerica());

    }
}
