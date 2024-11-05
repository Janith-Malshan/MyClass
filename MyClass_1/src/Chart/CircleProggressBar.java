
package Chart;

import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.plaf.ProgressBarUI;

public class CircleProggressBar extends JProgressBar{
    
    
    public CircleProggressBar(){
         setOpaque(false);
         setBackground(new Color(220,220,220));
         setForeground(new Color(97,97,97));
         setStringPainted(true);
         setUI(new ProgressCircleUI(this));
    
    
    
    }

}
