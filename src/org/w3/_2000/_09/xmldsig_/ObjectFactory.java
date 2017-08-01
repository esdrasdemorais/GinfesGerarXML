// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 29/03/2016 16:30:45
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   ObjectFactory.java

package org.w3._2000._09.xmldsig_;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

// Referenced classes of package org.w3._2000._09.xmldsig_:
//            DSAKeyValueType, RetrievalMethodType, ObjectType, KeyValueType, 
//            X509IssuerSerialType, ReferenceType, ManifestType, SignatureMethodType, 
//            SignaturePropertyType, CanonicalizationMethodType, X509DataType, RSAKeyValueType, 
//            PGPDataType, TransformsType, SignatureType, KeyInfoType, 
//            SPKIDataType, TransformType, SignaturePropertiesType, DigestMethodType, 
//            SignedInfoType, SignatureValueType

public class ObjectFactory
{

    public ObjectFactory()
    {
    }

    public DSAKeyValueType createDSAKeyValueType()
    {
        return new DSAKeyValueType();
    }

    public RetrievalMethodType createRetrievalMethodType()
    {
        return new RetrievalMethodType();
    }

    public ObjectType createObjectType()
    {
        return new ObjectType();
    }

    public KeyValueType createKeyValueType()
    {
        return new KeyValueType();
    }

    public X509IssuerSerialType createX509IssuerSerialType()
    {
        return new X509IssuerSerialType();
    }

    public ReferenceType createReferenceType()
    {
        return new ReferenceType();
    }

    public ManifestType createManifestType()
    {
        return new ManifestType();
    }

    public SignatureMethodType createSignatureMethodType()
    {
        return new SignatureMethodType();
    }

    public SignaturePropertyType createSignaturePropertyType()
    {
        return new SignaturePropertyType();
    }

    public CanonicalizationMethodType createCanonicalizationMethodType()
    {
        return new CanonicalizationMethodType();
    }

    public X509DataType createX509DataType()
    {
        return new X509DataType();
    }

    public RSAKeyValueType createRSAKeyValueType()
    {
        return new RSAKeyValueType();
    }

    public PGPDataType createPGPDataType()
    {
        return new PGPDataType();
    }

    public TransformsType createTransformsType()
    {
        return new TransformsType();
    }

    public SignatureType createSignatureType()
    {
        return new SignatureType();
    }

    public KeyInfoType createKeyInfoType()
    {
        return new KeyInfoType();
    }

    public SPKIDataType createSPKIDataType()
    {
        return new SPKIDataType();
    }

    public TransformType createTransformType()
    {
        return new TransformType();
    }

    public SignaturePropertiesType createSignaturePropertiesType()
    {
        return new SignaturePropertiesType();
    }

    public DigestMethodType createDigestMethodType()
    {
        return new DigestMethodType();
    }

    public SignedInfoType createSignedInfoType()
    {
        return new SignedInfoType();
    }

