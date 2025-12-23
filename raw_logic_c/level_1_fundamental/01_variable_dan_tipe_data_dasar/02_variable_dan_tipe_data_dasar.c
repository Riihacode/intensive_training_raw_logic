/*
 * =====================================================================
 * FILE    : type_system_reference.c
 * STANDARD: ISO C17
 *
 * TUJUAN:
 * --------
 * Mengunci SELURUH SISTEM TIPE DATA C dalam satu source code.
 * File ini berfungsi sebagai:
 *
 * 1. PETA SISTEM TIPE C (BUKAN tutorial pemula)
 * 2. REFERENSI stabil agar tidak terjadi "oh ternyata ada ini"
 * 3. LANDASAN konseptual sebelum masuk memory, pointer, UB
 *
 * CATATAN PENTING:
 * ----------------
 * - Tidak semua tipe digunakan dalam operasi runtime
 * - Fokus pada DEFINISI, KATEGORI, dan RELASI tipe
 * - Tidak membahas memory layout, pointer semantics, atau lifetime
 * =====================================================================
 */

#include <stdbool.h> /* _Bool, bool */
#include <stddef.h>  /* size_t, ptrdiff_t */
#include <stdint.h>  /* fixed-width integer types */
#include <stdio.h>   /* printf */

/*
 * =====================================================================
 * 1. FUNDAMENTAL INTEGER TYPES
 * =====================================================================
 *
 * Semua tipe integer C dibagi berdasarkan:
 * - signedness (signed / unsigned)
 * - minimum width (short, int, long, long long)
 *
 * Ukuran aktual IMPLEMENTATION-DEFINED,
 * kecuali jaminan minimum oleh standar.
 */

/* Character types (1 byte, addressable unit terkecil) */
char c = 'A'; /* signedness implementation-defined */
signed char sc = -10;
unsigned char uc = 250;

/* Short integer types (>= 16 bit) */
short s = -32000;
unsigned short us = 65000;

/* Default integer types */
int i = -42;
unsigned int ui = 42;

/* Long integer types */
long l = 1000000L;
unsigned long ul = 2000000L;

/* Extended integer types (>= 64 bit) */
long long ll = 9000000000LL;
unsigned long long ull = -18000000000LL;

/*
 * =====================================================================
 * 2. FLOATING POINT TYPES
 * =====================================================================
 *
 * Floating point di C bersifat implementation-defined
 * (IEEE-754 umum, tapi tidak dijamin oleh standar).
 */

float f = 3.14f;                        /* single precision */
double d = 3.141592653589793;           /* double precision (default literal) */
long double ld = 3.141592653589793238L; /* extended precision */

/*
 * =====================================================================
 * 3. BOOLEAN TYPE
 * =====================================================================
 *
 * _Bool adalah tipe integer khusus (C99+).
 * <stdbool.h> hanya menyediakan alias & macro.
 */

_Bool raw_bool = 1;
bool wrapped_bool = true;

/*
 * =====================================================================
 * 4. VOID TYPE
 * =====================================================================
 *
 * void merepresentasikan "tidak ada nilai".
 * Digunakan pada:
 * - function tanpa return
 * - generic pointer (void*)
 */

void function_without_return(void) {
  // sengaja kosong
}

/*
 * =====================================================================
 * 5. ENUMERATION TYPE
 * =====================================================================
 *
 * enum adalah TIPE DATA.
 * Underlying type-nya adalah integer.
 */

enum Color { COLOR_RED = 0, COLOR_GREEN = 1, COLOR_BLUE = 2 };

enum Color current_color = COLOR_GREEN;

/*
 * =====================================================================
 * 6. DERIVED TYPES
 * =====================================================================
 *
 * Tipe turunan dibentuk dari tipe lain.
 * Ini BUKAN level lanjut — ini bagian inti sistem tipe C.
 */

/* Pointer type */
int *ptr_to_int = NULL;

/* Array type */
int int_array[10] = {1, 2, 3, 4, 5};

/* Function type */
int add(int a, int b) { return a + b; }

/*
 * =====================================================================
 * 7. AGGREGATE TYPES
 * =====================================================================
 *
 * Aggregate = tipe komposit.
 */

/* Structure type */
struct Person {
  int age;
  double height;
};

struct Person person = {.age = 21, .height = 170.5};

/* Union type */
union Number {
  int i;
  double d;
};

union Number number = {.i = 100};

/*
 * =====================================================================
 * 8. TYPE ALIAS (typedef)
 * =====================================================================
 *
 * typedef TIDAK membuat tipe baru,
 * hanya alias terhadap tipe yang ada.
 */

typedef unsigned long ulong_t;
typedef struct Person Person;

