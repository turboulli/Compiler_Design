# Executing your compiler

## ProgramArgumentFile

```
int main() {
int a = 0xa;
int b = 0X2;
int c = a << b;
b &= (0xF & a);
a ^= 0xF & c << b;

return a | b;
}
```

## ShouldSucceed

# Executing the compiled binary

## ExitCode

```
10
```

# Meta

## Limited to Category

```
false
```

## Creator

```
smug-canary
```

## Admin Authored

```
false
```

## Hash

```
d8070d29c66d1620c86630f2bad0caa83ef552e81e28bfef6146d4243193cb19
```
