package com.zhibtzwz.cn.serialException;
/** 
* @author  ZWZ 
* @version 2016年11月5日 下午6:39:27 
* @Function 处理数据输入流异常
*/
public class ReadDataFromSerialPortFailure extends Exception{

	private static final long serialVersionUID = 1L;

	public ReadDataFromSerialPortFailure() {}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "从串口读取数据时出错！";
	}
	
}
