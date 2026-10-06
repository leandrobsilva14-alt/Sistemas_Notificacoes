public class Email implements Notificador {

    static void enviar() {
        String nome;
        String email = IO.readln("Digite seu email");

    }
    @Override
    public void enviar(String mensagem) {
        IO.println("Enviando email");
        IO.println(mensagem);
    }
}
