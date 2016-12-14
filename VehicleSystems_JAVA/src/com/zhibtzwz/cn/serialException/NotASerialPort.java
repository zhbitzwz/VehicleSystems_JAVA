package com.zhibtzwz.cn.serialException;
/** 
* @author  ZWZ 
* @version 2016年11月5日 下午6:37:03 
* @Function 处理非串口类型异常
*/
public class NotASerialPort extends Exception{

	private static final long serialVersionUID = 1L;

	public NotASerialPort() {}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "端口指向设备不是串口类型！打开串口操作失败！";
	}
}
