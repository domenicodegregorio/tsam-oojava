
import java.util.Scanner;

public class CambiaMonete {
		static int[] banknotes = {500,200,100,50,20,10,5,2,1};
	
	public static void main(String[] args){
		System.out.println("Inserire il valore della banconota da cambiare");
		Scanner in = new Scanner(System.in);
		Tagli dosh = new Tagli(in.nextInt());
		int[] result = dosh.getMaxChange();
		System.out.println("Si possono usare: ");
		for(int i=0;i<result.length;++i){
			if(result[i]>0){
				System.out.println(result[i]+" banconote da "+banknotes[i]);
			}
		}
	}
}
