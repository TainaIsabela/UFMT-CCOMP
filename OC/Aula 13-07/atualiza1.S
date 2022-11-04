.global _start
_start:
la t0, number
lw t1, 0(t0)
addi t1, t1, 1
sw t1, 0(t0)
li a0, 0
li a7, 93
ecall
.data
number: .word 33