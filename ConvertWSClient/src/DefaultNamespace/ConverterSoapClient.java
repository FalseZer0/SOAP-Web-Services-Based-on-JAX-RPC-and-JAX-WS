package DefaultNamespace;

import java.rmi.RemoteException;
import java.text.DecimalFormat;

public class ConverterSoapClient {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("0.0");
		ConverterProxy proxy = new ConverterProxy();
		System.out.println("Name: Seksembayev Kairat 18078689d");
		float temp;
		try {
			temp = proxy.celsiusToFarenheit(20.0f);
			System.out.println("20.0 degree of Celcius is "+temp+" degree Farenheit.");
			temp = proxy.farenheitToCelsius(20.0f);
			System.out.println("20.0 degree of Farenheit is " +df.format(temp)+" degree Celcius");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
