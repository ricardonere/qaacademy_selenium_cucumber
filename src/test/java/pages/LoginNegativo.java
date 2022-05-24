package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginNegativo {
    WebDriver driver;
    String botaoRegistrar = "//button[contains(text(),'Registrar')]";
    String email = "//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/input[1]";
    String nome = "//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/input[1]";
    String senha = "//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]";
    String confirmarSenha = "//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/div[5]/div[1]/input[1]";
    String criarComSaldo = "//label[@id='toggleAddBalance']";
    String cadastrar = "//button[contains(text(),'Cadastrar')]";

    String fecharModal = "//*[@id='btnCloseModal']";

    String emailLogin = "//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]";

    String senhaLogin = "//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]";

    String botaoAcessar = "//button[contains(text(),'Acessar')]";

    public void HomePage(WebDriver driverDoTeste) {
        this.driver = driverDoTeste;
    }


    public void clicarRegistrar() {
        driver.findElement(By.xpath(botaoRegistrar)).click();
    }

    public void preencherEmail() {
        driver.findElement(By.xpath(email)).sendKeys("teste@teste.com");
    }

    public void preencherNome() {
        driver.findElement(By.xpath(nome)).sendKeys("QA Ricardo");
    }

    public void digitarSenha() {
        driver.findElement(By.xpath(senha)).sendKeys("415263");
    }

    public void confirmarSenha() {
        driver.findElement(By.xpath(confirmarSenha)).sendKeys("415263");
    }

    public void clicarCriarContaComSaldo() {
        driver.findElement(By.xpath(criarComSaldo)).click();
    }

    public void clicarCadastrar() {
        driver.findElement(By.xpath(cadastrar)).click();
    }
    public void fecharBotaoModal() throws InterruptedException {
        driver.findElement(By.xpath(fecharModal)).click();
        Thread.sleep( 3000);
    }
    public void preencherEmailLogin(){
        driver.findElement(By.xpath(emailLogin)).sendKeys("teste@teste.com");
    }
    public void preencherSenhaLogin(){
        driver.findElement(By.xpath(senhaLogin)).sendKeys("415263");
    }
    public void clicarAcessar(){
        driver.findElement(By.xpath(botaoAcessar)).click();
    }


}
