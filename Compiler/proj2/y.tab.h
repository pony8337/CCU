/* A Bison parser, made by GNU Bison 3.0.4.  */

/* Bison interface for Yacc-like parsers in C

   Copyright (C) 1984, 1989-1990, 2000-2015 Free Software Foundation, Inc.

   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.

   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

#ifndef YY_YY_Y_TAB_H_INCLUDED
# define YY_YY_Y_TAB_H_INCLUDED
/* Debug traces.  */
#ifndef YYDEBUG
# define YYDEBUG 1
#endif
#if YYDEBUG
extern int yydebug;
#endif

/* Token type.  */
#ifndef YYTOKENTYPE
# define YYTOKENTYPE
  enum yytokentype
  {
    IDENTIFIER = 258,
    KEY_PROCEDURE = 259,
    KEY_IS = 260,
    KEY_DECLARE = 261,
    KEY_BEGIN = 262,
    KEY_END = 263,
    KEY_INTEGER = 264,
    KEY_ELSE = 265,
    KEY_EXIT = 266,
    KEY_FOR = 267,
    KEY_IF = 268,
    KEY_IN = 269,
    KEY_LOOP = 270,
    KEY_READ = 271,
    KEY_THEN = 272,
    KEY_WRITE = 273,
    INTEGER = 274,
    COLON = 275,
    SEMICOLON = 276,
    EXCLAMATION = 277,
    DEF = 278,
    DOT = 279,
    OR = 280,
    AND = 281,
    EQ = 282,
    NE = 283,
    EG = 284,
    EL = 285,
    GREAT = 286,
    LESS = 287,
    UPPER_BRACKET = 288,
    HINGE_BRACKET = 289,
    PLUS = 290,
    SUB = 291,
    MUL = 292,
    DIV = 293,
    MOD = 294
  };
#endif
/* Tokens.  */
#define IDENTIFIER 258
#define KEY_PROCEDURE 259
#define KEY_IS 260
#define KEY_DECLARE 261
#define KEY_BEGIN 262
#define KEY_END 263
#define KEY_INTEGER 264
#define KEY_ELSE 265
#define KEY_EXIT 266
#define KEY_FOR 267
#define KEY_IF 268
#define KEY_IN 269
#define KEY_LOOP 270
#define KEY_READ 271
#define KEY_THEN 272
#define KEY_WRITE 273
#define INTEGER 274
#define COLON 275
#define SEMICOLON 276
#define EXCLAMATION 277
#define DEF 278
#define DOT 279
#define OR 280
#define AND 281
#define EQ 282
#define NE 283
#define EG 284
#define EL 285
#define GREAT 286
#define LESS 287
#define UPPER_BRACKET 288
#define HINGE_BRACKET 289
#define PLUS 290
#define SUB 291
#define MUL 292
#define DIV 293
#define MOD 294

/* Value type.  */
#if ! defined YYSTYPE && ! defined YYSTYPE_IS_DECLARED
typedef int YYSTYPE;
# define YYSTYPE_IS_TRIVIAL 1
# define YYSTYPE_IS_DECLARED 1
#endif

/* Location type.  */
#if ! defined YYLTYPE && ! defined YYLTYPE_IS_DECLARED
typedef struct YYLTYPE YYLTYPE;
struct YYLTYPE
{
  int first_line;
  int first_column;
  int last_line;
  int last_column;
};
# define YYLTYPE_IS_DECLARED 1
# define YYLTYPE_IS_TRIVIAL 1
#endif


extern YYSTYPE yylval;
extern YYLTYPE yylloc;
int yyparse (void);

#endif /* !YY_YY_Y_TAB_H_INCLUDED  */
