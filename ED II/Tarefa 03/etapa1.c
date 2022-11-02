#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
typedef struct lista{
    int valor;
    struct lista *prox;
} Tlista;

typedef Tlista *Hash;

int hash(int mat, int tam){
    return mat % tam;
}

void inicializa(Hash *tab, int tam) {
    int i;
    for (i = 0; i < tam; i++) {
        tab[i] = NULL;
    }
}

Tlista *aloca(int mat){
    Tlista *novo = (Tlista *)malloc(sizeof(Tlista));
    novo->valor = mat;
    novo->prox = NULL;
    return novo;
}

Tlista *busca(Hash *tab, int m, int mat){
    int h = hash(mat, m);
    Tlista *p = tab[h];
    while (p != NULL && p->valor != mat){
        p = p->prox;
    }
    return p;
}

void insere(Hash *tab, int m, int mat){
    int h = hash(mat, m);
    Tlista *p = tab[h];
    Tlista *ant = NULL;
    while (p != NULL && p->valor != mat){
        ant = p;
        p = p->prox;
    }
    Tlista *novo = aloca(mat);

    if (!ant){
        tab[h] = novo;
    }
    else{
        ant->prox = novo;
    }
}

void imprime(Hash *tab, int m){
    int i;
    for (i = 0; i < m; i++){
        printf("%d: ", i);
        if (tab[i]){
            Tlista *p = tab[i];
            while (p){
                printf("\t%d\t%c\t%p\t\n ", p->valor, p->prox);
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
    for (i = 0; i < m; i++)
    {
        if (tab[i]){
            Tlista *p = tab[i];
            Tlista *q;
            while (p){
                q = p;
                p = p->prox;
                free(q);
            }
        }
    }
}

char randomLetter(char vetor[]){
    char letra = 97 + (char)(rand() % 26);
    return letra;
}
int main(){
    srand(time(NULL));
    int m;
    scanf("%d", &m);
    Hash *tab[m];
    char nome[100];
    scanf("%s", nome);
    strcat(nome, "");
    inicializa(tab, m);
    FILE *arq;
    arq = fopen(nome, "w");
    int i;
    int mat;
    for (i = 0; i < m; i++){
            mat = rand() % 100000;
            insere(tab, m, mat);
        fprintf(arq, "%d\n", mat);
    }
    fclose(arq);
    libera(tab, m);
    return 0;
}