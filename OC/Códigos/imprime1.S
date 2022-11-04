.global _start 
_start: # ponto de entrada
li a0, 1
la a1, palavra
li a7, 64 #syscall exit
ecall
exit: 
li a0, 0 #1º argumento de exit e zero
la a7, 93
ecall
palavra: .string: ascii "RONCADOR\n"

