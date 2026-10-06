public class SMS implements Notificador{

    private String Nome;
    private String Numero;
    private String ParaQ;

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getParaQ() {
        return ParaQ;
    }

    public void setParaQ(String paraQ) {
        ParaQ = paraQ;
    }

    @Override
    public void enviar(String mensagem){
        IO.println("Enviando SMS...");
        IO.println(mensagem);



    }
}
