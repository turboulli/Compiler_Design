# Executing your compiler

## ShouldSucceed

## ProgramArgumentFile

```
int main() {
  int numerator = 100;
  int divisor;
  bool condition_is_true = (10 > 5);
  int zero_value = 0;
  int safe_value = 1;

  if (condition_is_true) {
    divisor = (numerator % 2 == 0) ? zero_value : safe_value;
    // Since numerator (100) % 2 == 0 is true, divisor becomes 0.
  } else {
    divisor = safe_value;
  }
  return numerator / divisor;
}
```

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
heavenly-crimsonwing
```

## Admin Authored

```
false
```

## Hash

```
16f50ec768b9b970e29ef547e1367833bac34462eecf921346a61bf52100395b
```
