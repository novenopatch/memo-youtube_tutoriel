import java.awt.BorderLayout;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
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
      
      container.setLayout(new BorderLayout());

      JButton btn1 = new JButton("Koor");
     
      container.add(btn1,BorderLayout.NORTH);

      JButton btn2 = new JButton("cliqueMe");
      btn2.setPreferredSize(new Dimension(200,0));//le haut on le controle pas
      container.add(btn2,BorderLayout.WEST);


      JCheckBox checko =new JCheckBox("check me");
      
      container.add(checko,BorderLayout.SOUTH);

      JTextArea textF = new JTextArea("Edit me!");
     
     
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