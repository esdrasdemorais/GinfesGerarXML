/*
 * Decompiled with CFR 0_114.
 */
package br.com.ginfes.tipos_v03;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="tcIdentificacaoRps", propOrder={"numero", "serie", "tipo"})
public class TcIdentificacaoRps {
    @XmlElement(name="Numero", required=true)
    protected BigInteger numero;
    @XmlElement(name="Serie", required=true)
    protected String serie;
    @XmlElement(name="Tipo")
    protected byte tipo;

    public BigInteger getNumero() {
        return this.numero;
    }

    public void setNumero(BigInteger value) {
        this.numero = value;
    }

    public String getSerie() {
        return this.serie;
    }

    public void setSerie(String value) {
        this.serie = value;
    }

    public byte getTipo() {
        return this.tipo;
    }

    public void setTipo(byte value) {
        this.tipo = value;
    }
}