# Executing your compiler

## ProgramArgumentFile

```
// EDIT by Julian: This was a bug in the reference compiler :(
// Good test though! I have adjusted it. The typing rule
// for binops forces the arguments to both be int, which
// is not the case for "test = test & false".
int main()
{
  bool test = true;

  test &= false;

  return test ? 1: 0;
}
```

## ShouldFail

```
SemanticAnalysis
```

# Executing the compiled binary

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
c1bef0eaeee3a7956124cb346b644c43d5eedd471957fd0be00e465f06981593
```
