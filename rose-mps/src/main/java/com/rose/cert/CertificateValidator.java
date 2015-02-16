package com.rose.cert;

import java.security.cert.X509Certificate;

import com.sun.xml.wss.impl.callback.CertificateValidationCallback;
import com.sun.xml.wss.impl.callback.CertificateValidationCallback.CertificateValidationException;

public class CertificateValidator implements CertificateValidationCallback.CertificateValidator{

	public boolean validate(X509Certificate certificate) throws CertificateValidationException {
		return true;
	}

}
