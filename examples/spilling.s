.include "startup.s"

_main:
    movl $1, 8+0*4(%rsp)
    movl $2, 8+1*4(%rsp)

    movl 8+0*4(%rsp), %edi
    movl 8+1*4(%rsp), %esi
    movl %edi, %edx
    addl %esi, %edx
    movl %edx, 8+2*4(%rsp)

    movl 8+2*4(%rsp), %eax
    ret
