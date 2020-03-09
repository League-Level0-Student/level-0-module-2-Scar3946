package _06_lottery_numbers;
import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryScar {
public static void main(String[] args) {
Random randomMaker = new Random();
for (int i = 0 ; i < 4 ; i ++) {
int randomNumber = randomMaker.nextInt(4);
System.out.println(randomNumber);
	JOptionPane.showMessageDialog(null,randomNumber);
}
		
	}

}
