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

sequenceSubSequence(Seq, B, E, SubSeq) :-
  sequenceSize(Seq, Size),
  B =< Size + 1, E =< Size,
  sequenceSubSequence1(Seq, 1, B, E, SubSeq).
sequenceSubSequence1([], N, _, E, []) :- 
  N > E.
sequenceSubSequence1([H|L], N, B, E, [H|L1]) :-
  N >= B, N =< E, N1 is N + 1,
sequenceSubSequence1(L, N1, B, E, L1).
sequenceSubSequence1([_|L], N, B, E, L1) :-
  N1 is N + 1,
  sequenceSubSequence1(L, N1, B, E, L1).

% queue size = 0
testDelet0([Queue_Pre], [Queue_Pre], Exception) :-
  intSequenceInstances(0, Queue_Pre),
  sequenceSize(Queue_Pre, Size),
  Size =< 0,
  Exception = "QueueEmptyException".

% queue size = 1
testDelet1([Queue_Pre], [Queue], Exception) :-
  intSequenceInstances(1, Queue_Pre),
  sequenceSubSequence(Queue_Pre, 2, 1, Queue),
  Exception = "".

% queue size = 2
testDelet2([Queue_Pre], [Queue], Exception) :-
  intSequenceInstances(2, Queue_Pre),
  sequenceSubSequence(Queue_Pre, 2, 2, Queue),
  Exception = "".

% queue size = 3
testDelet3([Queue_Pre], [Queue], Exception) :-
  intSequenceInstances(3, Queue_Pre),
  sequenceSubSequence(Queue_Pre, 2, 3, Queue),
  Exception = "".

% queue size = 4
testDelet4([Queue_Pre], [Queue], Exception) :-
  intSequenceInstances(4, Queue_Pre),
  sequenceSubSequence(Queue_Pre, 2, 4, Queue),
  Exception = "".


