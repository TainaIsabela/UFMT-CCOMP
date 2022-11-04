.global _start
numero: word 33
_start: # ponto de entrada
la t0, numero
lw t1, 0(t0) #t1 <- mem [16 + 0]
addi t1,t1, 1
sw t1, 0 (t0)
li a7, 93 #syscall exit
li a0, 0 #1º argumento de exit e zero
ecall

