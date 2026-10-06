public class Email implements Notificador {

    private String nome;
    private String email;
    private String para;


    @Override
    public void enviar(String mensagem) {
        IO.println("Foi enviado de " + nome);
        IO.println("Para " + para);
        IO.println("Enviando email");
        IO.println(mensagem);
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
