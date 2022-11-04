.global _start

one:
    li t1, 1
    li t2, 0 # contador 

loop:
    beq t1, t2, return # alcaçamos o fim do vetor?
    sw t1, 0(a0)
    addi a0, a0, 4 #
    addi t2, t2, 1
    j loop
    
return:
    ret

main:
    addi sp, sp, -16 
    sw ra, 12(sp)
    mv a0, sp
    li a1, 3
    jal one

    lw ra, 12(sp)
    addi sp, sp, 16
    ret

_start:
    jal main 

end:
    li a0, 0
    li a7, 93
    ecall
