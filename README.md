# MyApplication

This project aims at reproducing the issue of being able to debug a library that contains both Java and C++ code.

MyApplication contains two modules:

 1. app: the main application with a single activity that invokes the library code
 2. mylibrary: the Java/C++ library

When you run this project, you should see two outputs (one from Java, one from C++):

	com.salesforce.myapplication I/System.out: MyLibrary Constructor
	com.salesforce.myapplication I/mylibrary: Hello from C++


Now if you try to debug the application and put a breakpoint on each print statement (one in the MyLibraryClass.java and one in the mylibraryclass.c), then you will see the output but the debugger will only stop in the Java class and not in the C class.

	com.salesforce.myapplication I/System.out: waiting for debugger to settle...
	com.salesforce.myapplication I/System.out: debugger has settled (1444)
	com.salesforce.myapplication I/System.out: MyLibrary Constructor
	com.salesforce.myapplication I/mylibrary: Hello from C++

