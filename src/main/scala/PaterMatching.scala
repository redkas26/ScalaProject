object PaterMatching {

  def main(args:Array["String"]): Unit = {
    var num = 5000;

    num match{
      case 1000 => println("1000")
      case 2000 => println("2000")
      case 3000 => println("3000")
      case _ => println("unknown")
    }
  }
  }

