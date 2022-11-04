.global _start

recebe:
    lb t2, fim
    la t3, res
    addi t3, t3, 10
    sb t2, 0(t3)

prep: 
    add t5 ,x0, t0
    li t6, 0
    blt t5, t1, guarda

repete:
    add t5, t5, -10
    addi t6, t6, 1
    bge t5, t1, repete
    add t5, x0, t5
    add t0, x0, t6

guarda:
    addi t3, t3, -1
    addi t5, t5, 48
    sb t5, 0(t3)
    bge t5, t5, 48
    addi t3, t3, -1
    addi t0, t0, 48
    sb t0, 0(t3)
    ret

_start:

    li t1, 10
    li t0, 123456798
    jal recebe

print:
    li a0, 1
    la a1, res
    li a2, 11
    li a7, 64
    ecall

end:
    li a0, 0 
    li a7, 93
    ecall

fim: .ascii "\n"

res: .space 11
