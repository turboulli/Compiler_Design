# Executing your compiler

## ProgramArgumentFile

```
int main() {
  bool a = true;
  bool b = false;
  bool c = false;
  bool result = ((a && b) || (a && c)) && ((a || c) || (b || c));
  if (result) {
    return 1;
  }
  return 0;
}
```

## ShouldSucceed

# Executing the compiled binary

## ExitCode

```
0
```

# Meta

## Limited to Category

```
false
```

## Creator

```
advanced-spinetails
```

## Admin Authored

```
false
```

## Hash

```
afaf2197e16cef586cc9edb02dfce0498bcf8f384368c0c33826d8a19f708fb2
```
