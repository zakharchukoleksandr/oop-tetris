package ua.TechnicalInterveByJava.JPInterviewQuestions;
/*Q # 11) Write a program to Java to demonstrate a clear
check of the waiting conditions.
Answer:

Selenium has two main types of waiting - implicitwaitandexplicit
 Wait. (We don't consider explicit (free)
 expectation in this example).)
Implicit wait - is announced once in code outside of the search
 operation and valid until the change. This wait is made regardless
  of any condition and applies to all subsequent search operations
  implicitly. In the program below, you can see the application
  of this expectation for Google Chrome. We used several built-in
  techniques to install properties, maximize windows, navigate the
   URL, and search for web items.

WebDriverWait waitWD = new WebDriverWait(curentDriver, 20);
WebElement secondElement q waitWD.until
(ExpectedConditions.visibilityOfElementLocated
(By.partialLinkText ("Software testing - Wikipedia"));
secondElement.click();
In the code fragment above, you can see that we created a
waitWD for WebDriverWait,and then we searched webElement with
the name secondElement.
The condition is established so that the web driver will have
to wait until we see the link "Testing software - Wikipedia"
on the web page. The team won't run unless you find this link.
If a link is found, the web driver will click on this link.*/

/*Q # 11) Напишите программу на Java, чтобы продемонстрировать
явную проверку условий ожидания.
Ответ:

В Selenium есть два основных типа ожидания – неявное(Implicit Wait)
 и явное (Explicit Wait). (Мы не рассматриваем явное (свободное)
 ожидание в этом примере).
Неявное ожидание - объявляется один раз в коде вне операции поиска
и действует до изменения.  Это ожидание выполняется независимо от
какого-либо условия и применяется ко всем последующим операциям
поиска неявно. В приведенной ниже программе вы можете видеть
применение такого ожидания для Google Chrome.  Мы использовали
несколько встроенных методов для установки свойства, максимизации окна, навигации по URL и поиска веб-элементов.

WebDriverWait waitWD = new WebDriverWait(curentDriver, 20);
WebElement secondElement = waitWD.until(ExpectedConditions.
visibilityOfElementLocated(By.partialLinkText
("Тестирование программного обеспечения - Википедия")));
secondElement.click();
В приведенном выше фрагменте кода вы можете видеть, что мы
создали объект waitWD для WebDriverWait, а затем мы выполнили
поиск WebElement с именем secondElement.
Условие установлено таким образом, что веб-драйверу придется
ждать, пока мы не увидим ссылку «Тестирование программного
обеспечения - Википедия» на веб-странице. Команда не выполнится,
если не найдет эту ссылку. Если ссылка будет найдена,
то веб-драйвер выполнит щелчок мышью по этой ссылке. */

/*import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;*/


public class JPClearCheckWaitingCond {
    public static void main(String[] args) {
        //  10 of the top 20 test jobs for a Java developer interview
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");

       // ChromeOptions cOptions = new ChromeOptions();
       // cOptions.addArguments("--disable-arguments");

        //WebDriver curentDriver = new ChromeDriver();
       // curentDriver.manage().window().maximize();
        //curentDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       // curentDriver.navigate().to("https://www. google. com. ua ");

        //WebElement curentElement = curentDriver.findElement(By.name("q"));
       // curentElement.sendKeys("Testing");
        //curentElement.submit();

       // WebDriverWait waitWD = new WebDriverWait(curentDriver, 20);
        //WebElement secondElement q waitWD.until (ExpectedConditions.visibilityOfElementLocated (By.partialLinkText ("Software testing - Wikipedia"));
        //secondElement.click();

    }
}
