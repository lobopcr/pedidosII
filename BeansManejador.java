/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import beansmanejadores.PedidoFacadeLocal;
import beanstablas.Pedido;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author user
 */
public class BeansManejador {

    /**
     * Creates a new instance of BeansManejador
     */
    private String nombre ;
    public BeansManejador() {
       nombre = "123" ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
        @EJB
    PedidoFacadeLocal tablaControladora1;
    
    
    public List<Pedido> listaTablas1() {
        return tablaControladora1.findAll();
    }
    
    
    
}
