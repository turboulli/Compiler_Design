.global main
.global _main

.text

main:
    call _main
    movq %rax, %rdi
    movq $0x3C, %rax
    syscall

_main:
    movl $1, %edi
    movl $2, %esi
    movl %edi, %edx
    addl %esi, %edx
    movl %edx, %eax
    ret
