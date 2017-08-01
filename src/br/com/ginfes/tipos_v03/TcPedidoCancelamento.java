/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  org.w3._2000._09.xmldsig_.SignatureType
 */
package br.com.ginfes.tipos_v03;

import br.com.ginfes.tipos_v03.TcInfPedidoCancelamento;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3._2000._09.xmldsig_.SignatureType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="tcPedidoCancelamento", propOrder={"infPedidoCancelamento", "signature"})
public class TcPedidoCancelamento {
    @XmlElement(name="InfPedidoCancelamento", required=true)
    protected TcInfPedidoCancelamento infPedidoCancelamento;
    @XmlElement(name="Signature", namespace="http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;

    public TcInfPedidoCancelamento getInfPedidoCancelamento() {
        return this.infPedidoCancelamento;
    }

    public void setInfPedidoCancelamento(TcInfPedidoCancelamento value) {
        this.infPedidoCancelamento = value;
    }

    public SignatureType getSignature() {
        return this.signature;
    }

    public void setSignature(SignatureType value) {
        this.signature = value;
    }
}