#include <stdatomic.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/*
====================================================================
A. DYNAMIC INTEGER (HEAP ALLOCATION)
====================================================================
Skenario:
- Data datang dari runtime (bukan compile-time)
*/
void demo_dynamic_integer(void) {
  int *value = malloc(sizeof(int));
  if (!value) {
    return;
  }

  *value = 42;
  printf("%d\n", *value);

  free(value);
  printf("\n\n");
}

/*
====================================================================
B. DYNAMIC FLOATING POINT
====================================================================
Skenario:
- Hasil perhitungan runtime
*/
// perlu stdlib.h
void demo_dynamic_float(void) {
  double *result = malloc(sizeof(double));
  if (!result) {
    return;
  }

  *result = 22.0 / 7.0;
  printf("%lf\n", *result);

  free(result);
  printf("\n\n");
}

/*
====================================================================
C. DYNAMIC BOOLEAN FLAG
====================================================================
Skenario:
- Status runtime (config, state machine)
*/
// perlu stdbool.h
void demo_dynamic_bool(void) {
  bool *flag = malloc(sizeof(bool));
  if (!flag) {
    return;
  }

  *flag = true;
  printf("%d\n", *flag);

  free(flag);
  printf("\n\n");
}

/*
====================================================================
D. DYNAMIC ARRAY
====================================================================
Skenario:
- Ukuran array diketahui saat runtime
*/
void demo_dynamic_array(size_t count) {
  int *array = malloc(count * sizeof(int));
  if (!array) {
    return;
  }

  for (size_t i = 0; i < count; i++) {
    array[i] = (int)(i * 10);
  }

  for (size_t i = 0; i < count; i++) {
    printf("[dynamic array] array[%zu] = %d\n", i, array[i]);
  }

  free(array);
  printf("\n\n");
}

/*
====================================================================
E. STRUCT DINAMIS
====================================================================
Skenario:
- Representasi data user / entity
*/
// Butuh library string.h
struct User {
  int id;
  char *name;
};

void demo_dynamic_struct(void) {
  struct User *user = malloc(sizeof(struct User));
  if (!user) {
    return;
  }

  user->id = 1;
  user->name = malloc(32);
  if (!user->name) {
    free(user);
    return;
  }

  strcpy(user->name, "Riiha");

  printf("id = %d, name = %s", user->id, user->name);

  free(user->name);
  free(user);
  printf("\n\n");
}

/*
====================================================================
F. FUNCTION POINTER DINAMIS
====================================================================
Skenario:
- Callback / strategy pattern ala C
*/
int add(int a, int b) { return a + b; }
int sub(int a, int b) { return a - b; }

typedef int (*operation_fn)(int, int);

void demo_dynamic_function_pointer(bool use_add) {
  operation_fn op;
  if (use_add) {
    op = add;
  } else {
    op = sub;
  }

  int result = op(10, 3);
  printf("[function pointer] result = %d\n", result);
  printf("\n\n");
}

/*
====================================================================
G. VOID POINTER (GENERIC DATA)
====================================================================
Skenario:
- API generik (mirip qsort, malloc wrapper)
*/
void print_int(void *data) {
  int *value = (int *)data;
  printf("[void*] value = %d\n", *value);
}

void demo_void_pointer(void) {
  int *number = malloc(sizeof(int));
  if (!number) {
    return;
  }

  *number = 90;
  print_int(number);

  free(number);
  printf("\n\n");
}

/*
====================================================================
H. CONST + RESTRICT (REAL USE CASE)
====================================================================
Skenario:
- Optimisasi fungsi matematis
*/
void sum_arrays(const int *restrict a, const int *restrict b, int *restrict out,
                size_t n) {
  for (size_t i = 0; i < n; i++) {
    out[i] = a[i] + b[i];
  }
}

void demo_const_restrict(void) {
  int a[3] = {1, 2, 3};
  int b[3] = {4, 5, 6};
  int out[3];

  sum_arrays(a, b, out, 3);

  for (int i = 0; i < 3; i++) {
    printf("[restrict] out[%d] = %d\n", i, out[i]);
  }

  printf("\n\n");
}

/*
====================================================================
I. FIXED-WIDTH TYPES (BINARY DATA)
====================================================================
Skenario:
- Parsing data biner / network / file format
*/
// Perlu library stdint.h
void demo_fixed_width_binary(void) {
  uint8_t packet[4] = {0x01, 0x02, 0xFF, 0x10};

  for (size_t i = 0; i < 4; i++) {
    printf("[binary] byte-%zu =  0x%02X\n", i, packet[i]);
  }

  printf("\n\n");
}

/*
====================================================================
J. SIZE_T & PTRDIFF_T (MEMORY SAFE LOOP)
====================================================================
*/
// program ini hanya ingin menunjukkan jarak titik point dengan ptrdiff_t
// perlu library stddef.h
void demo_size_ptrdiff(void) {
  int arr[5] = {10, 20, 30, 40, 50};

  size_t size = sizeof(arr) / sizeof(arr[0]);
  ptrdiff_t diff = &arr[4] - &arr[0];

  printf("[size_t] length = %zu\n", size);
  printf("[ptrdiff_t] diff = %td\n", diff);

  printf("\n\n");
}

/*
====================================================================
K. ATOMIC (BASIC CONCURRENCY MODEL)
====================================================================
Skenario:
- Counter thread-safe
*/
void demo_atomic(void) {
  atomic_int counter = 0;

  atomic_fetch_add(&counter, 1);
  atomic_fetch_add(&counter, 1);

  printf("[atomic] counter = %d\n", counter);
}

int main(void) {
  demo_dynamic_integer();
  demo_dynamic_float();
  demo_dynamic_bool();
  demo_dynamic_array(5);
  demo_dynamic_struct();
  demo_dynamic_function_pointer(true);
  demo_void_pointer();
  demo_const_restrict();
  demo_fixed_width_binary();
  demo_size_ptrdiff();
  demo_atomic();

  return 0;
}
