package level2Ex1;

import java.util.ArrayList;
import java.util.List;

public class Network {

		
		List<String> numbers = new ArrayList<>();
		{				//	Почему то работает только так
			numbers.add("0000000000");
			numbers.add("1111111111");
			numbers.add("2222222222");
			numbers.add("3333333333");
			numbers.add("4444444444");
			numbers.add("5555555555");
			numbers.add("6666666666");
			numbers.add("7777777777");
			numbers.add("8888888888");
			numbers.add("9999999999");
		}
		
		public boolean checkReg(String number) {
			boolean check = false;
			for (int i = 0; i < numbers.size(); i++) {
				if(numbers.contains(number)) {
					return true;
				}
			}
			return check;
		}



	
}