package stepDefinition;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;



public class StepDefinition {

    private int firstNumber;
    private int secondNumber;
    private int actual;


    @Дано("^Первое число равно (\\d+)$")
    public void getFirstNum(int num1)  {
        firstNumber = num1;
    }

    @И("^Второе число равно (\\d+)$")
    public void getSecondNum(int num2) {
        secondNumber = num2;
    }

    @Когда("Я складываю числа")
    public void summarize() {
        actual = firstNumber + secondNumber;
    }

    @Тогда("^Результат равен (\\d+)$")
    public void getResult(int expected) {
        assert actual == expected;
    }

    @Тогда("^Результат не равен (\\d+)$")
    public void getFailResult(int expected) {
        assert actual != expected;
    }
}
