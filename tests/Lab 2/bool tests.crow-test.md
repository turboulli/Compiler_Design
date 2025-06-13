# Executing your compiler

## ShouldSucceed

## ProgramArgumentFile

```
int main()
{
    bool t = true;
    bool f = false;

    int a = t ? 1 : 2;
    
    if (f && t) a += 4;
    while(f) {a += 1;}
    if(f) {}
    else { return a;}
    
    int b = 1 / 0;
    return 1;
}
```

# Executing the compiled binary

## ExitCode

```
1
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
2abaf61d82cc9c09ae13b772d2721a89454306992a9deb7045570b7994ea09b4
```
