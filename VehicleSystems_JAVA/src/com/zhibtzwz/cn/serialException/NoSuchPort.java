package com.zhibtzwz.cn.serialException;
/** 
* @author  ZWZ 
* @version 2016年11月5日 下午6:35:41 
* @Function 处理端口找不到异常
*/
public class NoSuchPort extends Exception{
	
	private static final long serialVersionUID = 1L;

	public NoSuchPort() {}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "没有找到与该端口名匹配的串口设备！打开串口操作失败！";
	}
}
