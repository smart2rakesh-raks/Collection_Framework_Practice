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

        //Using Arrylist
        ArrayList<WebElement> Elementlishead = (ArrayList<WebElement>) driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/div[4]/table/tbody/tr/td[1]/table/tbody/tr/td/table[1]/tbody/tr[2]/td/table/thead/tr/th"));
        Iterator<WebElement> itrhead = Elementlishead.iterator();
        System.out.println(itrhead.next().getText());

        //Using list
        List<WebElement> Elementlis = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/div[4]/table/tbody/tr/td[1]/table/tbody/tr/td/table[1]/tbody/tr[2]/td/table/tbody/tr"));
        Iterator<WebElement> itr = Elementlis.iterator();

        //adding list data into hashset
        HashSet<String> li = new HashSet<String>();
        for( WebElement i: Elementlis) {
            li.add(i.getText());

        }
        System.out.println(li);

        //Adding list data in hashmap
        Map<Integer,String> ElementValues = new HashMap<Integer,String>();
        int n =1;
        for( WebElement i: Elementlis) {
            ElementValues.put(n, i.getText());
            n++;
        }
        System.out.println(ElementValues);

        //creating new hashset and adding previous hashset
        HashSet<String> setlis = new HashSet<String>(li);
        setlis.add("SSE Composite Index (Shanghai) 3,675.02 +27.39   +0.75%");
        setlis.add("Straits Times 3,128.80 +13.92   +0.45%");
        System.out.println(setlis);

        driver.quit();


    }
}
