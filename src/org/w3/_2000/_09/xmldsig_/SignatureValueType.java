// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 29/03/2016 16:30:45
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   SignatureValueType.java

package org.w3._2000._09.xmldsig_;


public class SignatureValueType
{

    public SignatureValueType()
    {
    }

    public byte[] getValue()
    {
        return value;
    }

    public void setValue(byte value[])
    {
        this.value = (byte[])value;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String value)
    {
        id = value;
    }

    protected byte value[];
    protected String id;
}