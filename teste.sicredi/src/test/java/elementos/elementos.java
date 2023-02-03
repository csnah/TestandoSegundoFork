package elementos;

import org.openqa.selenium.By;

public class elementos {
	
	public By from = By.xpath("//*[@id=\"field_salesRepEmployeeNumber_chosen\"]/a/span");
	public By fix = By.xpath("//li[@data-option-array-index='8']");
	public By save = By.xpath("//*[@id=\"form-button-save\"]");
	public By mensagem = By.xpath("//*[@id=\"report-success\"]/p/text()[1]");

}
