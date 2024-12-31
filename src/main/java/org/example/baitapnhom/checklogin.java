package org.example.baitapnhom;

import org.openqa.selenium.chrome.ChromeDriver;

public class checklogin {
    private static final String url = "https://automationexercise.com/login";
    private static ChromeDriver driver = null;

    private static void getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
    }

    private static void openLoginPage() {
        getDriver();
        driver.get(url);
    }


    public void testLogin() throws InterruptedException {
        driver.get(url);
    }
////        1. Truy cập trang web demo https://automationexercise.com/login
////        2. Xác định được cụm "Login to your account"
////        3. Tìm element email và Nhập email hợp lệ
////        4. Tìm element password và Nhập password hợp lệ
////        5. Tìm và bấm Click vào nút Login
////        6. Xác thực việc đăng nhập thành công bằng việc so sánh tên tên tài khoản của mình (Khi mình lập account) với kết quả web hiển thị
//        String url = "https://automationexercise.com/login";
//        // Tạo biến name, email, password với những thông tin đã đăng ký
//        String name = "Ngan Thu";
//        String email = "nganthu@gmail.com";
//        String password = "123";
//        Chrom eDriver driver = getDriver();
//        driver.get(url);
//        //Tìm form login
//        WebElement formLogin = driver.findElement(By.className("login-form"));
//        // Tìm element email, password và button login
//        WebElement inputEmail = formLogin.findElement(By.name("email"));
//        WebElement inputPassword = formLogin.findElement(By.name("password"));
//        WebElement btnLogin = formLogin.findElement(By.tagName("button"));
//        // Nhập email, password và click login
//        inputEmail.sendKeys(email);
//        inputPassword.sendKeys(password);
//        btnLogin.click();
//        // Kiểm tra xem đã đăng nhập thành công chưa, Nếu url khác với url hiện tại thì đã đăng nhập thành công
//
//
//        if (!url.equals(driver.getCurrentUrl())) {
//            // Tìm element hiển thị tên người dùng
//            By xpathName =  By.xpath("//b[text()='" + name + "']");
//            WebElement userName = driver.findElement(xpathName);
//            if (userName.getText().equals(name)) {
//                System.out.println("Login successfully");
//            } else {
//                System.out.println("Login failed");
//            }
//            Thread.sleep(5000);
//        } else {
//            System.out.println("Login failed");
//        }
//        driver.quit();
//    }
}
