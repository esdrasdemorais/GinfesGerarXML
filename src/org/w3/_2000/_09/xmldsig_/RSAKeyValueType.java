// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 29/03/2016 16:30:45
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   RSAKeyValueType.java

package org.w3._2000._09.xmldsig_;


public class RSAKeyValueType
{

    public RSAKeyValueType()
    {
    }

    public byte[] getModulus()
    {
        return modulus;
    }

    public void setModulus(byte value[])
    {
        modulus = (byte[])value;
    }

    public byte[] getExponent()
    {
        return exponent;
    }

    public void setExponent(byte value[])
    {
        exponent = (byte[])value;
    }

    protected byte modulus[];
    protected byte exponent[];
}