// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 29/03/2016 16:30:45
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   TransformsType.java

package org.w3._2000._09.xmldsig_;

import java.util.ArrayList;
import java.util.List;

public class TransformsType
{

    public TransformsType()
    {
    }

    public List getTransform()
    {
        if(transform == null)
            transform = new ArrayList();
        return transform;
    }

    protected List transform;
}