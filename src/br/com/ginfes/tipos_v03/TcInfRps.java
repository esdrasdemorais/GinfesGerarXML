/*
 * Decompiled with CFR 0_114.
 */
package br.com.ginfes.tipos_v03;

import br.com.ginfes.tipos_v03.TcDadosConstrucaoCivil;
import br.com.ginfes.tipos_v03.TcDadosServico;
import br.com.ginfes.tipos_v03.TcDadosTomador;
import br.com.ginfes.tipos_v03.TcIdentificacaoIntermediarioServico;
import br.com.ginfes.tipos_v03.TcIdentificacaoPrestador;
import br.com.ginfes.tipos_v03.TcIdentificacaoRps;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="tcInfRps", propOrder={"identificacaoRps", "dataEmissao", "naturezaOperacao", "regimeEspecialTributacao", "optanteSimplesNacional", "incentivadorCultural", "status", "rpsSubstituido", "servico", "prestador", "tomador", "intermediarioServico", "construcaoCivil"})
public class TcInfRps {
    @XmlElement(name="IdentificacaoRps", required=true)
    protected TcIdentificacaoRps identificacaoRps;
    @XmlElement(name="DataEmissao", required=true)
    @XmlSchemaType(name="dateTime")
    protected XMLGregorianCalendar dataEmissao;
    @XmlElement(name="NaturezaOperacao")
    protected byte naturezaOperacao;
    @XmlElement(name="RegimeEspecialTributacao")
    protected Byte regimeEspecialTributacao;
    @XmlElement(name="OptanteSimplesNacional")
    protected byte optanteSimplesNacional;
    @XmlElement(name="IncentivadorCultural")
    protected byte incentivadorCultural;
    @XmlElement(name="Status")
    protected byte status;
    @XmlElement(name="RpsSubstituido")
    protected TcIdentificacaoRps rpsSubstituido;
    @XmlElement(name="Servico", required=true)
    protected TcDadosServico servico;
    @XmlElement(name="Prestador", required=true)
    protected TcIdentificacaoPrestador prestador;
    @XmlElement(name="Tomador", required=true)
    protected TcDadosTomador tomador;
    @XmlElement(name="IntermediarioServico")
    protected TcIdentificacaoIntermediarioServico intermediarioServico;
    @XmlElement(name="ConstrucaoCivil")
    protected TcDadosConstrucaoCivil construcaoCivil;
    @XmlAttribute(name="Id")
    protected String id;

    public TcIdentificacaoRps getIdentificacaoRps() {
        return this.identificacaoRps;
    }

    public void setIdentificacaoRps(TcIdentificacaoRps value) {
        this.identificacaoRps = value;
    }

    public XMLGregorianCalendar getDataEmissao() {
        return this.dataEmissao;
    }

    public void setDataEmissao(XMLGregorianCalendar value) {
        this.dataEmissao = value;
    }

    public byte getNaturezaOperacao() {
        return this.naturezaOperacao;
    }

    public void setNaturezaOperacao(byte value) {
        this.naturezaOperacao = value;
    }

    public Byte getRegimeEspecialTributacao() {
        return this.regimeEspecialTributacao;
    }

    public void setRegimeEspecialTributacao(Byte value) {
        this.regimeEspecialTributacao = value;
    }

    public byte getOptanteSimplesNacional() {
        return this.optanteSimplesNacional;
    }

    public void setOptanteSimplesNacional(byte value) {
        this.optanteSimplesNacional = value;
    }

    public byte getIncentivadorCultural() {
        return this.incentivadorCultural;
    }

    public void setIncentivadorCultural(byte value) {
        this.incentivadorCultural = value;
    }

    public byte getStatus() {
        return this.status;
    }

    public void setStatus(byte value) {
        this.status = value;
    }

    public TcIdentificacaoRps getRpsSubstituido() {
        return this.rpsSubstituido;
    }

    public void setRpsSubstituido(TcIdentificacaoRps value) {
        this.rpsSubstituido = value;
    }

    public TcDadosServico getServico() {
        return this.servico;
    }

    public void setServico(TcDadosServico value) {
        this.servico = value;
    }

    public TcIdentificacaoPrestador getPrestador() {
        return this.prestador;
    }

    public void setPrestador(TcIdentificacaoPrestador value) {
        this.prestador = value;
    }

    public TcDadosTomador getTomador() {
        return this.tomador;
    }

    public void setTomador(TcDadosTomador value) {
        this.tomador = value;
    }

    public TcIdentificacaoIntermediarioServico getIntermediarioServico() {
        return this.intermediarioServico;
    }

    public void setIntermediarioServico(TcIdentificacaoIntermediarioServico value) {
        this.intermediarioServico = value;
    }

    public TcDadosConstrucaoCivil getConstrucaoCivil() {
        return this.construcaoCivil;
    }

    public void setConstrucaoCivil(TcDadosConstrucaoCivil value) {
        this.construcaoCivil = value;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String value) {
        this.id = value;
    }
}