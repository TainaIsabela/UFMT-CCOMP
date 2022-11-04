package questao3;

public class Fila {

	public static void main(String[] args) {
        Fila minhaFila = new Fila();
        minhaFila.adicionar("sou no 1");
        minhaFila.adicionar("sou no 2");
        minhaFila.adicionar("sou no 3");
        minhaFila.adicionar("sou no 4");
        minhaFila.show();

        minhaFila.remover();
        minhaFila.remover();
        System.out.println("FILA APOS REMOCAO");

        minhaFila.show();

        System.out.println("USANDO ITERADOR //////");
        Fila.Iterador iter = minhaFila.iterador();
        System.out.println("Sou iterador e estou apontando para o nó com dado: "+ iter.auxiliar.dado );
        System.out.println("Agora apontarei para o proximo");
        System.out.println( iter.next().dado );
        System.out.println( "tem prox? " + iter.hasNext() );

    }
	
	No primeiroNo;
	No ultimoNo;
    //CLASSE ANINHADA NO
	public class No {
		private String dado;
		private No proxNo;
        
        public String getDado() {
            return dado;
        }
        public void setDado(String dado) {
            this.dado = dado;
        }
        public No getProxNo() {
            return proxNo;
        }
        public void setProxNo(No proxNo) {
            this.proxNo = proxNo;
        }

        public No(String dado, No proxNo) {
            this.dado = dado;
            this.proxNo = proxNo;
        }
		
        public No(){
            this.dado= "";
            this.proxNo=null;

        }
		
		
	} //FIM CLASSE ANINHADA NO
	
    //CLASSE ANINHADA ITERADOR
    public class Iterador{
        No auxiliar=primeiroNo;

        public No next(){
            if(auxiliar.proxNo != null){
                auxiliar= auxiliar.proxNo;
                return auxiliar;
            }
            else {
                System.out.println("Nao ha prox no");
                return null;
            }
        }

        public boolean hasNext(){
            if(auxiliar.proxNo != null){
                return true;
            }
            else {
                return false;
            }
        }
    }

    public Iterador iterador(){
        Iterador it= new Iterador();
        return it;
    }

    //minhaFila.next()

    public Fila(){
        this.primeiroNo = this.ultimoNo =null;
    }

    public void adicionar( String dado){
        if(this.primeiroNo==null){
            No novoNo= new No();
            novoNo.setDado(dado);
            novoNo.setProxNo(null);

            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else {
            No auxiliar= new No();

            No novoNo= new No();
            novoNo.setDado(dado);

            auxiliar=primeiroNo;

            while( auxiliar.proxNo != null ){
                auxiliar= auxiliar.proxNo;
            }
            auxiliar.proxNo=novoNo;

            novoNo.setProxNo(null);

            ultimoNo=novoNo;
        }
    }

    public No remover(){
        if(primeiroNo != null){
            No auxiliar= new No();
            auxiliar=primeiroNo;

            primeiroNo= auxiliar.proxNo;

            return auxiliar;
        }else{
            System.out.println("LISTA VAZIA !!!");
            return null;
        }
    }

    public void show(){
        No auxiliar= new No();
        auxiliar=primeiroNo;
        while( auxiliar.proxNo != null ){
            System.out.println(auxiliar.dado);
            auxiliar= auxiliar.proxNo;
        }
        System.out.println(auxiliar.dado);
    }

}
