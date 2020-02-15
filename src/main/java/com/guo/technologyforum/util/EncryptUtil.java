package com.guo.technologyforum.util;

import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 * 加密工具类
 *
 * 默认md5
 */
public class EncryptUtil {

    private static  String encryptAlgorithmName = "md5";
    private static RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();
    private final static int hashIterations = 2;

    public static String encrypt(String data,String salt){
        String encryptData = new SimpleHash(
                encryptAlgorithmName,
                data,
                ByteSource.Util.bytes(salt),
                hashIterations).toHex();
        return encryptData;
    }

    public static String getRandSalt(){
        return randomNumberGenerator.nextBytes().toHex();
    }
}
