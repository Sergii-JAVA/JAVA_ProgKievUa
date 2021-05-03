package src.com.ua.lesson5.hometask;

import com.ibm.icu.math.BigDecimal;

public class Level2Ex3Var2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/* ����� ��� ������ � �������� */
public class fwMoney {

	/* ����� ����� */
	private BigDecimal amount;

	/* ����������� �� Long */
	public fwMoney(long l) {
		String s = String.valueOf(l);
		if (!s.contains(".")) {
			s += ".0";
		}
		this.amount = new BigDecimal(s);
	}

	/* ����������� �� Double */
	public fwMoney(double l) {
		String s = String.valueOf(l);

		if (!s.contains(".")) {
			s += ".0";
		}

		this.amount = new BigDecimal(s);
	}

	/* ����������� �� String */
	public fwMoney(String s) {
		if (!s.contains(".")) {
			s += ".0";
		}
		this.amount = new BigDecimal(s);
	}

	/* ������� �����, ��� ������ */
	public String asString() {
		return amount.toString();
	}
	
	/*������� ����� �������� � ��������� �� ������*/
	public String num2str() {
		return num2str(false);
	}
}
