/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beansmanejadores;

import beanstablas.Pedido;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author user
 */
@Stateless
public class PedidoFacade extends AbstractFacade<Pedido> implements PedidoFacadeLocal {
    @PersistenceContext(unitName = "ProyectoPedidosIIIPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PedidoFacade() {
        super(Pedido.class);
    }
    
}
