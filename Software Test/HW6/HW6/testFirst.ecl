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

sequenceFirst([H|_], H). 

testFirst0([Queue_Pre],[Queue_Pre],[], Exception) :-
  intSequenceInstances(0, Queue_Pre),
  sequenceSize(Queue_Pre, Size),
  Exception = "QueueEmptyException",
  Size =< 0.

testFirst1([Queue_Pre],[Queue_Pre],[First], Exception) :-
  intSequenceInstances(1, Queue_Pre),
  sequenceSize(Queue_Pre, Size),
  Size > 0,
  Exception = "",
  sequenceFirst(Queue_Pre, First).


testFirst2([Queue_Pre],[Queue_Pre],[First], Exception) :-
  intSequenceInstances(2, Queue_Pre),
  sequenceSize(Queue_Pre, Size),
  Size > 0,
  Exception = "",
  sequenceFirst(Queue_Pre, First).

  testFirst3([Queue_Pre],[Queue_Pre],[First], Exception) :-
  intSequenceInstances(3, Queue_Pre),
  sequenceSize(Queue_Pre, Size),
  Size > 0,
  Exception = "",
  sequenceFirst(Queue_Pre, First).

testFirst4([Queue_Pre],[Queue_Pre],[First], Exception) :-
  intSequenceInstances(4, Queue_Pre),
  sequenceSize(Queue_Pre, Size),
  Size > 0,
  Exception = "",
  sequenceFirst(Queue_Pre, First).