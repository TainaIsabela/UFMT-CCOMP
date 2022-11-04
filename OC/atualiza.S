.global _start #exigencia do linker
_start: #primeira instrução
la t0, numero #addi t0,zero,  numero
lw t1,0(t0) # t1 <- mem[16 + 0]
addi t1,t1,1
sw t1,0(t0)

#lui carrega os 20 bits primeiros bits para o lado esquerdo da memoria
#la load adress, carrega o endereço na memoria, coisa q nao é possivel usando o addi
#mv t1, t2. copia o conteudo de t2 para t1
#j 20. faz um jump incondicionalmente 20 bytes para baixo.
#beqz t1, end. onde end é um rotulo
li a7, 93 #chamar a syscall exit(0), 93 significa a chamada de exit, o S.O sempre olha o a7.
li a0, 0 #primeiro argumento de exit é zero.
ecall 
numero: .word 33 #diretiva // escreve direto na memoria neste endereço.
