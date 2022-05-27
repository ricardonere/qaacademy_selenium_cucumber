package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferenciaPage {
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

    String botaoTransferencia = "//body/div[@id='__next']/div[1]/div[3]/div[2]/div[1]/a[1]/span[1]/img[1]";

    String numeroDaConta = "//body/div[@id='__next']/div[1]/div[3]/form[1]/div[1]/div[1]/input[1]";

    String digitoDaConta = "//body/div[@id='__next']/div[1]/div[3]/form[1]/div[1]/div[2]/input[1]";

    String valorTransferencia = "//body/div[@id='__next']/div[1]/div[3]/form[1]/div[2]/input[1]";

    String descricaoTransferencia = "//body/div[@id='__next']/div[1]/div[3]/form[1]/div[3]/input[1]";

    String transferirAgora = "//button[contains(text(),'Transferir agora')]";
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

    public void preencherEmailLogin(String emailLogin){
        driver.findElement(By.xpath(emailLogin)).sendKeys("teste@teste.com");

    }
    public void preencherSenhaLogin(){
        driver.findElement(By.xpath(senhaLogin)).sendKeys("415263");
    }
    public void clicarAcessar(){
        driver.findElement(By.xpath(botaoAcessar)).click();
    }

    public void clicarTransferencia(){
        driver.findElement(By.xpath(botaoTransferencia)).click();
    }
    public void preencherNumeroConta(){
        driver.findElement(By.xpath(numeroDaConta)).sendKeys("123456789");
    }
    public void digitoDaConta(){
        driver.findElement(By.xpath(digitoDaConta)).sendKeys("0");
    }
    public void valorTransferencia(){
        driver.findElement(By.xpath(valorTransferencia)).sendKeys("9000000");
    }
    public void descricaoTransferencia(){
        driver.findElement(By.xpath(descricaoTransferencia)).sendKeys("Compra da casa");
    }
    public void transferirAgora(){
        driver.findElement(By.xpath(transferirAgora)).click();
    }
}