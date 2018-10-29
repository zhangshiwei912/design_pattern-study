package com.zsw.flyweight;

/**
 * 棋子位置--外部状态(UnSharedConcreteFlyWeight)
 * @author zhangshiwei
 *
 */
public class ChessCoordinate {
	int x,y;

	public ChessCoordinate(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
