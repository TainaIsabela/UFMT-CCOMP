#include <iostream>
#include <string>
#include <cmath>
using namespace std;

namespace A
{
    int soma (int a, int b)
    {
        return a + b;
    }

    namespace B
    {
        int soma (int a, int b)
        {
            return a + b;
        }
        double mult (int a, int b)
        {
            return a * b;
        }
    }
}
double mult (int a, int b)
{
    return a * b;
}

namespace mercado {
    class Compra {
        public:
        int qtdItens;
        double valorCompra;
    };
    
}

namespace loja {
    class Compra {
        public:
        int qtdItens;
        double valorCompra;
    };
    
}

double faturar(mercado::Compra compra1, loja::Compra compra2) {
    return compra1.valorCompra + compra2.valorCompra;
}

int main ()
{
    double AB = A::B::mult(2, 3);
    cout << "Soma: "<< AB << endl;
    mercado::Compra compra1;
    compra1.qtdItens = 2;
    compra1.valorCompra = 10;
    loja::Compra compra2;
    compra2.qtdItens = 3;
    compra2.valorCompra = 20;
    double total = faturar(compra1, compra2);
    cout << "Total: " << total << endl;
    return 0;
}
