import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;


public class GridView extends JPanel implements ActionListener
{
	DobbelsteenModel d;
	//variabelen die het aantal bijhoudt.
	int totalRolls;	
	int eenNum;
	int tweeNum;
	int drieNum;
	int vierNum;
	int vijfNum;
	int zesNum;
	
	//tekstveld voor display van nummers.
	private JTextField een = new JTextField(0);
	private JTextField twee = new JTextField(0);
	private JTextField drie = new JTextField(0);
	private JTextField vier = new JTextField(0);
	private JTextField vijf = new JTextField(0);
	private JTextField zes = new JTextField(0);
	private JTextField totaal = new JTextField(0);
	
	public GridView()
	{
		setLayout(new GridLayout(8,2,5,5));
		add(een);		
		add(twee);
		add(drie);
		add(vier);
		add(vijf);
		add(zes);
		add(totaal);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		d = (DobbelsteenModel) e.getSource();
		int nummer = d.getWaarde();
		this.statsList(nummer);		
	}
	
	public void statsList (int num){	
		totalRolls++;
		totaal.setText("Totaal aantal worpen: " + totalRolls);
		if (num == 1){
			eenNum++;
			een.setText("1: " + eenNum + " keer");
		}
		else if(num == 2){
			tweeNum++;
			twee.setText("2: " + tweeNum + " keer");
		}
		else if(num == 3){
			drieNum++;
			drie.setText("3: " + drieNum + " keer");
		}
		else if(num == 4){
			vierNum++;
			vier.setText("4: " + vierNum + " keer");
		}
		else if(num == 5){
			vijfNum++;
			vijf.setText("5: " + vijfNum + " keer");
		}
		else if(num == 6){
			zesNum++;
			zes.setText("6: " + zesNum + " keer");
		}
	}
	
	public Dimension getPreferredSize(){
		return new Dimension (150, 100);
	}
}
