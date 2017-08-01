/*
 * Decompiled with CFR 0_114.
 */
package br.com.ginfes.tipos_v03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="tcEndereco", propOrder={"endereco", "numero", "complemento", "bairro", "codigoMunicipio", "uf", "cep"})
public class TcEndereco {
    @XmlElement(name="Endereco")
    protected String endereco;
    @XmlElement(name="Numero")
    protected String numero;
    @XmlElement(name="Complemento")
    protected String complemento;
    @XmlElement(name="Bairro")
    protected String bairro;
    @XmlElement(name="CodigoMunicipio")
    protected Integer codigoMunicipio;
    @XmlElement(name="Uf")
    protected String uf;
    @XmlElement(name="Cep")
    protected String cep;

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String value) {
        this.endereco = value;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String value) {
        this.numero = value;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(String value) {
        this.complemento = value;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String value) {
        this.bairro = value;
    }

    public Integer getCodigoMunicipio() {
        return this.codigoMunicipio;
    }

    public void setCodigoMunicipio(Integer value) {
        this.codigoMunicipio = value;
    }

    public String getUf() {
        return this.uf;
    }

    public void setUf(String value) {
        this.uf = value;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String value) {
        this.cep = value;
    }
}