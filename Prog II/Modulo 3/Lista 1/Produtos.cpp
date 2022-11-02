#include <iostream>
#include <string>
#include <cmath>
using namespace std;

class Produto {
    public:
    double priceProduto;
    string nameProduto; 
};
class ComboProduto {
    public:
    double totalValor;
    int quantidadeItens;

    friend ComboProduto combinarProdutos(Produto, Produto);
};

//crie uma função amiga chamada combinarProdutos
//que recebe dois objetos da classe Produto
//e retorna um objeto da classe ComboProduto
//que contém o valor total dos produtos e a quantidade de itens que compõem o combo

ComboProduto combinarProdutos(Produto produto1, Produto produto2) {
    ComboProduto combo;
    combo.totalValor = (produto1.priceProduto + produto2.priceProduto) * 0.85;
    combo.quantidadeItens = 2;
    return combo;
}

int main(){
    Produto produto1;
    Produto produto2;
    ComboProduto combo;
    produto1.priceProduto = 10;
    produto1.nameProduto = "Produto 1";
    produto2.priceProduto = 20;
    produto2.nameProduto = "Produto 2";
    combo = combinarProdutos(produto1, produto2);
    cout << "Valor total: " << combo.totalValor << endl;
    cout << "Quantidade de itens: " << combo.quantidadeItens << endl;
    return 0;
};