//Joel Ye
//APCS1 pd10
//HW22 -- Standardization
//2016 - 03 - 31

/*****************************************************
 * skeleton for class Latkes
 * Implements stack of Strings using array as underlying container.
 * new in Version 2: typed for generics
 *****************************************************/

public class Latkes<T> implements Stack<T> {

    private T [] _stack;
    private int _stackSize;


    //constructor
    public Latkes() 
	{ 
	    //typecasting hard to avoid here:
	    _stack = ( T[] )new Object[42]; 
	    _stackSize = 0;
	}


    //overloaded constructor allows for intial capacity declaration
    public Latkes( int size ) 
	{ 
	    this();
	    _stackSize = size;
	}

    private void expand(){
	T[] newStack = ( T[] ) new Object[_stack.length * 2];
	for (int i = 0; i < _stack.length; i++)
	    newStack[i] = _stack[i];
	_stack = newStack;
    }
	
    //means of insertion
    public void push( T s ) 
    { 
	if (isFull()) expand();
	_stack[_stackSize] = s;
	_stackSize++;
    }

    public T peek( )
    {
	return _stack[_stackSize-1];
    }
	
    //means of removal
    public T pop( )
    { 
	if (isEmpty()) return null;
	_stackSize--;
	return _stack[_stackSize];
    }

    //chk for emptiness
    public boolean isEmpty() 
    { 
	return _stackSize == 0;
    }

    //chk for fullness
    public boolean isFull() 
    {
	return _stackSize == _stack.length;
    }



    //main method for testing
    public static void main( String[] args ) {

	/*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v

	  Latkes<String> tastyStack = new Latkes<String>(10);

	  tastyStack.push("aoo");
	  tastyStack.push("boo");
	  tastyStack.push("coo");
	  tastyStack.push("doo");
	  tastyStack.push("eoo");
	  tastyStack.push("foo");
	  tastyStack.push("goo");
	  tastyStack.push("hoo");
	  tastyStack.push("ioo");
	  tastyStack.push("joo");
	  tastyStack.push("coocoo");
	  tastyStack.push("cachoo");

	  //cachoo
	  System.out.println( "peek: " + tastyStack.peek() );
	  System.out.println( "pop: " + tastyStack.pop() );
	  //coocoo
	  System.out.println( "peek: " + tastyStack.peek() );
	  System.out.println( "pop: " + tastyStack.pop() );
	  //joo
	  System.out.println( "peek: " + tastyStack.peek() );
	  System.out.println( "pop: " + tastyStack.pop() );
	  //ioo
	  System.out.println( "peek: " + tastyStack.peek() );
	  System.out.println( "pop: " + tastyStack.pop() );
	  //hoo
	  System.out.println( "peek: " + tastyStack.peek() );
	  System.out.println( "pop: " + tastyStack.pop() );
	  //goo
	  System.out.println( "peek: " + tastyStack.peek() );
	  System.out.println( "pop: " + tastyStack.pop() );
	  //foo
	  System.out.println( "peek: " + tastyStack.peek() );
	  System.out.println( "pop: " + tastyStack.pop() );
	  //eoo
	  System.out.println( "peek: " + tastyStack.peek() );
	  System.out.println( "pop: " + tastyStack.pop() );
	  //doo
	  System.out.println( "peek: " + tastyStack.peek() );
	  System.out.println( "pop: " + tastyStack.pop() );
	  //coo
	  System.out.println( "peek: " + tastyStack.peek() );
	  System.out.println( "pop: " + tastyStack.pop() );
	  //boo
	  System.out.println( "peek: " + tastyStack.peek() );
	  System.out.println( "pop: " + tastyStack.pop() );
	  //aoo
	  System.out.println( "peek: " + tastyStack.peek() );
	  System.out.println( "pop: " + tastyStack.pop() );

	  //stack empty by now; SOP(null)
	  System.out.println( "peek: " + tastyStack.peek() );
	  System.out.println( "pop: " + tastyStack.pop() );
	  System.out.println( tastyStack.pop() );
          ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
    }//end main()

}//end class Latkes
