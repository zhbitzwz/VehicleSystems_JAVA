package com.zhibtzwz.cn.serialException;
/** 
* @author  ZWZ 
* @version 2016年11月5日 下午6:43:21 
* @Function 处理串口参数设置异常
*/
public class SerialPortParameterFailure extends Exception{

	
	private static final long serialVersionUID = 1L;

	public SerialPortParameterFailure() {}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "设置串口参数失败！打开串口操作未完成！";
	}
}
