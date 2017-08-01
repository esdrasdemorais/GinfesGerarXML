/*
 * Decompiled with CFR 0_114.
 */
package br.com.ginfes.tipos_v03;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="tcInfSubstituicaoNfse", propOrder={"nfseSubstituidora"})
public class TcInfSubstituicaoNfse {
    @XmlElement(name="NfseSubstituidora", required=true)
    protected BigInteger nfseSubstituidora;
    @XmlAttribute(name="Id")
    protected String id;

    public BigInteger getNfseSubstituidora() {
        return this.nfseSubstituidora;
    }

    public void setNfseSubstituidora(BigInteger value) {
        this.nfseSubstituidora = value;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String value) {
        this.id = value;
    }
}