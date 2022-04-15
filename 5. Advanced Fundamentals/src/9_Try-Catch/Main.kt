package `9_Try-Catch`

// --- Exception ---

// An Exception is a runtime problem which occurs in the program and leads to program termination

// - running out of memory
// - array out of bound
// - condition like divided by zero

// To handle this type of problem during program execution the technique of exception handling is used

// Exception handling is a technique which handles the runtime problems and maintains the flow of program execution


// --- Throwable Class ---

// throw MyException ("this throws an exception")

// There are four different keywords used in exception handling
// - try
// - catch
// - finally
// - throw


// --- TRY
// try: the try block contains a set of statements which might generate an exception.
// It must be followed by either catch or finally both

// --- CATCH
// The catch block is used to catch the exception thrown from try block

// --- FINALLY
// Finally block always execute whether exception is handled or not
// So it is used to execute important code statement (like closing buffers)

// --- THROW
// The throw keyword is used to throw an exception explicitly


// --- Unchecked exception ---

// Unchecked exception is that exception which is thrown due to mistake in out code

// This exception type extends the RuntimeException class

// The Unchecked exception is checked at run time


// --- Examples:

// ArithmeticException: throws when we divide a number by zero
// ArrayIndexOutOfBoundExceptions: thrown when an array has been tried to access with incorrect index value
// SecurityException: thrown by the security manager to indicate a security violation
// NullPointerException: thrown when invoking a method or property on a null object


// --- Checked exception ---

// A Checked exception is checked at compile time

// This exception type extends the Throwable class

// --- Examples:

// IOException
// SQLException


// --- Try Catch ---

// try-catch block is used for exception handling in the code


//try {
//
//  //  code that may throw the exception
//
//} catch (e: SomeException ){
//  //  code that handles the exception
//}


// --- Finally ---

// such block which is always executes whether exception is handled or not

// It is used to execute important code statement


//try {
//
//  //  code that may throw the exception
//
//} catch (e: SomeException ){
//
//  //  code that handles the exception
//
//} finally {
//
//  //  code that always executes
//
//}


// --- Throw ---

// The throw keyword is used to throw an explicit exception

// It is used to throw a custom exception

// To throw an exception object we will use the throw-expression

// throw SomeException()
