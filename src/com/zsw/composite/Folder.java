package com.zsw.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹--容器构件角色（composite）
 * @author zhangshiwei
 *
 */
public class Folder implements AbstractFile{
	private String name;
	List<AbstractFile> list =new ArrayList<AbstractFile>();
	
	public Folder(String name) {
		super();
		this.name = name;
	}
	
	public void add(AbstractFile file) {
		list.add(file);
	}
	
	public void remove(AbstractFile file) {
		list.remove(file);
	}
	
	public AbstractFile get(int index) {
		return list.get(index);
	}
	
	@Override
	public void killVirus() {
		System.out.println("【文件夹】--"+name+"--病毒查杀");
		for (AbstractFile file : list) {
			file.killVirus();
		}
	}

}
