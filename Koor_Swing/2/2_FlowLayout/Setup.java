import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.UIManager;
import java.awt.Dimension;



public class Setup extends JFrame{

    public Setup(){
        super("My first Swing application");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       // this.setSize(new Dimenssion(600,400));
       this.setSize(600,400);//
       this.setLocationRelativeTo(null);

      JPanel container = (JPanel) this.getContentPane();
      //container.setLayout(new FlowLayout());
      container.setLayout(new FlowLayout(FlowLayout.RIGHT,20,20));//(<alignemnt,marge x ,marge y>)par defaut l'alignement est center

      JButton btn1 = new JButton("Koor");
      btn1.setPreferredSize(new Dimension(120,30));
      
      container.add(btn1);


      JCheckBox checko =new JCheckBox("check me");
      
      container.add(checko);

      JTextField textF = new JTextField("Edit me!");
      textF.setPreferredSize(new Dimension(120,30));
     
      container.add(textF);
    }
    public static void main(String[] args) throws Exception{
        //integre le look ici on utilise nimbus
        //help /install new software/General purpose tool/ windows core et ui/swing Desiner
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        Setup io = new Setup();
        io.setVisible(true);

    }
}