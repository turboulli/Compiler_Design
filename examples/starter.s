.global main
.global _main

.text

main:
    call _main
    movq %rax, %rdi
    movq $0x3C, %rax
    syscall

_main:
    movq $0, %rdi
    movq %rdi, %rax
    ret
