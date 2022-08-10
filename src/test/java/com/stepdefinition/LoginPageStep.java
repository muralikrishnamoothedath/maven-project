package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageStep {

	WebDriver driver;

	@Given("User on the Adactin Hotel page")
	public void user_on_the_adactin_hotel_page() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

	}

	@When("User should login {string} and {string}")
	public void b(String name, String pass) {

		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys(name);
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys(pass);

		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
	}

	@Then("User should verify success message")
	public void user_should_verify_success_message() throws InterruptedException {
		WebElement loginDisplaymsg = driver.findElement(By.name("username_show"));
		String attribute = loginDisplaymsg.getAttribute("value");
		Assert.assertEquals("verify login", "Hello muralimoothedath!", attribute);

	}

	@Then("User should Search hotels {string},{string},{string},{string},{string} and {string}")
	public void user_should_search_hotels_and(String location, String hotels, String roomType, String numOfRooms,
			String adultsPerRoom, String childPerRoom) {

		WebElement dDnLocation = driver.findElement(By.id("location"));
		Select select = new Select(dDnLocation);
		select.selectByVisibleText(location);

		WebElement dDnHotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select select1 = new Select(dDnHotels);
		select1.selectByVisibleText(hotels);

		WebElement dDnroomType = driver.findElement(By.id("room_type"));
		Select select2 = new Select(dDnroomType);
		select2.selectByVisibleText(roomType);

		WebElement dDnroomNos = driver.findElement(By.id("room_nos"));
		Select select3 = new Select(dDnroomNos);
		select3.selectByVisibleText(numOfRooms);

		WebElement adultRoom = driver.findElement(By.id("adult_room"));
		Select select4 = new Select(adultRoom);
		select4.selectByVisibleText(adultsPerRoom);

		WebElement childRoom = driver.findElement(By.id("child_room"));
		Select select5 = new Select(childRoom);
		select5.selectByVisibleText(childPerRoom);

		WebElement btnSearch = driver.findElement(By.id("Submit"));
		btnSearch.click();

	}

	@Then("User should verify select hotel")
	public void user_should_verify_select_hotel() {
		WebElement selecrHotelText = driver.findElement(By.xpath("//td[text()='Select Hotel ']"));
		String msg = selecrHotelText.getText();
		Assert.assertEquals("verify the ", "Select Hotel", msg);

	}

	@Then("User should selecthotel")
	public void user_should_selecthotel() {

		WebElement radioBtn = driver.findElement(By.id("radiobutton_0"));
		radioBtn.click();

		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.click();

	}

	@Then("user should verify Book a Hotel Page")
	public void user_should_verify_book_a_hotel_page() {
		WebElement bookHotelText = driver.findElement(By.xpath("//td[text()='Book A Hotel ']"));
		String msg1 = bookHotelText.getText();
		Assert.assertEquals("verify book  hotel", "Book A Hotel", msg1);

	}

	@Then("User Should  book the hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_book_the_hotel_and(String firstName, String lastName, String address, String cCNo,
			String cCType, String expMonth, String expYear, String cVVNo) throws InterruptedException {
		WebElement txtfirstName = driver.findElement(By.id("first_name"));
		txtfirstName.sendKeys(firstName);
		WebElement txtLastName = driver.findElement(By.id("last_name"));
		txtLastName.sendKeys(lastName);
		WebElement txtAddress = driver.findElement(By.id("address"));
		txtAddress.sendKeys(address);
		WebElement txtCcNo = driver.findElement(By.id("cc_num"));
		txtCcNo.sendKeys(cCNo);
		WebElement dDncCtype = driver.findElement(By.id("cc_type"));
		Select select7 = new Select(dDncCtype);
		select7.selectByVisibleText(cCType);
		WebElement dDnexpMonth = driver.findElement(By.id("cc_exp_month"));
		Select select8 = new Select(dDnexpMonth);
		select8.selectByVisibleText(expMonth);
		WebElement dDnexpYear = driver.findElement(By.id("cc_exp_year"));
		Select select9 = new Select(dDnexpYear);
		select9.selectByVisibleText(expYear);

		WebElement txtcVv = driver.findElement(By.id("cc_cvv"));
		txtcVv.sendKeys(cVVNo);

		WebElement btnBook = driver.findElement(By.id("book_now"));
		btnBook.click();

		Thread.sleep(10000);

		WebElement bookId = driver.findElement(By.id("order_no"));
		String attribute = bookId.getAttribute("value");
		System.out.println(attribute);

		driver.quit();

	}

}
