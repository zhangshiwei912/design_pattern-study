package com.zsw.composite;

public class Client {
	public static void main(String[] args) {
		AbstractFile f1=new ImageFile("小猫.jpg");
		AbstractFile f2=new TextFile("笔记.txt");
		AbstractFile f3=new VideoFile("无双.avi");
		
		Folder f4=new Folder("文档");
		Folder f5=new Folder("电影");
		f5.add(f3);
		f4.add(f2);
		f4.add(f1);
		f4.add(f5);
		//f1.killVirus();
		//f5.killVirus();
		f4.killVirus();
	}
}
