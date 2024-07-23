package model;

import interfaces.IAparelhoTelefonico;
import interfaces.INavegadorInternet;
import interfaces.IReprodutorMusical;

public class Iphone implements IReprodutorMusical, IAparelhoTelefonico, INavegadorInternet {

    // Métodos de IReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Iphone: Reproduzindo música.");
    }

    @Override
    public void pausar() {
        System.out.println("Iphone: Música pausada.");
    }

    @Override
    public void abrirReprodutorMusical() {
        System.out.println("Iphone: Reprodutor musical aberto.");
    }

    @Override
    public void fecharReprodutorMusical() {
        System.out.println("Iphone: Reprodutor musical fechado.");
    }

    @Override
    public void proximaFaixa(int faixaAtualId) {
        System.out.println("Iphone: Tocando a próxima faixa: " + (faixaAtualId + 1));
    }

    @Override
    public void anteriorFaixa(int faixaAtualId) {
        System.out.println("Iphone: Tocando a faixa anterior: " + (faixaAtualId - 1));
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Iphone: Selecionando a música: " + musica);
    }

    // Métodos de IAparelhoTelefonico
    @Override
    public void atender() {
        System.out.println("Iphone: Atendendo a chamada.");
    }

    @Override
    public void desligar() {
        System.out.println("Iphone: Desligando a chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iphone: Iniciando o correio de voz.");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Iphone: Ligando para: " + numero);
    }

    @Override
    public void enviarSms(String numero) {
        System.out.println("Iphone: Enviando SMS para: " + numero);
    }

    // Métodos de INavegadorInternet
    @Override
    public void abrirNavegador() {
        System.out.println("Iphone: Abrindo o navegador.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Iphone: Atualizando a página.");
    }

    @Override
    public void fecharTodasAbas() {
        System.out.println("Iphone: Fechando todas as abas.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Iphone: Adicionando nova aba.");
    }

    @Override
    public void fecharAba(int abaId) {
        System.out.println("Iphone: Fechando a aba de ID: " + abaId);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Iphone: Exibindo a página: " + url);
    }
}
