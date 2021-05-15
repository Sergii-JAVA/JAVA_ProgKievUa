package level2Ex1;

import java.io.*;

public class Phone {
	
	//	��� ������ ���� ������ ������, �� ����� ����� ���
	final static String myNumber = "0000000000";	// ����� ��� ������ ����� ��� final
	private static String incomingNumber;
	private static String outcomingNumber;

	public static void main(String[] args) {
		char turn = 0;
		incomingNumber = "1111111111";	//	����������� ������ ����� ������
		outcomingNumber = "2222222222";	//	������ ������ �� ������� ������

		System.out.println("�������� �������.");
		System.out.println("��� ����������� � ����, ������� 'Y'" + " , � ��������� ������ 'N'.");

		try {
			turn = (char) System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// �������� ������ �� ����
		Network checkNetwork = new Network();
		if (turn == 'Y') {
			networkCheck(myNumber);
		} else if(turn == 'N'){
			System.out.println("�� ������ ������������ ������� � ���������� ������?...");
		} else {
			System.out.println("��������� ������ �� ������������� ������������.");
		}

		outcommingCall(outcomingNumber);

	}
	
	private static boolean networkCheck(String myNumber) {
		Network checkNetwork = new Network();
		boolean call = false;
		if(checkNetwork.checkReg(myNumber)) {
			System.out.println("��� ����� �������� �� ����� ���� ��������������� � ����.");
			System.exit(0);
			call = true;
		} else {
			System.out.println("���������� ���������. ������� �������� " + "� ���������� ������.");
			System.exit(0);
		}
		
		return call;
	}

	public static boolean checkNumbersOutcommingCall(String outcommingNumer) {
		Network checkNetwork = new Network();
		boolean call = false;
		if (checkNetwork.checkReg(outcommingNumer)) {
			call = true;
		} else {
			System.out.println("���������� ����� - �� ��������������� � ����.");
			System.exit(0);
		}
		if (checkNetwork.checkReg(myNumber)) {
			call = true;
		} else {
			System.out.println("��� ����� �������� �� ����� ���� ��������������� � ����.");
		}
		return call;
	}

	public boolean checkIncommingNumber(String incomingNumber) {
		Network checkNetwork = new Network();
		boolean call = false;
		if (checkNetwork.checkReg(incomingNumber)) {
			call = true;
		}
		return call;
	}

	public static void outcommingCall(String outcommingNumber) {
		checkNumbersOutcommingCall(outcomingNumber); 	// ��� ������ ���� �����-�� �������
														// ������� ������
		System.out.println("������.");
	}

	public static void setIncomingNumber(String incomingNumber) {
		Phone.incomingNumber = incomingNumber;
	}

	public static String getIncomingNumber() {
		return incomingNumber;
	}

	@Override
	public String toString() {
		return String.format("Phone [toString()=%s]", super.toString());
	}
	
	
}
