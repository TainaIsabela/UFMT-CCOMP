.global _start
_start:
la t3, string
la t2, fim_msg
sub a2,t2,t3
li a7, 64 #codigo para imprimir
li a0, 1 
la a1,string #rotulo 
ecall
li a7, 93 #chamar a syscall exit(0), 93 significa a chamada de exit, o S.O sempre olha o a7.
li a0, 0 #primeiro argumento de exit é zero.
ecall
string: .string "RON\n"
fim_msg:
