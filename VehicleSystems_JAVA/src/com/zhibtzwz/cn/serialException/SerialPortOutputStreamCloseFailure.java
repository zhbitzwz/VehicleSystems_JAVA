package com.zhibtzwz.cn.serialException;
/** 
* @author  ZWZ 
* @version 2016年11月5日 下午6:42:38 
* @Function 处理串口对象输出流异常
*/
public class SerialPortOutputStreamCloseFailure extends Exception{

	private static final long serialVersionUID = 1L;

	public SerialPortOutputStreamCloseFailure() {}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "关闭串口对象的输出流（OutputStream）时出错！";
	}
}
