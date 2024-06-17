package celular;

import internet.NavegadorInternet;
import musica.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class IPhone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical{

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
        
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina...");
        
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
        
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
        
    }

    @Override
    public void pausar() {
        System.out.println("Pausando...");
        
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica...");
        
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica...");
        
    }
    

}
