/*
 * Decompiled with CFR 0_114.
 */
package br.com.ginfes.tipos_v03;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="tcValores", propOrder={"valorServicos", "valorDeducoes", "valorPis", "valorCofins", "valorInss", "valorIr", "valorCsll", "issRetido", "valorIss", "valorIssRetido", "outrasRetencoes", "baseCalculo", "aliquota", "valorLiquidoNfse", "descontoIncondicionado", "descontoCondicionado"})
public class TcValores {
    @XmlElement(name="ValorServicos", required=true)
    protected BigDecimal valorServicos;
    @XmlElement(name="ValorDeducoes")
    protected BigDecimal valorDeducoes;
    @XmlElement(name="ValorPis")
    protected BigDecimal valorPis;
    @XmlElement(name="ValorCofins")
    protected BigDecimal valorCofins;
    @XmlElement(name="ValorInss")
    protected BigDecimal valorInss;
    @XmlElement(name="ValorIr")
    protected BigDecimal valorIr;
    @XmlElement(name="ValorCsll")
    protected BigDecimal valorCsll;
    @XmlElement(name="IssRetido")
    protected byte issRetido;
    @XmlElement(name="ValorIss")
    protected BigDecimal valorIss;
    @XmlElement(name="ValorIssRetido")
    protected BigDecimal valorIssRetido;
    @XmlElement(name="OutrasRetencoes")
    protected BigDecimal outrasRetencoes;
    @XmlElement(name="BaseCalculo")
    protected BigDecimal baseCalculo;
    @XmlElement(name="Aliquota")
    protected BigDecimal aliquota;
    @XmlElement(name="ValorLiquidoNfse")
    protected BigDecimal valorLiquidoNfse;
    @XmlElement(name="DescontoIncondicionado")
    protected BigDecimal descontoIncondicionado;
    @XmlElement(name="DescontoCondicionado")
    protected BigDecimal descontoCondicionado;

    public BigDecimal getValorServicos() {
        return this.valorServicos;
    }

    public void setValorServicos(BigDecimal value) {
        this.valorServicos = value;
    }

    public BigDecimal getValorDeducoes() {
        return this.valorDeducoes;
    }

    public void setValorDeducoes(BigDecimal value) {
        this.valorDeducoes = value;
    }

    public BigDecimal getValorPis() {
        return this.valorPis;
    }

    public void setValorPis(BigDecimal value) {
        this.valorPis = value;
    }

    public BigDecimal getValorCofins() {
        return this.valorCofins;
    }

    public void setValorCofins(BigDecimal value) {
        this.valorCofins = value;
    }

    public BigDecimal getValorInss() {
        return this.valorInss;
    }

    public void setValorInss(BigDecimal value) {
        this.valorInss = value;
    }

    public BigDecimal getValorIr() {
        return this.valorIr;
    }

    public void setValorIr(BigDecimal value) {
        this.valorIr = value;
    }

    public BigDecimal getValorCsll() {
        return this.valorCsll;
    }

    public void setValorCsll(BigDecimal value) {
        this.valorCsll = value;
    }

    public byte getIssRetido() {
        return this.issRetido;
    }

    public void setIssRetido(byte value) {
        this.issRetido = value;
    }

    public BigDecimal getValorIss() {
        return this.valorIss;
    }

    public void setValorIss(BigDecimal value) {
        this.valorIss = value;
    }

    public BigDecimal getValorIssRetido() {
        return this.valorIssRetido;
    }

    public void setValorIssRetido(BigDecimal value) {
        this.valorIssRetido = value;
    }

    public BigDecimal getOutrasRetencoes() {
        return this.outrasRetencoes;
    }

    public void setOutrasRetencoes(BigDecimal value) {
        this.outrasRetencoes = value;
    }

    public BigDecimal getBaseCalculo() {
        return this.baseCalculo;
    }

    public void setBaseCalculo(BigDecimal value) {
        this.baseCalculo = value;
    }

    public BigDecimal getAliquota() {
        return this.aliquota;
    }

    public void setAliquota(BigDecimal value) {
        this.aliquota = value;
    }

    public BigDecimal getValorLiquidoNfse() {
        return this.valorLiquidoNfse;
    }

    public void setValorLiquidoNfse(BigDecimal value) {
        this.valorLiquidoNfse = value;
    }

    public BigDecimal getDescontoIncondicionado() {
        return this.descontoIncondicionado;
    }

    public void setDescontoIncondicionado(BigDecimal value) {
        this.descontoIncondicionado = value;
    }

    public BigDecimal getDescontoCondicionado() {
        return this.descontoCondicionado;
    }

    public void setDescontoCondicionado(BigDecimal value) {
        this.descontoCondicionado = value;
    }
}