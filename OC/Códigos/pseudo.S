la t0, numero
lw t1, 0(t0)
addi t1,t1, 1
sw t1,0(t0)
numero: .word 33
li a7, 93
li a0, 0
ecall
numero: .word 33

