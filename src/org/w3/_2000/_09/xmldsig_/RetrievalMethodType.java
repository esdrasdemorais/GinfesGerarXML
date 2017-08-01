// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 29/03/2016 16:30:45
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   RetrievalMethodType.java

package org.w3._2000._09.xmldsig_;


// Referenced classes of package org.w3._2000._09.xmldsig_:
//            TransformsType

public class RetrievalMethodType
{

    public RetrievalMethodType()
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
    protected String uri;
    protected String type;
}