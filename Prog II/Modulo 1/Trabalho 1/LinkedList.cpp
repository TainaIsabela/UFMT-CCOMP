// Instituição: UFMT - Campus Araguaia
// Disciplina: Prog. II 
// Aluna: Tainá Isabela Monteiro da Silva - RGA: 202011722019


#include <iostream>

using namespace std;

struct LinkedListNode
{
    int payload;
    LinkedListNode *next;
    LinkedListNode *prev;
};

struct LinkedList
{
    int size;
    LinkedListNode *head;
    LinkedListNode *tail;

    void insert(int payload)
    {
        LinkedListNode *newNode = new LinkedListNode;
        newNode->payload = payload;
        newNode->next = NULL;
        newNode->prev = NULL;

        if (head == NULL)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail->next = newNode;
            newNode->prev = tail;
            tail = newNode;
        }
        size++;
    }

    void remove(int payload)
    {
        LinkedListNode *current = head;
        while (current != NULL)
        {
            if (current->payload == payload)
            {
                if (current == head)
                {
                    head = current->next;
                    if (head != NULL)
                        head->prev = NULL;
                }
                else if (current == tail)
                {
                    tail = current->prev;
                    if (tail != NULL)
                        tail->next = NULL;
                }
                else
                {
                    current->prev->next = current->next;
                    current->next->prev = current->prev;
                }
                delete current;
                size--;
                return;
            }
            current = current->next;
        }
    }

    void print()
    {
        LinkedListNode *current = head;
        while (current != NULL)
        {
            cout << current->payload << " ";
            current = current->next;
        }
        cout << endl;
    }
};

int main()
{
    auto lista = new LinkedList;
    lista->insert(1);
    lista->insert(2);
    lista->insert(3);
    lista->insert(4);
    lista->insert(5);
    lista->insert(6);
    lista->insert(7);
    lista->insert(8);
    lista->insert(9);
    lista->insert(10);
    lista->remove(1);
    lista->remove(5);
    lista->remove(10);
    lista->print();
}