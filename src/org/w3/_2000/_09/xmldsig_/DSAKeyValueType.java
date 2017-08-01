// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 29/03/2016 16:30:45
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   DSAKeyValueType.java

package org.w3._2000._09.xmldsig_;


public class DSAKeyValueType
{

    public DSAKeyValueType()
    {
    }

    public byte[] getP()
    {
        return p;
    }

    public void setP(byte value[])
    {
        p = (byte[])value;
    }

    public byte[] getQ()
    {
        return q;
    }

    public void setQ(byte value[])
    {
        q = (byte[])value;
    }

    public byte[] getG()
    {
        return g;
    }

    public void setG(byte value[])
    {
        g = (byte[])value;
    }

    public byte[] getY()
    {
        return y;
    }

    public void setY(byte value[])
    {
        y = (byte[])value;
    }

    public byte[] getJ()
    {
        return j;
    }

    public void setJ(byte value[])
    {
        j = (byte[])value;
    }

    public byte[] getSeed()
    {
        return seed;
    }

    public void setSeed(byte value[])
    {
        seed = (byte[])value;
    }

    public byte[] getPgenCounter()
    {
        return pgenCounter;
    }

    public void setPgenCounter(byte value[])
    {
        pgenCounter = (byte[])value;
    }

    protected byte p[];
    protected byte q[];
    protected byte g[];
    protected byte y[];
    protected byte j[];
    protected byte seed[];
    protected byte pgenCounter[];
}