.global _start
.text
_start:
    la           s1, arr          
    addi         s2, zero, 3      
    addi         sp, sp, -8        
    sd           ra, 0(sp)        
    mv           s3, zero         
    j            compare
L1:
    slli         s4, s3, 3        
    add          s5, s1, s4       
    ld           a0, 0(s5)        
    jal          ra, print_    
    addi         s3, s3, 1        
compare:
    blt          s3, s2, L1       
    j            exit
print_:
    addi         sp, sp, -40      
    sd           s0, 32(sp)       
    addi         s0, sp, 40       
    addi         t0, zero, 0      
    addi         t1, zero, 10     
    addi         t2, s0, -16       
    add          a1, zero, t2     
    addi         t3, zero, '\n'   
    sb           t3, 0(a1)        
    bge          a0, zero, PVE    
    xori         a0, a0, -1       
    addi         a0, a0, 1        
    addi         t0, zero, 1      
PVE:
    remu         t3, a0, t1       
    addi         t3, t3, 48       
    addi         a1, a1, -1       
    sb           t3, 0(a1)        
    divu         a0, a0, t1       
    blt          zero, a0, PVE    
    beq          t0, zero, print  
    addi         t3, zero, '-'    
    addi         a1, a1, -1       
    sb           t3, 0(a1)        
print:
    sub          t4, t2, a1       
    addi         a2, t4, 1        
    addi         a0, zero, 1      
    addi         a7, zero, 64     
    ecall                         
    ld           s0, 32(sp)       
    addi         sp, sp, 40       
    ret                                   
exit:
    ld           ra, 0(sp)        
    addi         sp, sp, 8        
    addi         a0, zero, 0      
    addi         a7, zero, 93     
    ecall
.data
arr:
  .dword  12345670, -12345670, 0
 

