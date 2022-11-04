.global _start

NumInt: # Seleciona o numero inteiro e divide por 10
    la t3, resultado
    lb t4, fim 
    addi t3, t3, 10
    sb t4, 0(t3) # Salva o resultado na posicao 0 do endereco t3

loop1:
    add t2, x0, t0 # Adiciona o valor de t2 + 0 do x0 ao valor de t0
    li t5, 0
    blt t2, t1, guardaResultado # Guarda o resultado se o valor de t2 for menor que t1

loop2:
    add t2, t2, -10 # subtrai 10 do valor de t2
    addi t5, t5, 1
    bge t2, t1, loop1 # Verifica se o valor de t2 é maior ou igual a t1 = 10 
    add t2, x0, t2 # Adiciona o valor de t2 + 0 do x0 ao valor de t2
    add t0, x0, t5 # t0 recebe o valor de x0 + t5


guardaResultado:
    addi t3, t3, -1
    addi t2, t2, 48 # subtrai 48 do valor de t2
    sb t2, 0(t3) # Salva o resultado de t2 na posicao 0 do endereco t3
    bge t0, t1, loop1 # Verifica se o valor de t0 é maior a t1 = 10
    addi t3, t3, -1
    addi t0, t0, 48
    sb t0, 0(t3) # Salva o resultado do numero 
    ret

_start:
    li t1, 10
    li t0, 9876543
    jal NumInt

print:
    li a0, 0
    la a1, resultado
    li a2, 20
    li a7, 64 # Chamada de Sistema
    ecall

end:
    li a0, 0
    li a7, 93 # Chamada de Sistema 
    ecall

fim: .ascii "\n"

resultado: .space 20
