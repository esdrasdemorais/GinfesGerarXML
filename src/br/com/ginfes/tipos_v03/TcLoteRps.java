// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 29/03/2016 16:30:44
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   TcLoteRps.java

package br.com.ginfes.tipos_v03;

import br.com.ginfes.tipos_v03.TcLoteRps;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.ginfes.tipos_v03.TcLoteRps;
import br.com.ginfes.tipos_v03.TcRps;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="tcLoteRps", propOrder={"numeroLote", "cnpj", "inscricaoMunicipal", "quantidadeRps", "listaRps"})
public class TcLoteRps {
    @XmlElement(name="NumeroLote", required=true)
    protected BigInteger numeroLote;
    @XmlElement(name="Cnpj", required=true)
    protected String cnpj;
    @XmlElement(name="InscricaoMunicipal", required=true)
    protected String inscricaoMunicipal;
    @XmlElement(name="QuantidadeRps")
    protected int quantidadeRps;
    @XmlElement(name="ListaRps", required=true)
    protected ListaRps listaRps;
    @XmlAttribute(name="Id")
    protected String id;

    @XmlAccessorType(value=XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"rps"})
    public static class ListaRps {
        @XmlElement(name="Rps", required=true)
        protected List<TcRps> rps;

        public List<TcRps> getRps() {
            if (this.rps == null) {
                this.rps = new ArrayList<TcRps>();
            }
            return this.rps;
        }
    }
    
    public BigInteger getNumeroLote() {
        return this.numeroLote;
    }

    public void setNumeroLote(BigInteger value) {
        this.numeroLote = value;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String value) {
        this.cnpj = value;
    }

    public String getInscricaoMunicipal() {
        return this.inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String value) {
        this.inscricaoMunicipal = value;
    }

    public int getQuantidadeRps() {
        return this.quantidadeRps;
    }

    public void setQuantidadeRps(int value) {
        this.quantidadeRps = value;
    }

    public ListaRps getListaRps() {
        return this.listaRps;
    }

    public void setListaRps(ListaRps value) {
        this.listaRps = value;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String value) {
        this.id = value;
    }
}