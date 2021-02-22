fun row(k:Int,i:Int,c:Int):Int {
  when {
      k > i -> return 0;
      else -> {
        print("$c, ");
        val a = c * (i-k)/(k+1);
        return row(k+1, i, a);
      }
  }
}

fun col(i:Int, n:Int):Int {
  when {
    i > n -> return 0;
    else -> {
      row(0, i, 1);
      println("");
      return col(i+1, n);
    }
  }
}

fun main() {
  val N: Int = 10
  println("[INPUT] " + N)
  println("[OUTPUT]")
  col(0, N)
}
