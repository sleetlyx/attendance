package cn.fhjt.weixin.utils;
import java.io.UnsupportedEncodingException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.Arrays;
//import org.codehaus.xfire.util.Base64;

import com.alibaba.fastjson.JSONObject;
import org.codehaus.xfire.util.Base64;

public class WXAppletUserInfo {
	/**
     * 获取微信小程序 session_key 和 openid
     */
    public static JSONObject getSessionKeyAndOropenid(String code,String openid,String appSecret){
        //微信端登录code值
        String wxCode = code;
        String requestUrl = "https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code";
        Map<String,String> requestUrlParam = new HashMap<String,String>();
        requestUrlParam.put("appid", openid);
        requestUrlParam.put("secret", appSecret);
        requestUrlParam.put("js_code", wxCode);
        requestUrlParam.put("grant_type", "authorization_code");
        JSONObject jsonObject = JSONObject.parseObject(HttpsClientUtil.getInstance().getMap(requestUrl, requestUrlParam));
        return jsonObject;
    }
    /**
     * 解密用户敏感数据获取用户信息
     * @param sessionKey 数据进行加密签名的密钥
     * @param encryptedData 包括敏感数据在内的完整用户信息的加密数据
     * @param iv 加密算法的初始向量
     * @throws NoSuchPaddingException 
     * @throws NoSuchAlgorithmException 
     * @throws InvalidParameterSpecException 
     * @throws InvalidAlgorithmParameterException 
     * @throws InvalidKeyException 
     * @throws BadPaddingException 
     * @throws IllegalBlockSizeException 
     * @throws UnsupportedEncodingException 
     */
    public static JSONObject getUserInfo(String encryptedData,String sessionKey,String iv) {
        // 被加密的数据
        byte[] dataByte = Base64.decode(encryptedData);
        // 加密秘钥
        byte[] keyByte = Base64.decode(sessionKey);
        // 偏移量
        byte[] ivByte = Base64.decode(iv);
        try {
            // 如果密钥不足16位，那么就补足.  这个if 中的内容很重要
            int base = 16;
            if (keyByte.length % base != 0) {
                int groups = keyByte.length / base + (keyByte.length % base != 0 ? 1 : 0);
                byte[] temp = new byte[groups * base];
                Arrays.fill(temp, (byte) 0);
                System.arraycopy(keyByte, 0, temp, 0, keyByte.length);
                keyByte = temp;
            }
            // 初始化
            Security.addProvider(new BouncyCastleProvider());

            Cipher cipher;

			cipher = Cipher.getInstance("AES/CBC/PKCS7Padding","BC");

            SecretKeySpec spec = new SecretKeySpec(keyByte, "AES");
            AlgorithmParameters parameters = AlgorithmParameters.getInstance("AES");
			parameters.init(new IvParameterSpec(ivByte));
			cipher.init(Cipher.DECRYPT_MODE, spec, parameters);
			// 初始化
            byte[] resultByte;
			resultByte = cipher.doFinal(dataByte);
            if (null != resultByte && resultByte.length > 0) {
                String result;
				result = new String(resultByte, "UTF-8");
                return JSONObject.parseObject(result);
            }
        }catch (NoSuchProviderException e) {
            e.printStackTrace();
        }catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}catch (NoSuchPaddingException e) {
			e.printStackTrace();
		}catch (InvalidParameterSpecException e) {
			e.printStackTrace();
		}catch (InvalidKeyException e) {
			e.printStackTrace();
		}catch (InvalidAlgorithmParameterException e) {
			e.printStackTrace();
		}catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		}catch (BadPaddingException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

        return null;
    }

    /**
     * <p>随机生成 access token 值的函数</p>
     * @param length 需要生成的 access token 长度
     * @return String 类型为字符串的accesstoken值
     */
    public static final String getToken(int length) {
        if (length < 1) {
            return null;
        }

        Random  randGen = new Random();

        char[]  numbersAndLetters = ("0123456789abcdefghijklmnopqrstuvwxyz" +
                    "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();

        char [] randBuffer = new char[length];

        for (int i=0; i<randBuffer.length; i++) {
            randBuffer[i] = numbersAndLetters[randGen.nextInt(64)];
        }
        return new String(randBuffer);
    }

    public static final String wxcode(int length) {
        if (length < 1) {
            return null;
        }

        Random  randGen = new Random();

        char[]  numbersAndLetters = ("0123456789").toCharArray();

        char [] randBuffer = new char[length];

        for (int i=0; i<randBuffer.length; i++) {
            randBuffer[i] = numbersAndLetters[randGen.nextInt(10)];
        }
        return new String(randBuffer);
    }

}
