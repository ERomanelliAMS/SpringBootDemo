package com.example.SpringAppHCC;

import com.example.SpringAppHCC.pages.HomePage;
import com.example.SpringAppHCC.pages.LoginPage;
import com.example.SpringAppHCC.pages.MainPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringAppHccApplicationTests {

	@Autowired
	private MainPage mainPage;

	@Test
	void contextLoads() {

		/*ApplicationContext applicationContext = SpringApplication.run(SpringAppHccApplication.class);

		var car = applicationContext.getBean(Car.class);
		car.getCar();

		HomePage homePage = new HomePage();
		LoginPage loginPage = new LoginPage();

		*//*HomePage page = new HomePage();
		LoginPage loginPage = page.clickLogin();
		loginPage.clickLogin();*/

		//MainPage mainPage = new MainPage(loginPage,homePage);
		mainPage.PerformLogin();

	}

}
