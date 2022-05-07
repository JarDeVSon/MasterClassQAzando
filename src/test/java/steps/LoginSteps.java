package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Map;

public class LoginSteps {
    WebDriver driver;


    @Before
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("http://automationpratice.com.br/");
    }

    @Dado("que estou na tela de login")
    public void queEstouNaTelaDeLogin() {
        driver.findElement(By.cssSelector("*[href='/login']")).click();
    }

    @Quando("forneco as informações login e senha")
    public void fornecoAsInformaçõesLoginESenha(Map<String, String> map) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        String email = map.get("e-mail");
        String password = map.get("senha");
        if (email != null) driver.findElement(By.cssSelector("#user")).sendKeys(email);
        if (password != null) driver.findElement(By.cssSelector("#password")).sendKeys(password);

    }

    @Quando("clico em Login")
    public void clicoEmLogin() {
        driver.findElement(By.cssSelector("#btnLogin")).click();
    }

    @Entao("deve ser logado na aplicacao")
    public void deveSerLogadoNaAplicacao() {
        String logado = driver.findElement(By.xpath("//*[text()='Login realizado']")).getText();
        Assert.assertEquals("Login realizado",
                logado);
    }
    @Entao("deve ser mostrar uma mensagem de erro")
    public void deveSerMostrarUmaMensagemDeErro(Map<String,String> map) {
        String mensagemDeErro = map.get("mensagem");
        String textError = driver.findElement(By.cssSelector(".invalid_input")).getText();
        Assert.assertEquals(mensagemDeErro,
                textError);
    }
    @After
    public void closeBrowser(Scenario scenario) {
        System.out.println("Cenario: " + scenario.getName());
        System.out.println("Status: " + scenario.getStatus());
        driver.quit();
    }


}
