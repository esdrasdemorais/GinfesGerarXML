/*
 * Decompiled with CFR 0_114.
 */
package br.com.ginfes.tipos_v03;

import br.com.ginfes.tipos_v03.TcIdentificacaoNfse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="tcInfPedidoCancelamento", propOrder={"identificacaoNfse", "codigoCancelamento"})
public class TcInfPedidoCancelamento {
    @XmlElement(name="IdentificacaoNfse", required=true)
    protected TcIdentificacaoNfse identificacaoNfse;
    @XmlElement(name="CodigoCancelamento", required=true)
    protected String codigoCancelamento;
    @XmlAttribute(name="Id")
    protected String id;

    public TcIdentificacaoNfse getIdentificacaoNfse() {
        return this.identificacaoNfse;
    }

    public void setIdentificacaoNfse(TcIdentificacaoNfse value) {
        this.identificacaoNfse = value;
    }

    public String getCodigoCancelamento() {
        return this.codigoCancelamento;
    }

    public void setCodigoCancelamento(String value) {
        this.codigoCancelamento = value;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String value) {
        this.id = value;
    }
}