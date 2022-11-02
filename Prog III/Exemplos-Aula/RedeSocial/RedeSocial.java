import java.util.ArrayList;

public class RedeSocial {
    public class Membro{
        private String name;
        private int id;
        
        ArrayList<Membro> amigos;

        public Membro(String name, int id) {
            this.name = name;
            this.id = id;
            this.amigos = new ArrayList<>();
        }
        
        public String getName() {
            return name;
        }
        public int getId() {
            return id;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setId(int id) {
            this.id = id;
        }
        public void desativar(){
            membros.remove(this);
            //sintaxe completa:
            // RedeSocial.this.membros.remove(this); <-- se n tiver conflito de nome

        }
        public boolean addAmigo (String name){
            for(Membro m : membros){
                if(m.getName().equals(name)){
                    this.amigos.add(m);
                    System.out.println("Amigo adicionado com sucesso!");
                    return true;
                }
            }
            return false;
        }
    }
    ArrayList<Membro> membros = new ArrayList<>();

    public Membro addMembro(String name, int id) {
        Membro novoMembro = new Membro(name, id);
        membros.add(novoMembro);
        return novoMembro;
    }

    public void show() {
        for (Membro membro : this.membros) {
            System.out.println("Nome: " + membro.name + " ID: " + membro.id);
        }
    }
}
