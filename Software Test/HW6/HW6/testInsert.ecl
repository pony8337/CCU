:- lib(ic).
intSequenceInstances(0, []).

intSequenceInstances(Size, [N|Seq]) :-
Size > 0,
Size1 is Size - 1,
intSequenceInstances(Size1, Seq),
integerGen(N).

integerGen(N) :-
random(R),
mod(R, 32767, N).

sequenceAppend([], X, [X]).
sequenceAppend([H|L], X, [H|L1]):-
 sequenceAppend(L, X, L1).

sequenceSize([ ], 0).
sequenceSize([_|L], Size) :-
  sequenceSize(L, Size1),
  Size is Size1 + 1.

% Bound = 0
testInsert0([Queue_Pre], [Bound], [X], [Queue_Pre], Exception) :-
  Bound #= 0,
  intSequenceInstances(0, Queue_Pre),
  integerGen(X),
  sequenceSize(Queue_Pre, Size), 
  Size >= Bound,
  Exception = "QueueFullException".

%Bound = 1  
testInsert1([Queue_Pre], [Bound], [X], [Queue], Exception) :-
  Bound #= 1,
  intSequenceInstances(0, Queue_Pre),
  integerGen(X),
  sequenceSize(Queue_Pre, Size), 
  Size < Bound,
  sequenceAppend(Queue_Pre, X, Queue),
  Exception = "".
testInsert2([Queue_Pre], [Bound], [X], [Queue_Pre], Exception) :-
  Bound #= 1,
  intSequenceInstances(1, Queue_Pre),
  integerGen(X),
  sequenceSize(Queue_Pre, Size), 
  Size >= Bound,
  Exception = "QueueFullException".

%Bound = 4
testInsert3([Queue_Pre], [Bound], [X], [Queue], Exception) :-
  Bound #= 4,
  intSequenceInstances(0, Queue_Pre),
  integerGen(X),
  sequenceSize(Queue_Pre, Size), 
  Size < Bound,
  sequenceAppend(Queue_Pre, X, Queue),
  Exception = "".
testInsert4([Queue_Pre], [Bound], [X], [Queue], Exception) :-
  Bound #= 4,
  intSequenceInstances(1, Queue_Pre),
  integerGen(X),
  sequenceSize(Queue_Pre, Size), 
  Size < Bound,
  sequenceAppend(Queue_Pre, X, Queue),
  Exception = "".
testInsert5([Queue_Pre], [Bound], [X], [Queue], Exception) :-
  Bound #= 4,
  intSequenceInstances(2, Queue_Pre),
  integerGen(X),
  sequenceSize(Queue_Pre, Size), 
  Size < Bound,
  sequenceAppend(Queue_Pre, X, Queue),
  Exception = "".
testInsert6([Queue_Pre], [Bound], [X], [Queue], Exception) :-
  Bound #= 4,
  intSequenceInstances(3, Queue_Pre),
  integerGen(X),
  sequenceSize(Queue_Pre, Size), 
  Size < Bound,
  sequenceAppend(Queue_Pre, X, Queue),
  Exception = "".
testInsert7([Queue_Pre], [Bound], [X], [Queue_Pre], Exception) :-
  Bound #= 4,
  intSequenceInstances(4, Queue_Pre),
  integerGen(X),
  sequenceSize(Queue_Pre, Size), 
  Size >= Bound,
  Exception = "QueueFullException".






  


 