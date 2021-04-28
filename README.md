# Description

This is a programmatic solution to the problem:

`This sentence contains _ 0's, _ 1's, _ 2's, _ 3's, _ 4's, _ 5's, _ 6's, _ 7's, _ 8's, and _ 9's.`

I'm positive that the solution(s) implemented are not the most efficient and aren't intended to be.  Instead, these projects are ways for me to experiment with various language features, constructs, and testing tools.  

## Java 8 Streams

The solution in [HowManyWithStreams](src/main/java/com/stupidplebs/howmany/HowManyWithStreams.java) is an attempt to solve with Java 8 streams.  It contains no explicit loops and is near-incomprehensible.  

Travis status
=============
[![Build Status](https://travis-ci.org/trescube/HowMany_java.svg?branch=master)](https://travis-ci.org/trescube/HowMany_java)

## Bazel

I think this works with Bazel with:

- `bazel build '...'`
- `bazel test '...'`