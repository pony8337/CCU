#ifndef  _ROSE_H_
#define  _ROSE_H_

#include <stdio.h>
#define  IDENTIFIER    0
#define  KEYWORD       1
#define  INTERGER      2
#define  COLON         3
#define  DOT           4
#define  SEMICOLON     5
#define  PLUS          6
#define  SUB           7
#define  MUL           8
#define  DIV           9
#define  MOD           10
#define  EQ            11
#define  NE            12
#define  GREAT         13
#define  EG            14
#define  LESS          15
#define  EL            16
#define  AND           17
#define  OR            18
#define  EXCLAMATION   19
#define  DEF           20
#define  UPPER_BRACKET 21
#define  HINGE_BRACKET 22
#define  ERROR         23

union data{
int   value;
char* string;
}yylval;

#endif
