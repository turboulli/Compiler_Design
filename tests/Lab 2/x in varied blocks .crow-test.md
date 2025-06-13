# Executing your compiler

## ShouldSucceed

## ProgramArgumentFile

```
int main() {
{}{int x = 5;}{{{{}}}}
int x;
{x = 10;{{{{x+=4;}}}}{x*=2;}{{{{
if (x == 28) {
 {x=-10;{{{
  while (x > 2*x) {{
    for(; x < -2; x+=1) {
      if (x > 5) {
       return x;
       break;
      } else if (x > 1) {
       break;
       continue;
      } else {{
       {{{continue;}}}
       {break;}
      }}
      {x += 56;}
    }
   {{}{x+=1;}}
  }}
 }}}}
} else {
  {x/=0;{{{x-=3;}while(true) {{{{}}}}}}}
}
}}}}}

{{{x+=7;{x*=6;}
}}}

return x;
}
```

# Executing the compiled binary

## ExitCode

```
42
```

# Meta

## Limited to Category

```
false
```

## Creator

```
dependable-scimitarbill
```

## Admin Authored

```
false
```

## Hash

```
c2c80fb9d69349655dea83033643c93698700f807df0a22c35a2b91be5b37dff
```
