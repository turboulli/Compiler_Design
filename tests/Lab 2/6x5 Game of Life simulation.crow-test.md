# Executing your compiler

## ProgramArgumentFile

```
int main() {
  int board_height = 5;
  int board_width = 6;
  int expected_steps = 8;
  int expected_result = 0x18C0000;

  int board = (1 << (1 * board_height + 2)) | (1 << (2 * board_height + 3)) |
              (1 << (3 * board_height + 1)) | (1 << (3 * board_height + 2)) |
              (1 << (3 * board_height + 3));
  int previous = 0;

  int steps = 0;
  while (board != previous) {
    steps += 1;
    previous = board;
    for (int i = 0; i < board_height; i += 1) {
      for (int j = 0; j < board_width; j += 1) {
        int linear_address = i * board_height + j;

        int northern_neighbor_alive =
            i == 0 ? 0 : ((previous >> (linear_address - board_height)) & 1);
        int northeastern_neighbor_alive =
            (i == 0 || j == (board_width - 1))
                ? 0
                : ((previous >> (linear_address - board_height + 1)) & 1);
        int eastern_neighbor_alive =
            j == (board_width - 1) ? 0
                                   : ((previous >> (linear_address + 1)) & 1);
        int southeastern_neighbor_alive =
            (i == (board_height - 1) || j == (board_width - 1))
                ? 0
                : ((previous >> (linear_address + board_height + 1)) & 1);
        int southern_neighbor_alive =
            i == (board_height - 1)
                ? 0
                : ((previous >> (linear_address + board_height)) & 1);
        int southwestern_neighbor_alive =
            (i == (board_height - 1) || j == 0)
                ? 0
                : ((previous >> (linear_address + board_height - 1)) & 1);
        int western_neighbor_alive =
            j == 0 ? 0 : ((previous >> (linear_address - 1)) & 1);
        int northwestern_neighbor_alive =
            (i == 0 || j == 0)
                ? 0
                : ((previous >> (linear_address - board_height - 1)) & 1);

        int alive_neighbours =
            northern_neighbor_alive + northeastern_neighbor_alive +
            eastern_neighbor_alive + southeastern_neighbor_alive +
            southern_neighbor_alive + southwestern_neighbor_alive +
            western_neighbor_alive + northwestern_neighbor_alive;

        int currently_alive = (previous >> linear_address) & 1;
        int alive_after = 0;
        if (currently_alive == 1) {
          alive_after =
              (alive_neighbours == 2 || alive_neighbours == 3) ? 1 : 0;
        } else {
          alive_after = alive_neighbours == 3 ? 1 : 0;
        }

        board &= ~(1 << linear_address);
        board |= alive_after << linear_address;
      }
    }
  }

  return expected_steps - steps
    + expected_result - board
    + (expected_result >> 8) - (board >> 8)
    + (expected_result >> 16) - (board >> 16)
    + (expected_result >> 24) - (board >> 24);
}
```

## ShouldSucceed

# Executing the compiled binary

## ShouldSucceed

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
02187f10becbc493193ba90835e7f4d7a7e1a718d57091f7b903f0ec6e6a9bc0
```
