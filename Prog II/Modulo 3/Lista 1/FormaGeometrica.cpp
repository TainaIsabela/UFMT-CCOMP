#include <iostream>
#include <string>
#include <cmath>
using namespace std;

class FormaGeometrica{
    // classe puramente virtual
    public:
    virtual double calculaArea() = 0;

    void oi(){
        cout << "oi, sou uma forma geometrica" << endl;
    }
};

class Retangulo : public FormaGeometrica{
    public:
    double base;
    double altura;
    Retangulo(double base, double altura)
    {
        this->base = base;
        this->altura = altura;
    }
    // sobrescrevendo o método calculaArea da classe pai
    double calculaArea()
    {
        return base * altura;
    }

    void oi(){
        cout << "oi, sou um retangulo" << endl;
    }
};

int main(){
    Retangulo retangulo(10, 5);
    cout << "Area do retangulo: " << retangulo.calculaArea() << endl;
    FormaGeometrica *pRetangulo = &retangulo;
    pRetangulo->oi();
    return 0;
};


//A) Se o retangulo não sobreescrever o método calculaArea, o compilador não compila.
//B) Se o retangulo sobreescrever o método calculaArea sem a palavra override, o compilador não compila.
//C) Se o retangulo sobreescrever o método calculaArea dizendo que é um método const e não um método virtual, o compilador não compila.
