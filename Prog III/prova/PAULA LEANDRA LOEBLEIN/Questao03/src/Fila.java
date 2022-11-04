
public class Fila {
	
	public class No {
		private int el;
		private No prox;
		
		private No(int el, No prox) {
			this.el = el;
			this.prox = prox;
		}
		
	};
	
	public class Itarator {
		private No next(No no) {
			return no.prox;
		}
		
		private boolean hasNext(No no){
			return (no.prox != null);
		}
	};
	
	public int adicionar() {
		return 0; 
	}
	
	public int remover() {
		return 0;
	}
}
