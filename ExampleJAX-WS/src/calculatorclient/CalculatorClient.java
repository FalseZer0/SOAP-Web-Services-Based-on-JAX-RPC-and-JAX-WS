package calculatorclient;

import client.CalculatorImplService;
import client.CalculatorInterface;

public class CalculatorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorImplService service = new CalculatorImplService();
		CalculatorInterface calc = service.getCalculatorImplPort();
		int i = 1,j=44;
		System.out.println("Seksembayev Kairat 18078689d");
		System.out.printf("%d+%d=%d\n",i,j,calc.add(i, j));
	}

}
