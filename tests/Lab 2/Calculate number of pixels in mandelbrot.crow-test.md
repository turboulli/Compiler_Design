# Executing your compiler

## ProgramArgumentFile

```
int main() {
    int max_iterations = 10;
    int number_of_pixels = 0;

    // c = c1 + c2 * i
    int c1;
    int c2;

    // z = z1 + z2 * i
    int z1;
    int z2;

    for (int j = -2; j <= 2; j += 1) {
        for (int i = -5; i <= 5; i += 1) {
            c1 = i;
            c2 = j;
            
            z1 = c1;
            z2 = c2;

            bool in_mandelbrot = true;
            for (int iteration = 0; iteration < max_iterations; iteration += 1) {
                if (z1 * z1 + z2 * z2 >= 4) {
                    in_mandelbrot = false;
                    break;
                }

                int z1_temp = z1 * z1 - z2 * z2 + c1;
                z2 = 2 * z1 * z2 + c2;
                z1 = z1_temp; 
            }

            if (in_mandelbrot) {
                number_of_pixels += 1;
            }
        }
    }

    return number_of_pixels;
}
```

## ShouldSucceed

# Executing the compiled binary

## ExitCode

```
4
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
2fac3701b4c37ec9c277912dd9d7384fc60fdb4528a3dabfc73b62e86ffab6b5
```
