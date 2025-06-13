# Executing your compiler

## ProgramArgumentFile

```
int main() {
  int b_val = 100;
  int c_val = 7;
  int d_val = 5;
  int e_val = 3;
  int g_val = 10;
  int f_shift = 2;
  int h_shift = 1;
  int i_mask = 0x0F; // 15
  int j_xor  = 0x33; // 51
  int k_or   = 0xAA; // 170

  // The Precedence Hell Expression:
  // Goal: ( ( ( ( (b_val - (c_val*d_val%e_val)) + (~g_val) ) >> f_shift ) << h_shift ) & i_mask ) ^ j_xor ) | k_or
  int result = b_val - c_val * d_val % e_val + ~g_val >> f_shift << h_shift & i_mask ^ j_xor | k_or;

  return result;
}
```

## ShouldSucceed

# Executing the compiled binary

## ExitCode

```
187
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
e38c32b7dd866e4b2bbba775c8cd49e4c3f0c8b06be0ad7635edc9a4e42afde1
```
