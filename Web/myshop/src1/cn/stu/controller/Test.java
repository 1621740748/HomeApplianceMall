package cn.stu.controller;


public class Test {

	public static void main(String[] args) {
		String str = "collectionForMobile.action";
		String[] s = str.split("\\.");
		System.out.println(s[0]);
		if(s[0].endsWith("ForMobile")){
			System.out.println("�йؼ���");
		}else{
			System.out.println("û�ؼ���");
		}
//		System.out.println(str.length());
	}

}
