.global main
.global _main

.text

main:
    call _main
    movq %rax, %rdi
    movq $0x3C, %rax
    syscall

_main:
    movq $1, %rdi
    movq $2, %rsi
    movq %rdi, %rdx
    addq %rsi, %rdx
    movq %rdx, %rax
    ret
