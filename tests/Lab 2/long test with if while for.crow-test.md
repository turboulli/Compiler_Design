# Executing your compiler

## ShouldSucceed

## ProgramArgumentFile

```
int main() {
  int a = 5;
  int b = 10;
  a += b;
  b = (a * 2) - 4;
  int c;
  c = b / a;
  int d = 0xF;
  d *= 2;
  int e;
  e = -d + (c * 3);
  a = e % 4;
  b -= a;
  c = (b + a) * (d - e);
  int f = c / (a + 1);
  int g = f + d - b;
  g *= 3;
  int h = g / 2;
  h += a * b;
  int i = (h % 7) + (e - d);
  int j = i * f;
  j -= g / a;
  int k = j + i - h;
  k *= (c + 1);
  int l = -k + d;
  l %= 9;
  int m = l * l;
  m += a - b + c - d + e - f + g - h + i - j + k;
  int n = m / 3;
  n += k % 4;
  int o = n + l * d;
  o -= g + h;
  int p = o % 5;
  p *= p + 1;
  int q = p + m - o + a * b;
  int r = (q * p + m) % (d + 1);
  int s = (r + k - n) * 2;
  s += (o - i) % 3;
  int t = s / 2 + j * 3;
  t -= (l + f);
  int u = t * t - (g % 4);
  u += e * d;
  int v = u + s - q + a * c;
  v %= 17;
  int w = (v * v * v) + (n - m);
  int x = w / (a + 2);
  x += r - s + b * d;
  int y = x * q;
  int z = y % 10 + (u - v);
  z += x * 3 - t;

  // Use if statement
  if (z > 50) {
    z = z - 10;
  }

  if (x < 100) {
    x += 20;
  } else {
    x -= 5;
  }

  if ((a + b + c) % 2 == 0) {
    z *= 2;
  }

  // Use for loop
  int sum = 0;
  for (i = 0; i < 5; i += 1) {
    sum += i;
  }

  for (j = 10; j > 0; j -= 2) {
    sum += j;
  }

  // Use while loop
  int count = 3;
  while (count > 0) {
    z += count;
    count -= 1;
  }

  int loopVar = 0;
  while (loopVar < 10) {
    if (loopVar % 2 == 0) {
      sum += loopVar;
    } else {
      sum -= loopVar;
    }
    loopVar += 1;
  }

  int aa = z + y + x + w + v + u + t + s + r + q + p + o + n + m + l + k + j + i + h + g + f + e + d + c + b + a + sum;
  return aa;
}
```

# Executing the compiled binary

## ExitCode

```
90
```

# Meta

## Limited to Category

```
false
```

## Creator

```
impressive-palm-swift
```

## Admin Authored

```
false
```

## Hash

```
143e7ffb4c605171935d4c738ece5372ca54a72acaf5d2b698353b0d05e2f0a6
```
