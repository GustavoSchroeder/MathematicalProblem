import javax.swing.JOptionPane;

public class SpecialPythagoreanTriplet {
	private double cQuadrado;
	private double c;
	
	public SpecialPythagoreanTriplet(){
	}
	
	public void product(int num){
		for(int a = 3; a <= num; a++){
			for(int b = a+1; b < num; b++){
				cQuadrado = Math.pow(a, 2) + Math.pow(b, 2);
				c = Math.pow(cQuadrado, 0.5);
				
				if(a + b + c == 1000){
					System.out.println(a + "\n" + b + "\n" + c);
					System.out.println((a * b) * (c));
				}
			}
		}
			System.out.println("Terminated");

 
	}
	
	public static void main(String [] args){
		SpecialPythagoreanTriplet spt = new SpecialPythagoreanTriplet();
		spt.product(Integer.parseInt(JOptionPane.showInputDialog("Insira um número válido: ")));
	}
}

