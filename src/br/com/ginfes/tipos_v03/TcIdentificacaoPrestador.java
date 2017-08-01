/*
 * Decompiled with CFR 0_114.
 */
package br.com.ginfes.tipos_v03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="tcIdentificacaoPrestador", propOrder={"cnpj", "inscricaoMunicipal"})
public class TcIdentificacaoPrestador {
    @XmlElement(name="Cnpj", required=true)
    protected String cnpj;
    @XmlElement(name="InscricaoMunicipal")
    protected String inscricaoMunicipal;

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
}