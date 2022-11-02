#include <iostream>
#include <string>
#include <cmath>
using namespace std;

class Cartao
{
public:
    string destinatario;

    Cartao(string destinatario)
    {
        this->destinatario = destinatario;
    }

    string getDestinatario()
    {
        return this->destinatario;
    }
    void mensagem()
    {
    }
};

class CartaoNatal : public Cartao
{
public:
    CartaoNatal(string destinatario) : Cartao(destinatario)
    {
    }
    void mensagem()
    {
        cout << "Feliz Natal!"<< destinatario << endl;
    }
    friend istream &operator>>(istream &i, CartaoNatal &c)
    {
        i >> c.destinatario;
        return i;
    }
};

class CartaoAniversario : public Cartao
{
public:
    CartaoAniversario(string destinatario) : Cartao(destinatario)
    {
    }
    void mensagem()
    {
        cout << "Feliz Aniversario!"<< destinatario << endl;
    }
    friend istream &operator>>(istream &i, CartaoAniversario &c)
    {
        i >> c.destinatario;
        return i;
    }
};

int main()
{
    string destinatario;
    char opcao;
    Cartao *cartao;
    do
    {
        cout << "Digite o destinatario do cartao: ";
        cin >> destinatario;
        cout << "Digite a opcao desejada: " << endl;
        cout << "1 - Cartao de Natal" << endl;
        cout << "2 - Cartao de Aniversario" << endl;
        cout << "3 - Sair" << endl;
        cin >> opcao;
        switch (opcao)
        {
        case '1':
            cartao = new CartaoNatal(destinatario);
            cartao->mensagem();
            break;
        case '2':
            cartao = new CartaoAniversario(destinatario);
            cartao->mensagem();
            break;
        case '3':
            cout << "Saindo...\n" << endl;
            break;
        default:
            cout << "Opcao invalida" << endl;
            break;
        }
    }
    while (opcao != '3');
    return 0;
}
