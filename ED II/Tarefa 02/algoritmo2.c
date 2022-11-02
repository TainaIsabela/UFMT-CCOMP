#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include <sys/times.h> //Times Funcao
#include <sys/types.h> //Bib que define o registro TMS
#include <unistd.h>	   //Biblioteca necessaria para descobrir os ciclos de clock

//inclusão de biblioteca proprias
#include "funcoes.c"

int main(int argc, char *argv[])
{
	clock_t tt;
	//Variaveis para contagem do tempo
	struct tms time;	 //Estrutura que ira guardar os dados a respeito do tempo de execucao do programa
						 //clock_t clock;
	int tics_per_second; //Variavel que irah guardar os ciclos de clock por segundo do sistema
	//Pergunta ao SO sobre os ciclos de clock
	tics_per_second = sysconf(_SC_CLK_TCK);

	FILE *arquivo;
	int m = 100, chave;
	int colisao;
	char ltr[5];

	Hash *tab[m];
	inicializa(tab, m);

	arquivo = fopen("150tipo2-5.txt", "r");
	if (arquivo == NULL)
	{
		printf("IMPOSSIVEL ABRIR O ARQUIVO");
		return 0;
	}
	while (EOF != fscanf(arquivo, "%d", &chave) && fgets(ltr, 5, arquivo))
	{
		for (int i = 0; i < 4; i++)
			ltr[i] = ltr[i + 1];
		insere(tab, m, chave, ltr);
	}
	fclose(arquivo);

	imprime(tab, m, &colisao);
	printf("numero de colisões: %d\n", colisao);

	return 0;
}
