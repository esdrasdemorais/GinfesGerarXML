/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  org.w3._2000._09.xmldsig_.SignatureType
 */
package br.com.ginfes.tipos_v03;

import br.com.ginfes.tipos_v03.TcInfSubstituicaoNfse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3._2000._09.xmldsig_.SignatureType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="tcSubstituicaoNfse", propOrder={"substituicaoNfse", "signature"})
public class TcSubstituicaoNfse {
    @XmlElement(name="SubstituicaoNfse", required=true)
    protected TcInfSubstituicaoNfse substituicaoNfse;
    @XmlElement(name="Signature", namespace="http://www.w3.org/2000/09/xmldsig#", required=true)
    protected List<SignatureType> signature;

    public TcInfSubstituicaoNfse getSubstituicaoNfse() {
        return this.substituicaoNfse;
    }

    public void setSubstituicaoNfse(TcInfSubstituicaoNfse value) {
        this.substituicaoNfse = value;
    }

    public List<SignatureType> getSignature() {
        if (this.signature == null) {
            this.signature = new ArrayList<SignatureType>();
        }
        return this.signature;
    }
}