package filastring;
public class Lista {
    
    private static class No{
     String dado;
     No proximo;
        
        public No(String dado){
            this.dado = dado;
            this.proximo = null;
        }
    }
     private No comeco;
     private No fim;
     
     public Lista (){
         this.comeco = null;
         this.fim = null;
     }
     public boolean vazia(){
         return this.comeco == null;
     }
     public void adiciona(String dado){
         No novoNo = new No(dado);
         if (vazia()){
             this.comeco = novoNo;
             this.fim = novoNo;
         }
         else{
             this.fim.proximo = novoNo;
             this.fim = novoNo;
         }
     }   public String remove(){
         if (vazia()){
             return null;
         }
         else{
             No aux = this.comeco;
         }
         if(this.comeco == this.fim){
             this.comeco = null;
             this.fim = null;
         }else{
             
         }
     }
         
}
