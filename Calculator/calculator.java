package Calculator;

public class calculator {

	int num1=4,num2=2;
	int result;
    public int add()
    {
    	return result=num1+num2;
    }
    public int sub()
    {
    	return result=num1-num2;
    }
	public calculator() {
		// TODO Auto-generated constructor stub
	}
	public class Main {
	    public static void main(String[] args) {
	        calculator calc = new calculator(); 

	        
	        int additionResult = calc.add();
	        System.out.println("Addition result: " + additionResult);

	        int subtractionResult = calc.sub();
	        System.out.println("Subtraction result: " + subtractionResult);
	    }
	}
}
