.include "startup.s"

_main:
    movl $6, %edi
    movl $3, %esi
    movl %edi, %eax
    cltd
    idivl %esi
    movl %eax, %eax
    ret
