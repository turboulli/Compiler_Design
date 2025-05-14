.include "startup.s"

_main:
    movl $2, %edi
    movl $1, %esi
    movl %edi, %edx
    subl %esi, %edx
    movl %edx, %eax
    ret
