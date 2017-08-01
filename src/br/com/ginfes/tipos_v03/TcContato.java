/*
 * Decompiled with CFR 0_114.
 */
package br.com.ginfes.tipos_v03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="tcContato", propOrder={"telefone", "email"})
public class TcContato {
    @XmlElement(name="Telefone")
    protected String telefone;
    @XmlElement(name="Email")
    protected String email;

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String value) {
        this.telefone = value;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String value) {
        this.email = value;
    }
}

