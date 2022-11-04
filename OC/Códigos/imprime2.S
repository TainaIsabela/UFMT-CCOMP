.global _start 
_start:
la t1, msg
la t2, fimmsg
li a0, 1
la a1, msg
li a7, 64 
ecall
exit: 
li a0, 0
la a7, 93
ecall
msg: .string .ascii "RONCADOR\n"
fimmsg: sub t3, t2, t1

 
