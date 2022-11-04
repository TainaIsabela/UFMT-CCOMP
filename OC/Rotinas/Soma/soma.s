.global _start
soma: 
    add t0, a0, a1      # soma a0 ao resultado
    mv a0, t0           # a0 <- t0 (valor de retorno  vai p/ a0)
    ret                 # pseudo-instrução: jalr x0, ra, 0
                        #Invoca a rotina multi9(4)
                        #1. Carrega o argumento 4 para a0
_start:                 # Ponto de Inicio
addi a0, zero, 4
addi a1, zero, 5
                        #2. Invoca a rotina multi9
jal soma
end: 
    li a0, 0            # addi a0, zero, 0
    li a7, 93           # addi a7, zero, 93 #exit
    ecall               #saltar para uma rotina dentro do S.O
