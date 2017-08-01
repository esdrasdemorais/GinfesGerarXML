/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  br.com.ginfes.tipos_v03.TcMensagemRetorno
 */
package br.com.ginfes.tipos_v03;

import br.com.ginfes.tipos_v03.TcMensagemRetorno;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="", propOrder={"mensagemRetorno"})
@XmlRootElement(name="ListaMensagemRetorno")
public class ListaMensagemRetorno {
    @XmlElement(name="MensagemRetorno", required=true)
    protected List<TcMensagemRetorno> mensagemRetorno;

    public List<TcMensagemRetorno> getMensagemRetorno() {
        if (this.mensagemRetorno == null) {
            this.mensagemRetorno = new ArrayList<TcMensagemRetorno>();
        }
        return this.mensagemRetorno;
    }
}