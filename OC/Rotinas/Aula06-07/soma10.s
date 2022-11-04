.global _start

soma10:
    add a0, a0, a1
    add a0, a0, a2
    add a0, a0, a3
    add a0, a0, a4
    add a0, a0, a5
    add a0, a0, a6
    add a0, a0, a7
    lw t0, 0(sp)
    add a0, a0, t0 # acessa 1
    lw t0, 4(sp)
    add a0, a0, t0 # acessa 2
    ret

_start:
    li a0, 1
    li a1, 2
    li a2, 3
    li a3, 4
    li a4, 5
    li a5, 6
    li a6, 7
    li a7, 8
    addi sp, sp, -12 #aumentar o tamanho da pilha
    li t0, 9
    sw t0, 0(sp)
    li t0, 10
    sw t0, 4(sp)
    sw ra, 8(sp)
    jal soma10
    lw ra, 8(sp)
    addi sp, sp, 12 

end: 
    li a0, 0
    li a7, 93
    ecall
