/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import beansmanejadores.PedidoFacadeLocal;
import beanstablas.Pedido;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author user
 */

@Stateless
public class PedidoObjeto implements PedidoObjetoLocal{
   
      @EJB
    PedidoFacadeLocal tablaControladora ;
    
    
    public List<Pedido> listaTablasx() {
        return tablaControladora.findAll();
    }
    
    
}

