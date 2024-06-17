import celular.IPhone;
import internet.NavegadorInternet;
import musica.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class App {
    public static void main(String[] args) throws Exception {
        IPhone iphone = new IPhone();

        NavegadorInternet navegador = iphone;
        ReprodutorMusical reprodutor = iphone;
        AparelhoTelefonico aparelho = iphone;

        navegador.atualizarPagina();
        reprodutor.tocar();
        aparelho.atender();
        
    }
}
