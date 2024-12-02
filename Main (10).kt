/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
  fun findSecondLargest(arr: IntArray):Int?
    {
      if( arr.size < 2) return null
      var largest :Int?=null
      var secondLargest:Int? =null
      
      
      for (num in arr)
      {
      if(largest == null || num > largest)
      {
        secondLargest=largest
        largest = num
        
      }
      else if(secondLargest == null || num >secondLargest  && num!=largest){
      secondLargest = num
      }
      }
      return secondLargest
    }
    
    fun main() {
    val arr = intArrayOf(10, 20, 4, 45, 99)
    println("Second Largest: ${findSecondLargest(arr)}")
}
    
  

