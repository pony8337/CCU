all:
	bison -vdty Rose.y
	flex Rose.l
	gcc -o parser y.tab.c lex.yy.c
clean:
	rm *.c *.h ./parser
	

