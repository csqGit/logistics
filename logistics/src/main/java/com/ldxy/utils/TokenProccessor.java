package com.ldxy.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

import javax.management.RuntimeErrorException;
import javax.servlet.http.HttpServletRequest;

import sun.misc.BASE64Encoder;

/**
 * token工具类
 * @author bozpower
 *
 */
public class TokenProccessor {
	
	/**
	 * 单例模式（保证类的对象在该内存中只有一个）
	 * 1、把类的构造函数私有
	 * 2、自己创建一个类的对象
	 * 3、对外提供一个公共的方法，返回类的对象
	 */
	
	private TokenProccessor() {}
	
	private static final TokenProccessor instance =  new TokenProccessor();
	
	/**
	 * 返回类的对象
	 * @return
	 */
	public static TokenProccessor getInstance() {
		return instance;
	}
	
	public String makeToken() {
		String token = System.currentTimeMillis() + new Random().nextInt(999999999) +"";
		//数据指纹  128位  16个字节  md5
		try {
			MessageDigest md = MessageDigest.getInstance("md5");
			byte md5[] = md.digest(token.getBytes());
			//base64编码--任意二进制编码明文字符
			BASE64Encoder encoder = new BASE64Encoder();
			return encoder.encode(md5);
		} catch (Error e) {
			e.printStackTrace();
			throw new RuntimeErrorException(e);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}
	}
	
	
	/**
	 * 校验客户端提交上来的token与服务器段生成的是否一致
	 * @param request
	 * @return
	 * true 重复提交了表单
	 * false 没有重复提交表单
	 */
	public static boolean isRepeatSubmit(HttpServletRequest req, String token) {
		String client_token = token;
		//如果没有token，则重复提交了表单
		if(client_token == null) { 
			return true;
		}
		
		//取出存储在session中的token令牌
		String server_token = (String) req.getSession().getAttribute("token");
		//如果当前用户的session中不存在token令牌，则重复提交了表单
		if(server_token == null) {
			return true;
		}
		//存储在session中的token令牌与表单提交的不同，用户重复提交了表单
		if(!client_token.equals(server_token)) {
			return true;
		}
		
		return false;
	}
	

}
