package cn.stu.model;

/*
 * ��Ʒ
 */
public class Goods {
	private int id;	//��ƷID
	private int kind; //��Ʒ����ID
	private String name;//��Ʒ����
	private float price;//��Ʒ�۸�
	private float preprice;//��Ʒԭ��
	private int overNumber;//��������
	private int pic_dis;//��ƷͼƬ��ʾ�ĸ���
	private int pic_mid;//��ƷͼƬ�����ĸ���
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getKind() {
		return kind;
	}
	public void setKind(int kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getPreprice() {
		return preprice;
	}
	public void setPreprice(float preprice) {
		this.preprice = preprice;
	}
	public int getOverNumber() {
		return overNumber;
	}
	public void setOverNumber(int overNumber) {
		this.overNumber = overNumber;
	}
	public int getPic_dis() {
		return pic_dis;
	}
	public void setPic_dis(int pic_dis) {
		this.pic_dis = pic_dis;
	}
	public int getPic_mid() {
		return pic_mid;
	}
	public void setPic_mid(int pic_mid) {
		this.pic_mid = pic_mid;
	}
}