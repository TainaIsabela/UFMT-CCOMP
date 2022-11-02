
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
typedef struct aluno{
    int matricula;
    char cr[3];
    struct aluno *prox;
} TAluno;
typedef TAluno *Hash;
int hash(int mat, int tam){
    return mat % tam;
}
void inicializa(Hash *tab, int tam){
    int i;
    for (i = 0; i < tam; i++){
        tab[i] = NULL;
    }
}
TAluno *aloca(int mat, char cr[]){
    TAluno *novo = (TAluno *)malloc(sizeof(TAluno));
    novo->matricula = mat;
    novo->cr[0] = cr;
    novo->prox = NULL;
    return novo;
}
void insere(Hash *tab, int tam, int mat, char cr[]){   
    int contador = 0;
    int pos = hash(mat, tam);
    TAluno *novo = aloca(mat, cr);
    if (tab[pos] == NULL){
        tab[pos] = novo;
    }
    else{
        TAluno *aux = tab[pos];
        while (aux->prox != NULL){
            aux = aux->prox;
        }
        contador++;
        aux->prox = novo;
    }
}
void excluir(Hash *tab, int m, int mat){
    int h = hash(mat, m);
    TAluno *p = tab[h];
    TAluno *ant = NULL;
    while (p != NULL && p->matricula != mat){
        ant = p;
        p = p->prox;
    }
    if (p != NULL){
        if (ant == NULL){
            tab[h] = p->prox;
        }
        else{
            ant->prox = p->prox;
        }
        free(p);
    }
}
void imprime(Hash *tab, int m){
    int i;
    for (i = 0; i < m; i++){
        printf("%d: ", i);
        if (tab[i]){
            TAluno *p = tab[i];
            while (p){
              printf("\t%d\t%c\t%p\t\n ", p->matricula, p->cr, p->prox);
              p = p->prox;
            }
        }
        else{
            printf("NULL\n");
        }
    }
}
void libera(Hash *tab, int m){
    int i;
    for (i = 0; i < m; i++){
        if (tab[i]){
            TAluno *p = tab[i];
            TAluno *q;
            while (p){
                q = p;
                p = p->prox;
                free(q);
            }
        }
    }
}
int main(){
    int m;
    m = 100;
    Hash *tab[m];
    FILE *arq;
    arq = fopen("alunos.txt", "r");
    if (arq == NULL){
        printf("Erro na abertura do arquivo\n");
        return 1;
    }
    inicializa(tab, m);
    int mat, i;
    char cr[3];
    while (fscanf(arq, "%d %s", &mat, cr) != EOF){
        insere(tab, m, mat, cr);
    }
    libera(tab, m);
    return 0;
}