package com.zsw.flyweight;
/**
 * 客户端
 * @author zhangshiwei
 *
 */
public class Client {
	public static void main(String[] args) {
		ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("黑色");
		ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");
		System.out.println(chess1);
		System.out.println(chess2);
		
		
		
		System.out.println("================操作外部状态================");
		
		chess1.display(new ChessCoordinate(10, 10));
		chess1.display(new ChessCoordinate(20, 20));
	}
}
