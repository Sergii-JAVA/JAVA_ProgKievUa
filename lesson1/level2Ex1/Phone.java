package level2Ex1;

import java.io.*;

public class Phone {
	
	//	Тут должна быть другая логика, но пусть будет так
	final static String myNumber = "0000000000";	// Пусть эти данные будут как final
	private static String incomingNumber;
	private static String outcomingNumber;

	public static void main(String[] args) {
		char turn = 0;
		incomingNumber = "1111111111";	//	Формируется внутри этого класса
		outcomingNumber = "2222222222";	//	Должен прийти из другого класса

		System.out.println("Включить телефон.");
		System.out.println("Для регистрации в сети, нажмите 'Y'" + " , в противном случае 'N'.");

		try {
			turn = (char) System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Проверка номера по базе
		Network checkNetwork = new Network();
		if (turn == 'Y') {
			networkCheck(myNumber);
		} else if(turn == 'N'){
			System.out.println("Вы хотите использовать телефон в автономном режиме?...");
		} else {
			System.out.println("Введенный символ не соответствует предложенным.");
		}

		outcommingCall(outcomingNumber);

	}
	
	private static boolean networkCheck(String myNumber) {
		Network checkNetwork = new Network();
		boolean call = false;
		if(checkNetwork.checkReg(myNumber)) {
			System.out.println("Ваш номер телефона не может быть зарегистрирован в сети.");
			System.exit(0);
			call = true;
		} else {
			System.out.println("Завершение программы. Телефон работает " + "в автономном режиме.");
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
			System.out.println("Набираемый номер - не зарегистрирован в сети.");
			System.exit(0);
		}
		if (checkNetwork.checkReg(myNumber)) {
			call = true;
		} else {
			System.out.println("Ваш номер телефона не может быть зарегистрирован в сети.");
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
		checkNumbersOutcommingCall(outcomingNumber); 	// Тут должна быть какая-то функция
														// которая звонит
		System.out.println("Звонок.");
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
