import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class display extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField display;

    public display() {
        initComponents();
    }
    
    private void initComponents() {
        this.setLayout(new GridLayout(1, 1));

        display = new JTextField("0");
        display.setHorizontalAlignment(JTextField.RIGHT);
        this.add(display);
    }

    public void setValue(String value) {
        this.display.setText(value);
    } 
}