// Instituição: UFMT - Campus Araguaia
// Disciplina: Prog. II 
// Aluna: Tainá Isabela Monteiro da Silva - RGA: 202011722019

// Escreva um programa para ler duas strings e informar qual das duas são maiores ou se são iguais.
#include <iostream>
#include <string.h>
#include <stdio.h>
int main(){
    char str1[100], str2[100];
    std::cout << "Digite a primeira string: ";
    std::cin.getline(str1, 100);
    std::cout << "Digite a segunda string: ";
    std::cin.getline(str2, 100);
    char lenstr1 = strlen(str1);
    char lenstr2 = strlen(str2);
    if( lenstr1 > lenstr2 ){
        std::cout << "A primeira string e maior." << std::endl;
    }else if(strlen(str1) < strlen(str2)){
        std::cout << "A segunda string e maior." << std::endl;
    }else{
        std::cout << "As duas strings sao iguais." << std::endl;
    }
    return 0;
}