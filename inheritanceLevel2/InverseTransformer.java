/**
 * 
 */
package inheritanceLevel2;

/**
 * @author Serg_
 *
 */
public class InverseTransformer extends TextTransformer {

	/**
	 * 
	 */
	public InverseTransformer() {
		// TODO Auto-generated constructor stub
	}
	
	public InverseTransformer(String text) {
		
	}
	
	@Override
	public String transform(String text) {		// the IDE want to make
														// a constructor from this method
		StringBuffer strBuf = new StringBuffer();
		strBuf.append(text);
		strBuf = strBuf.reverse();
		String result = strBuf.toString();
		return result;
	}

	@Override
	public String toString() {
		return "InverseTransformer [" + (super.toString() != null ? "toString()=" + super.toString() + ", " : "")
				+ (getClass() != null ? "getClass()=" + getClass() : "") + "]";
	}
	
}
