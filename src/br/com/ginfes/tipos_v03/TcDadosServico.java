/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  br.com.ginfes.tipos_v03.TcValores
 */
package br.com.ginfes.tipos_v03;

import br.com.ginfes.tipos_v03.TcValores;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="tcDadosServico", propOrder={"valores", "itemListaServico", "codigoCnae", "codigoTributacaoMunicipio", "discriminacao", "codigoMunicipio"})
public class TcDadosServico {
    @XmlElement(name="Valores", required=true)
    protected TcValores valores;
    @XmlElement(name="ItemListaServico", required=true)
    protected String itemListaServico;
    @XmlElement(name="CodigoCnae")
    protected Integer codigoCnae;
    @XmlElement(name="CodigoTributacaoMunicipio")
    protected String codigoTributacaoMunicipio;
    @XmlElement(name="Discriminacao", required=true)
    protected String discriminacao;
    @XmlElement(name="CodigoMunicipio")
    protected int codigoMunicipio;

    public TcValores getValores() {
        return this.valores;
    }

    public void setValores(TcValores value) {
        this.valores = value;
    }

    public String getItemListaServico() {
        return this.itemListaServico;
    }

    public void setItemListaServico(String value) {
        this.itemListaServico = value;
    }

    public Integer getCodigoCnae() {
        return this.codigoCnae;
    }

    public void setCodigoCnae(Integer value) {
        this.codigoCnae = value;
    }

    public String getCodigoTributacaoMunicipio() {
        return this.codigoTributacaoMunicipio;
    }

    public void setCodigoTributacaoMunicipio(String value) {
        this.codigoTributacaoMunicipio = value;
    }

    public String getDiscriminacao() {
        return this.discriminacao;
    }

    public void setDiscriminacao(String value) {
        this.discriminacao = value;
    }

    public int getCodigoMunicipio() {
        return this.codigoMunicipio;
    }

    public void setCodigoMunicipio(int value) {
        this.codigoMunicipio = value;
    }
}