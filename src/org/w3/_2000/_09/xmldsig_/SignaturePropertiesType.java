// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 29/03/2016 16:30:45
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   SignaturePropertiesType.java

package org.w3._2000._09.xmldsig_;

import java.util.ArrayList;
import java.util.List;

public class SignaturePropertiesType
{

    public SignaturePropertiesType()
    {
    }

    public List getSignatureProperty()
    {
        if(signatureProperty == null)
            signatureProperty = new ArrayList();
        return signatureProperty;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String value)
    {
        id = value;
    }

    protected List signatureProperty;
    protected String id;
}