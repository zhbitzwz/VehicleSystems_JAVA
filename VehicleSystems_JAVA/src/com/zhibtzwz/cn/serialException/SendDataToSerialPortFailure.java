package com.zhibtzwz.cn.serialException;
/** 
* @author  ZWZ 
* @version 2016年11月5日 下午6:40:29 
* @Function 处理数据分发异常
*/
public class SendDataToSerialPortFailure extends Exception{

	private static final long serialVersionUID = 1L;

	public SendDataToSerialPortFailure() {}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "往串口发送数据失败！";
	}
}
