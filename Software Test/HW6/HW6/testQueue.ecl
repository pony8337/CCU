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

% Bound < 0
testQueue0([Bound], [], Exception) :-
    [Bound] :: -1 .. 4,
    Bound #< 0,
    Exception = "IllegalBoundException",
    labeling([Bound]). 

% Bound = 0
testQueue1([Bound], [Queue], Exception) :-
    [Bound] :: -1 .. 4,
    Bound #=0,
    Exception = "",
    labeling([Bound]),
    intSequenceInstances(Bound, Queue).

% Bound > 0
 testQueue2([Bound], [Queue], Exception) :-
    [Bound] :: -1 .. 4,
    Bound #> 0,
    Exception = "",
    labeling([Bound]),
    intSequenceInstances(Bound, Queue).


 