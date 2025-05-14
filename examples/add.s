.include "startup.s"

_main:
    movl $1, %edi
    movl $2, %esi
    movl %edi, %edx
    addl %esi, %edx
    movl %edx, %eax
    ret
