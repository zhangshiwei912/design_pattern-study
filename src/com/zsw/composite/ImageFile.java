package com.zsw.composite;

/**
 * 图片文件、文本文件、视频文件--叶子构件角色（leaf）
 * @author zhangshiwei
 *
 */
public class ImageFile implements AbstractFile {
	private String name;
	
	public ImageFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("【图片文件】--"+name+"--病毒查杀");
	}

}
class TextFile implements AbstractFile {
	private String name;
	
	public TextFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("【文本文件】--"+name+"--病毒查杀");
	}

}
class VideoFile implements AbstractFile {
	private String name;
	
	public VideoFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("【视频文件】--"+name+"--病毒查杀");
	}

}