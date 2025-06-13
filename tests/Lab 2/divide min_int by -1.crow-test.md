# Executing your compiler

## ProgramArgumentFile

```
int main() {
  int numerator = -2147483646;
  int problematic_denominator = -1;
  bool enable_dangerous_division = true;
  int result = 0;

  // i = 0: numerator becomes -2147483647
  // i = 1: numerator becomes -2147483648 (MIN_INT)
  for (int i = 0; i < 2; i = i + 1) {
    if (enable_dangerous_division) {
      numerator = numerator - 1;
    } else {
      numerator = 10;
    }
  }

  // After the loop, if enable_dangerous_division was true,
  // numerator is -2147483648.

  if (enable_dangerous_division && (numerator < 0) ) {
    // The following line attempts -2147483648 / -1, which overflows.
    result = numerator / problematic_denominator;
  } else {
    result = 123;
  }

  return result;
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
heavenly-crimsonwing
```

## Admin Authored

```
false
```

## Hash

```
1f178d798390eade3362d6d2ad1943ac753de640134af472b5b3d7c3c5d2cb8f
```
