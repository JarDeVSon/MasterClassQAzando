package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DescontoSteps {
    WebDriver driver = new ChromeDriver();

    @Dado("que estou no site da qazando")
    public void queEstouNoSiteDaQazando() {
        driver.get("http://qazando.com.br/curso.html");
    }
    @Quando("eu preencho meu e-mail")
    public void euPreenchoMeuEMail() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Quando("clico em ganhar cupom")
    public void clicoEmGanharCupom() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entao("eu vejo o código de desconto")
    public void euVejoOCódigoDeDesconto() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
