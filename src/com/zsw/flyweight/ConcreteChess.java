package com.zsw.flyweight;

/**
 * 具体的棋子
 * @author zhangshiwei
 *
 */
public class ConcreteChess implements ChessFlyWeight {
	/* 内部状态 共享的 */
	private String color;
	
	
	public ConcreteChess(String color) {
		super();
		this.color = color;
	}

	@Override
	public void setColor(String color) {
		this.color=color;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void display(ChessCoordinate cc) {
		System.out.println("棋子颜色： "+color);
		System.out.println("棋子位置：("+cc.getX()+","+cc.getY()+")");
	}


}
