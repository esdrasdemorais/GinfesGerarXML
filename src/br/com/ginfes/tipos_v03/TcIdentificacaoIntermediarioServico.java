/*
 * Decompiled with CFR 0_114.
 */
package br.com.ginfes.tipos_v03;

import br.com.ginfes.tipos_v03.TcCpfCnpj;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="tcIdentificacaoIntermediarioServico", propOrder={"razaoSocial", "cpfCnpj", "inscricaoMunicipal"})
public class TcIdentificacaoIntermediarioServico {
    @XmlElement(name="RazaoSocial", required=true)
    protected String razaoSocial;
    @XmlElement(name="CpfCnpj", required=true)
    protected TcCpfCnpj cpfCnpj;
    @XmlElement(name="InscricaoMunicipal")
    protected String inscricaoMunicipal;

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String value) {
        this.razaoSocial = value;
    }

    public TcCpfCnpj getCpfCnpj() {
        return this.cpfCnpj;
    }

    public void setCpfCnpj(TcCpfCnpj value) {
        this.cpfCnpj = value;
    }

    public String getInscricaoMunicipal() {
        return this.inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String value) {
        this.inscricaoMunicipal = value;
    }
}