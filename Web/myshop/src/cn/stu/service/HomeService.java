package cn.stu.service;

import java.util.List;
import java.util.Map;
import cn.stu.neu.util.DBUtil;

public class HomeService {
	
	private DBUtil db ;
	public HomeService(){
		db = new DBUtil();
	}
	
	/**
	 * �ر����ݿ�
	 */
	public void close(){
		db.close();
	}
	
	/**
	 * ��ȡ�����Ƽ���Ʒ
	 * @return �����Ƽ���Ʒ�б�ID good_id������ good_name���۸� good_price��ͼƬ good_mid��
	 */
	public List<Map<String,String>> getTodayGoods(){
		List<Map<String,String>> list = null;
		list = db.getList("select good_id,good_name,good_price,good_mid from t_goods where istoday=1");
		return list;
	}
	
	/**
	 * ��ȡ������Ʒ
	 * @return ��Ʒ�б�ID good_id������ good_name���۸� good_price��ͼƬ good_mid����� good_kind��
	 */
	public List<Map<String,String>> getAllGoods(){
		List<Map<String,String>> list = null;
		list = db.getList("select good_id,good_name,good_price,good_mid,good_kind from t_goods");
		return list;
	}
	
	/**
	 * ��ȡ�������
	 * @return ���ID kind_id������ kind_name��
	 */
	public List<Map<String,String>> getAllKinds(){
		List<Map<String,String>> list = null;
		list = db.getList("select * from t_kind");
		return list;
	}
	
	
}