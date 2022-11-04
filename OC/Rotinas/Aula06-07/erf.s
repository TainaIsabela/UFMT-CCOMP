.global _start

init_var:
    li t0, 7
    sw t0, 0(a0)
    ret

foo:
    addi sp, sp, -8
    sw ra,4(sp)
    mv a0, sp
    jal init_var
    lw ra,4(sp)
    addi sp, sp, 8
    ret

_start:
    jal foo

end: 
    li a0, 0
    li a7, 93
    ecall

