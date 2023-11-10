import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class calculator implements ActionListener{
   
	JFrame frame;
	JTextField textfield;
	JButton[] numberbuttons = new JButton[10];    //represents number 0 to 9 
	JButton[] functionbutton = new JButton[8];    // represents function +-....
	JButton addButton,subButton,mulButton,divButton;
	JButton eqButton,clrButton,delButton,decButton;
	JPanel jpanel;
	
	Font myfont = new Font("Arial",Font.BOLD,35);
	double n1 =0,n2=0,result=0;
	char operator;
	
          calculator()
          {
        	  frame = new JFrame("Calculator");
        	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	  frame.setSize(420,550);
        	  frame.setLayout(null);
              
              
              textfield = new JTextField();
              textfield.setBounds(50,25,300,50);
              textfield.setFont(myfont);
              textfield.setEditable(false);
              
              addButton = new JButton("+");
              subButton = new JButton("-");
              mulButton = new JButton("*");
              divButton = new JButton("/");
              eqButton = new JButton("=");
              clrButton = new JButton("Clear");
              delButton = new JButton("Delete");
              decButton = new JButton(".");
              
              functionbutton[0] = addButton;
              functionbutton[1] = subButton;
              functionbutton[2] = mulButton;
              functionbutton[3] = divButton;
              functionbutton[4] = eqButton;
              functionbutton[5] = clrButton;
              functionbutton[6] = delButton;
              functionbutton[7] = decButton;
          
              
              for(int i =0;i<8;i++)
              {
            	  functionbutton[i].addActionListener(this);
            	  functionbutton[i].setFont(myfont);
            	  functionbutton[i].setFocusable(false);
              }
              
              for(int i=0;i<10;i++)
              {
            	numberbuttons[i] = new JButton(String.valueOf(i));
            	numberbuttons[i].addActionListener(this);
           	    numberbuttons[i].setFont(myfont);
           	    numberbuttons[i].setFocusable(false);
            	
              }
              delButton.setBounds(50,430,145,50);
              clrButton.setBounds(205,430,145,50);
              
              jpanel = new JPanel();
              jpanel.setBounds(50,100,300,300);
              jpanel.setLayout(new GridLayout(4,4,10,10));
              
              jpanel.add(numberbuttons[1]);
              jpanel.add(numberbuttons[2]);
              jpanel.add(numberbuttons[3]);
              jpanel.add(addButton);
              jpanel.add(numberbuttons[4]);
              jpanel.add(numberbuttons[5]);
              jpanel.add(numberbuttons[6]);
              jpanel.add(subButton);
              jpanel.add(numberbuttons[7]);
              jpanel.add(numberbuttons[8]);
              jpanel.add(numberbuttons[9]);
              jpanel.add(mulButton);
              jpanel.add(decButton);
              jpanel.add(numberbuttons[0]);
              jpanel.add(eqButton);
              jpanel.add(divButton);
              
                           
              frame.add(jpanel);
              frame.add(delButton);
              frame.add(clrButton);
              frame.add(textfield);        ///add text field to frame so its visible in calculator 
              frame.setVisible(true);     ///used to display the calculator on screen
          }	  
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator c =  new calculator();

	}

	@Override
	public void actionPerformed(ActionEvent e) {              ////it should implement this method as actionlistener implements it.
		// TODO Auto-generated method stub
		
		for(int i =0;i<10;i++)
		{
			if(e.getSource() == numberbuttons[i])
			{
				textfield.setText(textfield.getText().concat(String.valueOf(i)));
			}	
		}
		if(e.getSource()==decButton) {
			textfield.setText(textfield.getText().concat("."));
		}
		if(e.getSource()==addButton) {
			n1 = Double.parseDouble(textfield.getText());
			operator ='+';
			textfield.setText("");
		}
		if(e.getSource() == subButton)
		{
			n1 = Double.parseDouble(textfield.getText());
			operator = '-';
			textfield.setText("");
		}
		if(e.getSource() == mulButton)
		{
			n1 = Double.parseDouble(textfield.getText());
			operator = '*';
			textfield.setText("");
		}
		if(e.getSource() == divButton)
		{
			n1 = Double.parseDouble(textfield.getText());
			operator = '/';
			textfield.setText("");
		}
		if(e.getSource() == eqButton)
		{
			n2 = Double.parseDouble(textfield.getText());
	    
		switch(operator)
		{
		case '+':
			 result = n1+n2;
			 break;
		case '-':
			 result = n1-n2;
			 break;		 
		case '*':
			 result = n1*n2;
			 break;	 
		case '/':
			 result = n1/n2;
			 break;	 
		}
		textfield.setText(String.valueOf(result));
		n1 = result;
              }
		if(e.getSource()==clrButton) {
			textfield.setText("");
		}
		if(e.getSource()==delButton)
		{
			String str = textfield.getText();
			textfield.setText("");
			for(int i=0;i<str.length()-1;i++)
			{
				textfield.setText(textfield.getText()+str.charAt(i));
				
			}
				
		}
		        
	}
}
