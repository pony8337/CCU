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

testIsEmpty0(Queue_Pre, true) :-
  intSequenceInstances(0, Queue_Pre),
  sequenceSize(Queue_Pre, N), N =:= 0.
testIsEmpty0(Queue_Pre, false) :-
  intSequenceInstances(0, Queue_Pre),
  sequenceSize(Queue_Pre, N), N > 0.

testIsEmpty1(Queue_Pre, true) :-
  intSequenceInstances(1, Queue_Pre),
  sequenceSize(Queue_Pre, N), N =:= 0.
testIsEmpty1(Queue_Pre, false) :-
  intSequenceInstances(1, Queue_Pre),
  sequenceSize(Queue_Pre, N), N > 0.

testIsEmpty2(Queue_Pre, true) :-
  intSequenceInstances(2, Queue_Pre),
  sequenceSize(Queue_Pre, N), N =:= 0.
testIsEmpty2(Queue_Pre, false) :-
  intSequenceInstances(2, Queue_Pre),
  sequenceSize(Queue_Pre, N), N > 0.

testIsEmpty3(Queue_Pre, true) :-
  intSequenceInstances(3, Queue_Pre),
  sequenceSize(Queue_Pre, N), N =:= 0.
testIsEmpty3(Queue_Pre, false) :-
  intSequenceInstances(3, Queue_Pre),
  sequenceSize(Queue_Pre, N), N > 0.

testIsEmpty4(Queue_Pre, true) :-
  intSequenceInstances(4, Queue_Pre),
  sequenceSize(Queue_Pre, N), N =:= 0.
testIsEmpty4(Queue_Pre, false) :-
  intSequenceInstances(4, Queue_Pre),
  sequenceSize(Queue_Pre, N), N > 0.