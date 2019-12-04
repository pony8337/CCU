%{
#include "y.tab.h"
%}
%option      yylineno
%x           C_COMMENT
delim        [ \t\n]
identifier   ([A-Z_])([A-Z0-9_])*
ws           {delim}+
digit        [0-9]
number       {digit}+

%%
<INITIAL>{
"//"  BEGIN(C_COMMENT);
}
<C_COMMENT>{
\n     BEGIN(INITIAL);
[^\n]+ {}
}
{ws}             {}
{identifier}     {return IDENTIFIER;}
"begin"          {return KEY_BEGIN;}
"declare"        {return KEY_DECLARE;}
"else"           {return KEY_ELSE;}
"end"            {return KEY_END;}
"exit"           {return KEY_EXIT;}
"for"            {return KEY_FOR;}
"if"             {return KEY_IF;}
"in"             {return KEY_IN;}
"integer"        {return KEY_INTEGER;}
"is"             {return KEY_IS;}
"loop"           {return KEY_LOOP;}
"procedure"      {return KEY_PROCEDURE;}
"read"           {return KEY_READ;}
"then"           {return KEY_THEN;}
"write"          {return KEY_WRITE;}
{number}         {return INTEGER;}
":"              {return COLON;}
";"              {return SEMICOLON;}
":="             {return DEF;}
".."             {return DOT;}
"!"              {return EXCLAMATION;}
"="              {return EQ;}
"||"             {return OR;}
"&&"             {return AND;}
"<>"             {return NE;}
">="             {return EG;}
"<="             {return EL;}
">"              {return GREAT;}
"<"              {return LESS;}
"("              {return UPPER_BRACKET;}
")"              {return HINGE_BRACKET;}
"+"              {return PLUS;}
"-"              {return SUB;}
"*"              {return MUL;}
"/"              {return DIV;}
"%"              {return MOD;}
<<EOF>>          {return(EOF);}
%%

int yywrap(void){
  return 1;
}

