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
@XmlType(name="tcIdentificacaoNfse", propOrder={"numero", "cnpj", "inscricaoMunicipal", "codigoMunicipio"})
public class TcIdentificacaoNfse {
    @XmlElement(name="Numero", required=true)
    protected BigInteger numero;
    @XmlElement(name="Cnpj", required=true)
    protected String cnpj;
    @XmlElement(name="InscricaoMunicipal")
    protected String inscricaoMunicipal;
    @XmlElement(name="CodigoMunicipio")
    protected int codigoMunicipio;

    public BigInteger getNumero() {
        return this.numero;
    }

    public void setNumero(BigInteger value) {
        this.numero = value;
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

    public int getCodigoMunicipio() {
        return this.codigoMunicipio;
    }

    public void setCodigoMunicipio(int value) {
        this.codigoMunicipio = value;
    }
}