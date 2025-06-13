# Executing your compiler

## ShouldSucceed

## ProgramArgumentFile

```
int main() {
  int n = 10;
  int k = 6;

  int result_numerator = 1;
  for (int i = n; i >= n - k + 1; i -= 1) {
    result_numerator *= i;
  }

  int result_denominator = 1;
  for (int i = k; i >= 1; i -= 1) {
    result_denominator *= i;
  }

  return result_numerator / result_denominator;
}
```

# Executing the compiled binary

## ExitCode

```
210
```

# Meta

## Limited to Category

```
false
```

## Creator

```
elated-wren
```

## Admin Authored

```
false
```

## Hash

```
072a2d602a347e6ea90d56a0df7b79b246b2a8d68b8b686690d0ec59adf9f858
```
