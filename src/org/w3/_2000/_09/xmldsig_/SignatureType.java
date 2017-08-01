// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 29/03/2016 16:30:45
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   SignatureType.java

package org.w3._2000._09.xmldsig_;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package org.w3._2000._09.xmldsig_:
//            SignedInfoType, SignatureValueType, KeyInfoType

public class SignatureType
{

    public SignatureType()
    {
    }

    public SignedInfoType getSignedInfo()
    {
        return signedInfo;
    }

    public void setSignedInfo(SignedInfoType value)
    {
        signedInfo = value;
    }

    public SignatureValueType getSignatureValue()
    {
        return signatureValue;
    }

    public void setSignatureValue(SignatureValueType value)
    {
        signatureValue = value;
    }

    public KeyInfoType getKeyInfo()
    {
        return keyInfo;
    }

    public void setKeyInfo(KeyInfoType value)
    {
        keyInfo = value;
    }

    public List getObject()
    {
        if(object == null)
            object = new ArrayList();
        return object;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String value)
    {
        id = value;
    }

    protected SignedInfoType signedInfo;
    protected SignatureValueType signatureValue;
    protected KeyInfoType keyInfo;
    protected List object;
    protected String id;
}