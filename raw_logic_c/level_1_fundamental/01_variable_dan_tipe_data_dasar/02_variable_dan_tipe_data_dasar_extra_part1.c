#include <stdatomic.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>

/*
====================================================================
A. FUNDAMENTAL / SCALAR TYPES
====================================================================
*/
// THIS ONE ENOUGH BY USING stdio.h
void demo_integer_types(void) {
  char c = 'A';
  signed char sc = -10;
  unsigned char uc = 250;

  short s = -300;
  unsigned short us = 60000;

  int i = -1000;
  unsigned int ui = 1000;

  long l = 100000L;
  unsigned long ul = 200000UL;

  long long ll = -9000000000LL;
  unsigned long long ull = 9000000000ULL;

  // OUTPUT
  printf("%c\n", c);
  printf("%d\n", sc);
  printf("%u\n", uc);
  printf("%d\n", s);
  printf("%u\n", us);
  printf("%d\n", i);
  printf("%u\n", ui);
  printf("%ld\n", l);
  printf("%lu\n", ul);
  printf("%lld\n", ll);
  printf("%llu\n", ull);

  printf("\n\n");
}

/*
====================================================================
B. FLOATING POINT TYPES
====================================================================
*/
// THIS ONE ENOUGH BY USING stdio.h
void demo_floating_types(void) {
  // float f = 3.14f;
  // double d = 3.1231232131;
  // long double ld = 3.141239812L;
  float f = 3.14f;
  double d = 3.1415926535;
  long double ld = 3.141592653589793L;

  // ME
  printf("%f\n", f);
  printf("%f\n", d);
  printf("%Lf\n", ld);

  // CHATGPT
  printf("float: %f\n", f);
  printf("double: %lf\n", d);
  printf("long double: %Lf\n", ld);

  printf("\n\n");
}

/*
====================================================================
C. BOOLEAN TYPE
====================================================================
*/
// _Bool cukup pakai stdio.h
// bool pakai
void demo_boolean_type(void) {
  _Bool raw = 1;
  bool b = true;

  printf("%d\n", raw);
  printf("%d\n", b);

  printf("\n\n");
}

/*
====================================================================
D. POINTER TYPES
====================================================================
*/
void demo_pointer_type(void) {
  int x = 42;
  int *p = &x;
  void *vp = &x;

  printf("%d\n", x);
  printf("%d\n", *p);
  printf("%p\n", vp);

  printf("\n\n");
}

/*
====================================================================
E. ARRAY TYPES
====================================================================
*/
void demo_array_type(void) {
  int arr[5] = {1, 2, 3, 4, 5};

  for (int i = 0; i < 5; i++) {
    printf("%d. arr[%d] = %d\n", i + 1, i, arr[i]);
  }

  printf("\n\n");
}

/*
====================================================================
F. FUNCTION TYPE & FUNCTION POINTER
====================================================================
*/
int add(int a, int b) { return a + b; }

void demo_function_type(void) {
  int (*fp)(int, int) = add;
  int result = fp(3, 4);

  printf("%d", result);

  printf("\n\n");
}

/*
====================================================================
G. STRUCT TYPE
====================================================================
*/
struct Point {
  int x;
  int y;
};

void demo_struct_type(void) {
  struct Point p = {10, 20};
  printf("Point.x = %d, Point.y = %d\n", p.x, p.y);

  printf("\n\n");
}

/*
====================================================================
H. UNION TYPE
====================================================================
*/
union Number {
  int i;
  float f;
};

void demo_union_type(void) {
  union Number n;

  n.i = 10;
  printf("union as int = %d\n", n.i);

  n.f = 3.14f;
  printf("union as float = %f\n", n.f);
}

/*
====================================================================
I. ENUM TYPE
====================================================================
*/
enum Color { RED, GREEN, BLUE };

void demo_enum_type(void) {
  enum Color c = GREEN;
  printf("enum Color value: %d\n", c);
  printf("\n\n");
}

/*
====================================================================
J. TYPE QUALIFIERS
====================================================================
*/
void demo_type_qualifiers(void) {
  const int a = 10;
  volatile int b = 20;
  int c = 30;
  int *restrict rp = &c;

  printf("a = %d\n", a);
  printf("b = %d\n", b);
  printf("rp = %d\n", *rp);

  printf("\n\n");
}

/*
====================================================================
K. FIXED-WIDTH INTEGER TYPES
====================================================================
*/
// ga cukup pakai library stdio.h
// harus pakai library stdint.h
void demo_fixed_width_types(void) {
  int8_t a = -128;
  uint8_t b = 255;
  int16_t c = -32000;
  uint16_t d = 65000;
  int32_t e = -2000000000;
  uint32_t f = 4000000000U;
  int64_t g = -9000000000000000000LL;
  uint64_t h = 18000000000000000000ULL;

  printf("int8_t: %d\n", a);
  printf("uint8_t: %u\n", b);
  printf("int16_t: %d\n", c);
  printf("uint16_t: %u\n", d);
  printf("int32_t: %d\n", e);
  printf("uint32_t: %u\n", f);
  printf("int64_t: %ld\n", g);
  printf("uint64_t: %lu\n", h);

  printf("\n\n");
}

/*
====================================================================
L. SIZE & POINTER DIFFERENCE TYPES
====================================================================
*/
// tidak cukup pakai library stdio.h
// harus pakai library stddef.h
void demo_size_ptrdiff(void) {
  int arr[10];
  size_t size = sizeof(arr);
  ptrdiff_t diff = &arr[9] - &arr[0];

  printf("size_t (size of array)    = %zu\n", size);
  printf("ptrdiff_t (pointer diff)  = %td\n", diff);

  printf("\n\n");
}

/*
====================================================================
M. ATOMIC TYPE
====================================================================
*/
// tidak bisa pakai library stdio.h
// harus pakai library stdatomic.h
void demo_atomic_type(void) {
  atomic_int counter = 0;

  atomic_fetch_add(&counter, 1);
  atomic_fetch_add(&counter, 1);

  printf("atomic counter: %d\n", counter);

  printf("\n\n");
}

int main(void) {
  demo_integer_types();
  demo_floating_types();
  demo_boolean_type();
  demo_pointer_type();
  demo_array_type();
  demo_function_type();
  demo_struct_type();
  demo_union_type();
  demo_enum_type();
  demo_type_qualifiers();
  demo_fixed_width_types();
  demo_size_ptrdiff();
  demo_atomic_type();
}
