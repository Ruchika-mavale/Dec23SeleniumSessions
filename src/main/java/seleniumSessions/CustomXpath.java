package seleniumSessions;

public class CustomXpath {

	public static void main(String[] args) {
		
		//https://www.facebook.com
		//xpath is a address of the element in the Dom
		//xpath is XMLpath
		//1.Absolute xpath
		
		//   /html/body/div[3]/div/div/section[1]/div[2]/div/div[2]/div/div/form/fieldset/div[1]/div/input
		
		
		//2. relative using single attribute Xpath
		
		//Using any attribute
		//input[@name='firstname']
		//input[@name='lastname']
		//input[@name]==2
		//input[@id] ==2
		//a[@role and text()]
		
		
		//using multiple attribute
		//input[@name='firstname' and @placeholder='First name']
		//input[@name='lastname' and @type='text']
		//input[@name='firstname' and @placeholder]
		//input[@id and @type='password']
		
		//a[@href]
		
		//3. text()
		//tagname[text()='value']
		//h2[text()='Facebook helps you connect and share with the people in your life.']
		//a[text()='About']
		
		//4. text() and attribute
		//tagname[text()='value' and @atrr='value']
		//a[@href and @title]
		//a[@href and @title and @class='_sv4']
		
		//5.contains with attribute
		//tagname[contains(@attribute, 'value')]
		//input[contains(@class , 'inputtext ') and @name='email']
		
		//6 dynamic id
		//<id="u_0_0_Ew">
		//<id="u_0_0_6t">
		//<id="u_0_0_xt">
		//<id="u_0_0_or">
		//<id="u_0_0_X1">
		
		
		//a[contains(@id, 'u_0_0')]
		
		//7. contains with text()
		//h2[contains(text() ,'Facebook helps you')]
		
		//8. contains with attribute and text
		//h2[contains(text() ,'Facebook helps you') and @class='_8eso']
		
		
		//9. starts-with
		//input[starts-with(@placeholder, 'Email')]
		//input[starts-with(@class, 'inputtext ') and@id = 'email']
		
		
		
		//10. starts-with  with text()
		//a[starts-with(text(),'Contact')]
		
		//11. ends-with() is not supported
		
		//index base 
		//   (//a[@class='_sv4'])[1])
		
		// 	 (//a[@class='_sv4'])[last()]
		//   (//a[@class='_sv4'])[last()-1]
		
		//https://www.amazon.in/
		
		//12. index with position 
		//   (//a[@class='_sv4'])[position() = 4]
		
		//13. index with last value
		//find the footer link Healp
		
		//   ((//div[@class = 'navFooterLinkCol navAccessibility'])[last()]//a)[last()]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

