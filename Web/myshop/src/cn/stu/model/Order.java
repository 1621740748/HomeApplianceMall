package cn.stu.model;

import java.util.Date;

/*
 * ����
 */
public class Order {
	private int id; //����ID
	private int userId;//�û�ID
	private int status;//����״̬
	private int goodId;//��ƷID
	private String add;//�ռ��˵�ַ
	private String addName;//�ռ�������
	private String addTel;//�ռ��˵绰
	private int detailId;//����ID
	private Date timeSubmit;//����ʱ��-�ύ
	private Date timePay;//����ʱ��-֧��
	private Date timeCancel;//����ʱ��-ȡ��
	private Date timeShip;//����ʱ��-����
	private Date timeReturn;//����ʱ��-�˻�
	private Date timeFinish;//����ʱ��-���
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getGoodId() {
		return goodId;
	}
	public void setGoodId(int goodId) {
		this.goodId = goodId;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getAddName() {
		return addName;
	}
	public void setAddName(String addName) {
		this.addName = addName;
	}
	public String getAddTel() {
		return addTel;
	}
	public void setAddTel(String addTel) {
		this.addTel = addTel;
	}
	public int getDetailId() {
		return detailId;
	}
	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}
	public Date getTimeSubmit() {
		return timeSubmit;
	}
	public void setTimeSubmit(Date timeSubmit) {
		this.timeSubmit = timeSubmit;
	}
	public Date getTimePay() {
		return timePay;
	}
	public void setTimePay(Date timePay) {
		this.timePay = timePay;
	}
	public Date getTimeCancel() {
		return timeCancel;
	}
	public void setTimeCancel(Date timeCancel) {
		this.timeCancel = timeCancel;
	}
	public Date getTimeShip() {
		return timeShip;
	}
	public void setTimeShip(Date timeShip) {
		this.timeShip = timeShip;
	}
	public Date getTimeReturn() {
		return timeReturn;
	}
	public void setTimeReturn(Date timeReturn) {
		this.timeReturn = timeReturn;
	}
	public Date getTimeFinish() {
		return timeFinish;
	}
	public void setTimeFinish(Date timeFinish) {
		this.timeFinish = timeFinish;
	}
	
}