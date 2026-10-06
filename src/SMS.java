public class SMS implements Notificador{

    @Override
    public void enviar(String mensagem){
        IO.println("Enviando SMS...");
        IO.println(mensagem);



    }
}
