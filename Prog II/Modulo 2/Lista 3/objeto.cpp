#include <iostream>
#include <string>
#include <cmath>
using namespace std;

class objetoGeometric{
    public:
    virtual double area() = 0;
    virtual double perimetro() = 0;
    virtual void mostraDados() {
        cout << "Area: " << area() << endl;
        cout << "Perimetro: " << perimetro() << endl;
    }
};  
class circle : public objetoGeometric{
    private:
    double raio;
    public:
    circle(double raio){
        this->raio = raio;
    }
    double getRaio(){return raio;}
    void setRaio(double raio){this->raio = raio;}
    double area(){
        return 3.14 * pow(raio, 2);
    }
    double perimetro(){
        return 2 * 3.14 * raio;
    }
    void mostraDados(){
        cout << "Raio: " << raio << endl;
        objetoGeometric::mostraDados();

    }
};

class retangulo: public objetoGeometric{
    private:
    double base;
    double altura;
    public:
    retangulo(double base, double altura){
        this->base = base;
        this->altura = altura;
    }
    double getBase(){return base;}
    double getAltura(){return altura;}
    void setBase(double base){this->base = base;}
    void setAltura(double altura){this->altura = altura;}
    double area(){
        return base * altura;
    }
    double perimetro(){
        return 2 * (base + altura);
    }
    void mostraDados(){
        cout << "Base: " << base << endl;
        cout << "Altura: " << altura << endl;
        objetoGeometric::mostraDados();

    }
};

class triangle : public objetoGeometric {
    private:
    double base;
    double altura;
    public:
    triangle(double base, double altura){
        this->base = base;
        this->altura = altura;
    }
    double getBase(){return base;}
    double getAltura(){return altura;}
    void setBase(double base){this->base = base;}
    void setAltura(double altura){this->altura = altura;}
    double area(){
        return (base * altura) / 2;
    }
    double perimetro(){
        return base + altura + sqrt(pow(base, 2) + pow(altura, 2));
    }
    void mostraDados(){
        cout << "Base: " << base << endl;
        cout << "Altura: " << altura << endl;
        objetoGeometric::mostraDados();
    }
};

int main(){
    circle c(5);
    retangulo r(5, 10);
    triangle t(5, 10);
    objetoGeometric *obj[3];
    obj[0] = &c;
    obj[1] = &r;
    obj[2] = &t;
    
    cout << "\nCirculo" << endl;
    obj[0]->mostraDados();
    cout << "\nRetangulo" << endl;
    obj[1]->mostraDados();
    cout << "\nTriangulo" << endl;
    obj[2]->mostraDados();
    
    return 0;
}