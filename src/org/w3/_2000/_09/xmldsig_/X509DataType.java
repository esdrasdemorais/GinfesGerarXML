// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 29/03/2016 16:30:45
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   X509DataType.java

package org.w3._2000._09.xmldsig_;

import java.util.ArrayList;
import java.util.List;

public class X509DataType
{

    public X509DataType()
    {
    }

    public List getX509IssuerSerialOrX509SKIOrX509SubjectName()
    {
        if(x509IssuerSerialOrX509SKIOrX509SubjectName == null)
            x509IssuerSerialOrX509SKIOrX509SubjectName = new ArrayList();
        return x509IssuerSerialOrX509SKIOrX509SubjectName;
    }

    protected List x509IssuerSerialOrX509SKIOrX509SubjectName;
}