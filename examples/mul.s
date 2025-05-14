.include "startup.s"

_main:
    movl $2, %edi
    movl $3, %esi
    movl %edi, %edx
    imull %esi, %edx
    movl %edx, %eax
    ret
