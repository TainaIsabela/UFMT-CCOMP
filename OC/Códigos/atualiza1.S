addi t0, zero, numero
lw t1, 0(t0) # t1 <- mem [16 + 0]
addi t1, t1, 1
sw t1, 0(t0)
sub to, zero, 5
numero: .word 33 #diretiva

