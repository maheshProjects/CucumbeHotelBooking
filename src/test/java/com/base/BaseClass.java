package com.base;
//
//import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.text.SimpleDateFormat;
//import java.util.List;
//import java.util.Properties;
//import java.util.Set;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class BaseClass{
//
//		public static WebDriver driver;
//		Actions actions;
//		Select select;
//		Alert alert;
//		Robot robot;
//
//		public void browserLaunch(String browserType) {
//			switch (browserType) {
//			case "chrome":
//				
//				driver = (WebDriver) new ChromeDriver();
//				break;
//			case "ie":
//				
//		//		driver = new InternetExplorerDriver();
//				break;
//			case "firefox":
//				
//					
//				//			driver = new FirefoxDriver();
//				break;
//			case "edge":
//				
//				//			driver = new EdgeDriver();
//				break;
//
//			default:
//				break;
//			}
//
//		}
//
//		public static void launchBrowser() {
//
//			System.setProperty("webdriver.chrome.driver",
//					"D:\\Eclipse2023Ver\\OMRBranchHotelAutomation\\Driver\\chromedriver.exe");
//			driver = new ChromeDriver();
//		}
//
//		public String getProjectPath() {
//			String path = System.getProperty("user.dir");
//			return path;
//		}
//
//		public static void loadUrl(String url) {
//
//			driver.get(url);
//		}
//
//		public static void maximizeWindow() {
//			driver.manage().window().maximize();
//		}
//
//		public String getTitle() {
//
//			String title = driver.getTitle();
//			System.out.println(title);
//			return title;
//		}
//
//		public String getCurrentUrl() {
//			String currentUrl = driver.getCurrentUrl();
//			System.out.println(currentUrl);
//			return currentUrl;
//		}
//
//		public WebElement findLocatorById(String attributeValue) {
//
//			WebElement element = driver.findElement(By.id(attributeValue));
//			return element;
//		}
//
//		public WebElement findLocatorByName(String attributeValue) {
//			WebElement findElement = driver.findElement(By.name(attributeValue));
//			return findElement;
//
//		}
//
//		public WebElement findLocatorByClassName(String attributeValue) {
//			WebElement findElement = driver.findElement(By.className(attributeValue));
//			return findElement;
//
//		}
//
//		public WebElement findLocatorByXpath(String xpathExp) {
//
//			WebElement findElement = driver.findElement(By.xpath(xpathExp));
//			return findElement;
//		}
//
//		public WebElement findLocatorByCssSel(String cssSelector) {
//			WebElement element = driver.findElement(By.cssSelector(cssSelector));
//			return element;
//
//		}
//
//		public String getText(WebElement element) {
//
//			String text = element.getText();
////			System.out.println(text);
//			return text;
//
//		}
//
//		// 99% get Attribute Value
//		public String getElementAttributeValue(WebElement element) {
//
//			String attribute = element.getAttribute("value");
//			return attribute;
//
//		}
//
//		// 1% get Attribute Value
//		public String getElementAttributeValue(WebElement element, String attributeName) {
//
//			String attribute = element.getAttribute(attributeName);
//			return attribute;
//
//		}
//
//		public void elementSendkeys(WebElement element, String data) {
//
//			element.sendKeys(data);
//
//		}
//
//		public void elementClick(WebElement element) {
//
//			element.click();
//
//		}
//
//		public void elementSendkeysByJs(WebElement element, String data) {
//
//			JavascriptExecutor executor = (JavascriptExecutor) driver;
//			executor.executeScript("arguments[0].setAttribute('value','" + data + "')", element);
//
//		}
//
//		public void elementClickByJs(WebElement element) {
//
//			JavascriptExecutor executor = (JavascriptExecutor) driver;
//			executor.executeScript("arguments[0].click()", element);
//
//		}
//
//		public void elementScrollIntoView(WebElement element) {
//			JavascriptExecutor executor = (JavascriptExecutor) driver;
//			executor.executeScript("arguments[0].scrollIntoView()", element);
//
//		}
//
//		public void elementDoubleClick(WebElement element) {
//
//			actions = new Actions(driver);
//			actions.doubleClick(element).perform();
//
//		}
//
//		public void elementRightClick(WebElement element) {
//
//			actions = new Actions(driver);
//			actions.contextClick(element).perform();
//
//		}
//
//		public void elementMouseOver(WebElement element) {
//
//			actions = new Actions(driver);
//			actions.moveToElement(element);
//
//		}
//
//		public void dragAndDrop(WebElement source, WebElement dest) {
//
//			actions = new Actions(driver);
//			actions.dragAndDrop(source, dest);
//
//		}
//		
//		public void keyBoardUsingRobot() throws AWTException {
//			
//			robot = new Robot();
//			robot.keyPress(KeyEvent.VK_ENTER);
//			robot.keyRelease(KeyEvent.VK_ENTER);
//		}
//
//		public void switchToAlertAccept() {
//
//			Alert alert = driver.switchTo().alert();
//			alert.accept();
//
//		}
//
//		public void switchToAlertDismiss() {
//
//			Alert alert = driver.switchTo().alert();
//			alert.dismiss();
//
//		}
//
//		public void switchToAlertValue(String data) {
//			Alert alert = driver.switchTo().alert();
//			alert.sendKeys(data);
//
//		}
//
//		public void switchToFrame(WebElement element) {
//
//			driver.switchTo().frame(element);
//
//		}
//
//		public void switchToFrame(int index) {
//
//			driver.switchTo().frame(index);
//
//		}
//
//		public void switchToFrame(String nameOrId) {
//
//			driver.switchTo().frame(nameOrId);
//
//		}
//
//		public void comeoutFrame() {
//			driver.switchTo().defaultContent();
//
//		}
//
//		public void switchToChildWindow() {
//
//			String parentWindow = driver.getWindowHandle();
//			Set<String> allWindows = driver.getWindowHandles();
//			for (String string : allWindows) {
//				if (!parentWindow.equals(allWindows)) {
//					driver.switchTo().window(string);
//				}
//			}
//
//		}
//
//		public void takeScreenshotPage(String fileName) throws IOException {
//
//			TakesScreenshot screenshot = (TakesScreenshot) driver;
//			File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
//			File destFile = new File("D:\\GreensNew\\FrameWork\\Screenshot\\" + fileName + ".png");
//			Files.copy(srcFile, destFile);
//
//		}
//
//		public void selectAllOptions(WebElement element) {
//
//			Select select = new Select(element);
//			List<WebElement> options = select.getOptions();
//			for (int i = 0; i < options.size(); i++) {
//				select.selectByIndex(i);
//			}
//
//		}
//
//		public void selectByIndex(WebElement element, int index) {
//
//			Select select = new Select(element);
//			select.selectByIndex(index);
//
//		}
//
//		public void selectByValue(WebElement element, String value) {
//
//			Select select = new Select(element);
//			select.selectByValue(value);
//
//		}
//
//		public void selectByVisibleText(WebElement element, String text) {
//
//			Select select = new Select(element);
//			select.selectByVisibleText(text);
//		}
//
//		public List<WebElement> getAllOptions(WebElement element) {
//
//			Select select = new Select(element);
//			List<WebElement> options = select.getOptions();
//			return options;
//
//		}
//
//		public List<WebElement> getAllSelectedOptions(WebElement element) {
//			Select select = new Select(element);
//			List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
//			return allSelectedOptions;
//
//		}
//
//		public WebElement getFirstSelectedOption(WebElement element) {
//
//			Select select = new Select(element);
//			WebElement firstSelectedOption = select.getFirstSelectedOption();
//			return firstSelectedOption;
//
//		}
//
//		public void deSelectByIndex(WebElement element, int index) {
//			Select select = new Select(element);
//			select.deselectByIndex(index);
//
//		}
//
//		public void deSelectByValue(WebElement element, String value) {
//
//			Select select = new Select(element);
//			select.deselectByValue(value);
//
//		}
//
//		public void deSelectedByVisibleText(WebElement element, String text) {
//
//			Select select = new Select(element);
//			select.deselectByVisibleText(text);
//
//		}
//
//		public void deSelectAll(WebElement element) {
//
//			Select select = new Select(element);
//			select.deselectAll();
//
//		}
//
//		// this method used to check the check box or radio button is selected or not
//		public boolean isMultipleSelect(WebElement element) {
//
//			Select select = new Select(element);
//			boolean multiple = select.isMultiple();
//			return multiple;
//
//		}
//
//		public boolean isSelected(WebElement element) {
//			boolean selected = element.isSelected();
//			return selected;
//
//		}
//
//		public boolean isDisplayed(WebElement element) {
//
//			boolean displayed = element.isDisplayed();
//			return displayed;
//
//		}
//
//		public boolean isEnabled(WebElement element) {
//			boolean enabled = element.isEnabled();
//			return enabled;
//
//		}
//
////		@SuppressWarnings("deprecation")
////		public void implicitWait() {
//	//
////			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
//	//
////		}
//
//		public static void implicitWait() {
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//
//		}
//
//		public void explicitWait(WebElement element) {
//
//			WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofMinutes(1));
//			driverWait.until(ExpectedConditions.visibilityOf(element));
//		}
//
//		public void explicitWaitClick(WebElement element) {
//
//			WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofMinutes(1));
//			driverWait.until(ExpectedConditions.elementToBeClickable(element));
//		}
//
//		public void clearTextElement(WebElement element) {
//			element.clear();
//
//		}
//
//		public void refreshPage() {
//			driver.navigate().refresh();
//
//		}
//
//		public void comeToBackPage() {
//			driver.navigate().back();
//
//		}
//
//		public void goToNextPage() {
//			driver.navigate().forward();
//
//		}
//
//		public static void closeWindow() {
//			driver.close();
//
//		}
//
//		public static void quitWindow() {
//			driver.quit();
//
//		}
//
//		public String readExcelData(String sheetName, int rowNum, int cellNum) throws IOException {
//
//			String value = null;
//
//			File file = new File("D:\\Eclipse2023Ver\\Cucumber1\\Excel\\OmrHotel.xlsx");
//			FileInputStream inputStream = new FileInputStream(file);
//			Workbook workbook = new XSSFWorkbook(inputStream);
//			Sheet sheet = workbook.getSheet(sheetName);
//			Row row = sheet.getRow(rowNum);
//			Cell cell = row.getCell(cellNum);
//			CellType cellType = cell.getCellType();
//			switch (cellType) {
//			case STRING:
//
//				value = cell.getStringCellValue();
//				break;
//			case NUMERIC:
//
//				if (DateUtil.isCellDateFormatted(cell)) {
//					Date dateCellValue = cell.getDateCellValue();
//					SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mmm-yy");
//					value = dateFormat.format(dateCellValue);
//
//				} else {
//
//					double numericCellValue = cell.getNumericCellValue();
//					long round = Math.round(numericCellValue);
//					if (round == numericCellValue) {
//						value = String.valueOf(round);
//
//					} else {
//
//						value = String.valueOf(numericCellValue);
//
//					}
//
//				}
//
//				break;
//
//			default:
//				break;
//			}
//			return value;
//
//		}
//		
//		public String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
//			
//			Properties properties = new Properties();
//			properties.load(new FileInputStream(getProjectPath()+"Config\\config.properties"));
//			Object object = properties.get(key);
//			String value = (String) object;
//			return value;
//
//		}
//
//		public void writeCellData(String sheetName, int rowNum, int cellNum, String data) throws IOException {
//
//			// Writing New Data From Particular Cell For Already Created Row
//			File file = new File("D:\\GreensNew\\FrameWork\\Excel\\Book.xlsx");
//			FileInputStream inputStream = new FileInputStream(file);
//			Workbook workbook = new XSSFWorkbook(inputStream);
//			Sheet sheet = workbook.getSheet(sheetName);
//			Row row = sheet.getRow(rowNum);
//			Cell createCell = row.createCell(cellNum);
//			createCell.setCellValue(data);
//			FileOutputStream fileOutputStream = new FileOutputStream(file);
//			workbook.write(fileOutputStream);
//
//		}
//
//		public void writeNewRow(String sheetName, int rowNum, int cellNum, String data) throws IOException {
//
//			// Creating New Row and Write Cell
//			File file = new File("D:\\GreensNew\\FrameWork\\Excel\\Book.xlsx");
//			FileInputStream inputStream = new FileInputStream(file);
//			Workbook workbook = new XSSFWorkbook(inputStream);
//			Sheet sheet = workbook.getSheet(sheetName);
//			Row createRow = sheet.createRow(rowNum);
//			Cell createCell = createRow.createCell(cellNum);
//			createCell.setCellValue(data);
//			FileOutputStream outputStream = new FileOutputStream(file);
//			workbook.write(outputStream);
//
//		}
//
//		public void writeNewWorkbook(String fileName, String sheetName, int rowNum, int cellNum, String data)
//				throws IOException {
//
//			// Creating New Workbook and Creating New Row and Creating New Cell and Write
//			// The Data
//			File file = new File("D:\\GreensNew\\FrameWork\\Excel\\" + fileName + ".xlsx");
//			Workbook workbook = new XSSFWorkbook();
//			Sheet createSheet = workbook.createSheet(sheetName);
//			Row createRow = createSheet.createRow(rowNum);
//			Cell createCell = createRow.createCell(cellNum);
//			createCell.setCellValue(data);
//			FileOutputStream outputStream = new FileOutputStream(file);
//			workbook.write(outputStream);
//
//		}
//
//		public void updateCellData(String sheetName, int rowNum, int cellNum, String oldData, String newData)
//				throws IOException {
//
//			// ReWriting or Updating Particular Cell Data
//			File file = new File("");
//			FileInputStream inputStream = new FileInputStream(file);
//			Workbook workbook = new XSSFWorkbook(inputStream);
//			Sheet sheet = workbook.getSheet(sheetName);
//			Row row = sheet.getRow(rowNum);
//			Cell cell = row.getCell(cellNum);
//			String value = cell.getStringCellValue();
//			if (value.equals(oldData)) {
//
//				cell.setCellValue(newData);
//
//			}
//
//			FileOutputStream outputStream = new FileOutputStream(file);
//			workbook.write(outputStream);
//
//		}
//
//	}
//
//
//
