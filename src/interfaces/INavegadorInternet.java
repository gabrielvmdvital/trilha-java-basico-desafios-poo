package interfaces;

public interface INavegadorInternet {
    void tocar();
    void pausar();
    void abrirReprodutorMusical();
    void fecharReprodutorMusical();
    void proximaFaixa(int faixaAtualId);
    void anteriorFaixa(int faixaAtualId);
    void selecionarMusica(String musica);
}


