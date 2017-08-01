// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 29/03/2016 16:30:45
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   ObjectType.java

package org.w3._2000._09.xmldsig_;

import java.util.ArrayList;
import java.util.List;

public class ObjectType
{

    public ObjectType()
    {
    }

    public List getContent()
    {
        if(content == null)
            content = new ArrayList();
        return content;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String value)
    {
        id = value;
    }

    public String getMimeType()
    {
        return mimeType;
    }

    public void setMimeType(String value)
    {
        mimeType = value;
    }

    public String getEncoding()
    {
        return encoding;
    }

    public void setEncoding(String value)
    {
        encoding = value;
    }

    protected List content;
    protected String id;
    protected String mimeType;
    protected String encoding;
}