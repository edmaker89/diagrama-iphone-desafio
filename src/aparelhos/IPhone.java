package aparelhos;

import aparelhos.interfaces.AparelhoTelefonico;
import aparelhos.interfaces.NavegadorInternet;
import aparelhos.interfaces.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo Página..." + url);;
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina...");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando..." + numero);
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
    public void tocar() {
        System.out.println("O telefone está tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println(
            "Selecionando música: " + musica
        );
    }

}
