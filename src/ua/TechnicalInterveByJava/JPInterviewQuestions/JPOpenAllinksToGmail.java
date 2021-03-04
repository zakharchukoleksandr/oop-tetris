package ua.TechnicalInterveByJava.JPInterviewQuestions;
/*Write to the programin Java to open alllinks to gmail. com.
Answer:

This is a typical example of the improved forloop that
we've seen in our previous examples.

Once you've opened a website such as Gmail using get()
or navigate(), you can use the tagNamelocator to get all
links to the website that have the same tags.

We have an improved forloop in which we bypass all the
found links on our tag. For each Link like WebElement
in our link sheet, we get the links ourselves through
getAttribute ("href") and texts through getText.)*/
/*Q # 13) Напишите программу на Java, чтобы открыть все ссылки
на gmail.com.
Ответ:

Это типичный пример применения улучшенного цикла for, который
мы видели в наших предыдущих примерах.

После того, как вы открыли веб-сайт, такой как Gmail, используя
get() или navigate().to(), вы можете использовать локатор tagName,
чтобы получить все ссылки на веб-сайте, имеющие одинаковые теги.

У нас есть улучшенный цикл for, в котором мы обходим все найденные
ссылки по нашему тегу.  Для каждой ссылки типа WebElement в нашем
листе ссылок, мы получаем сами ссылки через getAttribute(«href»)
и тексты через getText().*/
/*
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;


public class JPOpenAllinksToGmail {
    public static void main(String[] args) {

        // 13 of the top 20 test jobs interviewed for a Java developer

        System.setProperty("webdriver.chrome.drive", "C:\\driver\\chromedriver.exe");

        WebDriver curentDriver = new ChromeDriver();

        curentDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        curentDriver.manage().window().maximize();

        curentDriver.get("https://www. gmail. com/ ");

        java.util.List<WebElement> linkList = curentDriver.findElements(By.tagName("a"));

        System.out.println(linkList.size());



        for (WebElement thisLink: linkList) {



            click on the screen link http://google. com or https://www. gmail. com

            System.out.println(qurentLink.getAttribute("href"));



            display the text of the link

            System.out.println(qurentLink.getText());

        }

    }
}
*/

/*On the screen we get:

Starting ChromeDriver 2.38.551601 (edb21f07fc70e9027c746edd3201443e011a61ed) on port 16163
Only local connections are allowed.
3
https://support. google. com/accounts? hlqen
Help
https://policies. google. com/privacy? GLqINandhlen

Privacy Policy https://twitter.com/twitter google. com/terms? GlqIN andhl
 */