package cn.stu.service;
import java.util.List;
import java.util.Map;
import cn.stu.neu.util.DBUtil;

public class ShoppingCarService {
	private DBUtil db ;
	public ShoppingCarService(){
		db = new DBUtil();
	}
	
	/**
	 * �ر����ݿ�
	 */
	public void close(){
		db.close();
	}

	/**
	 * ��ȡ�û����ﳵ��Ʒ
	 * @param userId �û�ID
	 * @return ��ƷList��Map:good_id,name,price,detail_id��
	 */
	public List<Map<String,String>> getCarGoods(String userId){
		List<Map<String,String>> list = null;
		list = db.getList("select good_id,detail_id from t_shoppingcar where user_id="+userId);
		if(list!=null && list.size()!=0){
			for(int i=0;i<list.size();i++){
				Map<String,String> map = db.getMap("select good_name,good_price from t_goods where good_id="+list.get(i).get("good_id"));
				String name = map.get("good_name");
				if(list.get(i).get("detail_id")!=null){
					name += "##��"+db.getMap("select detail_name from t_detail where detail_id="
							+list.get(i).get("detail_id")+
							" and good_id="+list.get(i).get("good_id")).get("detail_name")+ "��##";
				}
				list.get(i).put("name", name);
				list.get(i).put("price", map.get("good_price"));
			}
		}
		return list;
	}
	
	/**
	 * �ӹ��ﳵ��ɾ��
	 * @param userId �û�ID
	 * @param goodId ��ƷID
	 * @return SQL���н��
	 */
	public int delCar(String userId,String goodId){
		String sql = "delete from t_shoppingcar where user_id="+userId+" and good_id="+goodId;
		return db.update(sql);
	}
	
	/**
	 * ��ӵ����ﳵ
	 * @param userId �û�ID
	 * @param goodId ��ƷID
	 * @param detailId ��Ʒ��ϸID
	 * @return SQL���н��
	 */
	public int addCar(String userId,String goodId,String detailId){
		String sql = null;
		if(detailId!=null && !detailId.equals("-1") && detailId.length()!=0){
			sql = "insert into t_shoppingcar (user_id,good_id,detail_id) values('"+userId+"','"+goodId+"','"+detailId+"')";
		}else{
			sql = "insert into t_shoppingcar (user_id,good_id) values('"+userId+"','"+goodId+"')";
		} 
		return db.update(sql);
	}
}
