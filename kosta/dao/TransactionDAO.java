package ex0330.db.transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import ex0330.db.DbUtil;

public class TransactionDAO {
  /**
   * ������ü ��� ����
   * */
	public void transfer(String inputAccount, String outputAccount, int money) {
		
	}
	
	public static void main(String[] args) {
		TransactionDAO dao = new TransactionDAO();
		System.out.println("--1. ��ݰ��� ����----");
		//dao.transfer("A02", "A05",200);//�Ա�, ���, �ݾ�
		
		System.out.println("--2. �Աݰ��� ����----");
		//dao.transfer("A04", "A01",200);//�Ա�, ���, �ݾ�
		
		
		System.out.println("--3. �Աݰ����� �Ѿ� 1000�� �̻��ΰ��----");
		//dao.transfer("A02", "A01",700);//�Ա�, ���, �ݾ�
		
		System.out.println("--4. ����----------");
		dao.transfer("A02", "A01",100);//�Ա�, ���, �ݾ�
	}
}











