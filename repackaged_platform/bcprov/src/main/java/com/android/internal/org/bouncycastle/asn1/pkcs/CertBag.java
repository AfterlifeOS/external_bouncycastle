/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.internal.org.bouncycastle.asn1.pkcs;

import com.android.internal.org.bouncycastle.asn1.ASN1Encodable;
import com.android.internal.org.bouncycastle.asn1.ASN1EncodableVector;
import com.android.internal.org.bouncycastle.asn1.ASN1Object;
import com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.android.internal.org.bouncycastle.asn1.ASN1Primitive;
import com.android.internal.org.bouncycastle.asn1.ASN1Sequence;
import com.android.internal.org.bouncycastle.asn1.DERSequence;
import com.android.internal.org.bouncycastle.asn1.DERTaggedObject;

/**
 * @hide This class is not part of the Android public SDK API
 */
public class CertBag
    extends ASN1Object
{
    private ASN1ObjectIdentifier certId;
    private ASN1Encodable certValue;

    private CertBag(
        ASN1Sequence    seq)
    {
        this.certId = (ASN1ObjectIdentifier)seq.getObjectAt(0);
        this.certValue = ((DERTaggedObject)seq.getObjectAt(1)).getObject();
    }

    public static CertBag getInstance(Object o)
    {
        if (o instanceof CertBag)
        {
            return (CertBag)o;
        }
        else if (o != null)
        {
            return new CertBag(ASN1Sequence.getInstance(o));
        }

        return null;
    }

    public CertBag(
        ASN1ObjectIdentifier certId,
        ASN1Encodable        certValue)
    {
        this.certId = certId;
        this.certValue = certValue;
    }

    public ASN1ObjectIdentifier getCertId()
    {
        return certId;
    }

    public ASN1Encodable getCertValue()
    {
        return certValue;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector  v = new ASN1EncodableVector();

        v.add(certId);
        v.add(new DERTaggedObject(0, certValue));

        return new DERSequence(v);
    }
}
