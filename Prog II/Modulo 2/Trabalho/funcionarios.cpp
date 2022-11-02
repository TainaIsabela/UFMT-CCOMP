#include <iostream>
#include <string>
#include <cmath>
using namespace std;

class funcionarios
{
public:

    string nome;
    string cod;
    double salario;
    string escolaridade;

    funcionarios(string nome, string cod, double salario, string escolaridade)
    {
        this->nome = nome;
        this->cod = cod;
        this->salario = salario;
        this->escolaridade = escolaridade;
    }
    string getNome()
    {
        return nome;
    }
    string getCod()
    {
        return cod;
    }
    double getSalario()
    {
        return salario;
    }
    string getEscolaridade()
    {
        return escolaridade;
    }
    void setNome(string nome)
    {
        this->nome = nome;
    }
    void setCod(string cod)
    {
        this->cod = cod;
    }
    void setSalario(double salario)
    {
        this->salario = salario;
    }
    void setEscolaridade(string escolaridade)
    {
        this->escolaridade = escolaridade;
    }
    double salarioFinal()
    {
        if (escolaridade == "Ensino Básico")
        {
            return salario * 1.10;
        }
        else if (escolaridade == "Ensino Medio")
        {
            return ((salario * 1.10) * 1.50);
        }
        else if (escolaridade == "Superior")
        {
            return ((salario * 1.10) * 1.50) * 2.00;
        }
        else
        {
            return salario;
        }
    }
};

class ensinoBasico : public funcionarios
{
    public:
    string escolaBasica;
    ensinoBasico(string nome, string cod, double salario, string escolaridade, string escolaBasica) : funcionarios(nome, cod, salario, escolaridade)
    {
        this->escolaBasica = escolaBasica;
    }
    string getEscolaBasica()
    {
        return escolaBasica;
    }
    void setEscolaBasica(string escolaBasica)
    {
        this->escolaBasica = escolaBasica;
    }

};

class ensinoMedio : public ensinoBasico
{
    public:
    string escolaMedio;
    ensinoMedio(string nome, string cod, double salario, string escolaridade, string escolaBasica, string escolaMedio) : ensinoBasico(nome, cod, salario, escolaridade, escolaBasica)
    {
        this->escolaMedio = escolaMedio;
    }
    string getEscolaMedio()
    {
        return escolaMedio;
    }
    void setEscolaMedio(string escolaMedio)
    {
        this->escolaMedio = escolaMedio;
    }
};

class superior : public ensinoMedio
{
    public:
    string escolaSuperior;
    superior(string nome, string cod, double salario, string escolaridade, string escolaBasica, string escolaMedio, string escolaSuperior) : ensinoMedio(nome, cod, salario, escolaridade, escolaBasica, escolaMedio)
    {
        this->escolaSuperior = escolaSuperior;
    }
    string getEscolaSuperior()
    {
        return escolaSuperior;
    }
    void setEscolaSuperior(string escolaSuperior)
    {
        this->escolaSuperior = escolaSuperior;
    }
};

int main(){
    ensinoBasico eBasico1("Joao", "123", 1000, "Ensino Básico", "Escola Basica");
    ensinoBasico eBasico2("Maria", "456", 1000, "Ensino Básico", "Escola Basica");
    ensinoBasico eBasico3("José", "789", 1000, "Ensino Básico", "Escola Basica");
    ensinoBasico eBasico4("Julietta", "089", 1000, "Ensino Básico", "Escola Basica");

    ensinoMedio eMedio1("Pedro", "312", 1000, "Ensino Medio", "Escola Basica", "Escola Medio");
    ensinoMedio eMedio2("Joana", "325", 1000, "Ensino Medio", "Escola Basica", "Escola Medio");
    ensinoMedio eMedio3("Marcus", "233", 1000, "Ensino Medio", "Escola Basica", "Escola Medio");
    ensinoMedio eMedio4("Yara", "743", 1000, "Ensino Medio", "Escola Basica", "Escola Medio");

    superior eSuperior1("Vitória", "332", 1000, "Superior", "Escola Basica", "Escola Medio", "Escola Superior");
    superior eSuperior2("Isabela", "092", 1000, "Superior", "Escola Basica", "Escola Medio", "Escola Superior");

    double  sBasico, sMedio, sSuperior, sTotal;
    
    sBasico = eBasico1.salarioFinal() + eBasico2.salarioFinal() + eBasico3.salarioFinal() + eBasico4.salarioFinal();
    sMedio = eMedio1.salarioFinal() + eMedio2.salarioFinal() + eMedio3.salarioFinal() + eMedio4.salarioFinal();
    sSuperior = eSuperior1.salarioFinal() + eSuperior2.salarioFinal();

    sTotal = sBasico + sMedio + sSuperior;

    cout << "Salarios do(s) funcionario(s) do ensino basico: " << sBasico << endl;
    cout << "Salarios do(s) funcionario(s) do ensino medio: " << sMedio << endl;
    cout << "Salarios do(s) funcionario(s) do ensino superior: " << sSuperior << endl;
    cout << "Salarios totais: " << sTotal << endl;
}