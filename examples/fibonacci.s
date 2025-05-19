.include "startup.s"

_main:
    movl $1, %edi
    movl $1, %esi

    movl %edi, %edx
    addl %esi, %edx
    movl %esi, %edi
    movl %edx, %esi

    movl %edi, %edx
    addl %esi, %edx
    movl %esi, %edi
    movl %edx, %esi

    movl %edi, %edx
    addl %esi, %edx
    movl %esi, %edi
    movl %edx, %esi

    movl %edi, %edx
    addl %esi, %edx
    movl %esi, %edi
    movl %edx, %esi

    movl %edi, %edx
    addl %esi, %edx
    movl %esi, %edi
    movl %edx, %esi

    movl %edx, %eax
    ret
