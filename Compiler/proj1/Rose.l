%{
#include "Rose.h"
%}
%option      yylineno
%x           C_COMMENT
delim        [ \t\n]
identifier   ([A-Z_])([A-Z0-9])*
ws           {delim}+
digit        [0-9]
number       {digit}+
keywords     (begin|declare|else|end|exit|for|if|in|integer|is|loop|procedure|read|then|write)

%%
<INITIAL>{
"//"  BEGIN(C_COMMENT);
}
<C_COMMENT>{
\n     BEGIN(INITIAL);
[^\n]+ {}
}
{identifier}     {yylval.string=yytext; return IDENTIFIER;}
{number}         {yylval.value=atoi(yytext); return INTERGER;}
{keywords}       {yylval.string=yytext; return KEYWORD;}
":"              {return COLON;}
".."             {return DOT;}
";"              {return SEMICOLON;}
"+"              {return PLUS;}
"-"              {return SUB;}
"*"              {return MUL;}
"/"              {return DIV;}
"%"              {return MOD;}
"="              {return EQ;}
"<>"             {return NE;}
">"              {return GREAT;}
">="             {return EG;}
"<"              {return LESS;}
"<="             {return EL;}
"&&"             {return AND;}
"||"             {return OR;}
"!"              {return EXCLAMATION;}
":="             {return DEF;}
"("              {return UPPER_BRACKET;}
")"              {return HINGE_BRACKET;}
{ws}             {}
.                {yylval.string=yytext; return ERROR;}      
<<EOF>>          {return(EOF);}
%%

int main()
{
  int token = 0;
  FILE *fp;
  fp = fopen("stderr.txt","w+");
  while((token =  yylex())!=EOF){
    switch(token){
    case IDENTIFIER:
      printf("Identifier: %s\n", yylval.string);
    break;
    case KEYWORD:
      printf("Keyword: %s\n", yylval.string);
    break;
    case INTERGER:
      printf("Integer Constant: %d\n", yylval.value);
    break;
    case COLON:
      printf("Operator: :\n");
      break;  
    case DOT:  
      printf("Operator: ..\n");
      break; 
    case SEMICOLON:
      printf("Operator: ;\n");
      break; 
    case PLUS:
      printf("Operator: +\n");
      break;       
    case SUB:
      printf("Operator: -\n");
      break; 
    case MUL:
      printf("Operator: *\n");
      break; 
    case DIV:
      printf("Operator: \\\n");
      break; 
    case MOD:
      printf("Operator: %%\n");
      break; 
    case EQ:
      printf("Operator: =\n");
      break; 
    case NE:
      printf("Operator: <>\n");
      break; 
    case GREAT:
      printf("Operator: >\n");
      break; 
    case EG:
      printf("Operator: >=\n");
      break; 
    case LESS:
      printf("Operator: <\n");
      break; 
    case EL:
      printf("Operator: <=\n");
      break; 
    case AND:
      printf("Operator: &&\n");
      break; 
    case OR:
      printf("Operator: ||\n");
      break; 
    case EXCLAMATION:
      printf("Operator: !\n");
      break; 
    case DEF:
      printf("Operator: :=\n");
      break; 
    case UPPER_BRACKET:
      printf("Operator: (\n");
      break; 
    case HINGE_BRACKET:
      printf("Operator: )\n");
      break; 
    case ERROR:
      fprintf(fp,"Lexical error: line %d: unknown cheracter %s\n",yylineno, yytext);  
    break;
    default:
    break;
    }
  }
  return 0;
}