    public SignatureValueType createSignatureValueType()
    {
        return new SignatureValueType();
    }

//    public JAXBElement createX509DataTypeX509IssuerSerial(X509IssuerSerialType value)
//    {
//        return new JAXBElement(_X509DataTypeX509IssuerSerial_QNAME, org/w3/_2000/_09/xmldsig_/X509IssuerSerialType, org/w3/_2000/_09/xmldsig_/X509DataType, value);
//    }
//
//    public JAXBElement createX509DataTypeX509Certificate(byte value[])
//    {
//        return new JAXBElement(_X509DataTypeX509Certificate_QNAME, [B, org/w3/_2000/_09/xmldsig_/X509DataType, (byte[])value);
//    }
//
//    public JAXBElement createX509DataTypeX509SKI(byte value[])
//    {
//        return new JAXBElement(_X509DataTypeX509SKI_QNAME, [B, org/w3/_2000/_09/xmldsig_/X509DataType, (byte[])value);
//    }
//
//    public JAXBElement createX509DataTypeX509SubjectName(String value)
//    {
//        return new JAXBElement(_X509DataTypeX509SubjectName_QNAME, java/lang/String, org/w3/_2000/_09/xmldsig_/X509DataType, value);
//    }
//
//    public JAXBElement createX509DataTypeX509CRL(byte value[])
//    {
//        return new JAXBElement(_X509DataTypeX509CRL_QNAME, [B, org/w3/_2000/_09/xmldsig_/X509DataType, (byte[])value);
//    }
//
//    public JAXBElement createX509Data(X509DataType value)
//    {
//        return new JAXBElement(_X509Data_QNAME, org/w3/_2000/_09/xmldsig_/X509DataType, null, value);
//    }
//
//    public JAXBElement createSignature(SignatureType value)
//    {
//        return new JAXBElement(_Signature_QNAME, org/w3/_2000/_09/xmldsig_/SignatureType, null, value);
//    }
//
//    public JAXBElement createPGPData(PGPDataType value)
//    {
//        return new JAXBElement(_PGPData_QNAME, org/w3/_2000/_09/xmldsig_/PGPDataType, null, value);
//    }
//
//    public JAXBElement createDSAKeyValue(DSAKeyValueType value)
//    {
//        return new JAXBElement(_DSAKeyValue_QNAME, org/w3/_2000/_09/xmldsig_/DSAKeyValueType, null, value);
//    }
//
//    public JAXBElement createSignatureMethod(SignatureMethodType value)
//    {
//        return new JAXBElement(_SignatureMethod_QNAME, org/w3/_2000/_09/xmldsig_/SignatureMethodType, null, value);
//    }
//
//    public JAXBElement createSPKIData(SPKIDataType value)
//    {
//        return new JAXBElement(_SPKIData_QNAME, org/w3/_2000/_09/xmldsig_/SPKIDataType, null, value);
//    }
//
//    public JAXBElement createKeyInfo(KeyInfoType value)
//    {
//        return new JAXBElement(_KeyInfo_QNAME, org/w3/_2000/_09/xmldsig_/KeyInfoType, null, value);
//    }
//
//    public JAXBElement createSignedInfo(SignedInfoType value)
//    {
//        return new JAXBElement(_SignedInfo_QNAME, org/w3/_2000/_09/xmldsig_/SignedInfoType, null, value);
//    }
//
//    public JAXBElement createRetrievalMethod(RetrievalMethodType value)
//    {
//        return new JAXBElement(_RetrievalMethod_QNAME, org/w3/_2000/_09/xmldsig_/RetrievalMethodType, null, value);
//    }
//
//    public JAXBElement createDigestMethod(DigestMethodType value)
//    {
//        return new JAXBElement(_DigestMethod_QNAME, org/w3/_2000/_09/xmldsig_/DigestMethodType, null, value);
//    }
//
//    public JAXBElement createDigestValue(byte value[])
//    {
//        return new JAXBElement(_DigestValue_QNAME, [B, null, (byte[])value);
//    }
//
//    public JAXBElement createCanonicalizationMethod(CanonicalizationMethodType value)
//    {
//        return new JAXBElement(_CanonicalizationMethod_QNAME, org/w3/_2000/_09/xmldsig_/CanonicalizationMethodType, null, value);
//    }
//
//    public JAXBElement createMgmtData(String value)
//    {
//        return new JAXBElement(_MgmtData_QNAME, java/lang/String, null, value);
//    }
//
//    public JAXBElement createObject(ObjectType value)
//    {
//        return new JAXBElement(_Object_QNAME, org/w3/_2000/_09/xmldsig_/ObjectType, null, value);
//    }
//
//    public JAXBElement createSignatureProperties(SignaturePropertiesType value)
//    {
//        return new JAXBElement(_SignatureProperties_QNAME, org/w3/_2000/_09/xmldsig_/SignaturePropertiesType, null, value);
//    }
//
//    public JAXBElement createKeyName(String value)
//    {
//        return new JAXBElement(_KeyName_QNAME, java/lang/String, null, value);
//    }
//
//    public JAXBElement createKeyValue(KeyValueType value)
//    {
//        return new JAXBElement(_KeyValue_QNAME, org/w3/_2000/_09/xmldsig_/KeyValueType, null, value);
//    }
//
//    public JAXBElement createReference(ReferenceType value)
//    {
//        return new JAXBElement(_Reference_QNAME, org/w3/_2000/_09/xmldsig_/ReferenceType, null, value);
//    }
//
//    public JAXBElement createSignatureProperty(SignaturePropertyType value)
//    {
//        return new JAXBElement(_SignatureProperty_QNAME, org/w3/_2000/_09/xmldsig_/SignaturePropertyType, null, value);
//    }
//
//    public JAXBElement createTransforms(TransformsType value)
//    {
//        return new JAXBElement(_Transforms_QNAME, org/w3/_2000/_09/xmldsig_/TransformsType, null, value);
//    }
//
//    public JAXBElement createManifest(ManifestType value)
//    {
//        return new JAXBElement(_Manifest_QNAME, org/w3/_2000/_09/xmldsig_/ManifestType, null, value);
//    }
//
//    public JAXBElement createSignatureValue(SignatureValueType value)
//    {
//        return new JAXBElement(_SignatureValue_QNAME, org/w3/_2000/_09/xmldsig_/SignatureValueType, null, value);
//    }
//
//    public JAXBElement createRSAKeyValue(RSAKeyValueType value)
//    {
//        return new JAXBElement(_RSAKeyValue_QNAME, org/w3/_2000/_09/xmldsig_/RSAKeyValueType, null, value);
//    }
//
//    public JAXBElement createTransform(TransformType value)
//    {
//        return new JAXBElement(_Transform_QNAME, org/w3/_2000/_09/xmldsig_/TransformType, null, value);
//    }
//
//    public JAXBElement createPGPDataTypePGPKeyID(byte value[])
//    {
//        return new JAXBElement(_PGPDataTypePGPKeyID_QNAME, [B, org/w3/_2000/_09/xmldsig_/PGPDataType, (byte[])value);
//    }
//
//    public JAXBElement createPGPDataTypePGPKeyPacket(byte value[])
//    {
//        return new JAXBElement(_PGPDataTypePGPKeyPacket_QNAME, [B, org/w3/_2000/_09/xmldsig_/PGPDataType, (byte[])value);
//    }
//
//    public JAXBElement createTransformTypeXPath(String value)
//    {
//        return new JAXBElement(_TransformTypeXPath_QNAME, java/lang/String, org/w3/_2000/_09/xmldsig_/TransformType, value);
//    }
//
//    public JAXBElement createSPKIDataTypeSPKISexp(byte value[])
//    {
//        return new JAXBElement(_SPKIDataTypeSPKISexp_QNAME, [B, org/w3/_2000/_09/xmldsig_/SPKIDataType, (byte[])value);
//    }
//
//    public JAXBElement createSignatureMethodTypeHMACOutputLength(BigInteger value)
//    {
//        return new JAXBElement(_SignatureMethodTypeHMACOutputLength_QNAME, java/math/BigInteger, org/w3/_2000/_09/xmldsig_/SignatureMethodType, value);
//    }

