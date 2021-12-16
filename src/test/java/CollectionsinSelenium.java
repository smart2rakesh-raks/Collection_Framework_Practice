import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class CollectionsinSelenium {


    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/indicators");
        driver.manage().window().maximize();

        ArrayList<WebElement> Elementlishead = (ArrayList<WebElement>) driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/div[4]/table/tbody/tr/td[1]/table/tbody/tr/td/table[1]/tbody/tr[2]/td/table/thead/tr/th"));
        Iterator<WebElement> itrhead = Elementlishead.iterator();
        System.out.println(itrhead.next().getText());


        List<WebElement> Elementlis = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/div[4]/table/tbody/tr/td[1]/table/tbody/tr/td/table[1]/tbody/tr[2]/td/table/tbody/tr"));
        Iterator<WebElement> itr = Elementlis.iterator();
        System.out.println(itr.next().getText());

        Map<Integer,String> ElementValues = new HashMap<Integer,String>();
        int n =1;
        for( WebElement i: Elementlis) {
            ElementValues.put(n, i.getText());
            n++;
        }
        System.out.println(ElementValues);

        driver.quit();


    }
}
