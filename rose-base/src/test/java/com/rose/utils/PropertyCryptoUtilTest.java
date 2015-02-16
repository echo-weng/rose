package com.rose.utils;

import org.junit.Assert;
import org.junit.Test;

/**
 * 简单的加密解密测试
 *
 * @author echo
 */
public class PropertyCryptoUtilTest {
	
	@Test
	public void testEncrypt(){
		System.out.println(PropertyCryptoUtil.encrypt("pass"));
		System.out.println(PropertyCryptoUtil.encrypt("web"));
	}
	
	@Test
	public void testDecrypt(){
		Assert.assertEquals("pass", PropertyCryptoUtil.decrypt("A6F3DBA2982DFBD0"));
		Assert.assertEquals("web", PropertyCryptoUtil.decrypt("433AC54A63D80AD1"));
	}
	
}
