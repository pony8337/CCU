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

sequenceSize([ ], 0).
sequenceSize([_|L], Size) :-
  sequenceSize(L, Size1),
  Size is Size1 + 1.

%Bound = 0
testIsFull0(Queue_Pre, Bound, true) :-
  Bound #= 0,
  intSequenceInstances(0, Queue_Pre),
  sequenceSize(Queue_Pre, N), 
  N=Bound.
testIsFull0(Queue_Pre, Bound, false) :-
  Bound #= 0,
  intSequenceInstances(0, Queue_Pre),
  sequenceSize(Queue_Pre, N), 
  N < Bound.

%Bound = 1
testIsFull1(Queue_Pre, Bound, true) :-
  Bound #= 1,
  intSequenceInstances(0, Queue_Pre),
  sequenceSize(Queue_Pre, N), 
  N=Bound.
testIsFull1(Queue_Pre, Bound, false) :-
  Bound #= 1,
  intSequenceInstances(0, Queue_Pre),
  sequenceSize(Queue_Pre, N), 
  N < Bound.
testIsFull2(Queue_Pre, Bound, true) :-
  Bound #= 1,
  intSequenceInstances(1, Queue_Pre),
  sequenceSize(Queue_Pre, N), 
  N=Bound.
testIsFull2(Queue_Pre, Bound, false) :-
  Bound #= 1,
  intSequenceInstances(1, Queue_Pre),
  sequenceSize(Queue_Pre, N), 
  N < Bound.

%Bound = 4
testIsFull3(Queue_Pre, Bound, true) :-
  Bound #= 4,
  intSequenceInstances(0, Queue_Pre),
  sequenceSize(Queue_Pre, N), 
  N=Bound.
testIsFull3(Queue_Pre, Bound, false) :-
  Bound #= 4,
  intSequenceInstances(0, Queue_Pre),
  sequenceSize(Queue_Pre, N), 
  N < Bound.
testIsFull4(Queue_Pre, Bound, true) :-
  Bound #= 4,
  intSequenceInstances(1, Queue_Pre),
  sequenceSize(Queue_Pre, N), 
  N=Bound.
testIsFull4(Queue_Pre, Bound, false) :-
  Bound #= 4,
  intSequenceInstances(1, Queue_Pre),
  sequenceSize(Queue_Pre, N), 
  N < Bound.
testIsFull5(Queue_Pre, Bound, true) :-
  Bound #= 4,
  intSequenceInstances(2, Queue_Pre),
  sequenceSize(Queue_Pre, N), 
  N=Bound.
testIsFull5(Queue_Pre, Bound, false) :-
  Bound #= 4,
  intSequenceInstances(2, Queue_Pre),
  sequenceSize(Queue_Pre, N), 
  N < Bound.
testIsFull6(Queue_Pre, Bound, true) :-
  Bound #= 4,
  intSequenceInstances(3, Queue_Pre),
  sequenceSize(Queue_Pre, N), 
  N=Bound.
testIsFull6(Queue_Pre, Bound, false) :-
  Bound #= 4,
  intSequenceInstances(3, Queue_Pre),
  sequenceSize(Queue_Pre, N), 
  N < Bound.
testIsFull7(Queue_Pre, Bound, true) :-
  Bound #= 4,
  intSequenceInstances(4, Queue_Pre),
  sequenceSize(Queue_Pre, N), 
  N=Bound.
testIsFull7(Queue_Pre, Bound, false) :-
  Bound #= 4,
  intSequenceInstances(4, Queue_Pre),
  sequenceSize(Queue_Pre, N), 
  N < Bound.