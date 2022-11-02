#include <iostream>
#include <string>
#include <cmath>
using namespace std;

class VeiculoAVenda{
    string marca;
    string modelo;
    int ano;
    float precoDeVenda;


    public:
    VeiculoAVenda(string marca, string modelo, int ano, float precoDeVenda){
        this->marca = marca;
        this->modelo = modelo;
        this->ano = ano;
        this->precoDeVenda = precoDeVenda;
    }
    void setMarca(string marca){this->marca = marca;}
    void setModelo(string modelo){this->modelo = modelo;}
    void setAno(int ano){this->ano = ano;}
    void setPrecoDeVenda(float precoDeVenda){this->precoDeVenda = precoDeVenda;}
    string getMarca(){return marca;}
    string getModelo(){return modelo;}
    int getAno(){return ano;}
    float getPrecoDeVenda(){return precoDeVenda;}

    virtual void mostraDados(){
        cout << "Marca: " << marca << endl;
        cout << "Modelo: " << modelo << endl;
        cout << "Ano: " << ano << endl;
        cout << "Preco de venda: " << precoDeVenda << endl;
    }
};

class automovelAVenda : public VeiculoAVenda {
    private:
    double motor;
    bool cambio;
    int numerodePortas;
    
    public:
    automovelAVenda(string marca, string modelo, int ano, float precoDeVenda, double motor, bool cambio, int numerodePortas)
    : VeiculoAVenda(marca, modelo, ano, precoDeVenda){
        this->motor = motor;
        this->cambio = cambio;
        this->numerodePortas = numerodePortas;
    }
    void setMotor(double motor){this->motor = motor;}
    double getMotor(){return motor;}
    void setCambio(bool cambio){this->cambio = cambio;}
    bool getCambio(){return cambio;}
    void setNumerodePortas(int numerodePortas){this->numerodePortas = numerodePortas;}
    int getNumerodePortas(){return numerodePortas;}
    void mostraDados(){
        VeiculoAVenda::mostraDados();
        cout << "Motor: " << motor << endl;
        cout << "Cambio: " << cambio << endl;
        cout << "Numero de portas: " << numerodePortas << endl;
    }
};

class Motocicleta : public VeiculoAVenda{
    private:
    int cilindrada;

    public:
    Motocicleta(string marca, string modelo, int ano, float precoDeVenda, int cilindrada): VeiculoAVenda(marca, modelo, ano, precoDeVenda){
        this->cilindrada = cilindrada;
    }
    void setCilindrada(int cilindrada){this->cilindrada = cilindrada;}
    int getCilindrada(){return cilindrada;}
    void mostraDados(){
        VeiculoAVenda::mostraDados();
        cout << "Cilindrada: " << cilindrada << endl;
    }
};

int main(){
    automovelAVenda carro1("Ford", "Fiesta", 2015, 15000, 1.6, true, 4);
    Motocicleta moto1("Honda", "CBR", 2015, 15000, 125);
    carro1.mostraDados();
    moto1.mostraDados();
    VeiculoAVenda *carro = &carro1;
    VeiculoAVenda *moto = &moto1;
    float precoC = carro->getPrecoDeVenda();
    float precoM = moto->getPrecoDeVenda();

    float somatoria = precoC + precoM;
    cout << "A soma dos preços é: " << somatoria << endl;
    
}