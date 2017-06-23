"# SeleniumTest" 
New on selenium 3.0:
we need to explicitly provide firefox driver (geckodriver)
as firefox no longer provides default inbuilt driver.
add :
    System.setProperty("webdriver.gecko.driver", "C:\geckodriver.exe");  // directed path of geckodriver.exe
