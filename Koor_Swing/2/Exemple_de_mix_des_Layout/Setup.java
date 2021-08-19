import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.UIManager;
import java.awt.Dimension;



public class Setup extends JFrame{

    public Setup(){
        super("My first Swing application");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
       this.setSize(600,400);//
       this.setLocationRelativeTo(null);

      JPanel container = (JPanel) this.getContentPane();
      
      container.setLayout(new BorderLayout());
      container.add(createToolBar(),BorderLayout.NORTH);

      
      
      container.add(createStatutBar(),BorderLayout.SOUTH);

      JScrollPane rara = new JScrollPane(new JTree());
      rara.setPreferredSize(new Dimension(140,0));
      container.add(rara,BorderLayout.WEST);
      container.add(createRightJpanel(),BorderLayout.EAST);

     

      JTextArea textF = new JTextArea("Edit me!");
      JScrollPane ra = new JScrollPane(textF);
     
     
      container.add(ra);
    }
   
    private JToolBar createToolBar(){
        JToolBar toolBar = new JToolBar();
        JButton btn1 = new JButton("Koor");
     
        toolBar.add(btn1);
  
        JButton btn2 = new JButton("cliqueMe");
        toolBar.add(btn2);
  
  
        JCheckBox checko =new JCheckBox("check me");
        toolBar.add(checko);

        JTextField textF1 = new JTextField("Edit me2!");
        textF1.setPreferredSize(new Dimension(140,30));
        toolBar.add(textF1);
        return toolBar;
    } 
    private JPanel createRightJpanel(){
        JPanel panel = new JPanel(new GridLayout(4,1));
        panel.add(new JButton("Bouton1"));
        panel.add(new JButton("Bouton2"));
        panel.add(new JButton("Bouton3"));
        panel.add(new JButton("Bouton4"));
        return panel;
    }
    private JPanel createStatutBar(){
        JPanel statutBar = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JLabel lbl1 = new JLabel("Message 1");
        lbl1.setPreferredSize(new Dimension(100,30));
        statutBar.add(lbl1);

        JLabel lbl2 = new JLabel("Message 2");
        lbl2.setPreferredSize(new Dimension(100,30));
        statutBar.add(lbl2);

        JLabel lbl3 = new JLabel("Message 3");
        lbl3.setPreferredSize(new Dimension(100,30));
        statutBar.add(lbl3);
        return statutBar;

    }
    public static void main(String[] args) throws Exception{
        //help /install new software/General purpose tool/ windows core et ui/swing Desiner
        //integre le look ici on utilise nimbus
        //par defaut c'est le look metal
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        Setup io = new Setup();
        io.setVisible(true);

    }
}