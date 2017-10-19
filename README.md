# Lab5_SieveOfErat
Returns all the Prime Numbers Upto a User Entered Value


Advanced Programming



Lab 5 
Sieve of Eratosthenes





Hafiz Hamza Hafeez

133127

BSCS – 5A


Submitted to

Fahad Ahmed Satti




Code Description

This lab was concerned with some more practice of Scala and functional programming paradigm. The lab objective was to write the code for an already well developed algorithm called Sieve of Eratosthenes. 

Objective: Given an integer 'n' find all the prime numbers from 2 to that given 'n' number.

Approach:	Functional Programming  → Recursive Implementation

DataStructure: 	Scala Lists

Unit Test  In File: 	Main.scala 

Profiling Tool : 	JVM (Java Virtual Monitor)

Github Repo: 		www.github.com/hamza7292/Lab5_SieveOfErat

Design:

	The design of program is kept pretty simple. To run you just need to run the Main.scala inside the 'src' folder (default package). 

Program shall ask for an integer  → Will return all the prime numbers from 2 to that integer.

Working :

Since we have used the recursive approach;

- Each recursive call filters out the current value along with all of it multiples from the list.

- Base case is reached when the integer checking exceeds the value of 'n' provided by the User.

-Return the leftover list i.e. All of the prime numbers from 2 to n


