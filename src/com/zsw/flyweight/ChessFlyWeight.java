package com.zsw.flyweight;

/**
 * 棋子--享元类
 * @author zhangshiwei
 *
 */
public interface ChessFlyWeight {
	void setColor(String color);
	String getColor();
	
	void display(ChessCoordinate cc);
}
