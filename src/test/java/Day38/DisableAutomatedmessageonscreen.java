package Day38;

import org.openqa.selenium.chrome.ChromeOptions;

public class DisableAutomatedmessageonscreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options= new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});

	}

}
