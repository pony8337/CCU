%{
#include <stdio.h>
int yylex(void);
void yyerror(char *s);
extern int yylineno;
FILE *fp = NULL;
%}
%locations
%token IDENTIFIER
%token KEY_PROCEDURE
%token KEY_IS
%token KEY_DECLARE
%token KEY_BEGIN
%token KEY_END
%token KEY_INTEGER
%token KEY_ELSE
%token KEY_EXIT
%token KEY_FOR
%token KEY_IF
%token KEY_IN
%token KEY_LOOP
%token KEY_READ
%token KEY_THEN
%token KEY_WRITE 
%token INTEGER
%token COLON
%token SEMICOLON
%token EXCLAMATION
%token DEF
%token DOT
%token OR
%token AND
%token EQ
%token NE
%token EG
%token EL
%token GREAT
%token LESS
%token UPPER_BRACKET
%token HINGE_BRACKET
%token PLUS
%token SUB
%token MUL
%token DIV
%token MOD
%start program

%%
program : KEY_PROCEDURE IDENTIFIER KEY_IS KEY_DECLARE var_decls KEY_BEGIN statements KEY_END SEMICOLON {printf("program -> procedure Idnetifier is declare var_decls begin statements end;\n");};

var_decls : /*empty*/          {printf("var_decls -> empty\n");}
          | var_decls var_decl {printf("var_decls -> var_decls var_decl\n");};

var_decl : IDENTIFIER COLON KEY_INTEGER SEMICOLON {printf("var_decl -> Identifier : integer;\n");};

statements : /*empty*/            {printf("statements -> empty\n");}
           | statements statement {printf("statements -> statements statement\n");};

statement : assignment_stmt {printf("statement -> assignment_stmt\n");}  
          | if_stmt         {printf("statement -> if_stmt\n");}
          | for_stmt        {printf("statement -> for_stmt\n");}
          | exit_stmt       {printf("statement -> exit_stmt\n");}
          | read_stmt       {printf("statement -> read_stmt\n");}
          | write_stmt      {printf("statement -> write_stmt\n");};

assignment_stmt : IDENTIFIER DEF arith_expr SEMICOLON {printf("assignment_stmt -> Identifier := arith_expr;\n");};

if_stmt : KEY_IF bool_expr KEY_THEN statements KEY_END KEY_IF SEMICOLON                     {printf("if_stmt -> if bool_expr then statements end if;\n");}
        | KEY_IF bool_expr KEY_THEN statements KEY_ELSE statements KEY_END KEY_IF SEMICOLON {printf("if_stmt -> if bool_expr then statements else statements end if;\n");};

for_stmt : KEY_FOR IDENTIFIER KEY_IN arith_expr DOT arith_expr KEY_LOOP statements KEY_END KEY_LOOP SEMICOLON {printf("for Identifier in arith_expr .. arith_expr loop statements end loop;\n");};

exit_stmt : KEY_EXIT SEMICOLON {printf("exit_stmt -> exit;\n");};

read_stmt : KEY_READ IDENTIFIER SEMICOLON {printf("read_stmt -> read Identifier;\n");};

write_stmt : KEY_WRITE arith_expr SEMICOLON {printf("write_stmt -> write arith_expr;\n");};

bool_expr : bool_term              {printf("bool_expr -> bool_term\n");}
          | bool_expr OR bool_term {printf("bool_expr -> bool_expr || bool_term\n");};

bool_term : bool_factor               {printf("bool_term -> bool_factor\n");}
          | bool_term AND bool_factor {printf("bool_term -> bool_term && bool_factor\n");};

bool_factor : bool_primary             {printf("bool_factor -> bool_primary\n");}
            | EXCLAMATION bool_primary {printf("bool_factor -> !bool_primary\n");};

bool_primary : arith_expr EQ arith_expr              {printf("bool_primary -> arith_expr = arith_expr\n");}
             | arith_expr NE arith_expr              {printf("bool_primary -> arith_expr <> arith_expr\n");}
             | arith_expr GREAT arith_expr           {printf("bool_primary -> arith_expr > arith_expr\n");}
             | arith_expr EG arith_expr              {printf("bool_primary -> arith_expr >= arith_expr\n");}
             | arith_expr LESS arith_expr            {printf("bool_primary -> arith_expr < arith_expr\n");}
             | arith_expr EL arith_expr              {printf("bool_primary -> arith_expr <= arith_expr\n");}
             | UPPER_BRACKET bool_expr HINGE_BRACKET {printf("(bool_expr)\n");};

arith_expr : arith_term                 {printf("arith_expr -> arith_term\n");}
           | arith_expr PLUS arith_term {printf("arith_expr -> arith_expr + arith_term\n");}
           | arith_expr SUB arith_term  {printf("arith_expr -> arith_expr - arith_term\n");};

arith_term : arith_factor                {printf("arith_term -> arith_factor\n");}
           | arith_term MUL arith_factor {printf("arith_term -> arith_term * arith_factor\n");}
           | arith_term DIV arith_factor {printf("arith_term -> arith_term / arith_factor\n");}
           | arith_term MOD arith_factor {printf("arith_term -> arith_term %% arith_factor\n");};

arith_factor : arith_primary     {printf("arith_factor -> arith_primary\n");}
             | SUB arith_primary {printf("arith_factor -> - arith_primary\n");};

arith_primary : INTEGER                                {printf("arith_primary -> Integer\n");}
              | IDENTIFIER                             {printf("arith_primary -> Identifier\n");}
              | UPPER_BRACKET arith_expr HINGE_BRACKET {printf("arith_primary -> (arith_expr)\n");};

%%

void yyerror(char *s)
{
  fprintf(fp,"Syntax erro: line %d\n",yylineno);
}

int main() {  
  fp = fopen("stderr.txt","w+");
  yyparse();
  fclose(fp);
  return 0;
}

