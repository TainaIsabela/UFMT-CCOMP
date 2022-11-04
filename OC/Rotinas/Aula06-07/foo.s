.global _start

inc_var:
    li t0, 7
    add a0, t0, sp
    sw t0, 0(a0)
    ret

foo:
    addi sp, sp, 5
    sw ra, 4(sp)
    mv a0, sp
    jal inc_var
    lw ra, 4(sp)
    ret

_start:
    jal foo

end: 
    li a0, 0
    li a7, 93
    ecall

