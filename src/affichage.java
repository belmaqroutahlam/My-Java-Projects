import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class affichage extends JPanel{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final ActionListener actionListener;
    
    public affichage(ActionListener actionListener){
        this.actionListener = actionListener;
        initComponents();
    }
    
    private final String[][] keyMap = {
        {"M+","M-","%","C"},
        {"7","8","9","/"},
        {"4","5","6","x"},
        {"1","2","3","-"},
        {"0",".","=","+"}
    };
    
    private void initComponents(){
        this.setLayout(new GridLayout(keyMap.length,keyMap.length));
        
        for(String[] line : keyMap){
            for(String caption: line){
                JButton btn = new JButton(caption);
                btn.addActionListener(actionListener);
                this.add(btn);
            }
        }
    }   
}