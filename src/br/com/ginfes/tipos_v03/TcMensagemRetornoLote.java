/*
 * Decompiled with CFR 0_114.
 */
package br.com.ginfes.tipos_v03;

import br.com.ginfes.tipos_v03.TcIdentificacaoRps;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="tcMensagemRetornoLote", propOrder={"identificacaoRps", "codigo", "mensagem"})
public class TcMensagemRetornoLote {
    @XmlElement(name="IdentificacaoRps", required=true)
    protected TcIdentificacaoRps identificacaoRps;
    @XmlElement(name="Codigo", required=true)
    protected String codigo;
    @XmlElement(name="Mensagem", required=true)
    protected String mensagem;

    public TcIdentificacaoRps getIdentificacaoRps() {
        return this.identificacaoRps;
    }

    public void setIdentificacaoRps(TcIdentificacaoRps value) {
        this.identificacaoRps = value;
    }

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
}