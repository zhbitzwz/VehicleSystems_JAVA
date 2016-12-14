package com.zhibtzwz.cn.serialException;
/** 
* @author  ZWZ 
* @version 2016年11月5日 下午6:38:27 
* @Function 处理端口占用异常
*/
public class PortInUse extends Exception{

	private static final long serialVersionUID = 1L;

	public PortInUse() {}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "端口已被占用！打开串口操作失败！";
	}
}
