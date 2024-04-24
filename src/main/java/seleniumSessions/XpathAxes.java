package seleniumSessions;

public class XpathAxes {

	public static void main(String[] args) {
		
		//parent to direct child use / slash
		//   "//form[@id = 'Form_getForm']/fieldset/div/div/input[@id='Form_getForm_FullName']"
		
		//parent to indirect child
		//form[@id = 'Form_getForm']//input[@id='Form_getForm_FullName']
		
		//backward traversing in xpath
		//input[@id='Form_getForm_FullName']/../../../../../../../../../../../../../../..
		//OR
		////input[@id='Form_getForm_FullName']/parent::div/parent::div/parent::fieldset/parent::form
		
		//if you want to jump from child to grandparents use ancestor
		//input[@id='Form_getForm_FullName']/ancestor::form
		//input[@id='Form_getForm_FullName']/ancestor::form/ancestor::body/ancestor::html
		
		//following sibling and preceding sibling
		//option[@value='India']/preceding-sibling::option[@value='Angola']
		//option[@value='India']/following-sibling::option[@value='Kuwait']
		
		
		
		
		
		
		
		

	}

}
