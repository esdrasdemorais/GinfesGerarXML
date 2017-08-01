// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 29/03/2016 16:30:45
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   SignedInfoType.java

package org.w3._2000._09.xmldsig_;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package org.w3._2000._09.xmldsig_:
//            CanonicalizationMethodType, SignatureMethodType

public class SignedInfoType
{

    public SignedInfoType()
    {
    }

    public CanonicalizationMethodType getCanonicalizationMethod()
    {
        return canonicalizationMethod;
    }

    public void setCanonicalizationMethod(CanonicalizationMethodType value)
    {
        canonicalizationMethod = value;
    }

    public SignatureMethodType getSignatureMethod()
    {
        return signatureMethod;
    }

    public void setSignatureMethod(SignatureMethodType value)
    {
        signatureMethod = value;
    }

    public List getReference()
    {
        if(reference == null)
            reference = new ArrayList();
        return reference;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String value)
    {
        id = value;
    }

    protected CanonicalizationMethodType canonicalizationMethod;
    protected SignatureMethodType signatureMethod;
    protected List reference;
    protected String id;
}