

/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  br.com.ginfes.tipos_v03.TcConfirmacaoCancelamento
 *  org.w3._2000._09.xmldsig_.SignatureType
 */
package br.com.ginfes.tipos_v03;

import br.com.ginfes.tipos_v03.TcConfirmacaoCancelamento;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3._2000._09.xmldsig_.SignatureType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="tcCancelamentoNfse", propOrder={"confirmacao", "signature"})
public class TcCancelamentoNfse {
    @XmlElement(name="Confirmacao", required=true)
    protected TcConfirmacaoCancelamento confirmacao;
    @XmlElement(name="Signature", namespace="http://www.w3.org/2000/09/xmldsig#", required=true)
    protected SignatureType signature;

    public TcConfirmacaoCancelamento getConfirmacao() {
        return this.confirmacao;
    }

    public void setConfirmacao(TcConfirmacaoCancelamento value) {
        this.confirmacao = value;
    }

    public SignatureType getSignature() {
        return this.signature;
    }

    public void setSignature(SignatureType value) {
        this.signature = value;
    }
}

