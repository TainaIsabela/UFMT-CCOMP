// Instituição: UFMT - Campus Araguaia
// Disciplina: Prog. II 
// Aluna: Tainá Isabela Monteiro da Silva - RGA: 202011722019

#include <iostream>
#include <vector>
#include <memory>
using namespace std;

void read_vector(shared_ptr<vector<int>> v)
{
    int n;
    cout << "Digite o tamanho do vetor: ";
    cin >> n;
    v->resize(n);
    for (int i = 0; i < n; i++)
    {
        cout << "Digite o valor " << i + 1 << ": ";
        cin >> (*v)[i];
    }
}
void print_vector(const vector<int> &v)
{
    for (int i = 0; i < v.size(); i++)
    {
        cout << v[i] << " ";
    }
    cout << endl;
}

int main()
{   
    shared_ptr<vector<int>> v = make_shared<vector<int>>();
    read_vector(v);
    print_vector(*v);
    return 0;
}