ulong_t alias_value = 123456UL;
Person alias_person = {.age = 30, .height = 100.0};

/*
 * =====================================================================
 * 9. TYPE QUALIFIERS
 * =====================================================================
 *
 * Qualifier MENGUBAH SEMANTIK TIPE,
 * bukan sekadar aturan penulisan.
 */

const int const_int = 10;
volatile int volatile_reg = 1;
int *restrict restrict_ptr = NULL;

/*
 * _Atomic (C11+) — bagian dari sistem tipe
 * (tidak digunakan di runtime di file ini)
 */
_Atomic int atomic_counter = 0;

/*
 * =====================================================================
 * 10. FIXED-WIDTH INTEGER TYPES (stdint.h)
 * =====================================================================
 *
 * Digunakan untuk:
 * - binary format
 * - network protocol
 * - file format
 * - security & forensics
 */

int8_t i8 = -8;
uint8_t u8 = 255;

int16_t i16 = -16000;
uint16_t u16 = 65000;

int32_t i32 = -320000;
uint32_t u32 = 320000;

int64_t i64 = -6400000000LL;
uint64_t u64 = 6400000000ULL;

/*
 * =====================================================================
 * 11. SIZE & DIFFERENCE TYPES
 * =====================================================================
 *
 * Digunakan untuk ukuran objek dan perbedaan pointer.
 */

size_t size = sizeof(int_array);
ptrdiff_t diff = 2;

/*
 * =====================================================================
 * MAIN FUNCTION
 * =====================================================================
 *
 * main di sini HANYA untuk memastikan file ini:
 * - valid secara sintaks
 * - bisa dikompilasi
 * - tidak mengandung UB runtime
 */

int main(void) {
  printf("C type system reference loaded successfully.\n");

  // Integer types
  printf("[Integer Types]\n");
  printf("char                      : %c\n", c);
  printf("signed char               : %d\n", sc);
  printf("unsigned char             : %u\n\n", uc);

  printf("short                     : %d\n", s);
  printf("unsigned short            : %u\n\n", us);

  printf("int                       : %d\n", i);
  printf("unsigned int              : %u\n\n", ui);

  printf("long                      : %ld\n", l);
  printf("unsigned long             : %lu\n\n", ul);

  printf("long long                 : %lld\n", ll);
  printf("unsigned long long        : %llu\n\n", ull);

  printf("float                     : %f\n", f);
  printf("double                    : %f\n", d);
  printf("long double               : %Lf\n\n", ld);

  printf("_Bool                     : %d\n", raw_bool);
  printf("bool                      : %d\n\n", wrapped_bool);

  printf("enum Color value          : %d\n\n", current_color);

  printf("ptr_to_int                : %p\n\n", (void *)ptr_to_int);

  printf("int_array (address)       : %p\n", (void *)int_array);
  printf("int_array (size)          : %zu bytes\n", sizeof(int_array));
  printf("int_array[0]              : %d\n", int_array[0]);
  printf("int_array[1]              : %d\n", int_array[1]);
  printf("int_array[2]              : %d\n\n", int_array[2]);

  printf("add(2,3)                  : %d\n", add(2, 3));
  printf("add(2,3) (address)        : %p\n\n", (void *)add);

  // Aggregate
  printf("Person.age                : %d\n", person.age);
  printf("Person.height             : %.1f\n\n", person.height);

  printf("Union Number (int)        : %d\n", number.i);
  printf("Union Number (double)     : %f\n\n", number.d);

  printf("alias ulong_t value       : %lu\n", alias_value);
  printf("alias Person.age          : %d\n", alias_person.age);
  printf("alias Person.height       : %f\n\n", alias_person.height);

  printf("const int value           : %d\n", const_int);
  printf("volatile int value        : %d\n", volatile_reg);
  printf("restrict pointer          : %p\n\n", (void *)restrict_ptr);

  printf("_Atomic int value         : %d\n\n", atomic_counter);

  printf("int8_t                    : %d\n", i8);
  printf("uint8_t                   : %u\n\n", u8);

  printf("int16_t                   : %d\n", i16);
  printf("uint16_t                  : %u\n\n", u16);

  printf("int32_t                   : %d\n", i32);
  printf("uint32_t                  : %u\n\n", u32);

  printf("int64_t                   : %ld\n", i64);
  printf("uint64_t                  : %lu\n\n", u64);

  printf("size_t                    : %zu\n", size);
  printf("ptrdiff_t                 : %td\n\n", diff);

  printf("Hello");
  printf("Hello World");
}

/*
 * =====================================================================
 * AKHIR FILE
 * =====================================================================
 */
