package com.zhibtzwz.cn.serialException;
/** 
* @author  ZWZ 
* @version 2016年11月5日 下午6:41:42 
* @Function 处理串口对象输入流异常
*/
public class SerialPortInputStreamCloseFailure extends Exception{
	
	private static final long serialVersionUID = 1L;

	public SerialPortInputStreamCloseFailure() {}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "关闭串口对象输入流（InputStream）时出错！";
	}

}