    private static final QName _X509DataTypeX509IssuerSerial_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509IssuerSerial");
    private static final QName _X509DataTypeX509Certificate_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509Certificate");
    private static final QName _X509DataTypeX509SKI_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509SKI");
    private static final QName _X509DataTypeX509SubjectName_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509SubjectName");
    private static final QName _X509DataTypeX509CRL_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509CRL");
    private static final QName _X509Data_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509Data");
    private static final QName _Signature_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Signature");
    private static final QName _PGPData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "PGPData");
    private static final QName _DSAKeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DSAKeyValue");
    private static final QName _SignatureMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureMethod");
    private static final QName _SPKIData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SPKIData");
    private static final QName _KeyInfo_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyInfo");
    private static final QName _SignedInfo_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignedInfo");
    private static final QName _RetrievalMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "RetrievalMethod");
    private static final QName _DigestMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DigestMethod");
    private static final QName _DigestValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DigestValue");
    private static final QName _CanonicalizationMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "CanonicalizationMethod");
    private static final QName _MgmtData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "MgmtData");
    private static final QName _Object_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Object");
    private static final QName _SignatureProperties_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureProperties");
    private static final QName _KeyName_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyName");
    private static final QName _KeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyValue");
    private static final QName _Reference_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Reference");
    private static final QName _SignatureProperty_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureProperty");
    private static final QName _Transforms_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Transforms");
    private static final QName _Manifest_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Manifest");
    private static final QName _SignatureValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureValue");
    private static final QName _RSAKeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "RSAKeyValue");
    private static final QName _Transform_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Transform");
    private static final QName _PGPDataTypePGPKeyID_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "PGPKeyID");
    private static final QName _PGPDataTypePGPKeyPacket_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "PGPKeyPacket");
    private static final QName _TransformTypeXPath_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "XPath");
    private static final QName _SPKIDataTypeSPKISexp_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SPKISexp");
    private static final QName _SignatureMethodTypeHMACOutputLength_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "HMACOutputLength");

}