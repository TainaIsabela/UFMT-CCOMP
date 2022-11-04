.global _start

_start:
li a0, 10
jal sub1
end:
    li a0, 0
    li a7, 93
    ecall
sub1:
    addi sp, sp, -4 #cresce a pilha de 4 bytes
    sw ra, 0(sp)
    li a1, 3
    jal sub2
    lw ra, 0(sp)
    addi sp, sp, -4 #cresce a pilha de 4 bytes
    ret
sub2:
    add a0, a0, a1
    ret