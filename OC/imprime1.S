.global _start
_start:
li a7, 64 
li a0, 1 
la a1,string 
li a2, 9
ecall
li a7, 93 #chamar a syscall exit(0), 93 significa a chamada de exit, o S.O sempre olha o a7.
li a0, 0 #primeiro argumento de exit é zero.
ecall
string: .string "RONCADOR\n"
