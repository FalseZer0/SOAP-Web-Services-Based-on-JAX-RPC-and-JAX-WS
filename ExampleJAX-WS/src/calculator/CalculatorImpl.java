package calculator;
import javax.jws.WebService;

@WebService(endpointInterface = 
			"calculator.CalculatorInterface")
public class CalculatorImpl implements CalculatorInterface{
	@Override
	public int add(int i, int j) {
		return i+j;
	}
}
