package com.posew7.sayisalloto.entity;

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
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "loto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Loto.findAll", query = "SELECT l FROM Loto l")
    , @NamedQuery(name = "Loto.findByNo", query = "SELECT l FROM Loto l WHERE l.no = :no")
    , @NamedQuery(name = "Loto.findByA", query = "SELECT l FROM Loto l WHERE l.a = :a")
    , @NamedQuery(name = "Loto.findByB", query = "SELECT l FROM Loto l WHERE l.b = :b")
    , @NamedQuery(name = "Loto.findByC", query = "SELECT l FROM Loto l WHERE l.c = :c")
    , @NamedQuery(name = "Loto.findByD", query = "SELECT l FROM Loto l WHERE l.d = :d")
    , @NamedQuery(name = "Loto.findByE", query = "SELECT l FROM Loto l WHERE l.e = :e")
    , @NamedQuery(name = "Loto.findByF", query = "SELECT l FROM Loto l WHERE l.f = :f")})
public class Loto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "no")
    private Integer no;
    @Column(name = "a")
    private Integer a;
    @Column(name = "b")
    private Integer b;
    @Column(name = "c")
    private Integer c;
    @Column(name = "d")
    private Integer d;
    @Column(name = "e")
    private Integer e;
    @Column(name = "f")
    private Integer f;

    public Loto() {
    }

    public Loto(Integer no) {
        this.no = no;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    public Integer getD() {
        return d;
    }

    public void setD(Integer d) {
        this.d = d;
    }

    public Integer getE() {
        return e;
    }

    public void setE(Integer e) {
        this.e = e;
    }

    public Integer getF() {
        return f;
    }

    public void setF(Integer f) {
        this.f = f;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (no != null ? no.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Loto)) {
            return false;
        }
        Loto other = (Loto) object;
        if ((this.no == null && other.no != null) || (this.no != null && !this.no.equals(other.no))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.posew7.sayisalloto.entity.Loto[ no=" + no + " ]";
    }

}
