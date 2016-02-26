package ru.lesson.lessons.other_lessons;

/**
	Класс реализует калькулятор
*/
public class Calculator{
	/**
		Результат вычисления.
	*/
	private int result=0;
	/**
		Признак нетронутости результата вычислений.
	*/
	private boolean firstAction=true;
	/**
		Сумма всех аргументов.
		@param params Аргументы суммирования.
	*/
	public void add(final int ... params){
		for(Integer param : params){
			this.result+=param;
		}
		if(firstAction)firstAction=false;
	}
	/**
		Вычитание аргументов
		@param params Аргументы вычитания.
	*/
	public void sub(final int ... params){
		for(Integer param : params){
			this.result-=param;
		}
		if(firstAction)firstAction=false;
	}
	/**
		Умножение аргументов
		@param params Аргументы умножения.
	*/
	public void mult(final int ... params){
		for(Integer param : params){
			this.result*=param;
		}
		if(firstAction)firstAction=false;
	}
	/**
		Деление аргументов нацело
		@param params Аргументы деления.
	*/
	public void div(final int ... params){
		for(Integer param : params){
			this.result=this.result/param;
		}
		if(firstAction)firstAction=false;
	}
	/**
		Получить результат.
		@return результат вычисления.
	*/
	public int getResult(){
		return this.result;
	}
	/**
		Получить признак нетронутого результата
		@return признак 
	*/
	public boolean getFirstAction(){
		return this.firstAction;
	}
	/**
		Очистить результат вычисления.
	*/
	public void clearResult(){
		this.result = 0;
		firstAction=true;
	}
}