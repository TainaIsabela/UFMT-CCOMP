#include <stdio.h>
#include <stdlib.h>
#include "TAVL.h"

int fatorBalanceamento(TAVL *main){
    return labs( altura(main->esq) - altura(main->dir) );
}

int retornaMaior(int x, int y){
    return ( ( x > y ) ? x : y );
}

int altura(TAVL *main){
    if(main){
		return main->fb;
	}
	return -1;
}

void rotacaoEE(TAVL **main){  
    TAVL *temp = (*main)->esq;
    (*main)->esq = temp->dir;
    temp->dir = *main;
    (*main)->fb = retornaMaior(altura((*main)->esq), altura((*main)->dir)) + 1;
    temp->fb = retornaMaior(altura(temp->esq), (*main)->fb) + 1;
    *main = temp;
}

void rotacaoDD(TAVL **main){    
    TAVL *temp = (*main)->dir;
    (*main)->dir = temp->esq;
    temp->esq = (*main);
    (*main)->fb = retornaMaior(altura((*main)->esq),altura((*main)->dir)) + 1;
    temp->fb = retornaMaior(altura(temp->dir), (*main)->fb) + 1;
    *main = temp;
}

void rotacaoDE(TAVL **main){  
    rotacaoEE(&((*main)->dir));
    rotacaoDD(main);
}

void rotacaoED(TAVL **main){   
    rotacaoDD(&((*main)->esq));
    rotacaoEE(main);
}

int inserir(TAVL **main, int num){
    int res;
    if(!(*main)){
        TAVL *aux = (TAVL *) malloc(sizeof(TAVL));
        aux->info = num; aux->fb = 0; aux->esq = aux->dir = NULL;
        (*main) = aux;
        return 1;
    }

    TAVL *temp = (*main);
    if(num < temp->info){
        if((res = inserir((&(temp->esq)), num)) == 1)
            if(fatorBalanceamento(temp) >= 2){
                if( num < (*main)->esq->info )
                    rotacaoEE(main);
                else
                    rotacaoED(main);
            }
    }
    else{
        if((res = inserir((&(temp->dir)), num)) == 1)
            if(fatorBalanceamento(temp) >= 2)
                if( num >= (*main)->dir->info )
                    rotacaoDD(main);
                else
                    rotacaoDE(main);
    }

    temp->fb = retornaMaior( altura(temp->esq), altura(temp->dir) ) + 1;

    return res;
}

TAVL* procuraMenor(TAVL *main){
    TAVL *aux = main, *temp = main->esq;
    while(temp){
        aux = temp;
        temp = temp->esq;
    }
    return aux;
}

int remover(TAVL **main, int num){
	if(!(*main)){	
	    printf("Valor não existe!\n");
	    return 0;
	}

    int res;
	if(num < (*main)->info)
	    if( (res = remover(&(*main)->esq, num)) == 1 )
            if(fatorBalanceamento(*main) >= 2){
                if( altura((*main)->dir->esq) <= altura((*main)->dir->dir) )
                    rotacaoDD(main);
                else
                    rotacaoDE(main);
            }
	if(num > (*main)->info)
	    if( (res = remover(&(*main)->dir, num)) == 1 )
            if(fatorBalanceamento(*main) >= 2){
                if( altura((*main)->esq->dir) <= altura((*main)->esq->esq) )
                    rotacaoEE(main);
                else
                    rotacaoED(main);
            }

	if((*main)->info == num){
	    if( ( !(*main)->esq ) || ( !(*main)->dir ) ) {	
			TAVL *aux = *main;
			if( (*main)->esq )
                *main = (*main)->esq;
            else
                *main = (*main)->dir;
			free(aux);
		}
		else {	
			TAVL *temp = procuraMenor( (*main)->dir );
			(*main)->info = temp->info;
			remover( &(*main)->dir, (*main)->info );
            if( fatorBalanceamento(*main) >= 2 ){
				if( altura((*main)->esq->dir) <= altura((*main)->esq->esq) )
					rotacaoEE(main);
				else
					rotacaoED(main);
			}
		}
		if (*main)
            (*main)->fb = retornaMaior( altura((*main)->esq), altura((*main)->dir) ) + 1;
		return 1;
	}

	(*main)->fb = retornaMaior( altura((*main)->esq), altura((*main)->dir) ) + 1;

	return res;
}

void imprimir(TAVL* main){
    
    printf("(");  
    if(main) {  
        printf("%d ", main->info); 
        imprimir(main->esq);   
        imprimir(main->dir);   
    }
    printf(")");    
}