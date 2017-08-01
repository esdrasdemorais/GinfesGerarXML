/*
 * Decompiled with CFR 0_114.
 */
package br.com.ginfes.tipos_v03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="tcCpfCnpj", propOrder={"cpf", "cnpj"})
public class TcCpfCnpj {
    @XmlElement(name="Cpf")
    protected String cpf;
    @XmlElement(name="Cnpj")
    protected String cnpj;

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String value) {
        this.cpf = value;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String value) {
        this.cnpj = value;
    }
}