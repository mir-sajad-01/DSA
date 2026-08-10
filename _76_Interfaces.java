public class _76_Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}
interface chesssplayer{
  void moves();
}
class Queen implements chesssplayer{
   public void moves(){
       System.out.println("up , down , left , right , diagonal");
    }
}
class rook implements chesssplayer{
    public void moves(){
        System.out.println("up,down left, right");
    }
}
class king implements chesssplayer {
    public void moves(){
        System.out.println("up,down, left, right ");
    }
}