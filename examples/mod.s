.include "startup.s"

_main:
    movl $5, %edi
    movl $3, %esi
    movl %edi, %eax
    cltd
    idivl %esi
    movl %edx, %eax
    ret
