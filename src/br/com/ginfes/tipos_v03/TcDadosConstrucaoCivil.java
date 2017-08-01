/*
 * Decompiled with CFR 0_114.
 */
package br.com.ginfes.tipos_v03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="tcDadosConstrucaoCivil", propOrder={"codigoObra", "art"})
public class TcDadosConstrucaoCivil {
    @XmlElement(name="CodigoObra", required=true)
    protected String codigoObra;
    @XmlElement(name="Art", required=true)
    protected String art;

    public String getCodigoObra() {
        return this.codigoObra;
    }

    public void setCodigoObra(String value) {
        this.codigoObra = value;
    }

    public String getArt() {
        return this.art;
    }

    public void setArt(String value) {
        this.art = value;
    }
}