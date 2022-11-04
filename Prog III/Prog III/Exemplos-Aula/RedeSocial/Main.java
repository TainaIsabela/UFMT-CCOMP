public class Main {
    public static void main(String[] args) {
        RedeSocial novoOrkut = new RedeSocial();
        RedeSocial.Membro m1 = novoOrkut.addMembro("lily", 1);
        RedeSocial.Membro m2 = novoOrkut.addMembro("lucy", 2);
        RedeSocial.Membro m3 = novoOrkut.addMembro("jack", 3);
        RedeSocial.Membro m4 = novoOrkut.addMembro("jill", 4);
        RedeSocial.Membro m5 = novoOrkut.addMembro("jane", 6);
        System.out.println("Membros: ");
        novoOrkut.show();
        m3.desativar();
        m4.desativar();
        System.out.println("Membros: ");
        novoOrkut.show();
        m1.addAmigo("lucy");
        m1.addAmigo("jill");
        
    }    
}
