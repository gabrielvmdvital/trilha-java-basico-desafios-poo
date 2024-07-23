package interfaces;

public interface IAparelhoTelefonico {
    void atender();
    void desligar();
    void iniciarCorreioVoz();
    void ligar(String numero);
    void enviarSms(String numero);
}
