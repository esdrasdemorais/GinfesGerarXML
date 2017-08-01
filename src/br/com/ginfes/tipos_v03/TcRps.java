/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  org.w3._2000._09.xmldsig_.SignatureType
 */
package br.com.ginfes.tipos_v03;

import br.com.ginfes.tipos_v03.TcInfRps;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3._2000._09.xmldsig_.SignatureType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="tcRps", propOrder={"infRps", "signature"})
public class TcRps {
    @XmlElement(name="InfRps", required=true)
    protected TcInfRps infRps;
    @XmlElement(name="Signature", namespace="http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;

    public TcInfRps getInfRps() {
        return this.infRps;
    }

    public void setInfRps(TcInfRps value) {
        this.infRps = value;
    }

    public SignatureType getSignature() {
        return this.signature;
    }

    public void setSignature(SignatureType value) {
        this.signature = value;
    }
}