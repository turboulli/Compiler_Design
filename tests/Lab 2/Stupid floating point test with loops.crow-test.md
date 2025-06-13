# Executing your compiler

## ProgramArgumentFile

```
int main() {
bool counter_;
int i;
int j = 1;
counter_ = true;
i = 7;
for (; i > 0; i -= 1) {
    while (counter_) counter_ = false;
    counter_ = true; 
}
return (j % i);
}
```

## ShouldSucceed

# Executing the compiled binary

## ShouldCrash

```
FloatingPointException
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
3400f9053219fea2ce53e3c90042f8fe06474ac8941e1cf7a5547768f901fd07
```
