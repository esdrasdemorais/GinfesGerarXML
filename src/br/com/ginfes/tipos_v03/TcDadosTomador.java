/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  br.com.ginfes.tipos_v03.TcEndereco
 *  br.com.ginfes.tipos_v03.TcIdentificacaoTomador
 */
package br.com.ginfes.tipos_v03;

import br.com.ginfes.tipos_v03.TcContato;
import br.com.ginfes.tipos_v03.TcEndereco;
import br.com.ginfes.tipos_v03.TcIdentificacaoTomador;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="tcDadosTomador", propOrder={"identificacaoTomador", "razaoSocial", "endereco", "contato"})
public class TcDadosTomador {
    @XmlElement(name="IdentificacaoTomador")
    protected TcIdentificacaoTomador identificacaoTomador;
    @XmlElement(name="RazaoSocial")
    protected String razaoSocial;
    @XmlElement(name="Endereco")
    protected TcEndereco endereco;
    @XmlElement(name="Contato")
    protected TcContato contato;

    public TcIdentificacaoTomador getIdentificacaoTomador() {
        return this.identificacaoTomador;
    }

    public void setIdentificacaoTomador(TcIdentificacaoTomador value) {
        this.identificacaoTomador = value;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String value) {
        this.razaoSocial = value;
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