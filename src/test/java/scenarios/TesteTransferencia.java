package scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class TesteTransferencia {
    WebDriver driver;
    HomePage homePage;

    @Before
    public void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePage = new HomePage(driver);
        driver.get("http://localhost:3000/");
    }
    @Test
    public void testeTransferencia() throws InterruptedException {
        homePage.clicarRegistrar();
        homePage.preencherEmail();
        homePage.preencherNome();
        homePage.digitarSenha();
        homePage.confirmarSenha();
        homePage.clicarCriarContaComSaldo();
        homePage.clicarCadastrar();
        homePage.fecharBotaoModal();
        homePage.preencherEmailLogin();
        homePage.preencherSenhaLogin();
        homePage.clicarAcessar();
        homePage.clicarTransferencia();
        homePage.preencherNumeroConta();
        homePage.digitoDaConta();
        homePage.valorTransferencia();
        homePage.descricaoTransferencia();
        homePage.transferirAgora();
    }
    @After
    public void encerra(){
        driver.quit();
    }
}

