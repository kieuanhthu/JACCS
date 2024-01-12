package JLOS.jaccs;

import java.awt.AWTException;
import java.awt.Checkbox;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://10.14.107.5:3101/login");
		driver.findElement(By.xpath("//input[@placeholder='Tên đăng nhập']")).sendKeys("JIVF002000");
		driver.findElement(By.xpath("//input[@placeholder='Mật khẩu']")).sendKeys("1234567Aa@");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();

		driver.findElement(By.xpath("(//a)[3]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Nhập mã hồ sơ']")).sendKeys("24011200004");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='w-frame wbaseItem-value w-row a4ae2cff-4b30-48a8-b090-40cc14d9862d']")).click();

		Thread.sleep(2000);
		WebElement daiLyElement = driver.findElement(By.xpath("//select[@name='maDaiLy']"));
		Select dropdown = new Select(daiLyElement);
		dropdown.selectByValue("1001");

		WebElement CTV = driver.findElement(By.xpath("//select[@name='maChuongTrinhVay']"));
		Select dropctv = new Select(CTV);
		dropctv.selectByIndex(1);

		WebElement NSX = driver.findElement(By.xpath("//select[@name='maNhaSanXuat']"));
		Select dropnsx = new Select(NSX);
		dropnsx.selectByValue("4");

//    	WebElement NSX = driver.findElement(By.xpath("//select[@name='maNhaSanXuat']"));
		Select dropnhanhieu = new Select(driver.findElement(By.xpath("//select[@name='maNhanHieu']")));
		dropnhanhieu.selectByValue("583");

		Duration duration = Duration.ofSeconds(10000);
		WebDriverWait wait = new WebDriverWait(driver, duration);
		WebElement passwordElement = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='namSanXuat']")));
		driver.findElement(By.xpath("//input[@name='namSanXuat']")).sendKeys("2022");
		driver.findElement(By.xpath("//input[@name='mauSac']")).sendKeys("ĐỎ");
		driver.findElement(By.xpath("//input[@name='giaXe']")).sendKeys("40000000");
		driver.findElement(By.xpath("//input[@name='phuTung']")).sendKeys("GƯƠNG");
		driver.findElement(By.xpath("//input[@name='giaPhuTung']")).sendKeys("2000000");

		WebElement ngaythanhtoan = driver.findElement(By.xpath("//select[@name='ngayThanhToanHangThang']"));
		Select dropntt = new Select(ngaythanhtoan);
		dropntt.selectByValue("12");

		WebElement kihanvay = driver.findElement(By.xpath("//select[@name='promotionCode']"));
		Select dropkhv = new Select(kihanvay);
		dropkhv.selectByValue("V63");

		WebElement mucdichvay = driver.findElement(By.xpath("//select[@name='maMucDichVay']"));
		Select dropmdv = new Select(mucdichvay);
		dropmdv.selectByValue("01");

		// select[@name='loanApplicationInsurance[0].maNhaCungCap']
		WebElement baohiem = driver.findElement(By.xpath("//select[@name='loanApplicationInsurance[0].maNhaCungCap']"));
		Select dropbh = new Select(baohiem);
		dropbh.selectByValue("GIC");

		WebElement mabaohiem = driver.findElement(By.xpath("//select[@name='loanApplicationInsurance[0].maBaoHiem']"));
		Select dropmbh = new Select(mabaohiem);
		dropmbh.selectByValue("GIC_G01_ 0.125");

		WebElement mahttt = driver
				.findElement(By.xpath("//select[@name='loanApplicationInsurance[0].maHinhThucThanhToan']"));
		Select dropmhttt = new Select(mahttt);
		dropmhttt.selectByValue("T1");

		WebElement hocvan = driver.findElement(By.xpath("//select[@name='maTrinhDoHocVan']"));
		Select dropmhocvan = new Select(hocvan);
		dropmhocvan.selectByValue("HV2");
		
		//input[@name='dcTamTru']
		driver.findElement(By.xpath("//input[@name='dcTamTru']")).sendKeys("LẠC THÀNH BẮC");
		WebElement thanhpho = driver.findElement(By.xpath("//select[@name='currentAddressProvincesCode']"));
		Select droptp = new Select(thanhpho);
		droptp.selectByValue("34");
		
		WebElement huyen = driver.findElement(By.xpath("//select[@name='currentAddressDistrictCode']"));
		Select drophuyen = new Select(huyen);
		drophuyen.selectByValue("342");
		
		WebElement ward = driver.findElement(By.xpath("//select[@name='currentAddressWardsCode']"));
		Select dropward = new Select(ward);
		dropward.selectByValue("12994");
		
		

//		driver.findElement(By.xpath("(//span[@class='slider'])[3]")).click();
		driver.findElement(By.xpath("//input[@name='namCuTru']")).sendKeys("12");
		driver.findElement(By.xpath("//input[@name='thangCuTru']")).sendKeys("3");

		WebElement noicutru = driver.findElement(By.xpath("//select[@name='maTtNoiCuTru']"));
		Select dropnct = new Select(noicutru);
		dropnct.selectByValue("P");

		WebElement manghenghiep = driver.findElement(By.xpath("//select[@name='maNgheNghiep']"));
		Select dropmnn = new Select(manghenghiep);
		dropmnn.selectByValue("LD003");

		driver.findElement(By.xpath("//input[@name='noiLamViec']")).sendKeys("FIS");
		driver.findElement(By.xpath("//input[@name='dcNoiLamViec']")).sendKeys("KEANGNAM");

		WebElement machucvu = driver.findElement(By.xpath("//select[@name='maChucVu']"));
		Select dropmcv = new Select(machucvu);
		dropmcv.selectByValue("00009");

		driver.findElement(By.xpath("//input[@name='thuNhapThang']")).sendKeys("15000000");

//    	Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='hoTenNguoiLienHe1']")).sendKeys("NGUYỄN THỊ QUÝ");
		WebElement nguoi1 = driver.findElement(By.xpath("//select[@name='maQhNguoiLienHe1']"));
		Select dropn1 = new Select(nguoi1);
		dropn1.selectByValue("MQH1");
		driver.findElement(By.xpath("//input[@name='dtNguoiLienHe1']")).sendKeys("0987643432");

		driver.findElement(By.xpath("//input[@name='hoTenNguoiLienHe2']")).sendKeys("NGUYỄN THỊ DŨNG");
		WebElement nguoi2 = driver.findElement(By.xpath("//select[@name='maQhNguoiLienHe2']"));
		Select dropn2 = new Select(nguoi2);
		dropn2.selectByValue("MQH9");
		driver.findElement(By.xpath("//input[@name='dtNguoiLienHe2']")).sendKeys("0987643434");

		String filePath = "D:\\Scoring\\02102023.pdf";
//    	Thread.sleep(1000);
		// click mo form upload
//    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button/div[text()='Upload']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//button[@class='w-button wbaseItem-value w-row b085459d-3c5e-4f02-b293-b43dcd2e6825']")))
				.click();

//    	driver.findElement(By.xpath("//button/div[text()='Upload']")).click();
//    	driver.findElement(By.xpath("//input[@name='fileLoanApplication[0].ten']")).click();
		// Khoi tao robot
		Robot rb = null;
		try {
			rb = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}

		// Copy File path vào Clipboard
		StringSelection str = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		Thread.sleep(1000);

		// Nhấn Control+V để dán
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// Xác nhận Control V trên
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		Thread.sleep(1000);

		// Nhấn Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[text()='Xác nhận']")).click();
		//div[text()='Xác nhận']
	}
}
