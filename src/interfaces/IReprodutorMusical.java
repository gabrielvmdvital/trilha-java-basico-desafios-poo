package interfaces;

public interface IReprodutorMusical {
    void abrirNavegador();
    void atualizarPagina();
    void fecharTodasAbas();
    void adicionarNovaAba();
    void fecharAba(int abaId);
    void exibirPagina(String url);
}