/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  org.w3._2000._09.xmldsig_.SignatureType
 */
package br.com.ginfes.tipos_v03;

import br.com.ginfes.tipos_v03.TcInfNfse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3._2000._09.xmldsig_.SignatureType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="tcNfse", propOrder={"infNfse", "signature"})
public class TcNfse {
    @XmlElement(name="InfNfse", required=true)
    protected TcInfNfse infNfse;
    @XmlElement(name="Signature", namespace="http://www.w3.org/2000/09/xmldsig#", required=true)
    protected List<SignatureType> signature;

    public TcInfNfse getInfNfse() {
        return this.infNfse;
    }

    public void setInfNfse(TcInfNfse value) {
        this.infNfse = value;
    }

    public List<SignatureType> getSignature() {
        if (this.signature == null) {
            this.signature = new ArrayList<SignatureType>();
        }
        return this.signature;
    }
}