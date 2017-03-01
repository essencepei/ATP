package SCM.back.TestCase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class iii {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("编号");
		list.add("名称");
		list.add("类型");
		list.add("区域");
		list.add("配送仓库");
		list.add("创建时间");
		System.out.println(list.size());
		Map<String,String>  map = null;
		int i;
		for(i=0;i<list.size();i++){
			map = new HashMap<String,String>();
			System.out.println(list.get(i));
			map.put(list.get(i), "value");
			
		}
		
	}
	
	public List<Map<String,String>> great(List list) {
		List<Map<String, String>> lmp = new ArrayList<Map<String,String>>();
		Map<String,String>  map = null;
		for(int i=0;i<list.size();i++){
			map = new HashMap<String,String>();
//			map.put(list.get(i), "sosos");
//			
		}
		
		return lmp;

	}
	
}
