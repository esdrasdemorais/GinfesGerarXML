// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 29/03/2016 16:30:46
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Conexao.java

package SelecionaDados;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao
{

    public Conexao()
    {
        try
        { 
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            //con = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=//proaxdtb/sig/ginfes/dbNfse.mdb");
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        	this.con = DriverManager.getConnection("jdbc:ucanaccess://\\\\proaxdtb\\sig\\CNAB240CobrancaTitulos.mdb");
            this.stm = con.createStatement();
        }
        catch(SQLException sqlexception)
        {
            Logger.getLogger(getName()).log(Level.SEVERE, null, sqlexception);
        }
        catch(Exception exception)
        {
            Logger.getLogger(getName()).log(Level.SEVERE, null, exception);
        }
    }
    
    public String getName()
    {
    	return this.toString();
    }

    public void desconectar()
    {
        try
        {
            con.close();
        }
        catch(SQLException sqlexception)
        {
            Logger.getLogger(getName()).log(Level.SEVERE, null, sqlexception);
        }
    }

    public ResultSet selecionaLoteRps()
    {
        try
        {
        	return stm.executeQuery("select * from C_LOTE_RPS");
        }
        catch(SQLException sqlexception)
        {
            Logger.getLogger(getName()).log(Level.SEVERE, null, sqlexception);
        }
        return null;
    }

    public ResultSet selecionaRps()
    {
        try
        {
            return stm.executeQuery("select top 20 * from C_RPS");
        }
        catch(SQLException sqlexception)
        {
            Logger.getLogger(getName()).log(Level.SEVERE, null, sqlexception);
        }
        return null;
    }

    protected Connection con;
    protected Statement stm;
}