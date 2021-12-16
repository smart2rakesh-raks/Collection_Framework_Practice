import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionsinSelenium {

    public static void dispHashMapValues(HashMap<String,String> elementValues)
    {
        Set<Entry<String, String>> elementsset= elementValues.entrySet();
        Iterator<Entry<String,String>> Itr= elementsset.iterator();
        while(Itr.hasNext())
        {
            Entry<String,String> entry= Itr.next();
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }
    }

    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/gainers/bse/weekly/groupm");
        driver.manage().window().maximize();
        ArrayList<WebElement> Elementlishead = (ArrayList<WebElement>) driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead"));
        Iterator<WebElement> itrhead = Elementlishead.iterator();

        List<WebElement> Elementlis = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody"));
        Iterator<WebElement> itr = Elementlis.iterator();

        String value= "";
        int i =0;
        HashMap<String,String> ElementValues = new HashMap<String,String>();
        while (itr.hasNext()){
            WebElement element = itr.next();
            value=element.getText();
            System.out.println("Element getText: "+value);

        }


        dispHashMapValues(ElementValues);

        driver.quit();


    }
}
