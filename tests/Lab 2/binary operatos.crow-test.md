# Executing your compiler

## ShouldSucceed

## ProgramArgumentFile

```
int main()
{
   int a = 0x00FF;
   int b = 0xFF00;

   if (a == b) return 1;
   
   int notA = ~a;
   int aXorB = a ^ b;

   int aAndB = a & b;

   if (aAndB != 0) return 1;
   if (notA != 0xFFFFFF00) return 1;
   if (aXorB != 0x0000FFFF) return 1;

   return 0;
}
```

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
spiffy-lyrebird
```

## Admin Authored

```
false
```

## Hash

```
8551fa560fa7625187a668969fc72f84dc5481bdae4c384b6398b1ef27d21281
```
