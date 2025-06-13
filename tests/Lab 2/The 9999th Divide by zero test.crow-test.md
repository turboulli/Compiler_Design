# Executing your compiler

## ProgramArgumentFile

```
// EDIT by Julian: Declarations are not allowed in the for update step per the grammar.
// That was a bug in the reference compiler that has since been fixed.
int main() {
    for (int i = 0 ; true; i = 1 % 0) continue;
    return 0;
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
daring-bulbul
```

## Admin Authored

```
false
```

## Hash

```
2fbb8f28f763ab63739900b99b849d7bc2a455b3e54e16c0c6a4d4b097fd4e99
```
