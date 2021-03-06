//Joel Ye
//APCS1 pd10
//w/e

/*****************************************************
 * skeleton for class Latkes
 * Implements stack of Strings using array as underlying container.
 * new in Version 2: typed for generics
 *****************************************************/
import java.util.ArrayList;

public class ALLatkes<T> implements Stack<T> {

    private ArrayList<T> _stack;
    private int _stackSize;


    //constructor
    public ALLatkes() 
	{
	    _stack = new ArrayList<T>(); 
	    _stackSize = 0;
	}


    //overloaded constructor allows for intial capacity declaration
    public ALLatkes( int size ) 
	{ 
	    this();
	    _stackSize = size;
	}
	
    //means of insertion
    public void push( T s ) 
    {
	_stack.add(s);
	_stackSize++;
    }

    public T peek( )
    {
	return _stack.get(_stackSize-1);
    }
	
    //means of removal
    public T pop( )
    { 
	if (isEmpty()) return null;
	_stackSize--;
	return _stack.get(_stackSize);
    }

    //chk for emptiness
    public boolean isEmpty() 
    { 
	return _stackSize == 0;
    }

    //chk for fullness
    public boolean isFull() 
    {
	return _stackSize == _stack.size();
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
