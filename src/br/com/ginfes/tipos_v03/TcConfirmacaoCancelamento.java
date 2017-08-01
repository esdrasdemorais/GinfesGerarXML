/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  br.com.ginfes.tipos_v03.TcInfConfirmacaoCancelamento
 *  br.com.ginfes.tipos_v03.TcPedidoCancelamento
 */
package br.com.ginfes.tipos_v03;

import br.com.ginfes.tipos_v03.TcInfConfirmacaoCancelamento;
import br.com.ginfes.tipos_v03.TcPedidoCancelamento;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="tcConfirmacaoCancelamento", propOrder={"pedido", "infConfirmacaoCancelamento"})
public class TcConfirmacaoCancelamento {
    @XmlElement(name="Pedido", required=true)
    protected TcPedidoCancelamento pedido;
    @XmlElement(name="InfConfirmacaoCancelamento", required=true)
    protected TcInfConfirmacaoCancelamento infConfirmacaoCancelamento;
    @XmlAttribute(name="Id")
    protected String id;

    public TcPedidoCancelamento getPedido() {
        return this.pedido;
    }

    public void setPedido(TcPedidoCancelamento value) {
        this.pedido = value;
    }

    public TcInfConfirmacaoCancelamento getInfConfirmacaoCancelamento() {
        return this.infConfirmacaoCancelamento;
    }

    public void setInfConfirmacaoCancelamento(TcInfConfirmacaoCancelamento value) {
        this.infConfirmacaoCancelamento = value;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String value) {
        this.id = value;
    }
}

