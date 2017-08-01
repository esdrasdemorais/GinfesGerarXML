// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 29/03/2016 16:30:45
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   X509IssuerSerialType.java

package org.w3._2000._09.xmldsig_;

import java.math.BigInteger;

public class X509IssuerSerialType
{

    public X509IssuerSerialType()
    {
    }

    public String getX509IssuerName()
    {
        return x509IssuerName;
    }

    public void setX509IssuerName(String value)
    {
        x509IssuerName = value;
    }

    public BigInteger getX509SerialNumber()
    {
        return x509SerialNumber;
    }

    public void setX509SerialNumber(BigInteger value)
    {
        x509SerialNumber = value;
    }

    protected String x509IssuerName;
    protected BigInteger x509SerialNumber;
}