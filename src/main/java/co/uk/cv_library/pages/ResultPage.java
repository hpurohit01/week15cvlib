package co.uk.cv_library.pages;

import co.uk.cv_library.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='search-header__title']")
    WebElement resultText;


    public String getSearchResultText() {
        String message = getTextFromElement(resultText);
        log.info("Verifying Search result: " + resultText.toString());
        return message;
    }


    public void verifyTheResults(String expected) {

        verifyMessage(resultText, expected, "Results not displayed as expected");
        log.info("Verifying Search result: " + resultText.toString());
    }



    }




