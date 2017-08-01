/*
 * Decompiled with CFR 0_114.
 */
package br.com.ginfes.tipos_v03;

import br.com.ginfes.tipos_v03.TcDadosConstrucaoCivil;
import br.com.ginfes.tipos_v03.TcDadosPrestador;
import br.com.ginfes.tipos_v03.TcDadosServico;
import br.com.ginfes.tipos_v03.TcDadosTomador;
import br.com.ginfes.tipos_v03.TcIdentificacaoIntermediarioServico;
import br.com.ginfes.tipos_v03.TcIdentificacaoOrgaoGerador;
import br.com.ginfes.tipos_v03.TcIdentificacaoRps;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="tcInfNfse", propOrder={"numero", "codigoVerificacao", "dataEmissao", "identificacaoRps", "dataEmissaoRps", "naturezaOperacao", "regimeEspecialTributacao", "optanteSimplesNacional", "incentivadorCultural", "competencia", "nfseSubstituida", "outrasInformacoes", "servico", "valorCredito", "prestadorServico", "tomadorServico", "intermediarioServico", "orgaoGerador", "construcaoCivil"})
public class TcInfNfse {
    @XmlElement(name="Numero", required=true)
    protected BigInteger numero;
    @XmlElement(name="CodigoVerificacao", required=true)
    protected String codigoVerificacao;
    @XmlElement(name="DataEmissao", required=true)
    @XmlSchemaType(name="dateTime")
    protected XMLGregorianCalendar dataEmissao;
    @XmlElement(name="IdentificacaoRps")
    protected TcIdentificacaoRps identificacaoRps;
    @XmlElement(name="DataEmissaoRps")
    @XmlSchemaType(name="date")
    protected XMLGregorianCalendar dataEmissaoRps;
    @XmlElement(name="NaturezaOperacao")
    protected byte naturezaOperacao;
    @XmlElement(name="RegimeEspecialTributacao")
    protected Byte regimeEspecialTributacao;
    @XmlElement(name="OptanteSimplesNacional")
    protected byte optanteSimplesNacional;
    @XmlElement(name="IncentivadorCultural")
    protected byte incentivadorCultural;
    @XmlElement(name="Competencia", required=true)
    @XmlSchemaType(name="date")
    protected XMLGregorianCalendar competencia;
    @XmlElement(name="NfseSubstituida")
    protected BigInteger nfseSubstituida;
    @XmlElement(name="OutrasInformacoes")
    protected String outrasInformacoes;
    @XmlElement(name="Servico", required=true)
    protected TcDadosServico servico;
    @XmlElement(name="ValorCredito")
    protected BigDecimal valorCredito;
    @XmlElement(name="PrestadorServico", required=true)
    protected TcDadosPrestador prestadorServico;
    @XmlElement(name="TomadorServico", required=true)
    protected TcDadosTomador tomadorServico;
    @XmlElement(name="IntermediarioServico")
    protected TcIdentificacaoIntermediarioServico intermediarioServico;
    @XmlElement(name="OrgaoGerador", required=true)
    protected TcIdentificacaoOrgaoGerador orgaoGerador;
    @XmlElement(name="ConstrucaoCivil")
    protected TcDadosConstrucaoCivil construcaoCivil;
    @XmlAttribute(name="Id")
    protected String id;

    public BigInteger getNumero() {
        return this.numero;
    }

    public void setNumero(BigInteger value) {
        this.numero = value;
    }

    public String getCodigoVerificacao() {
        return this.codigoVerificacao;
    }

    public void setCodigoVerificacao(String value) {
        this.codigoVerificacao = value;
    }

    public XMLGregorianCalendar getDataEmissao() {
        return this.dataEmissao;
    }

    public void setDataEmissao(XMLGregorianCalendar value) {
        this.dataEmissao = value;
    }

    public TcIdentificacaoRps getIdentificacaoRps() {
        return this.identificacaoRps;
    }

    public void setIdentificacaoRps(TcIdentificacaoRps value) {
        this.identificacaoRps = value;
    }

    public XMLGregorianCalendar getDataEmissaoRps() {
        return this.dataEmissaoRps;
    }

    public void setDataEmissaoRps(XMLGregorianCalendar value) {
        this.dataEmissaoRps = value;
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

    public XMLGregorianCalendar getCompetencia() {
        return this.competencia;
    }

    public void setCompetencia(XMLGregorianCalendar value) {
        this.competencia = value;
    }

    public BigInteger getNfseSubstituida() {
        return this.nfseSubstituida;
    }

    public void setNfseSubstituida(BigInteger value) {
        this.nfseSubstituida = value;
    }

    public String getOutrasInformacoes() {
        return this.outrasInformacoes;
    }

    public void setOutrasInformacoes(String value) {
        this.outrasInformacoes = value;
    }

    public TcDadosServico getServico() {
        return this.servico;
    }

    public void setServico(TcDadosServico value) {
        this.servico = value;
    }

    public BigDecimal getValorCredito() {
        return this.valorCredito;
    }

    public void setValorCredito(BigDecimal value) {
        this.valorCredito = value;
    }

    public TcDadosPrestador getPrestadorServico() {
        return this.prestadorServico;
    }

    public void setPrestadorServico(TcDadosPrestador value) {
        this.prestadorServico = value;
    }

    public TcDadosTomador getTomadorServico() {
        return this.tomadorServico;
    }

    public void setTomadorServico(TcDadosTomador value) {
        this.tomadorServico = value;
    }

    public TcIdentificacaoIntermediarioServico getIntermediarioServico() {
        return this.intermediarioServico;
    }

    public void setIntermediarioServico(TcIdentificacaoIntermediarioServico value) {
        this.intermediarioServico = value;
    }

    public TcIdentificacaoOrgaoGerador getOrgaoGerador() {
        return this.orgaoGerador;
    }

    public void setOrgaoGerador(TcIdentificacaoOrgaoGerador value) {
        this.orgaoGerador = value;
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