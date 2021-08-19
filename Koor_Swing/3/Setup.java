import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;



public class Setup extends JFrame implements ActionListener{

    /**
	 * 
	 */
	private static final long serialVersionUID = 5568118711046980683L;

	public Setup(){
        super("My first Swing application");
        setForeground(SystemColor.controlHighlight);
        setFont(new Font("Arial Black", Font.BOLD, 13));
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//DISPOSE_ON_CLOSE);
       
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
      textF.setBackground(SystemColor.controlDkShadow);
      JScrollPane ra = new JScrollPane(textF);
     
     
      container.add(ra);
      this.addWindowListener(new WindowAdapter() {
		
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			int click = JOptionPane.showConfirmDialog(Setup.this, "Etes-vous sur de vouloir quiter","Confirmez",JOptionPane.YES_NO_OPTION);
			if(click == JOptionPane.YES_OPTION) {
				//Setup.this.dispose();
				dispose();
			}
			
			
		}
		
		
	});
    }
   
    private JToolBar createToolBar(){
        JToolBar toolBar = new JToolBar();
        toolBar.setFloatable(false);
        JButton btn1 = new JButton("Koor");
        //btn1.addActionListener(this);
        btn1.addActionListener(this::tor);//c'est le compilateur qui trouve tout mais biensure comme elle foncionne que les fonctions lambda elle
        //elle ne fonctione que pour les interaces avec une seul methode abstraite
     
        toolBar.add(btn1);
  
        JButton btn2 = new JButton("cliqueMe");
        btn2.addActionListener( (e) ->tor(e) );
        /*
        btn2.addMouseListener(new MouseListener() {
        

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				btn2.setForeground(Color.RED);
				//clique retirer
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				btn2.setForeground(Color.BLUE);
				//clique du bouton
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				btn2.setForeground(Color.cyan);
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				btn2.setForeground(Color.black);
			}
        	
        	
        });
        */
        btn2.addMouseListener(new MouseAdapter() {
        	@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				btn2.setForeground(Color.RED);
				System.out.println("Red");
				//clique retirer
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				btn2.setForeground(Color.BLUE);
				System.out.println("Blue");
				//clique du bouton
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				btn2.setForeground(Color.GREEN);
				System.out.println("Green");
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				btn2.setForeground(Color.cyan);
				System.out.println("cyan");
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				btn2.setForeground(Color.black);
				System.out.println("Black");
			}
        	
		});
      
        toolBar.add(btn2);
  
  
        JCheckBox checko =new JCheckBox("check me");
        toolBar.add(checko);

        JTextField textF1 = new JTextField("Edit me2!");
        textF1.setPreferredSize(new Dimension(140,30));
        toolBar.add(textF1);
        
        btn1.addActionListener((event)->System.out.println("New mwthode pour les interface avec une seul methode abstraite"));//pour plusieurs instruction accolade ouvrente et fermante
        //le lambda
        return toolBar;
    } 
    private void tor(ActionEvent event) {
    	System.out.println("Ca fonctionne la methode encore plus bizarre de la fonction lambda qui renvoie a une fonction");
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

	@Override
	public void actionPerformed(ActionEvent event) {
		if ( ((JButton)event.getSource()).getText().equals("cliqueMe")) {
				System.out.println("Clique_me methode non recomandez!");
			
			
		} 
		else
		 	System.out.println("Vous avez cliquez");
		// TODO Auto-generated method stub
		
	}
}