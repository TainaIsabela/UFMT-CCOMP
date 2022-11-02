#include <iostream>
#include <string>
#include <cmath>
using namespace std;

class itemFatura{
    private:
    int id;
    string nome;
    int quantidade;
    float precoUnit;
    public:
    itemFatura(){
        id = 0;
        nome = "nulo";
        quantidade = 0;
        precoUnit = 0;
    };
    itemFatura(int id, string nome, int quantidade, float precoUnit){
        this->id = id;
        this->nome = nome;
        this->quantidade = quantidade;
        this->precoUnit = precoUnit;
    };
    void setId(int id){this->id = id;}
    void setNome(string nome){this->nome = nome;}
    void setQuantidade(int quantidade){this->quantidade = quantidade;}
    void setPrecoUnit(float precoUnit){this->precoUnit = precoUnit;}
    int getId(){return id;}
    string getNome(){return nome;}
    int getQuantidade() {return quantidade;}
    float getPrecoUnit(){return precoUnit;}

    void totalItem(){
        float total = quantidade * precoUnit;
        cout << "Total do item: " << total << endl;
    }

    void imprime(){
        cout << "Id: " << id << endl;
        cout << "Nome: " << nome << endl;
        cout << "Quantidade: " << quantidade << endl;
        cout << "Preco unitario: " << precoUnit << endl;
    }

};

int main(){
    itemFatura item1;
    item1.setId(1);
    item1.setNome("Coca-Cola");
    item1.setQuantidade(2);
    item1.setPrecoUnit(5.5);
    item1.imprime();
    itemFatura item2(2, "Pepsi", 3, 4.5);
    item2.imprime();
    item2.totalItem();
    item2.setPrecoUnit(5.5);
    item2.totalItem();


}