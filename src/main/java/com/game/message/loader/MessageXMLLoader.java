package com.game.message.loader;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.game.message.bean.Bean;
import com.game.message.bean.Message;

/**
 * 
 * @author JiangBangMing
 *
 * 2018年7月6日 下午5:24:46
 */
public class MessageXMLLoader {

	private HashMap<String, Bean> beans=new HashMap<String, Bean>();
	private List<Message> messagees=new ArrayList<>();
	
	public void load(String file) {
		
	}
	
	public void load(String file,String rootPath) {
		try {
			DocumentBuilder builder=DocumentBuilderFactory.newInstance().newDocumentBuilder();
			
			InputStream is=new FileInputStream(new File(file));
			Document document=builder.parse(is);
			Node root=document.getElementsByTagName("message").item(0);
			
			String packageName=root.getAttributes().getNamedItem("package").getTextContent().trim();
			if((rootPath!=null)&&(!rootPath.equals(""))) {
				packageName=rootPath+"."+packageName;
			}
			
			String packageId=root.getAttributes().getNamedItem("id").getTextContent().trim();
			
			NodeList nodes=document.getElementsByTagName("bean");
			for(int i=0;i<nodes.getLength();i++) {
				Node child=nodes.item(i);
				
				Bean bean =new Bean();
				NamedNodeMap beanAttributes=child.getAttributes();
				bean.setBeanName(beanAttributes.getNamedItem("name").getTextContent().trim());
				bean.setPackageName(packageName);
				bean.setExplain(beanAttributes.getNamedItem("explain").getTextContent().trim());
				bean.setFields(new ArrayList<>());
				Node node=child.getFirstChild();
				for() {
					
				}
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
