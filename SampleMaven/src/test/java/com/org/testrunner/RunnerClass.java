package com.org.testrunner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.resource.ReUse;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue="",dryRun=false,monochrome=true,plugin={"pretty","html:report/html"})
public class RunnerClass extends ReUse{
	
	@FindBy(xpath="//li[@data-cy='account']")
	private WebElement signup;
	@FindBy(id="username")
	private WebElement username;
	@FindBy(xpath="//button[@class='capText font16']")
	private WebElement continuebutton;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(xpath="//button[@data-cy='login']")
	private WebElement loginbutton;
	@FindBy(xpath="//li[2]/span[@class='tabsCircle appendRight5']")
	private WebElement roundtrip;
	@FindBy(xpath="//input[@placeholder='From']")
	private WebElement from;
	@FindBy(xpath="//li[@id='react-autowhatever-1-section-0-item-0']")
	private WebElement selectfrom;
	@FindBy(xpath="//input[@placeholder='To']")
	private WebElement to;
	@FindBy(xpath="//li[@id='react-autowhatever-1-section-0-item-0']")
	private WebElement selectto;
	@FindBy(xpath="//a[text()='Search']")
	private WebElement searchbutton;
	@FindBy(xpath="//span[@class='bgProperties icon20 overlayCrossIcon']")
	private WebElement popup;
	@FindBy(xpath="//label[@id='flightCard-7']/div/div[2]/div[2]/span[@class='customRadioBtn']")
	private WebElement departureflight;
	@FindBy(xpath="//label[@id='flightCard-19']/div/div[2]/div[2]/span[@class='customRadioBtn']")
	private WebElement arrivalflight;
	public WebElement getSignup() {
		return signup;
	}
	public void setSignup(WebElement signup) {
		this.signup = signup;
	}
	public WebElement getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username.sendKeys(username);
	}
	public WebElement getContinuebutton() {
		return continuebutton;
	}
	public void setContinuebutton(WebElement continuebutton) {
		this.continuebutton = continuebutton;
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	public void setLoginbutton(WebElement loginbutton) {
		this.loginbutton = loginbutton;
	}
	public WebElement getRoundtrip() {
		return roundtrip;
	}
	public void setRoundtrip(WebElement roundtrip) {
		this.roundtrip = roundtrip;
	}
	public WebElement getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from.sendKeys(from);
	}
	public WebElement getSelectfrom() {
		return selectfrom;
	}
	public void setSelectfrom(WebElement selectfrom) {
		this.selectfrom = selectfrom;
	}
	public WebElement getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to.sendKeys(to);
	}
	public WebElement getSelectto() {
		return selectto;
	}
	public void setSelectto(WebElement selectto) {
		this.selectto = selectto;
	}
	public WebElement getSearchbutton() {
		return searchbutton;
	}
	public void setSearchbutton(WebElement searchbutton) {
		this.searchbutton = searchbutton;
	}
	public WebElement getPopup() {
		return popup;
	}
	public void setPopup(WebElement popup) {
		this.popup = popup;
	}
	public WebElement getDepartureflight() {
		return departureflight;
	}
	public void setDepartureflight(WebElement departureflight) {
		this.departureflight = departureflight;
	}
	public WebElement getArrivalflight() {
		return arrivalflight;
	}
	public void setArrivalflight(WebElement arrivalflight) {
		this.arrivalflight = arrivalflight;
	}
	public RunnerClass(){
		PageFactory.initElements(driver, this);
	}

}
