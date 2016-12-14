package com.zhibtzwz.cn.serialException;
/** 
* @author  ZWZ 
* @version 2016年11月5日 下午6:44:07 
* @Function 处理串口监听数量超载异常
*/
public class TooManyListeners extends Exception{
	
	private static final long serialVersionUID = 1L;

	public TooManyListeners() {}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "串口监听类数量过多！添加操作失败！";
	}

}
