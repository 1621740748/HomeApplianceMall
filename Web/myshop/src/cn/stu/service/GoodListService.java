package cn.stu.service;

import java.util.List;
import java.util.Map;

import cn.stu.neu.util.DBUtil;

public class GoodListService {
	private DBUtil db ;
	public GoodListService(){
		db = new DBUtil();
	}
	
	/**
	 * �ر����ݿ�
	 */
	public void close(){
		db.close();
	}
	
	/**
	 * ��ȡĳһ���������Ʒ
	 * @param kind ����ID
	 * @return ��Ʒ�б�ID good_id������ good_name���۸� good_price������ good_over��ԭ�� good_pre��
	 */
	public List<Map<String,String>> getGoodsByKind(String kind){
		List<Map<String,String>> list = null;
		list = db.getList("select good_over,good_pre,good_id,good_name,good_price from t_goods where good_kind="+kind);
		return list;
	}
	
	/**
	 * ��ȡ������Ʒ
	 * @return ��Ʒ�б�ID good_id������ good_name���۸� good_price������ good_over��ԭ�� good_pre��
	 */
	public List<Map<String,String>> getHotGoods(){
		List<Map<String,String>> list = null;
		list = db.getList("select good_over,good_pre,good_id,good_name,good_price from t_goods order by good_over desc limit 24");
		return list;
	}
	
	/**
	 * ��ȡ�µ���Ʒ
	 * @return ��Ʒ�б�ID good_id������ good_name���۸� good_price������ good_over��ԭ�� good_pre��
	 */
	public List<Map<String,String>> getNewGoods(){
		List<Map<String,String>> list = null;
		list = db.getList("select good_over,good_id,good_name,good_price from t_goods order by good_over asc limit 24");
		return list;
	}
	
	/**
	 * ������Ʒ
	 * @param str ����������
	 * @return ��Ʒ�б�ID good_id������ good_name���۸� good_price������ good_over��ԭ�� good_pre��
	 */
	public List<Map<String,String>> searchGoods(String str){
		List<Map<String,String>> list = null;
		str = "%"+str+"%";
		String sql = "select good_over,good_id,good_name,good_price from t_goods where good_name like \""+str+"\"";
		System.out.println("sql:"+sql);
		list = db.getList(sql);
		System.out.println("list:"+list);
		return list;
	}
}
