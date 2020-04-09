:- lib(ic).
testAbsoluteNumberOfDay1([Y], [M], [D]) :-
    [Y, M, D] :: -32768 .. 32767,
    Y#>=1, M#>=1, M#=<12, D#>=1,
    M#>2, Y#=4*_, Y#\=100*_,
    labeling([Y, M, D]).
testAbsoluteNumberOfDay2([Y], [M], [D]) :-
    [Y, M, D] :: -32768 .. 32767,
    Y#>=1, M#>=1, M#=<12, D#>=1,
    M#>2, Y#=400*_,
    labeling([Y, M, D]).
testAbsoluteNumberOfDay3([Y], [M], [D]) :-
    [Y, M, D] :: -32768 .. 32767,
    Y#>=1, M#>=1, M#=<12, D#>=1,
    M#>2, Y#\=4*_, Y#\=400*_,
    labeling([Y, M, D]).
testAbsoluteNumberOfDay4([Y], [M], [D]) :-
    [Y, M, D] :: -32768 .. 32767,
    Y#>=1, M#>=1, M#=<12, D#>=1,
    M#>2, Y#=100*_, Y#\=400*_,
    labeling([Y, M, D]).
testAbsoluteNumberOfDay5([Y], [M], [D]) :-
    [Y, M, D] :: -32768 .. 32767,
    Y#>=1, M#>=1, M#=<12, D#>=1,
    M#=2,
    labeling([Y, M, D]).
testAbsoluteNumberOfDay6([Y], [M], [D]) :-
    [Y, M, D] :: -32768 .. 32767,
    Y#>=1, M#>=1, M#=<12, D#>=1,
    M#<2,
    labeling([Y, M, D]).



