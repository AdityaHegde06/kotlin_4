/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
fun reversedArray(arr : IntArray):IntArray
{
return arr.reversedArray()
    
}

fun main()
{
       val arr = intArrayOf(1,2,3,4,5)
       println("Reversed Array : ${reversedArray(arr).joinToString(",")}")
}
