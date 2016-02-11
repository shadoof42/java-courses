import java.util.Scanner;
/**
	Класс для запуска калькулятора. Поддерживает ввод пользователя.
*/
public class InteractRunner{
	protected static Scanner reader = new Scanner(System.in);//Общий сканнер
	protected Calculator calc = new Calculator();
	/*
	public static void main(String[] arg){
		Scanner reader = new Scanner(System.in);
		try{
			Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("yes")){
				System.out.println("Enter first arg : ");
				String first = reader.next();
				System.out.println("Enter next arg : ");
				String next = reader.next();
				calc.add(Integer.valueOf(first), Integer.valueOf(next));
				System.out.println("Result : " + calc.getResult());
				calc.clearResult();
				System.out.println("Exit : yes/no ");
				exit = reader.next();
			}
		}finally{
			reader.close();
		}
	}
	*/
	/**
		Выполнение операции.
	*/
	private void perform(final int next,final String action){
		//System.out.println("Action:" + action);
		switch(action){
			case "+":
				calc.add(next);		
				break;
			case "-":
				calc.sub(next);
				break;
			case "*":
				calc.mult(next);
				break;
			case "/":
				calc.div(next);
				break;
			case "clear":
				calc.clearResult();
				break;
			default:
				System.out.println("No such operation! Please try again))))");
				break;
		}
	}	
	/**
		Получение операндов и операции от пользователя.
	*/
	private String[] getParams(){
		String[] params = new String[3];
		//Проверяем, начинали ли мы работать  
		if(calc.getFirstAction()){
			System.out.println("Enter first arg : ");
			calc.add(Integer.valueOf(reader.next()));
		}else System.out.println("Previous result = " + calc.getResult());
		params[0] = Integer.toString(calc.getResult());
		System.out.println("Enter sign of action or 'clear' to clear result : ");
		params[1] = reader.next();
		if (!params[1].equals("clear")){
			System.out.println("Enter second arg : ");
			params[2] = reader.next();
		}
		return params;
	}
	
	
	public static void main(String[] arg){
		InteractRunner runner = new InteractRunner();
		try{
			String exit = "no";
			while (!exit.equals("yes")){
				
				String[] params=runner.getParams();
				//System.out.println(params);
				runner.perform(Integer.valueOf(params[2]),params[1]);
				System.out.println("Result : " + runner.calc.getResult());
				System.out.println("Exit? : yes/no ");
				exit = reader.next();
			}
		}finally{
			reader.close();
		}
	}
}