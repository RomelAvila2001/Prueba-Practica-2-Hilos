/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.vista.VentanaPrincipal;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NANCY
 */
public class Cliente implements Runnable{
    private int id;
    private Cuenta cuenta;
    int cantidad;

    public Cliente(int id,Cuenta cuenta, int cantidad) {
        this.id=id;
        this.cuenta = cuenta;
        this.cantidad = cantidad;
    }
    
    public Cliente(Cuenta cuenta, int cantidad) {
        this.cuenta = cuenta;
        this.cantidad = cantidad;
    } 

    public Cliente(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", cuenta=" + cuenta + ", cantidad=" + cantidad + '}';
    }

    @Override
    public void run() {
        cuenta.hacerMovimiento(cantidad);
        
    }
}
