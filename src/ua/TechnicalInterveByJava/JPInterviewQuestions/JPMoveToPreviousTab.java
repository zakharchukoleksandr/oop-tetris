package ua.TechnicalInterveByJava.JPInterviewQuestions;
/*Q # 14) Write a code for Selenium to move to the previous tab.
Answer:We use the Robotclass. This example is important enough
because if you know the shortcuts, you can use different navigation
 in the browser and its tabs.

For example,if you've got three tabs open in Chrome and you want
to switch to the average tab, then you'll need to click on the
keyboard. The same can be achieved with the code.

Apply the following code (as soon as we see the creation of a
robotclass instance). We used the Robot qurentRobot object,
with two built-in keyPress (KeyEvenet.VK_) and keyRelease
(KeyEvenet.VK_).

 */
/*Q # 14) Напишите код для Selenium, чтобы перейти на
предыдущую вкладку.
Ответ: Мы используем класс Robot. Этот пример является
достаточно важным, потому что, если вы знаете сочетания
клавиш, вы можете использовать различную навигацию в браузере
и его вкладках.

Например, если у вас в Chrome открыто три вкладки, и вы хотите
перейти на среднюю вкладку, то вам нужно нажать + 2 на клавиатуре.
То же самое можно достичь с помощью кода.

Применяйте следующий код (сразу после того, как мы увидим
создание экземпляра класса Robot). Мы использовали объект
qurentRobot класса Robot, с двумя встроенными методами
keyPress(KeyEvenet.VK_ *) и keyRelease(KeyEvenet.VK_ *).*/

/*
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JPMoveToPreviousTab {
    public static void main(String[] args) throws AWTException {

        // ITVDN. com 14 of the top 20 test jobs interviewed for Java developer

        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");

        WebDriver curentDriver = new ChromeDriver();

        curentDriver.manage().window().maximize();

        curentDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        curentDriver.get("https://www. google. com ");

        WebElement firstElement = curentDriver.findElement(By.name("q"));

        firstElement.sendKeys("software testing help");

        firstElement.sendKeys(Keys.ENTER);

        String str = Keys.chord(Keys.CONTROL,Keys.RETURN);

        curentDriver.findElement(By.partialLinkText("Software Testing Help - A Must Visit Software Testing Portal")).sendKeys(str);

        Robot qurentRobot = new Robot(); We're initializing a robot class instance

        qurentRobot.keyPress(KeyEvent.VK_CONTROL); By applying the Robot class you can easily get the desired result if you know the right combinations of buttons

        qurentRobot.keyPress(KeyEvent.VK_2); Here we press ctrl

        qurentRobot.keyRelease(KeyEvent.VK_CONTROL); as soon as we click and release the ctrl'2, we'll move to the second tab.

        qurentRobot.keyRelease(KeyEvent.VK_2); If you want to go back to the first tab click and release the vk_1

    }
}
*/
