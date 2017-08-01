// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 29/03/2016 16:30:44
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   TcLoteRps.java

package br.com.ginfes.tipos_v03;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package br.com.ginfes.tipos_v03:
//            TcLoteRps

public class TcLoteRps$ListaRps
{

    public List getRps()
    {
        if(rps == null)
            rps = new ArrayList();
        return rps;
    }

    protected List rps;

    public TcLoteRps$ListaRps()
    {
    }
}