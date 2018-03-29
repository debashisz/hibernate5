/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaduck.hibernate5;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author debas
 */
@Entity
@Table(name = "order_detail", catalog = "ecommerce", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrderDetail.findAll", query = "SELECT o FROM OrderDetail o")
    , @NamedQuery(name = "OrderDetail.findByOrderDetailId", query = "SELECT o FROM OrderDetail o WHERE o.orderDetailId = :orderDetailId")
    , @NamedQuery(name = "OrderDetail.findByUniqueOrderCode", query = "SELECT o FROM OrderDetail o WHERE o.uniqueOrderCode = :uniqueOrderCode")
    , @NamedQuery(name = "OrderDetail.findByProductid", query = "SELECT o FROM OrderDetail o WHERE o.productid = :productid")
    , @NamedQuery(name = "OrderDetail.findByCustomerid", query = "SELECT o FROM OrderDetail o WHERE o.customerid = :customerid")
    , @NamedQuery(name = "OrderDetail.findByQuantity", query = "SELECT o FROM OrderDetail o WHERE o.quantity = :quantity")
    , @NamedQuery(name = "OrderDetail.findByPrice", query = "SELECT o FROM OrderDetail o WHERE o.price = :price")
    , @NamedQuery(name = "OrderDetail.findByTimestamp", query = "SELECT o FROM OrderDetail o WHERE o.timestamp = :timestamp")})
public class OrderDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "order_detail_id")
    private Integer orderDetailId;

    @Basic(optional = false)
    @Column(name = "unique_order_code")
    private String uniqueOrderCode;
    
    @Basic(optional = false)
    @Column(name = "productid")
    private int productid;
    
    @Basic(optional = false)
    @Column(name = "customerid")
    private int customerid;
    @Basic(optional = false)
    @Column(name = "quantity")
    private int quantity;
    @Basic(optional = false)
    @Column(name = "price")
    private float price;
    @Basic(optional = false)
    @Column(name = "timestamp")
    @Temporal(TemporalType.DATE)
    private Date timestamp;

    public OrderDetail() {
    }

    public OrderDetail(Integer orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public OrderDetail(Integer orderDetailId, String uniqueOrderCode, int productid, int customerid, int quantity, float price, Date timestamp) {
        this.orderDetailId = orderDetailId;

        this.uniqueOrderCode = uniqueOrderCode;
        this.productid = productid;
        this.customerid = customerid;
        this.quantity = quantity;
        this.price = price;
        this.timestamp = timestamp;
    }

    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Integer orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getUniqueOrderCode() {
        return uniqueOrderCode;
    }

    public void setUniqueOrderCode(String uniqueOrderCode) {
        this.uniqueOrderCode = uniqueOrderCode;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderDetailId != null ? orderDetailId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderDetail)) {
            return false;
        }
        OrderDetail other = (OrderDetail) object;
        if ((this.orderDetailId == null && other.orderDetailId != null) || (this.orderDetailId != null && !this.orderDetailId.equals(other.orderDetailId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.javaduck.mavenproject2.OrderDetail[ orderDetailId=" + orderDetailId + " ]";
    }

}
