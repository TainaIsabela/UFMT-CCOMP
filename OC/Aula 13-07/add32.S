.global _start
number:
.word 32
.set h, 1080
add32:
la t0, number
lw t1, 0(t0)
add a0, a0, t1
ret
_start:
li a0, 2
li a1, h
jal add32
