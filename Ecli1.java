import javax.swing.JOptionPane;

public class Ecli1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num=JOptionPane.showInputDialog(null,"indicar numero","par o impar",
		          JOptionPane.QUESTION_MESSAGE);
		  
		  int num1 = Integer.parseInt(num);
		  
		  if( num1%2==0){
		      
		      System.out.println("el num es par");
		    
		  }
		}
	}


