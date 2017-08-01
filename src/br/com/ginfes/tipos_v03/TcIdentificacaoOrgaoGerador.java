/*
 * Decompiled with CFR 0_114.
 */
package br.com.ginfes.tipos_v03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="tcIdentificacaoOrgaoGerador", propOrder={"codigoMunicipio", "uf"})
public class TcIdentificacaoOrgaoGerador {
    @XmlElement(name="CodigoMunicipio")
    protected int codigoMunicipio;
    @XmlElement(name="Uf", required=true)
    protected String uf;

    public int getCodigoMunicipio() {
        return this.codigoMunicipio;
    }

    public void setCodigoMunicipio(int value) {
        this.codigoMunicipio = value;
    }

    public String getUf() {
        return this.uf;
    }

    public void setUf(String value) {
        this.uf = value;
    }
}