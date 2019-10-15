package cn.fhjt.weixin.pojo.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 用于向页面传递信息的类
 * @author jt
 *
 */
public class Result implements Serializable{
	
	private boolean success;
	private boolean flag;
	private String message;
	private Map<String, Object> map ;
	
	public Result(boolean success, String message) {
		super();
		this.success=success;
		this.flag = success;
		this.message = message;
	}
	public Result(boolean success, String message, Map<String, Object> map) {
		super();
		this.success=success;
		this.flag = success;
		this.message = message;
		this.map =map;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
}
