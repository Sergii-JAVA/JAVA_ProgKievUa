package src.com.ua.lesson5.hometask;

import com.ibm.icu.math.BigDecimal;

public class Level2Ex3Var2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/* Класс для работы с деньгами */
public class fwMoney {

	/* Сумма денег */
	private BigDecimal amount;

	/* Конструктор из Long */
	public fwMoney(long l) {
		String s = String.valueOf(l);
		if (!s.contains(".")) {
			s += ".0";
		}
		this.amount = new BigDecimal(s);
	}

	/* Конструктор из Double */
	public fwMoney(double l) {
		String s = String.valueOf(l);

		if (!s.contains(".")) {
			s += ".0";
		}

		this.amount = new BigDecimal(s);
	}

	/* Конструктор из String */
	public fwMoney(String s) {
		if (!s.contains(".")) {
			s += ".0";
		}
		this.amount = new BigDecimal(s);
	}

	/* Вернуть сумму, как строку */
	public String asString() {
		return amount.toString();
	}
	
	/*Вернуть сумму прописью с точностью до копеек*/
	public String num2str() {
		return num2str(false);
	}
}
