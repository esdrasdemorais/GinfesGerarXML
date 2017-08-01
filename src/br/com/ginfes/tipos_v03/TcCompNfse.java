/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  br.com.ginfes.tipos_v03.TcNfse
 *  br.com.ginfes.tipos_v03.TcSubstituicaoNfse
 */
package br.com.ginfes.tipos_v03;

import br.com.ginfes.tipos_v03.TcCancelamentoNfse;
import br.com.ginfes.tipos_v03.TcNfse;
import br.com.ginfes.tipos_v03.TcSubstituicaoNfse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="tcCompNfse", propOrder={"nfse", "nfseCancelamento", "nfseSubstituicao"})
public class TcCompNfse {
    @XmlElement(name="Nfse", required=true)
    protected TcNfse nfse;
    @XmlElement(name="NfseCancelamento")
    protected TcCancelamentoNfse nfseCancelamento;
    @XmlElement(name="NfseSubstituicao")
    protected TcSubstituicaoNfse nfseSubstituicao;

    public TcNfse getNfse() {
        return this.nfse;
    }

    public void setNfse(TcNfse value) {
        this.nfse = value;
    }

    public TcCancelamentoNfse getNfseCancelamento() {
        return this.nfseCancelamento;
    }

    public void setNfseCancelamento(TcCancelamentoNfse value) {
        this.nfseCancelamento = value;
    }

    public TcSubstituicaoNfse getNfseSubstituicao() {
        return this.nfseSubstituicao;
    }

    public void setNfseSubstituicao(TcSubstituicaoNfse value) {
        this.nfseSubstituicao = value;
    }
}