/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  br.com.ginfes.tipos_v03.TcEndereco
 *  br.com.ginfes.tipos_v03.TcIdentificacaoPrestador
 */
package br.com.ginfes.tipos_v03;

import br.com.ginfes.tipos_v03.TcContato;
import br.com.ginfes.tipos_v03.TcEndereco;
import br.com.ginfes.tipos_v03.TcIdentificacaoPrestador;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="tcDadosPrestador", propOrder={"identificacaoPrestador", "razaoSocial", "nomeFantasia", "endereco", "contato"})
public class TcDadosPrestador {
    @XmlElement(name="IdentificacaoPrestador", required=true)
    protected TcIdentificacaoPrestador identificacaoPrestador;
    @XmlElement(name="RazaoSocial", required=true)
    protected String razaoSocial;
    @XmlElement(name="NomeFantasia")
    protected String nomeFantasia;
    @XmlElement(name="Endereco", required=true)
    protected TcEndereco endereco;
    @XmlElement(name="Contato")
    protected TcContato contato;

    public TcIdentificacaoPrestador getIdentificacaoPrestador() {
        return this.identificacaoPrestador;
    }

    public void setIdentificacaoPrestador(TcIdentificacaoPrestador value) {
        this.identificacaoPrestador = value;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String value) {
        this.razaoSocial = value;
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String value) {
        this.nomeFantasia = value;
    }

    public TcEndereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(TcEndereco value) {
        this.endereco = value;
    }

    public TcContato getContato() {
        return this.contato;
    }

    public void setContato(TcContato value) {
        this.contato = value;
    }
}