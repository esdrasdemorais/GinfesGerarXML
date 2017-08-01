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
@XmlType(name="tcIdentificacaoTomador", propOrder={"cpfCnpj", "inscricaoMunicipal"})
public class TcIdentificacaoTomador {
    @XmlElement(name="CpfCnpj")
    protected TcCpfCnpj cpfCnpj;
    @XmlElement(name="InscricaoMunicipal")
    protected String inscricaoMunicipal;

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