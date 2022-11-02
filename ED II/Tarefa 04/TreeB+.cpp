#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <sys/times.h> //Times Funcao
#include <sys/types.h> //Bib que define o registro TMS
#include <unistd.h>	   //Biblioteca necessaria para descobrir os ciclos de clock
#include <string.h>
const int t = 2;

typedef struct arvbm{
  int nchaves, folha, *chave;
  struct arvbm **filho, *prox;
}TABM;

clock_t tt;
	//Variaveis para contagem do tempo
	struct tms time;	 //Estrutura que ira guardar os dados a respeito do tempo de execucao do programa
						 //clock_t clock;
	int tics_per_second; //Variavel que irah guardar os ciclos de clock por segundo do sistema
	//Pergunta ao SO sobre os ciclos de clock
	tics_per_second = sysconf(_SC_CLK_TCK);
TABM *cria(int t){
  TABM* novo = (TABM*)malloc(sizeof(TABM));
  novo->nchaves = 0;
  novo->chave =(int*)malloc(sizeof(int)*((t*2)-1));
  novo->folha = 1;
  novo->filho = (TABM**)malloc(sizeof(TABM*)*t*2);
  novo->prox = NULL;
  int i;
  for(i=0; i<(t*2); i++) novo->filho[i] = NULL;
  return novo;
}


TABM *inicializa(void){
  return NULL;
}

void libera(TABM *a){
  if(a){
    if(!a->folha){
      int i;
      for(i = 0; i <= a->nchaves; i++) libera(a->filho[i]);
    }
    free(a->chave);
    free(a);
  }
}

TABM *busca(TABM *a, int mat){
  if (!a) return NULL;
  int i = 0;
  while ((i < a->nchaves) && (mat > a->chave[i])) i++;
  if ((i < a->nchaves) && (a->folha) && (mat == a->chave[i])) return a;
  if (a-> folha) return NULL;
  if (a->chave[i] == mat) i++;
  return busca(a->filho[i], mat);
}

void imprime(TABM *a, int andar){
  if(a){
    int i,j;
    for(i=0; i<=a->nchaves-1; i++){
      imprime(a->filho[i],andar+1);
      for(j=0; j<=andar; j++) printf("   ");
      printf("%d\n", a->chave[i]);
    }
    imprime(a->filho[i],andar+1);
  }
}

TABM *divisao(TABM *x, int i, TABM* y, int t){
  TABM *z = cria(t);
  z->folha = y->folha;
  int j;
  if(!y->folha){
    z->nchaves = t-1;
    for(j=0;j<t-1;j++) z->chave[j] = y->chave[j+t];
    for(j=0;j<t;j++){
      z->filho[j] = y->filho[j+t];
      y->filho[j+t] = NULL;
    }
  }
  else {
    z->nchaves = t; 
    for(j=0;j < t;j++) z->chave[j] = y->chave[j+t-1];
    y->prox = z;
  }
  y->nchaves = t-1;
  for(j=x->nchaves; j>=i; j--) x->filho[j+1]=x->filho[j];
  x->filho[i] = z;
  for(j=x->nchaves; j>=i; j--) x->chave[j] = x->chave[j-1];
  x->chave[i-1] = y->chave[t-1];
  x->nchaves++;
  return x;
}


TABM *insere_nao_completo(TABM *x, int mat, int t){
  int i = x->nchaves-1;
  if(x->folha){
    while((i>=0) && (mat < x->chave[i])){
      x->chave[i+1] = x->chave[i];
      i--;
    }
    x->chave[i+1] = mat;
    x->nchaves++;
    return x;
  }
  while((i>=0) && (mat < x->chave[i])) i--;
  i++;
  if(x->filho[i]->nchaves == ((2*t)-1)){
    x = divisao(x, (i+1), x->filho[i], t);
    if(mat > x->chave[i]) i++;
  }
  x->filho[i] = insere_nao_completo(x->filho[i], mat, t);
  return x;
}

TABM *insere(TABM *T, int mat, int t){
  if(busca(T, mat)) return T;
  if(!T){
    T=cria(t);
    T->chave[0] = mat;
    T->nchaves=1;
    return T;
  }
  if(T->nchaves == (2*t)-1){
    TABM *S = cria(t);
    S->nchaves=0;
    S->folha = 0;
    S->filho[0] = T;
    S = divisao(S,1,T,t);
    S = insere_nao_completo(S, mat, t);
    return S;
  }
  T = insere_nao_completo(T, mat, t);
  return T;
}   

void remove(TABM* arvore, int mat, int t){
    TABM *a = buscaPai(arvore,mat);
    int i = 0;
    while ((i < a->nchaves) && (mat > a->chave[i])) i++;
    if(a->filho[i + 1]->folha){//caso 1
        a->filho[i+1] = removeCaso1(a->filho[i+1],mat);
        return;
    }
    
    return NULL;
}

TABM* buscaPai(TABM* a, int mat){
    if (!a) return NULL;
    int i = 0;
    while ((i < a->nchaves) && (mat > a->chave[i])) i++;
    if((a->filho[i]->folha)){
        TABM* filho = a->filho[i];
        int j = 0;
        while ((j < filho->nchaves) && (mat > filho->chave[j])) j++;
        if ((j < filho->nchaves)  && (mat == filho->chave[j])) return a;
    }
    if (a-> folha) return NULL;
    if (a->chave[i] == mat) i++;
    return busca(a->filho[i], mat);
}

TABM* removeCaso1(TABM* a, int mat){
    int i = 0;
    while (i<a->nchaves){
        a->chave[i] = a->chave[i+1];
    }
    a->nchaves -= 1;
}



int main(void){
  TABM * arvore = inicializa();
  int num = 0, from, to;
  while(num != -1){
  
    FILE *arquivo;
    arquivo = fopen("10.000.txt", "r");
    if (arquivo == NULL)
    {
      printf("IMPOSSIVEL ABRIR O ARQUIVO");
      return 0;
    }
    while (EOF != fscanf(arquivo, "%d", &chave) && fgets(ltr, 5, arquivo))
    {
      for (int i = 0; i < 9; i++)
        ltr[i] = ltr[i + 1];
        insere(arvore, num, t);
    }
    fclose(arquivo);
    printf(tics_per_second);
    printf("\n\n");
  }
}