/**
 * @(#)TicTacToe.java
 *
 *
 * @author Krkan
 * @version 1.00 2011/12/12
 */



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JFrame implements ActionListener{


JButton One, Two, Three, Four, Five, Six, Seven, Eight, Nine = new JButton();

ImageIcon O = new ImageIcon("o_btn.png");
ImageIcon X = new ImageIcon("x_btn.png");
int moves = 0;
int grid[][] = new int[3][3];

public TicTacToe() {


//Initierar grid. All värden är 7 eftersom den högsta summan kommer att vara 6 i grid.

for (int i = 0; i<3; i++){

for (int k = 0; k<3; k++)
{

grid[i][k] = 7;

}

}

//En 3x3 layout
GridLayout Layout = new GridLayout(3,3);

//Lite Knappar
One = new JButton();
Two = new JButton();
Three = new JButton();
Four = new JButton();
Five = new JButton();
Six = new JButton();
Seven = new JButton();
Eight = new JButton();
Nine = new JButton();


//Lägger till knappar in griden
add(One);
add(Two);
add(Three);
add(Four);
add(Five);
add(Six);
add(Seven);
add(Eight);
add(Nine);

//Byter knapparnas färg till vit
One.setBackground(Color.white);
Two.setBackground(Color.white);
Three.setBackground(Color.white);
Four.setBackground(Color.white);
Five.setBackground(Color.white);
Six.setBackground(Color.white);
Seven.setBackground(Color.white);
Eight.setBackground(Color.white);
Nine.setBackground(Color.white);

//Lite allmänna inställningar på hur stort fönstet är etc.
setLayout(Layout);
setTitle("Tic Tac Toe - Tre i rad!");
setSize(400,400);
setResizable(false);
setVisible(true);


//Lägger till en lystnare för knapparna
One.addActionListener(this);
Two.addActionListener(this);
Three.addActionListener(this);
Four.addActionListener(this);
Five.addActionListener(this);
Six.addActionListener(this);
Seven.addActionListener(this);
Eight.addActionListener(this);
Nine.addActionListener(this);


//Programet stängs av om rutan stängs ner
setDefaultCloseOperation(EXIT_ON_CLOSE);


}


//Min händelsehanterare! Den kontrolerar vad knapparna gör!

public void actionPerformed(ActionEvent e){

	if (e.getSource()==One)
	{

		if (moves%2 != 0)
		{
			One.setIcon(O);
			grid[0][0] = 1;

		}
		else
		{
		One.setIcon(X);
		grid[0][0] =2;
		}


		One.setEnabled(false);


	}
	else if (e.getSource()==Two)
	{

		if (moves%2 != 0)
		{
		Two.setIcon(O);
		grid[0][1] =1;
		}
		else
		{
		Two.setIcon(X);
		grid[0][1] =2;
		}


		Two.setEnabled(false);

	}
		else if (e.getSource()==Three)
	{

		if (moves%2 != 0)
		{
		Three.setIcon(O);
		grid[0][2] = 1;
		}
		else
		{
		Three.setIcon(X);
		grid[0][2] =2;
		}


		Three.setEnabled(false);

	}
		else if (e.getSource()==Four)
	{

		if (moves%2 != 0)
		{
		Four.setIcon(O);
		grid[1][0] =1;
		}
		else
		{
		Four.setIcon(X);
		grid[1][0] = 2;
		}


		Four.setEnabled(false);

	}
		else if (e.getSource()==Five)
	{

		if (moves%2 != 0)
		{
		Five.setIcon(O);
		grid[1][1] = 1;

		}
		else
		{
		Five.setIcon(X);
		grid[1][1] =2;
		}
		Five.setEnabled(false);

	}
		else if (e.getSource()==Six)
	{

		if (moves%2 != 0)
		{
		Six.setIcon(O);
		grid[1][2] =1;
		}
		else
		{
		Six.setIcon(X);
		grid[1][2] = 2;
		}


		Six.setEnabled(false);

	}

		else if (e.getSource()==Seven)
	{

		if (moves%2 != 0)
		{
		Seven.setIcon(O);
		grid[2][0] = 1;
		}
		else
		{
		Seven.setIcon(X);
		grid[2][0] = 2;
		}


		Seven.setEnabled(false);

	}

		else if (e.getSource()==Eight)
	{

		if (moves%2 != 0)
		{
		Eight.setIcon(O);
		grid[2][1] = 1;
		}
		else
		{
		Eight.setIcon(X);
		grid[2][1] = 2;
		}


		Eight.setEnabled(false);

	}

		else if (e.getSource()==Nine)
	{

		if (moves%2 != 0)
		{
		Nine.setIcon(O);
		grid[2][2] = 1;
		}
		else
		{
		Nine.setIcon(X);
		grid[2][2] = 2;
		}


		Nine.setEnabled(false);

	}

	moves++;


	//Kontrolera grid horizontelt!

	for (int i = 0; i<3; i++){

	if (grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2])
	{


	if (grid[i][0] + grid[i][1] + grid[i][2] == 3)
	{


	JOptionPane.showMessageDialog(null, "Game over! \n \n O has won!");
	System.exit(0);

	}
	else if (grid[i][0] + grid[i][1] + grid[i][2] == 6)
	{
	JOptionPane.showMessageDialog(null, "Game over! \n \n X has won!");
	System.exit(0);
	}

}

}


//Kontrolera grid vertikalt!

	for (int i = 0; i<3; i++){

	if (grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i])
	{


	if (grid[0][i] + grid[1][i] + grid[2][i] == 3)
	{


	JOptionPane.showMessageDialog(null, "Game over! \n \n O has won!");
	System.exit(0);

	}
	else if (grid[0][i] + grid[1][i] + grid[2][i] == 6)
	{
	JOptionPane.showMessageDialog(null, "Game over! \n \n X has won!");
	System.exit(0);
	}

}

}

//kontrollera snett från vänster top


if (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2])
	{

		if (grid[0][0] + grid[1][1] + grid[2][2] == 3)
		{
			JOptionPane.showMessageDialog(null, "Game over! \n \n O has won!");
			System.exit(0);
		}
		else if (grid[0][0] + grid[1][1] + grid[2][2] == 6)
		{
			JOptionPane.showMessageDialog(null, "Game over! \n \n X has won!");
			System.exit(0);
		}


}


//kontrollera snett från höger top


if (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0])
	{

		if (grid[0][2] + grid[1][1] + grid[2][0] == 3)
		{
			JOptionPane.showMessageDialog(null, "Game over! \n \n O has won!");
			System.exit(0);
		}
		else if (grid[0][2] + grid[1][1] + grid[2][0] == 6)
		{
			JOptionPane.showMessageDialog(null, "Game over! \n \n X has won!");
			System.exit(0);
		}


}


	if (moves==9)
	{
		JOptionPane.showMessageDialog(null, "Game over! \n \n No winner!");
		System.exit(0);
	}

}





//Main programet som initerar användar gränsnittet.
   public static void main(String[] args)
   {

	TicTacToe start = new TicTacToe();

   }




}