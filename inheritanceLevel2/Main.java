package inheritanceLevel2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("¬ведите строку:");
		@SuppressWarnings("resource")
		String s = new Scanner(System.in).nextLine();
		
		//	check TextTransformer
		TextTransformer t1 = new TextTransformer();
		System.out.println(t1.transform(s));
		System.out.println(t1.toString());
		
		System.out.println();
		
		//	check InversTransformer
		InverseTransformer t2 = new InverseTransformer();
		System.out.println(t2.transform(s));
		System.out.println(t2.toString());
		
		System.out.println();
		
		// check UpDownTransformer
		UpDownTransformer t3 = new UpDownTransformer(s);
		System.out.println(t3.transform(s));
		System.out.println(t3.toString());
		
		System.out.println();
		
		//	check TextSaver
		TextSaver tS = new TextSaver(s);
		tS.saveTextToFile(s);
		System.out.println(tS.toString());

	}

}
