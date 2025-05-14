.global main
.global _main

.text

main:
    call _main
    movq %rax, %rdi
    movq $0x3C, %rax
    syscall

_main:
    movl $2, %edi
    movl $1, %esi
    movl %edi, %edx
    subl %esi, %edx
    movl %edx, %eax
    ret
