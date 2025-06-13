# Executing your compiler

## ShouldSucceed

## ProgramArgumentFile

```
int main() {
int a = 696969;
int b = 420420;

int t;

while (b > 0) {
t = b;
b = a % b;
a = t;
}

// gcd(696969, 420420) % 256 = 17
return a;
}
```

# Executing the compiled binary

## ExitCode

```
17
```

# Meta

## Limited to Category

```
false
```

## Creator

```
determined-fantail
```

## Admin Authored

```
false
```

## Hash

```
c726510b04c14add82db79b8e817d64a1a4f4d38ad384c29c0da46a6bfd0ff0d
```
