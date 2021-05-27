package inheritanceLevel2;

public class TextTransformer {
	private String text;
	
	public TextTransformer() {
	}

	public TextTransformer(String text) {
		this.text = text;
	}

	/**
	 * @param text2 
	 * @return the text
	 */
	public String getText(String text2) {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	
	public String transform(String text) {
		String result = text.toUpperCase();
		return result;
	}

	@Override
	public String toString() {
		return "TextTransformer [text=" + getText(text) + ", getClass()=" + getClass() + "]";
	}
	
	
}