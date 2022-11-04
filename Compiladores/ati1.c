/**
 * UFMT -- Ciencia da Computacao
 * Compiladores - Prof. Ivairton
 * Aluna - Tainá Isabela
 * 
 * Exemplo 1 - Primeiro experimento: analisador sintático descendente
**/
#include <stdio.h>
#include <stdlib.h>

//Constantes
#define MAX_CHAR 32
#define true 1
#define false 0
//Variaveis globais
int pos = 0;
char string[MAX_CHAR];
char lookahead;
//Prototipos das funcoes da gramatica
int list();
int listR();
int digit();
int match(char c); //Funcao que compara o caracter da entrada com o esperado pela gramatica
void nextToken(); //Funcao que pega o proximo caracter da entrada a ser processado
//Verifica o proximo caracter (a frente) na cadeia se eh o esperado
int match(char c) {
    if ( lookahead == c ) {
        nextToken();
        return true;
    }
    return false;
}

//Funcao que passa ao proximo simbolo da cadeia
void nextToken() {
    pos++;
    lookahead = string[pos];
}

//Funcao da regra de derivacao 'list'
int list() {
    if ( digit() && listR() ) 
        return true;
    return false;
}

//Funcao da regra de derivacao 'listR'
int listR() {
    int test1, test2, test3;
    if ( lookahead == '+' ) {
        test1 = match('+');
        test2 = digit();
        test3 = listR();
        return test1 && test2 && test3;
    } if ( lookahead == '-' ) {
        test1 = match('-');
        test2 = digit();
        test3 = listR();
        return test1 && test2 && test3;
    } else {
        if ( match('\0') )
            return true;
        return false;
    }
}

//Funcao da regra de derivacao 'digit''
int digit() {
    if ( 
        match('0') || match('1') ||
        match('2') || match('3') ||
        match('4') || match('5') ||
        match('6') || match('7') ||
        match('8') || match('9') 
    ) {
        return true;
    }
    return false;
}
//*** Funcao principal ***
int main() {
    int acept = false;
    printf("Informe uma cadeia:");
    scanf("%s", string); //leitura da cadeia
    
    lookahead = string[0]; //inicializacao do lookahead
    acept = list(); //Chamada da derivacao/funcao inicial da gramatica
    if (acept) {
        printf("Cadeia PERTENCENTE a linguagem\n");
    } else {
        printf("Cadeia NAO pertencente a linguagem\n");
    }
    return 1;
}