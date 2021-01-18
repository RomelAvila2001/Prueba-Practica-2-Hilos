/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NANCY
 */
public abstract class Controlador <T>{
    private List<T> listaGenerica;
    
    public Controlador() {
        listaGenerica = new ArrayList<>();
    }
    
    public void create(T objeto) {
        listaGenerica.add(objeto);
    }
    
    public List<T> getListaGenerica() {
        return listaGenerica;
    }
    
    public void update(T objetoActalizado) {
        for (T objeto : listaGenerica) {
            if (objeto.equals(objetoActalizado)) {
                listaGenerica.set(listaGenerica.indexOf(objeto), objetoActalizado);
            }
        }
    }
}
