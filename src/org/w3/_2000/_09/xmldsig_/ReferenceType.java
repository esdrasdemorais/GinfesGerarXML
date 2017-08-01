// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 29/03/2016 16:30:45
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   ReferenceType.java

package org.w3._2000._09.xmldsig_;


// Referenced classes of package org.w3._2000._09.xmldsig_:
//            TransformsType, DigestMethodType

public class ReferenceType
{

    public ReferenceType()
    {
    }

    public TransformsType getTransforms()
    {
        return transforms;
    }

    public void setTransforms(TransformsType value)
    {
        transforms = value;
    }

    public DigestMethodType getDigestMethod()
    {
        return digestMethod;
    }

    public void setDigestMethod(DigestMethodType value)
    {
        digestMethod = value;
    }

    public byte[] getDigestValue()
    {
        return digestValue;
    }

    public void setDigestValue(byte value[])
    {
        digestValue = (byte[])value;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String value)
    {
        id = value;
    }

    public String getURI()
    {
        return uri;
    }

    public void setURI(String value)
    {
        uri = value;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String value)
    {
        type = value;
    }

    protected TransformsType transforms;
    protected DigestMethodType digestMethod;
    protected byte digestValue[];
    protected String id;
    protected String uri;
    protected String type;
}