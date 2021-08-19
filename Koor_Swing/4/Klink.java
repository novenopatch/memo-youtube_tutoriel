import java.awt.AWTEvent;
import java.awt.Cursor;

public class Klink extends JLabel{
	private static final Color LColor = new Color(51,123,200);
	
	public Klink(String text) {
		super("<htlm><u>"+text+"</u></htlm>");
		this.setForeground(LColor);
		this.setCusor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
} 