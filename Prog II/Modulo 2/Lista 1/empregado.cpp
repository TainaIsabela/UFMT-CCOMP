#include <iostream>
#include <string>
#include <cmath>
using namespace std;

class empregador {
    public:
    float salario;
    string nome;

    void aumento(float porcentagem) {
        salario = salario + (salario * porcentagem / 100);
    }
    void mostraDados() {
        cout << "Nome: " << nome << endl;
        cout << "Salario: " << salario << endl;
    }
};
int main(){
    empregador emp;
    emp.nome = "Tainá";
    emp.salario = 1000;
    emp.mostraDados();
    emp.aumento(10);
    emp.mostraDados();
    return 0;
}

