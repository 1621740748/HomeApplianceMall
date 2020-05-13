package cn.stu.service;

import java.util.List;
import java.util.Map;

import cn.stu.neu.util.DBUtil;

public class GoodDetailService {
	private DBUtil db ;
	public GoodDetailService(){
		db = new DBUtil();
	}
	
	/**
	 * �ر����ݿ�
	 */
	public void close(){
		db.close();
	}
	
	/**
	 * ��ȡ��Ʒ����
	 * @param id ��ƷID
	 * @return ��Ʒ����
	 */
	public Map<String,String> getGoodById(String id){
		Map<String,String> map = null;
		map = db.getMap("select * from t_goods where good_id ="+id);
		return map;
	}
	
	/**
	 * ��ȡ������Ʒ��ϸ����
	 * @param id ��ƷID
	 * @return ������Ʒ��ϸ����
	 */
	public List<Map<String,String>> getGoodDetail(String id){
		List<Map<String,String>> list = null;
		list = db.getList("select * from t_detail where good_id="+id);
		return list;
	}
}
