package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArticlePage extends BasePage
{
    @FindBy(id="firstHeading")
    private WebElement articleTilte;

    public ArticlePage(WebDriver webDriver)
    {
        super(webDriver);
    }

    public String getArticleName()
    {
        return articleTilte.getText();

    }

}