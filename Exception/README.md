# Exception Handling

An exception is an unwanted or unexpected event, which occurs during the execution of a program i.e at run time, that discrupts the normal flow of the program's instructions.


## Exception Blocks
* Try:
- The code which may cause exception are checked in this block
	- if the code do cause exception it throws the exception to catch blocks 
	- if the code doesnot cause exception it does nothing

* Catch:
- The exception thrown by the try block is catched by this block and checks the exception type.

* Finally:
- The code inside this block is executed no matter what ,even when the method returns some values

* Throw
- It throw's a specific exception manually 