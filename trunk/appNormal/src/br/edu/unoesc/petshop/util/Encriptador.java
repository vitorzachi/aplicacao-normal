package br.edu.unoesc.petshop.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

public class Encriptador {
	private static MessageDigest sha = null;

	static {
		try {
			sha = MessageDigest.getInstance("SHA-1");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}

	public static String encript(String value) {
		if (value != null) {
			// já esta cripto
			if (value.length() >= 28) {
				return value;
			}
			if (sha != null) {
				byte[] bytesDigested = sha.digest(value.getBytes());
				BASE64Encoder encoder = new BASE64Encoder();
				return encoder.encode(bytesDigested);
			}
		}
		return null;
	}

}
