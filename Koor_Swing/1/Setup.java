import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.UIManager;



public class Setup extends JFrame{

    public Setup(){
        super("My first Swing application");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       // this.setSize(new Dimenssion(600,400));
       this.setSize(600,400);//
       this.setLocationRelativeTo(null);

      JPanel container = (JPanel) this.getContentPane();
      container.setLayout(new FlowLayout());
      container.add(new JButton("First Bouton Koor"));
      container.add(new JButton("Koor"));
      container.add(new JCheckBox("check me"));
      container.add(new JTextField("Edit me!"));
    }
    public static void main(String[] args) throws Exception{
        //integre le look ici on utilise nimbus
        //help /install new software/General purpose tool/ windows core et ui/swing Desiner
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        Setup io = new Setup();
        io.setVisible(true);

    }
}