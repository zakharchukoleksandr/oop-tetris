package ua.TechnicalInterveByJava.JPInterviewQuestions;
/*Q # 12) Write a Java program to demonstrate up/down scrolling.
Answer:

All lines of code easily correlate with the code from
the previous example.
We've included JavascriptExecutor jscriptin the code
of this program, which will scroll. On the last line
of code we pass window.scrollBy (argument1, argument2).
If we need to scroll up, then we pass some value in
argument1,if we need to scroll down - we pass some
value in argument2.*/
/*Q # 12) Напишите Java-программу для демонстрации прокрутки вверх / вниз.
Ответ:

Все строки кодов легко соотносятся с кодом из предыдущего примера.
В код этой программы мы включили JavascriptExecutor jscript,
который будет выполнять прокрутку. На последней строке кода
мы передаём window.scrollBy(argument1, argument2).
Если нам нужно выполнить прокрутку вверх, тогда передаем
некоторое значение в argument1, если нам нужно прокрутить
вниз - передаем некоторое значение в argument2.*/

/*import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
public class JPUpDownScrolling {
    public static void main(String[] args) {

        // ITVDN. com 12 of the top 20 test jobs interviewed for a Java developer

        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");

        WebDriver qurentDriver = new ChromeDriver();

        JavascriptExecutor jscript = (JavascriptExecutor) qurentDriver;

        qurentDriver.manage().window().maximize();

        qurentDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        qurentDriver.get("https://www. google. com. ua ");

        WebElement qurentElement = qurentDriver.findElement(By.name("q"));

        qurentElement.sendKeys("SoftwareTestingHelp");

        qurentElement.sendKeys(Keys.ENTER);

        jscript.executeScript("window.scrollBy(0,900)");



    }
}
*/