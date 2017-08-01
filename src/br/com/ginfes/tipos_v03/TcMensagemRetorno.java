/*
 * Decompiled with CFR 0_114.
 */
package br.com.ginfes.tipos_v03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="tcMensagemRetorno", propOrder={"codigo", "mensagem", "correcao"})
public class TcMensagemRetorno {
    @XmlElement(name="Codigo", required=true)
    protected String codigo;
    @XmlElement(name="Mensagem", required=true)
    protected String mensagem;
    @XmlElement(name="Correcao")
    protected String correcao;

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String value) {
        this.codigo = value;
    }

    public String getMensagem() {
        return this.mensagem;
    }

    public void setMensagem(String value) {
        this.mensagem = value;
    }

    public String getCorrecao() {
        return this.correcao;
    }

    public void setCorrecao(String value) {
        this.correcao = value;
    }
}