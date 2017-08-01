// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 29/03/2016 16:30:45
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   ServicoEnviarLoteRpsEnvio.java

package Main;

import SelecionaDados.Conexao;
import br.com.ginfes.servico_enviar_lote_rps_envio_v03.EnviarLoteRpsEnvio;
import br.com.ginfes.tipos_v03.*;
import java.io.*;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.*;

// Referenced classes of package Main:
//            PrettyPrint

public class ServicoEnviarLoteRpsEnvio_old
{

    public ServicoEnviarLoteRpsEnvio_old()
    {
    }

    public static void main(String args[])
    {
        try
        {
            Conexao c = new Conexao();
            EnviarLoteRpsEnvio root = new EnviarLoteRpsEnvio();
 
            TcLoteRps loteRps = new TcLoteRps();
            ResultSet rsLoteRps = c.selecionaLoteRps();
            rsLoteRps.next();
            loteRps.setNumeroLote(rsLoteRps.getBigDecimal("NUMERO_LOTE_RPS").toBigInteger());
            loteRps.setCnpj(rsLoteRps.getString("CNPJ_PRO"));
            loteRps.setInscricaoMunicipal(rsLoteRps.getString("INSCRICAO_MUNICIPAL_PRO"));
            loteRps.setQuantidadeRps(rsLoteRps.getInt("QUANTIDADE_LOTE_RPS"));
            rsLoteRps.close();
            br.com.ginfes.tipos_v03.TcLoteRps.ListaRps listaRps = new br.com.ginfes.tipos_v03.TcLoteRps.ListaRps();
            ArrayList arrayListRps = (ArrayList)listaRps.getRps();
            TcRps rps;
            for(ResultSet rsRps = c.selecionaRps(); rsRps.next(); arrayListRps.add(rps))
            {
                rps = new TcRps();
                TcInfRps infRps = new TcInfRps();
                rps.setInfRps(infRps);
                TcIdentificacaoRps identificacaoRps = new TcIdentificacaoRps();
                identificacaoRps.setNumero(rsRps.getBigDecimal("NUM_IDENT_RPS").toBigInteger());
                identificacaoRps.setSerie(rsRps.getString("SERIE_IDENT_RPS"));
                identificacaoRps.setTipo(rsRps.getByte("TIPO_IDENT_RPS"));
                infRps.setIdentificacaoRps(identificacaoRps);
                infRps.setDataEmissao(PrettyPrint.formataData(rsRps.getDate("DT_EMISSAO_RPS")));
                infRps.setNaturezaOperacao(rsRps.getByte("NATUREZA_OPERACAO"));
                infRps.setOptanteSimplesNacional(rsRps.getByte("OPTANTE_SIMPLES_NACIONAL"));
                infRps.setIncentivadorCultural(Byte.parseByte("2"));
                infRps.setStatus(rsRps.getByte("STATUS_RPS"));
                TcDadosServico servico = new TcDadosServico();
                TcValores valores = new TcValores();
                valores.setValorServicos(rsRps.getBigDecimal("VL_SERVICO").setScale(2));
                valores.setValorDeducoes(rsRps.getBigDecimal("VL_DEDUCOES").setScale(2));
                valores.setValorPis(rsRps.getBigDecimal("VL_PIS").setScale(2));
                valores.setValorCofins(rsRps.getBigDecimal("VL_COFINS").setScale(2));
                valores.setValorInss(rsRps.getBigDecimal("VL_INSS").setScale(2));
                valores.setValorIr(rsRps.getBigDecimal("VL_IR").setScale(2));
                valores.setValorCsll(rsRps.getBigDecimal("VL_CSLL").setScale(2));
                valores.setIssRetido(rsRps.getByte("ISS_RETIDO"));
                valores.setValorIss(rsRps.getBigDecimal("VL_ISS").setScale(2));
                valores.setValorIssRetido(rsRps.getBigDecimal("VL_ISS_RETIDO").setScale(2));
                valores.setOutrasRetencoes(rsRps.getBigDecimal("VL_OUTRAS_RETENCOES").setScale(2));
                valores.setBaseCalculo(rsRps.getBigDecimal("VL_BASE_CALCULO").setScale(2));
                valores.setAliquota(rsRps.getBigDecimal("VL_ALIQUOTA").setScale(4));
                valores.setValorLiquidoNfse(rsRps.getBigDecimal("VL_LIQUIDO_NFSE").setScale(2));
                valores.setDescontoIncondicionado(rsRps.getBigDecimal("VL_DESCONTO_INCONDICIONADO").setScale(2));
                valores.setDescontoCondicionado(rsRps.getBigDecimal("VL_DESCONTO_CONDICIONADO").setScale(2));
                servico.setValores(valores);
                servico.setItemListaServico(rsRps.getString("ITEM_LISTA_SERVICO"));
                servico.setCodigoTributacaoMunicipio(rsRps.getString("CD_TRIBUTACAO_MUNICIPIO"));
                servico.setDiscriminacao(rsRps.getString("DISCRIMINACAO"));
                servico.setCodigoMunicipio(rsRps.getInt("CD_MUNICIPIO"));
                infRps.setServico(servico);
                TcIdentificacaoPrestador prestador = new TcIdentificacaoPrestador();
                prestador.setCnpj(rsRps.getString("CNPJ_PRO"));
                prestador.setInscricaoMunicipal(rsRps.getString("INSCRICAO_MUNICIPAL_PRO"));
                infRps.setPrestador(prestador);
                TcDadosTomador tomador = new TcDadosTomador();
                TcIdentificacaoTomador identifcacaoTomador = new TcIdentificacaoTomador();
                TcCpfCnpj cpfCnpj = new TcCpfCnpj();
                String aux = rsRps.getString("TOMADOR_CPF_CNPJ");
                if(aux.length() == 11)
                    cpfCnpj.setCpf(aux);
                else
                    cpfCnpj.setCnpj(aux);
                identifcacaoTomador.setCpfCnpj(cpfCnpj);
                String temp = null;
                temp = rsRps.getString("TOMADOR_INSCRICAO_MUNICIPAL");
                if(temp != null)
                    identifcacaoTomador.setInscricaoMunicipal(temp);
                tomador.setIdentificacaoTomador(identifcacaoTomador);
                tomador.setRazaoSocial(rsRps.getString("TOMADOR_RAZAO_SOCIAL"));
                TcEndereco endereco = new TcEndereco();
                endereco.setEndereco(rsRps.getString("TOMADOR_ENDERECO"));
                endereco.setNumero(rsRps.getString("TOMADOR_NUMERO"));
                endereco.setBairro(rsRps.getString("TOMADOR_BAIRRO"));
                endereco.setCodigoMunicipio(Integer.valueOf(rsRps.getInt("TOMADOR_CODIGO_MUNICIPIO")));
                endereco.setUf(rsRps.getString("TOMADOR_UF"));
                endereco.setCep(rsRps.getString("TOMADOR_CEP"));
                tomador.setEndereco(endereco);
                infRps.setTomador(tomador);
                TcDadosConstrucaoCivil construcaoCivil = new TcDadosConstrucaoCivil();
                construcaoCivil.setCodigoObra(rsRps.getString("CONSTRUCAO_CIVIL_CODIGO_OBRA"));
                construcaoCivil.setArt(rsRps.getString("CONSTRUCAO_CIVIL_ART"));
                if(construcaoCivil.getArt() != null) {
                    infRps.setConstrucaoCivil(construcaoCivil);
                }
                rps.setInfRps(infRps);
            }

            loteRps.setListaRps(listaRps);
            root.setLoteRps(loteRps);
            JAXBContext context = JAXBContext.newInstance("br.com.ginfes.servico_enviar_lote_rps_envio_v03");
            Marshaller marshaller = context.createMarshaller();
            marshaller.marshal(root, new FileOutputStream("c:\\ginfes\\notas_servicos_prestados.xml"));
            FileInputStream f = new FileInputStream("c:\\ginfes\\notas_servicos_prestados.xml");
            String s = PrettyPrint.print(PrettyPrint.ler(new File("c:\\ginfes\\notas_servicos_prestados.xml")));
            System.out.println(s);
            FileOutputStream fSaida = new FileOutputStream("c:\\ginfes\\notas_servicos_prestados.xml");
            fSaida.write(s.getBytes());
            c.desconectar();
        }
        catch(IOException ex)
        {
            Logger.getLogger(getName()).log(Level.SEVERE, null, ex);
        }
        catch(JAXBException ex)
        {
            Logger.getLogger(getName()).log(Level.SEVERE, null, ex);
        }
        catch(SQLException ex)
        {
            Logger.getLogger(getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String getName() {
    	return "ServicoEnviarLoteRpsEnvio";
    }
}