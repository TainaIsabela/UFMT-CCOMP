#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
typedef struct aluno{
    int matricula;
    char cr[3];
    struct aluno *prox;
} TAluno;

typedef TAluno *Hash;

int hash(int mat, int tam){
    return mat % tam;
}

void inicializa(Hash *tab, int tam) {
    int i;
    for (i = 0; i < tam; i++) {
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

TAluno *busca(Hash *tab, int m, int mat){
    int h = hash(mat, m);
    TAluno *p = tab[h];
    while (p != NULL && p->matricula != mat){
        p = p->prox;
    }
    return p;
}

float excluir(Hash *tab, int m, int mat){
    int h = hash(mat, m);
    if (tab[h] == NULL){
        return -1;
    }
    TAluno *p = tab[h];
    TAluno *ant = NULL;
    float cr = -1;
    while (p != NULL && p->matricula != mat){
        ant = p;
        p = p->prox;
    }
    if (p == NULL){
        return -1;
    }
    if (ant == NULL){
        tab[h] = p->prox;
    }
    else{
        ant->prox = p->prox;
    }
    cr = p->cr[0];
    free(p);
    return cr;
}

void insere(Hash *tab, int m, int mat, char cr){
    int h = hash(mat, m);
    TAluno *p = tab[h];
    TAluno *ant = NULL;
    while (p != NULL && p->matricula != mat){
        ant = p;
        p = p->prox;
    }
    TAluno *novo = aloca(mat, cr);

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
    for (i = 0; i < m; i++)
    {
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

char randomLetter(char vetor[]){
    char letra = 97 + (char)(rand() % 26);
    return letra;
}
int main(){
    srand(time(NULL));
    int m;
    scanf("%d", &m);
    Hash *tab[m];
    int tipo;
    scanf("%d", &tipo);
    char nome[100];
    scanf("%s", nome);
    strcat(nome, "");
    inicializa(tab, m);
    FILE *arq;
    arq = fopen(nome, "w");
    int i;
    int mat;
    char cr[3];
    for (i = 0; i < m; i++){
        if (tipo == 1){
            mat = rand() % 1023;
            if (mat % 2 == 0){
                mat = mat;
            }
            else{
                mat = mat + 1;
            }
            cr[0] = randomLetter(cr);
            cr[1] = randomLetter(cr);
            cr[2] = randomLetter(cr);
            insere(tab, m, mat, cr);
        }
        if (tipo == 2){
            mat = rand() % 1023;
            cr[0] = randomLetter(cr);
            cr[1] = randomLetter(cr);
            cr[2] = randomLetter(cr);
            insere(tab, m, mat, cr);
        }
        fprintf(arq, "%d\t%c%c%c\n", mat, cr[0], cr[1], cr[2]);
    }
    fclose(arq);
    libera(tab, m);
    return 0;
}