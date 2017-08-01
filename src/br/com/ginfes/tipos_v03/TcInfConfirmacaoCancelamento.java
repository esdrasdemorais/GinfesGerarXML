/*
 * Decompiled with CFR 0_114.
 */
package br.com.ginfes.tipos_v03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="tcInfConfirmacaoCancelamento", propOrder={"sucesso", "dataHora"})
public class TcInfConfirmacaoCancelamento {
    @XmlElement(name="Sucesso")
    protected boolean sucesso;
    @XmlElement(name="DataHora", required=true)
    @XmlSchemaType(name="dateTime")
    protected XMLGregorianCalendar dataHora;

    public boolean isSucesso() {
        return this.sucesso;
    }

    public void setSucesso(boolean value) {
        this.sucesso = value;
    }

    public XMLGregorianCalendar getDataHora() {
        return this.dataHora;
    }

    public void setDataHora(XMLGregorianCalendar value) {
        this.dataHora = value;
    }
}