// Instituição: UFMT - Campus Araguaia
// Disciplina: Prog. II 
// Aluna: Tainá Isabela Monteiro da Silva - RGA: 202011722019

// Escreva um programa que leia uma strings e gere outra com o contéudo da primeira invertido.
#include <iostream>
#include <string>
int main()
{
    std::string str;
    std::cout << "Digite uma string: ";
    std::cin >> str;
    std::string str2 = "";
    for (int i = str.length() - 1; i >= 0; i--)
    {
        str2 += str[i];
    }
    std::cout << "String invertida: " << str2 << std::endl;
    return 0;
}
