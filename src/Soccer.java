class Ball{
	int x, y;
	Ball(int x_, int y_){
		x = x_;
		y = y_;
	}
	boolean move (int x_, int y_) {
		x = x + x_;
		y = y + y_;
		System.out.println("공의 위치 : (" + x +" , " + y + ")");
		if( x >= 50) return true;
		else return false;
	}
}

class Player{
	int x, y;
	Player(int x_, int y_){
		x = x_; y = y_;
	}
	boolean kick(Ball b) {
		x += 10;
		System.out.println("공을 찼습니다 -> ");
		return b.move(10, 0);
	}
}
public class Soccer {
	public static void main(String args[]) {
		Ball b = new Ball(0,0);
		Player p = new Player(-10, 0);
		b.move(10, 10);
		System.out.println("Game Start");
		for(int i=0; i<5; i++) {
			if(p.kick(b) == true) break;
		}
		System.out.println("Game Over");
	}
}
