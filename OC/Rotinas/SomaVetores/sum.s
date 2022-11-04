.global _start

sum:    
    li t0, 0        #acumulador
loop: 
    lw t1, 0(a0)    # t1 <- mem[a0+0]
    add t0, t0, t1
    addi a0, a0, 4 
    add a1, a1, -1  #a1 atde de elementos do vetor
    bnez a1, loop
    mv a0, t0
    ret
_start:
la a0, vetor 
li a1, 5
jal sum
vetor:
    .word 1,2,3,4,5
end: 
    li a0, 0
    li a7, 93
    ecall


 