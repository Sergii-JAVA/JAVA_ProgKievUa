/**
 * 
 */
package inheritanceLevel2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Serg_
 *
 */
public class TextSaver {
	Scanner sc = new Scanner(System.in);

	private TextTransformer transformer;
	private File file;

//	public TextSaver() {
//		
//	}

	public TextSaver(String text) {
		transformer = new TextTransformer(text);
	}

	/**
	 * @return the transformer
	 */
	public TextTransformer getTransformer() {
		return transformer;
	}

	/**
	 * @return the file
	 */
	public File getFile() {
		return file;
	}

	/**
	 * @param transformer the transformer to set
	 */
	public void setTransformer(String text) {
		transformer.setText(text);
	}

	/**
	 * @param file the file to set
	 */
	public void setFile(File file) {
		this.file = file;
	}

	public void saveTextToFile(String text) {
		System.out.println("Choose a transformer:");
		System.out.println("1: TextTransformer;");
		System.out.println("2: InverseTransformer;");
		System.out.println("3: UpDownTransformer.");
		
		int choose = sc.nextInt();
		
		if (choose == 1) {
			TextTransformer a = new TextTransformer(text);
			String b = a.transform(text);
			transformer.setText(b);
		} else if (choose == 2) {
			InverseTransformer a = new InverseTransformer(text);
			String b = a.transform(text);
			transformer.setText(b);
		} else {
			UpDownTransformer a = new UpDownTransformer(text);
			String b = a.transform(text);
			transformer.setText(b);
		}
		System.out.println(transformer.getText(text));
		
		File file = new File("a.txt");
		try {
			file.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try (PrintWriter pW = new PrintWriter("a.txt")) {
			pW.print(transformer.getText(text));
		} catch (FileNotFoundException e) {
			System.out.println("Error write file");
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "TextSaver [transformer=" + transformer + ", file=" + file + "]";
	}
	
	
}
