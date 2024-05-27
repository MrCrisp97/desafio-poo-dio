package Aparelho;

import Funcionalidades.AparelhoTelefonico;
import Funcionalidades.NavegadorInternet;
import Funcionalidades.ReprodutorMusical;

public class iPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    public void exibirPagina(String url) {
        System.out.println("ACESSANDO PÁGINA: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("ABRINDO NOVA ABA EM BRANCO");
    }

    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");
    }

    public void ligar(String numero) {
        System.out.println("LIGANDO PARA O NÚMERO " + numero);
    }

    public void atender() {
        System.out.println("ATENDENDO LIGAÇÃO");
    }

    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    public void tocar(boolean tocandoMusica) {
        System.out.println("TOCANDO MÚSICA");
    }

    public void pausar(boolean tocandoMusica) {
        if (tocandoMusica == false){
            System.out.println("MÚSICA JÁ ESTÁ PAUSADA");
        } else {
            System.out.println("MÚSICA PAUSADA");
        }
    }

    public void selecionarMusica(String musica) {
        System.out.println("SELECIONADA MÚSICA " + musica);
    }
    
}