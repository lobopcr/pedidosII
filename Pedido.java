/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beanstablas;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p"),
    @NamedQuery(name = "Pedido.findByPedidoCodigo", query = "SELECT p FROM Pedido p WHERE p.pedidoCodigo = :pedidoCodigo"),
    @NamedQuery(name = "Pedido.findByCabeceraCodigo", query = "SELECT p FROM Pedido p WHERE p.cabeceraCodigo = :cabeceraCodigo"),
    @NamedQuery(name = "Pedido.findByProductoCodigo", query = "SELECT p FROM Pedido p WHERE p.productoCodigo = :productoCodigo"),
    @NamedQuery(name = "Pedido.findByCantidad", query = "SELECT p FROM Pedido p WHERE p.cantidad = :cantidad"),
    @NamedQuery(name = "Pedido.findByPrecio", query = "SELECT p FROM Pedido p WHERE p.precio = :precio")})
public class Pedido implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pedido_codigo")
    private Integer pedidoCodigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cabecera_codigo")
    private int cabeceraCodigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "producto_codigo")
    private int productoCodigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private double cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private double precio;

    public Pedido() {
    }

    public Pedido(Integer pedidoCodigo) {
        this.pedidoCodigo = pedidoCodigo;
    }

    public Pedido(Integer pedidoCodigo, int cabeceraCodigo, int productoCodigo, double cantidad, double precio) {
        this.pedidoCodigo = pedidoCodigo;
        this.cabeceraCodigo = cabeceraCodigo;
        this.productoCodigo = productoCodigo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Integer getPedidoCodigo() {
        return pedidoCodigo;
    }

    public void setPedidoCodigo(Integer pedidoCodigo) {
        this.pedidoCodigo = pedidoCodigo;
    }

    public int getCabeceraCodigo() {
        return cabeceraCodigo;
    }

    public void setCabeceraCodigo(int cabeceraCodigo) {
        this.cabeceraCodigo = cabeceraCodigo;
    }

    public int getProductoCodigo() {
        return productoCodigo;
    }

    public void setProductoCodigo(int productoCodigo) {
        this.productoCodigo = productoCodigo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pedidoCodigo != null ? pedidoCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.pedidoCodigo == null && other.pedidoCodigo != null) || (this.pedidoCodigo != null && !this.pedidoCodigo.equals(other.pedidoCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "beanstablas.Pedido[ pedidoCodigo=" + pedidoCodigo + " ]";
    }
    
}
