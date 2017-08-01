/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 *
 * @author carlosfreitas
 */
public class PrettyPrint {
    public static String print(String input, int indent) {
    try {
        Source xmlInput = new StreamSource(new StringReader(input));
        StringWriter stringWriter = new StringWriter();
        StreamResult xmlOutput = new StreamResult(stringWriter);
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        transformerFactory.setAttribute("indent-number", indent);
        Transformer transformer = transformerFactory.newTransformer(); 
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(xmlInput, xmlOutput);
        return xmlOutput.getWriter().toString();
    } catch (Exception e) {
        throw new RuntimeException(e); // simple exception handling, please review it
    }
}

    public static String print(String input) {
        return print(input, 2);
    }
    
    public static XMLGregorianCalendar formataData(Date data){
        try {  
            // Transformando para gregorian calendar  
            GregorianCalendar gc = new GregorianCalendar(); 
            gc.setTime(data);
            String DATE_FORMAT = "yyyy-MM-dd'T'hh:MM:ss";
            SimpleDateFormat sdf =  new SimpleDateFormat(DATE_FORMAT);

            DatatypeFactory dtf = DatatypeFactory.newInstance();
            XMLGregorianCalendar xgc = dtf.newXMLGregorianCalendar();
               
            xgc.setYear(gc.get(Calendar.YEAR));
            xgc.setDay(gc.get(Calendar.DAY_OF_MONTH));
            xgc.setMonth(gc.get(Calendar.MONTH)+ 1);
            xgc.setHour(gc.get(Calendar.HOUR_OF_DAY));
            xgc.setMinute(gc.get(Calendar.MINUTE));
            xgc.setSecond(gc.get(Calendar.SECOND));                                            

            xgc.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
            
            return xgc;
           
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(PrettyPrint.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }    

    public static String corrigeTags(String xmlString){
//        xmlString = xmlString.replace("</", "</tipos:").replace("</tipos:ns3", "</ns3");
//        String[] xmlVet = xmlString.split("<");
        String saida = xmlString;
//        for (String s : xmlVet) {
//            if (s.contains("encoding=\"UTF-8\"") || s.contains("LoteRps") 
//            		|| s.contains("EnviarLoteRpsEnvio")
//            ) {
//            	saida = saida + "<" + s;
//            	continue;
//            }
//            if (!s.contains("/") && !s.contains("ns3") && !s.contains("xml") && s.trim().length() > 0) {
//                s = "tipos:" + s;
//            }
//            if (s.trim().length() > 0) {
//            	saida = saida + "<" + s;
//            }
//        }
        
        saida = saida.replace("xmlns:ns4", "xmlns");
//        saida = saida.replace(":ns4", "");
//        saida = saida.replace("</tipos:LoteRps>", "</LoteRps>");
        saida = saida.replace("</tipos:EnviarLoteRpsEnvio>", "</EnviarLoteRpsEnvio>");
        saida = saida.replace("<tipos:InfRps>","<tipos:InfRps Id=\"Rps1\">");
//        saida = saida.replace("tipos:<", "");
//        saida = saida.replace("xmlns=\"http://www.ginfes.com.br/tipos_v03.xsd\"", "xmlns:tipos=\"http://www.ginfes.com.br/tipos_v03.xsd\"");
        saida = saida.replace("ns4:", "");
//        saida = saida.replace(":ns3", "");
//        saida = saida.replace("<D", "<tipos:D");
        return saida;
    }
    
    public static String ler(File arquivo) {
    StringBuilder sb = new StringBuilder();
    try {
        FileReader reader = new FileReader(arquivo);
        int c;
        do {
            c = reader.read();
            if (c != -1) {
                sb.append((char) c);
            }
        } while (c != -1);
        reader.close();
    } catch (IOException e) {
    }
    return sb.toString();
    }    
}
