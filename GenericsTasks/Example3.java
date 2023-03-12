// create a generic class with get and set methods which can accept String or integer

class MyGenericClass<T>
{  
    T obj;  
    void add(T obj)
    {
           this.obj=obj;
    }  
    T get()
    {
           return obj;
    }  
}  
 
class Example3
{  
     public static void main(String args[])
     {  
           MyGenericClass<Integer> m_int=new MyGenericClass<Integer>();  
           m_int.add(2);
           MyGenericClass<String> m_str=new MyGenericClass<String>();  
           m_str.add("SoftwaretestingHelp");
 
           System.out.println("Member of MyGenericClass<Integer>: " + m_int.get());
           System.out.println("Member of MyGenericClass<String>: " + m_str.get());
     }
} 