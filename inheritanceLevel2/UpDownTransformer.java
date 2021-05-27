/**
 * 
 */
package inheritanceLevel2;

/**
 * @author Serg_
 *
 */
public class UpDownTransformer extends TextTransformer {

	/**
	 * 
	 */
	public UpDownTransformer() {
		// TODO Auto-generated constructor stub
	}

	public UpDownTransformer(String text) {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("deprecation")
	public String transform(String text) {
		String result = "";
		char[] str = text.toCharArray();
		for (int i = 0; i < text.length(); i++) {
			char a = str[i];
			Character a1 = new Character(a);
			Character a2 = new Character(a);
			if(i%2 == 0) {
				a2 = new Character(Character.toUpperCase(a1));
			} else {
				a2 = new Character(Character.toLowerCase(a1));
			}
			result = result + a2;
		}
		return result;
	}

	@Override
	public String toString() {
		return "UpDownTransformer [" + (super.toString() != null ? "toString()=" + super.toString() + ", " : "")
				+ (getClass() != null ? "getClass()=" + getClass() : "") + "]";
	}
	
	
}
