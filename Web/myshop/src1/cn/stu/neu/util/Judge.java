package cn.stu.neu.util;

public class Judge {
	/**
	 * �ж��Ƿ����ƶ��˵�
	 * @param url request.getServletPath()�õ����ַ���
	 * @return boolean��ʽ
	 */
	public static boolean isForMobile(String url){
		boolean res = false;
		if(url.endsWith("ForMobile.action")){
			res = true;
		}
		return res;
	}
}
