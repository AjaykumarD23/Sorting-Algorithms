package bubblesort;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BubbleSort extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BubbleSort frame = new BubbleSort();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BubbleSort() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("SORTING");
		heading.setForeground(new Color(0, 0, 255));
		heading.setFont(new Font("Algerian", Font.BOLD, 17));
		heading.setBounds(163, 28, 70, 24);
		contentPane.add(heading);
		
		JLabel tl = new JLabel("ENTER NUMBERS FOR SORTING");
		tl.setForeground(new Color(234, 21, 69));
		tl.setFont(new Font("Times New Roman", Font.BOLD, 15));
		tl.setBounds(99, 62, 246, 18);
		contentPane.add(tl);
		
		JTextArea ta1 = new JTextArea();
		ta1.setBounds(99, 90, 240, 24);
		contentPane.add(ta1);
		
		JLabel tl1 = new JLabel("ENTER NUMBERS FOR SORTING");
		tl1.setForeground(new Color(234, 21, 69));
		tl1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		tl1.setBounds(99, 131, 246, 18);
		contentPane.add(tl1);
		
		JTextArea ta2 = new JTextArea();
		ta2.setBounds(99, 158, 240, 24);
		contentPane.add(ta2);
		
		JButton sort = new JButton("BUBBLE SORT");
		sort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			// logic for sorting
				 String sentence = ta1.getText();
				 String arr[] = sentence.split(" ");
				 String help;
				 for(int i=0; i<=arr.length-2;i++) {
					 for(int j=0; j<=arr.length-2-i;j++) {
						 if(Integer.valueOf(arr[j])>Integer.valueOf(arr[j+1])) {
							 help = arr[j];
							 arr[j]=arr[j+1];
							 arr[j+1]=help;
						 }
					 }
				 }
				 String result="";
				 for(int i=0; i<=arr.length-1;i++) {
					 result = result+arr[i]+" ";
					 
				 }
				 ta2.setText(result);
			}
		});
		sort.setFont(new Font("Algerian", Font.BOLD, 14));
		sort.setBounds(136, 200, 129, 27);
		contentPane.add(sort);
	}
}
