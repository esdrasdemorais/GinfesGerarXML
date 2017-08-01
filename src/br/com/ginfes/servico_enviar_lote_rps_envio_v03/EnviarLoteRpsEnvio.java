// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 29/03/2016 16:30:44
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   EnviarLoteRpsEnvio.java
package br.com.ginfes.servico_enviar_lote_rps_envio_v03;

import br.com.ginfes.tipos_v03.TcLoteRps;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.w3._2000._09.xmldsig_.SignatureType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="", propOrder={"loteRps", "signature"})
@XmlRootElement(name="EnviarLoteRpsEnvio")
public class EnviarLoteRpsEnvio {
    @XmlElement(name="LoteRps", required=true)
    protected TcLoteRps loteRps;
    @XmlElement(name="Signature")
    protected SignatureType signature;

    public TcLoteRps getLoteRps() {
        return this.loteRps;
    }

    public void setLoteRps(TcLoteRps value) {
        this.loteRps = value;
    }

    public SignatureType getSignature() {
        return this.signature;
    }

    public void setSignature(SignatureType value) {
        this.signature = value;
    }
}