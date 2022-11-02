// Instituição: UFMT - Campus Araguaia
// Disciplina: Prog. II 
// Aluna: Tainá Isabela Monteiro da Silva - RGA: 202011722019

// Escreva um programa que leia uma frase do teclado e a imprima na tela sem espaços

#include <iostream>
#include <string.h>
#include <stdio.h>


void gets(char *frase){
    char c;
    int i = 0;
    
    while((c = getchar()) != '\n'){
        frase[i] = c;
        i++;
    }
    
    frase[i] = '\0';
}

int main(){
    char frase[100];
    int i = 0;
    int j = 0;
    int k = 0;
    int tamanho = 0;
    
    printf("Digite uma frase: ");
    gets(frase);
    
    tamanho = strlen(frase);
    
    for(i = 0; i < tamanho; i++){
        if(frase[i] != ' '){
            frase[j] = frase[i];
            j++;
        }
    }
    
    frase[j] = '\0';
    
    printf("Frase sem espaços: %s\n", frase);
    
    return 0;
}

